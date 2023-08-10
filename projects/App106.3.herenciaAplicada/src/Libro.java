
public class Libro extends Producto {

	private String autor;
	private String titulo;
	private int año;
	private String resumen;

	public Libro(int id, String autor, String titulo, int año, String resumen, double precio) {
		super();

		// Para los atributos de la clase superior
		this.id = id;
		this.nombre = titulo + " - " + autor + "(" + año + ")";
		this.descripcion = "LIBRO: " + this.nombre + "\n" + resumen;
		this.precio = precio;

		// Para los atributos de la clase actual
		this.autor = autor;
		this.titulo = titulo;
		this.año = año;
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", año=" + año + ", resumen=" + resumen + "]";
	}

//	public String consultarBibliografia() {
//		// TODO: Usar el API de CHATGPT y consulta el siguiente texto
//		// "DAME LA BIBLIOGRAFIA DEL AUTOR %s", autor
//	}

}
