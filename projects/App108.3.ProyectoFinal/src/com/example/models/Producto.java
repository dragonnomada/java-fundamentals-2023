package com.example.models; // Las dentro de paquetes marcan su pertenencias

// Podemos importar esta clase en cualquier otro paquete mediante:
// import com.example.models.Producto;

// Si no queremos que esta clase sea accesible en otros proyectos
// quitaremos la palabra public antes de la definición de la clase

public class Producto {

	private Long id;
	private String nombre;
	private Double precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
