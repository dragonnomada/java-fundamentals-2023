import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class UserConfig {

	public static final int WRITE = 0;
	public static final int READ = 1;
	public static final int DELETE = 2;
	public static final int UPDATE = 3;

	private String username;
	private String[] permissions;
	private int requestLimit;

	private int requestCount = 0;

	public UserConfig() {
		username = "system";
		permissions = new String[] { "W-L0", "R-L0", "D-L0", "U-L0" };
		requestLimit = -1;
	}
	
	public UserConfig(String username, String[] permissions, int requestLimit) {
		this.username = username;
		this.permissions = permissions;
		this.requestLimit = requestLimit;
	}
	
	public UserConfig(String filename) {
		File file = new File(filename);
		
		try {
			Scanner scannerFile = new Scanner(file);
			
			username = scannerFile.nextLine();
			requestLimit = scannerFile.nextInt();
			scannerFile.nextLine();
			permissions = scannerFile.nextLine().split(":");
			
			scannerFile.close();
		} catch (Exception e) {
			username = "invalid";
			permissions = new String[] { "X-L0" };
			requestLimit = 0;
		}
	}

	public String getUsername() {
		return username;
	}

	public void beginRequest() {
		requestCount = 0;
	}

	public boolean canRequest() {
		if (requestLimit == -1) return true; 
		
		return requestLimit > 0 && requestCount < requestLimit;
	}

	public void processRequest() {
		requestCount += 1;
	}

	public void endRequest() {
		requestCount = 0;
	}

	public boolean checkPermission(String permission) {
//		System.out.println("VERIFICANDO PERMISO " + permission + "...");
		for (String code : permissions) {
			if (code.equals(permission)) {
//				System.out.println("PERMISO VERIFICADO: " + permission);
				return true;
			}
				
		}
//		System.out.println("PERMISO NO VERIFICADO: " + permission);
		return false;
	}

	public boolean checkPermission(String type, int level) {
		String permission = String.format("%s-L%d", type.toString(), level);
		return checkPermission(permission);
	}

	public boolean checkPermission(String type, int level, boolean recursive) {
		if (recursive) {
			for (int i = level; i >= 0; i--) {
				boolean isAccept = checkPermission(type, i);
				if (isAccept)
					return true;
			}
			return false;
		} else {
			return checkPermission(type, level);
		}
	}

	public boolean checkPermission(int type, int level, boolean recursive) {
		String typeText;

		switch (type) {
		case UserConfig.WRITE:
			typeText = "W";
			break;
		case UserConfig.READ:
			typeText = "R";
			break;
		case UserConfig.DELETE:
			typeText = "D";
			break;
		case UserConfig.UPDATE:
			typeText = "U";
			break;
		default:
			typeText = "X";
			break;
		}

		return checkPermission(typeText, level, recursive);
	}

	public boolean checkPermission(int type, int level) {
		return checkPermission(type, level, false);
	}

	@Override
	public String toString() {
		return "UserConfig [username=" + username + ", permissions=" + Arrays.toString(permissions) + ", requestLimit="
				+ requestLimit + ", requestCount=" + requestCount + "]";
	}

}
