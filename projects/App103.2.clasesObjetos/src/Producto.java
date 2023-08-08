
/*
 * El nivel de acceso `private` establece que una propiedad o método
 * sólo podrá ser accedida dentro de la clase.
 * 
 * El nivel de acceso `protected` establece que una propiedad o método
 * sólo podrá ser accedida dentro de la clase y sus clases derivadas.
 * 
 * El nivel de acceso `<default>` establece que una propiedad o método
 * sólo podrá ser accedida dentro de la clase, sus clases derivadas 
 * y otras clases dentro del mismo paquete.
 * 
 * El nivel de acceso `public` establece que una propiedad o método
 * podrá ser accedida dentro y fuera de la clase.
 * 
 */

public class Producto {

	private long id;
	private String nombre;
	private String descripcion;
	private double precioUnitario;
	private double precioPaquete;
	private int existenciasUnitarias;
	private int existenciasPaquetes;
	private int unidadesPorPaquete;
	private double pesoUnitario;
	private double pesoPaquete;
	private double altoUnitario;
	private double anchoUnitario;
	private double largoUnitario;
	private double altoPaquete;
	private double anchoPaquete;
	private double largoPaquete;

	public long getId() {
		return id;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		if (precioUnitario >= 0.01) {
			this.precioUnitario = precioUnitario;
			// TODO: Generar un registro alertando esta modificación
			if (precioUnitario <= 1.0) {
				// TODO: Enviar un correo con los datos del empleado
			}
		}
	}

	public double getPrecioPaquete() {
		return precioPaquete;
	}

	public void setPrecioPaquete(double precioPaquete) {
		if (precioPaquete >= precioUnitario * unidadesPorPaquete) {
			this.precioPaquete = precioPaquete;
		}
	}

	public int getExistenciasUnitarias() {
		return existenciasUnitarias;
	}

	public void setExistenciasUnitarias(int existenciasUnitarias) {
		this.existenciasUnitarias = existenciasUnitarias;
	}

	public int getExistenciasPaquetes() {
		return existenciasPaquetes;
	}

	public void setExistenciasPaquetes(int existenciasPaquetes) {
		this.existenciasPaquetes = existenciasPaquetes;
	}

	public int getUnidadesPorPaquete() {
		return unidadesPorPaquete;
	}

	public void setUnidadesPorPaquete(int unidadesPorPaquete) {
		this.unidadesPorPaquete = unidadesPorPaquete;
	}

	public double getPesoUnitario() {
		return pesoUnitario;
	}

	public void setPesoUnitario(double pesoUnitario) {
		this.pesoUnitario = pesoUnitario;
	}

	public double getPesoPaquete() {
		return pesoPaquete;
	}

	public void setPesoPaquete(double pesoPaquete) {
		this.pesoPaquete = pesoPaquete;
	}

	public double getAltoUnitario() {
		return altoUnitario;
	}

	public void setAltoUnitario(double altoUnitario) {
		this.altoUnitario = altoUnitario;
	}

	public double getAnchoUnitario() {
		return anchoUnitario;
	}

	public void setAnchoUnitario(double anchoUnitario) {
		this.anchoUnitario = anchoUnitario;
	}

	public double getLargoUnitario() {
		return largoUnitario;
	}

	public void setLargoUnitario(double largoUnitario) {
		this.largoUnitario = largoUnitario;
	}

	public double getAltoPaquete() {
		return altoPaquete;
	}

	public void setAltoPaquete(double altoPaquete) {
		this.altoPaquete = altoPaquete;
	}

	public double getAnchoPaquete() {
		return anchoPaquete;
	}

	public void setAnchoPaquete(double anchoPaquete) {
		this.anchoPaquete = anchoPaquete;
	}

	public double getLargoPaquete() {
		return largoPaquete;
	}

	public void setLargoPaquete(double largoPaquete) {
		this.largoPaquete = largoPaquete;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Método de LECTURA/ACCESO_LECTURA/MÉTODO_LECTURA_PROPIEDAD
	// GETTER - ADQUISITOR
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return "[" + id + "] " + nombre + " - " + descripcion;
	}

	// Método de AJUSTE/ACCESO_ESCRITURA/MÉTODO_ESCRITURA_PROPIEDAD
	// SETTER - AJUSTADOR
	public void setNombre(String nombre) {
		// TODO: Hacer validaciones para determinar si el nombre
		// es válido, para actualizar el this.nombre interno

		if (nombre.matches("^[A-Za-z\\s\\d]{4,}[^\\s]$")) {
			this.nombre = nombre;
			// nombre - parámetro del método (oculta al campo nombre)
			// this.nombre - propiedad de la clase
		} else {
			System.out.printf("[ADVERTENCIA]: El nombre <<%s>> no es válido %n", nombre);
		}

	}

	@Override // Reemplaza la funcionalidad por defecto (mostrar el hash de memoria)
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", precioPaquete=" + precioPaquete + ", existenciasUnitarias=" + existenciasUnitarias
				+ ", existenciasPaquetes=" + existenciasPaquetes + ", unidadesPorPaquete=" + unidadesPorPaquete
				+ ", pesoUnitario=" + pesoUnitario + ", pesoPaquete=" + pesoPaquete + ", altoUnitario=" + altoUnitario
				+ ", anchoUnitario=" + anchoUnitario + ", largoUnitario=" + largoUnitario + ", altoPaquete="
				+ altoPaquete + ", anchoPaquete=" + anchoPaquete + ", largoPaquete=" + largoPaquete + "]";
	}

}
