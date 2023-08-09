import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Producto {

	private int id;
	private String nombre;
	private double precio;
	private int existencias;

	public Producto(int id) {
		this.id = id;

		cargar();
	}

	public void cargar() {
		File file = new File(String.format("D:\\java-environment\\temporal\\%d.txt", id));

		try {
			Scanner scanner = new Scanner(file);

			nombre = scanner.nextLine();
			precio = scanner.nextDouble();
			existencias = scanner.nextInt();

			scanner.close();
		} catch (Exception e) {
			System.out.println("Error al abrir el archivo para ese producto");
		}
	}

	public void guardar() {
		File file = new File(String.format("D:\\java-environment\\temporal\\%d.txt", id));

		try {
			FileWriter writer = new FileWriter(file);

			writer.write(nombre + "\n");
			writer.write(String.valueOf(precio) + "\n");
			writer.write(String.valueOf(existencias) + "\n");

			writer.close();
		} catch (Exception e) {
			System.out.println("Error al escribir el archivo para ese producto");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		guardar();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		guardar();
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
		guardar();
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", existencias=" + existencias
				+ "]";
	}

}
