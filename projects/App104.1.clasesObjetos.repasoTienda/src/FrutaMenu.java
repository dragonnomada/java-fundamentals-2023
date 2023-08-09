
import java.util.Scanner;

public class FrutaMenu {

	public static void main(String[] args) {
		
		FrutaRepository frutaRepository = new FrutaRepository();
		
		frutaRepository.cargarFrutas();
		
		Scanner scanner = new Scanner(System.in);
		 
		while (true) {
			
			System.out.println("Selecciona una opción");
			System.out.println("--------------------------");
			System.out.println("1. Consultar todas las Frutas");
			System.out.println("2. Consultar Fruta por ID");
			System.out.println("3. Consultar Fruta por Nombre");
			System.out.println("4. Agregar Fruta");
			System.out.println("5. Quitar última Fruta");
			System.out.println("6. Quitar Fruta por ID");
			System.out.println("--------------------------");
			System.out.println("0. Salir");
			
			System.out.print(":> ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			if (opcion == 1) {
				System.out.printf("--- FRUTAS (%d) ---%n", frutaRepository.total());
				for (Fruta fruta : frutaRepository.consultarFrutasTodas()) {
					System.out.println(fruta);
				}
			} else if (opcion == 2) {
				// TODO: Consultar fruta por Id
				System.out.print("ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				Fruta fruta = frutaRepository.consultarFrutaPorId(id);
				if (fruta != null) {
					System.out.println("Fruta encontrada: " + id);
					System.out.println(fruta);
				} else {
					System.out.println("No se encuentra la fruta: " + id);
				}
			} else if (opcion == 4) {
				System.out.print("ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Nombre: ");
				String nombre = scanner.nextLine();
				System.out.print("Precio: ");
				double precio = scanner.nextDouble();
				scanner.nextLine();
				Fruta fruta = frutaRepository.agregarFrutaFinal(id, nombre, precio);
				if (fruta != null) {
					System.out.println("Fruta agegada:");
					System.out.println(fruta);
					
					// TODO: Guardar el archivo de las frutas en el repositorio
					frutaRepository.guardarFrutas();
					
				} else {
					System.out.println("No se pudo agregar la fruta: " + id + " " + nombre + " $" + precio);
				}
			} else if (opcion == 0) {
				System.out.println("Gracias :D");
				break;
			} else {
				System.out.println("Opción no válida");
			}
			
		}
		
		scanner.close();
		
	}
	
}
