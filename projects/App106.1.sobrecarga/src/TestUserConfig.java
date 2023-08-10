
public class TestUserConfig {

	public static void main(String[] args) {
		
		UserConfig user1 = new UserConfig();
		
		// INICIA TRANSACCIÓN
		// REQUIERE NIVEL 3 - ESCRITURA
		
		user1.beginRequest();
		if (user1.checkPermission("W", 3, true) && user1.canRequest()) {
			user1.processRequest();
			// TODO: Generar un reporte y escribirlo en físico
			System.out.println("LA OPERACIÓN ESCRIBIÓ EL REPORTE");
		} else {
			System.out.println("NO TIENES PERMISOS DE ESCRITURA NIVEL 3");
		}
		user1.endRequest();
		
		System.out.println("==================================================");
		
		UserConfig user2 = new UserConfig("admin", new String[] {"W-L3", "R-L5"}, 3);
		
		// Simulamos 10 operaciones
		user2.beginRequest();
		for (int i = 0; i < 10; i++) {
			if (!user2.canRequest()) {
				System.out.println("SE SUPERÓ EL LÍMITE DE PETICIONES");
				break;
			}
			
			System.out.println("PROCESANDO PETICIÓN: " + (i + 1));
			
			if (user2.checkPermission(UserConfig.READ, 6, true)) {
				System.out.println("OPERACIÓN LECTURA NIVEL 6 COMPLETA");
			} else {
				System.out.println("NO HAY PERMISOS DE LECTURA NIVEL 6");
				// TODO: Reportar la incidencia
			}
			
			if (user2.checkPermission(UserConfig.WRITE, 3, true)) {
				System.out.println("OPERACIÓN ESCRITURA NIVEL 3 COMPLETA");
			} else {
				System.out.println("NO HAY PERMISOS DE ESCRITURA NIVEL 3");
				// TODO: Reportar la otra incidencia
			}
			
			user2.processRequest();
			
			System.out.println("-------------------------------------");
		}
		user2.endRequest();
		
	}
	
}
