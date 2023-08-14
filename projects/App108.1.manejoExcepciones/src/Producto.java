
class ProductoPrecioNegativoException extends Exception {

	private static final long serialVersionUID = -7876615672520923528L;
	
}

class ProductoPrecioCeroException extends Exception {

	private static final long serialVersionUID = 3290062020637769364L;

}

class ProductoPrecioAltoException extends Exception {

	private static final long serialVersionUID = -8547852688064923290L;
	
}

public class Producto {

	private int id;
	private String nombre;
	private double precio;
	private boolean tienePrecioAjustado = false;

	public Producto(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	// Al propagar distintas excepciones podemos marcar cuáles son exactamente
	/**
	 * Intenta actualizar el precio si no es negativo, cero o superior a 1,000,000
	 * @param precio - El nuevo precio a actualizar
	 * @throws ProductoPrecioNegativoException - El precio no puede ser negativo
	 * @throws ProductoPrecioCeroException - El precio no puede ser cero
	 * @throws ProductoPrecioAltoException - El precio no puede superar 1,000,000
	 */
	public void actualizarPrecio(double precio) throws ProductoPrecioNegativoException, ProductoPrecioCeroException, ProductoPrecioAltoException {
		if (precio < 0) {
			//throw new Exception("Precio negativo");
			throw new ProductoPrecioNegativoException();
		}

		if (precio == 0) {
			//throw new Exception("Precio cero");
			throw new ProductoPrecioCeroException();
		}

		if (precio > 1000000) {
			//throw new Exception("Precio demasiado alto");
			throw new ProductoPrecioAltoException();
		}

		this.precio = precio;
		tienePrecioAjustado = true;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tienePrecioAjustado="
				+ tienePrecioAjustado + "]";
	}

}
