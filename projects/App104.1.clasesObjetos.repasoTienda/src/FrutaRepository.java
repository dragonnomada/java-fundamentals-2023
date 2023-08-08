
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

	Fruta[] frutas = new Fruta[100]; // Fruta
	int lastIndex = 0;

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
		Fruta fruta = frutas[lastIndex];
		
		frutas[lastIndex--] = null;
		// frutas[lastIndex] = null
		// lastIndex -= 1;
		
		if (lastIndex <= 0) {
			lastIndex = 0;
		}
		
		return fruta;
	}

	// CONSULTAR FRUTA POR ÍNDICE
	public Fruta consultarFrutaPorIndice(int indice) {
		if (indice < 0 || indice >= lastIndex) {
			return null;
		}
		
		return frutas[indice];
	}

	// CONSULTAR FRUTA POR ID
	public Fruta consultarFrutaPorId(int id) {
		for (Fruta fruta : frutas) {
			if (fruta.getId() == id) {
				return fruta;
			}
		}
		
		return null;
	}

	// CONSULTAR FRUTA POR NOMBRE
	public Fruta consultaFrutaPorNombre(String nombre) {
		for (Fruta fruta : frutas) {
			if (fruta.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
				return fruta;
			}
		}
		
		return null;
	}

	// MÁS CONSULTAS...

}
