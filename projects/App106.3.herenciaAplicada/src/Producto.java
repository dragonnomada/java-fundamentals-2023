
/*
 * LAS CLASES SIEMPRE DEBEN RESPETAR UNA IDENTIDAD
 * 
 * Cuándo la identad no está bien construida, a futuro, las clases extendidas
 * entrarán en conflicto porque la base no es sólida, es decir, desde la
 * superioridad no se estableció una buena identidad, por la tanto, las
 * clases derivadas cargarán el problema de la falta de identidad.
 * 
 * La identidad es el conjunto mínimo de propiedades y métodos que consoliden
 * un MODELO.
 * 
 */

public class Producto {

	protected long id;
	protected String nombre;
	protected String descripcion;
	protected double precio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ "]";
	}

}
