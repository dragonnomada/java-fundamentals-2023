import java.util.Scanner;

public class TestContador {

	public static void main(String[] args) {
		
		Contador contador = new Contador("A", 1, 10);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("=========================");
			System.out.println(contador);
			System.out.println("=========================");
			System.out.println("SELECCIONA UNA OPCIÓN:");
			System.out.println("-------------------------");
			System.out.println("1. Incrementar");
			System.out.println("2. Decrementar");
			System.out.println("-------------------------");
			System.out.println("0. Salir");
			System.out.println();
			System.out.print(":> ");
			int opcion = scanner.nextInt();
			
			boolean finalizar = false; // bandera o variable de control
			
			switch (opcion) {
			case 1:
				contador.incrementar();
				break;
			case 2:
				contador.decrementar();
				break;
			case 0:
				System.out.println("Fin del programa");
				finalizar = true;
				break;
			default:
				break;
			}
			
			if (finalizar) { // if (finalizar == true)
				break;
			}
		}
		
		scanner.close();
		
	}
	
}
