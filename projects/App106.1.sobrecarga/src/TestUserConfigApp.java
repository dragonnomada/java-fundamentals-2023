import java.util.Scanner;

public class TestUserConfigApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Username: ");
		String username = scanner.nextLine();
		
		String filename = "D:\\java-environment\\temporal\\" + username + ".userconfig.txt";
		
		UserConfig user = new UserConfig(filename);
		
		System.out.println(user);
		
		if (user.checkPermission(UserConfig.READ, 3, true)) {
			System.out.println("VENTAS TOTALES DEL DÍA 3");
		} else {
			System.out.println("VENTAS TOTALES DEL DÍA ****");
		}
		
		if (user.checkPermission(UserConfig.READ, 2, true)) {
			System.out.println("TOTAL VENTA ACUMULADO $6,789.23");
		} else {
			System.out.println("TOTAL VENTA ACUMULADO ****");
		}
		
		if (user.checkPermission(UserConfig.READ, 10, true)) {
			System.out.println("SUCURSAL EN OPERACIÓN: ACTIVA POR CERRAR EN 1 HORA");
		} else {
			System.out.println("SUCURSAL EN OPERACIÓN: ****");
		}
		
		scanner.close();
		
	}
	
}
