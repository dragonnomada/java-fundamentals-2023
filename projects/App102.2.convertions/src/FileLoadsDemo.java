import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoadsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nombre del archivo con los datos del producto: ");
		String nombreArchivo = scanner.nextLine();
		
		if (!nombreArchivo.contains(".txt")) {
			nombreArchivo += ".txt";
		}
		
		String path = String.format("D:\\java-environment\\reports\\%s", nombreArchivo);
		
		File reporte = new File(path);
		
		Scanner scannerFile = new Scanner(reporte);
		
		// String nombre = scannerFile.nextLine(); // NOMBRE: Manzana
		
		// AVANZA EN EL PATRÓN ENCONTRADO
		scannerFile.findInLine("NOMBRE:\s*");
		
		String nombre = scannerFile.nextLine();
		
		System.out.printf("Nombre del producto encontrado: %s %n", nombre);
		
		// AVANZA EN EL PATRÓN ENCONTRADO
		scannerFile.findInLine("PRECIO:\s*\\$");
		
		double precio = scannerFile.nextDouble();
	
		System.out.printf("Precio encontrado: %.2f (%.1fk) %n", precio, precio / 1000);
		
		scannerFile.close();
		
		scanner.close();
		
	}
	
}
