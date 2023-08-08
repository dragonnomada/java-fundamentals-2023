import java.util.Arrays;

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
	private Fruta consultarFrutaPorIndice(int indice) {
		if (indice < 0 || indice >= lastIndex) {
			return null;
		}

		return frutas[indice];
	}

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

	@Override
	public String toString() {
		return "FrutaRepository [frutas=" + Arrays.toString(frutas) + ", lastIndex=" + lastIndex + "]";
	}

	// MÁS CONSULTAS...

}
