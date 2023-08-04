import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileConvertionsDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa los datos del producto:");
		System.out.println("-------------------------------");
		
		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Precio: ");
		double precio = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Existencias: ");
		int existencias = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Código Barras: ");
		String codigoBarras = scanner.nextLine();
		
		System.out.print("Ubicación (lat lon): ");
		double lat = scanner.nextDouble();
		double lon = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Estante: ");
		char estante = scanner.next().charAt(0); // Próximo caracter
		scanner.nextLine();
		
		String linea1 = String.format("NOMBRE: %s", nombre);
		String linea2 = String.format("PRECIO: $%.2f (%d unidades)", precio, existencias);
		String linea3 = String.format("[ESTANTE %c] SKU: %s", estante, codigoBarras);
		String linea4 = String.format("LAT/LON: %.8f / %.8f", lat, lon);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("DATOS DEL PRODUCTO");
		System.out.println("======================================");
		
		System.out.println(linea1);
		System.out.println(linea2);
		System.out.println(linea3);
		System.out.println(linea4);
		
		System.out.println("======================================");
		
		System.out.print("Nombre del archivo: ");
		String nombreArchivo = scanner.nextLine();
		
		if (!nombreArchivo.contains(".txt")) {
			nombreArchivo += ".txt";
		}
		
		String path = String.format("D:\\java-environment\\reports\\%s", nombreArchivo);
		
		File reporte = new File(path);
		
//		try {
//			reporte.createNewFile();
//			System.out.println("Se creó el archivo para guardar el reporte");
//		} catch (IOException e) {
//			System.out.println("No se puede crear el archivo");
//			return; // :(
//		}
		
		FileWriter writer = new FileWriter(reporte);
		
		System.out.println("Escribiendo el reporte...");
		
		// "Hola" + " " + "mundo" -> "Hola mundo"
		
		writer.write(linea1 + "\n");
		writer.write(linea2 + "\n");
		writer.write(linea3 + "\n");
		writer.write(linea4 + "\n");
		
		System.out.println("Se escribió el reporte");
		
		writer.close();
		
		System.out.println("El reporte ha sido guardado");
		
	}
	
}
