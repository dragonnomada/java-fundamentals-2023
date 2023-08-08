/*
 * CLASE ESTADO -> ENTIDAD
 * 
 * ENTIDAD Fruta
 * 
 * - id
 * - nombre
 * - precio
 * 
 * PROPIEDADES -> DATOS (ESTADO)
 * 
 */

public class Fruta {

	private int id;
	private String nombre;
	private double precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// TODO: Validar el id
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		// TODO: Validar el nombre
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		// TODO: Validar el precio
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
