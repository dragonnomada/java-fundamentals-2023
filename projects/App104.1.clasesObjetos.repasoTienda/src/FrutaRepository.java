import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/*
 * CLASE TRANSACCIONAL -> REPOSITORIO
 * 
 * agregarFrutaFinal(id, nombre, precio) -> Fruta
 * 
 * quitarFrutaFinal() -> Fruta
 * 
 * MÉTODOS -> OPERACIONES (TRANSACCIONES)
 * 
 */

// { F_0, F_1, F_2, F_3, F_4, ..., F_99 }
//
//   F_53 -> ( 879, "Manzana Golden", 45.78 )

public class FrutaRepository {

	private Fruta[] frutas = new Fruta[100]; // Fruta
	private int lastIndex = 0;

	public int total() {
		return lastIndex;
	}
	
	public Fruta[] consultarFrutasTodas() {
		
		if (total() == 0) return null;
		
		Fruta[] frutasTotal = new Fruta[total()];
		
		int index = 0;
		for (Fruta fruta : frutas) {
			if (index >= total()) break;
			frutasTotal[index++] = fruta;
		}
		
		return frutasTotal;
	}
	
	// AGREGA FRUTA AL FINAL (PONE ÚLTIMA)
	public Fruta agregarFrutaFinal(int id, String nombre, double precio) {
		if (lastIndex >= frutas.length) {
			// TODO: Alertar por incapacidad de almacenar más frutas
			return null;
		}

		Fruta fruta = new Fruta();

		fruta.setId(id);
		fruta.setNombre(nombre);
		fruta.setPrecio(precio);

		// TODO: Validar que el ID, NOMBRE y PRECIO sean correctos
		if (fruta.getId() != id) {
			// TODO: Alertar que el índice no se pudo ajustar
			return null;
		}
		if (!fruta.getNombre().equals(nombre)) {
			// TODO: Alertar que el nombre no se pudo ajustar
			return null;
		}
		if (fruta.getPrecio() != precio) {
			// TODO: Alertar que el precio no se pudo ajustar
			return null;
		}

		frutas[lastIndex++] = fruta;
		// SENTENCIA: Asigna `fruta` en el último índice
		// y al final aumenta el índice
		// frutas[lastIndex] = fruta;
		// lastIndex += 1;

		return fruta; // Devolvemos la fruta construida
	}

	// QUITA FRUTA DEL FINAL (QUITA ÚLTIMA)
	public Fruta quitarFrutaFinal() {
		if (lastIndex == 0) {
			return null;
		}
		
		Fruta fruta = frutas[--lastIndex];

		frutas[lastIndex] = null;
		
		return fruta;
	}
	
	// [A, B, C, D, E, F, G]
	// -> D
	// index: 0, 1, 2, 3, 4, 5, 6
	// indexEncontrado: -1...-1...-1...3...3... => (3)
	// [A, B, C, E, F, G, G]
	// [A, B, C, E, F, G]
	
	public Fruta quitarFrutaPorId(int id) {
		Fruta fruta = consultarFrutaPorId(id);
		
		if (fruta != null) {
			int index = 0;
			int indexEncontrado = -1;
			for (Fruta otraFruta : frutas) {
				if (otraFruta == null) continue;
				
				if (otraFruta.getId() == fruta.getId()) {
					indexEncontrado = index;
				}
				index += 1;
			}
			
			if (indexEncontrado >= 0) {
				for (int j = indexEncontrado; j + 1 < lastIndex; j++) {
					frutas[j] = frutas[j + 1];
				}
				quitarFrutaFinal();
			}
		}
		
		return fruta;
	}

	// CONSULTAR FRUTA POR ÍNDICE
//	private Fruta consultarFrutaPorIndice(int indice) {
//		if (indice < 0 || indice >= lastIndex) {
//			return null;
//		}
//
//		return frutas[indice];
//	}

	// CONSULTAR FRUTA POR ID
	public Fruta consultarFrutaPorId(int id) {
		for (Fruta fruta : frutas) {
			if (fruta == null) continue;
			
			if (fruta.getId() == id) {
				return fruta;
			}
		}

		return null;
	}

	// CONSULTAR FRUTA POR NOMBRE
	public Fruta consultaFrutaPorNombre(String nombre) {
		for (Fruta fruta : frutas) {
			if (fruta == null) continue;
			
			if (fruta.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
				return fruta;
			}
		}

		return null;
	}
	
	// CARGAR FRUTAS
	public void cargarFrutas() {
		File file = new File("D:\\java-environment\\temporal\\frutas.txt");
		
		try {
			Scanner scannerFile = new Scanner(file);
			
			while (scannerFile.hasNextLine()) {
				String line = scannerFile.nextLine();
				
				if (line.isEmpty()) continue;
				
				Scanner scannerLine = new Scanner(line);
				
//				Pattern pattern = Pattern.compile("(\\d+)\\s*([^\\$]+)\\$(\\d\\.?\\d*)");
//				
//				Matcher matcher = pattern.matcher(line);
//				
//				int id = Integer.parseInt(matcher.group(1));
//				String nombre = matcher.group(2);
//				double precio = Double.parseDouble(matcher.group(3));
				
				int id = scannerLine.nextInt();
				scannerLine.findInLine("\\s*");
				
				String nombre = scannerLine.findInLine("[^\\$]+");
				scannerLine.findInLine("\\$\\s*");
				nombre = nombre.replaceAll("\\s+$", "");
				
				double precio = scannerLine.nextDouble();
				
				agregarFrutaFinal(id, nombre, precio);
				
				scannerLine.close();
			}
			
			scannerFile.close();
		} catch (Exception e) {
			System.out.println("ERROR AL LEER EL ARCHIVO");
			e.printStackTrace();
		}
	}

	// GUARDAR FRUTAS
	public void guardarFrutas() {
		
		File file = new File("D:\\java-environment\\temporal\\frutas.txt");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			
			StringBuilder frutaText = new StringBuilder();

			for (Fruta fruta : frutas) {
				
				if (fruta == null) continue;
				
				frutaText.append(fruta.getId());
				frutaText.append(" ");
				frutaText.append(fruta.getNombre());
				frutaText.append(" $");
				frutaText.append(fruta.getPrecio());
				frutaText.append("\n");
				
			}

			fileWriter.write(frutaText.toString());
			
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("ERROR AL GUARDAR EL ARCHIVO");
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "FrutaRepository [frutas=" + Arrays.toString(frutas) + ", lastIndex=" + lastIndex + "]";
	}

}
