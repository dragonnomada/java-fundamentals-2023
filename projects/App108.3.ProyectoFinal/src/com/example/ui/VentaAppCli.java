package com.example.ui;

import java.util.Scanner;

import com.example.exceptions.CobroException;
import com.example.exceptions.PagadoException;
import com.example.models.ICobrador;
import com.example.models.Producto;
import com.example.services.VentaService;

public class VentaAppCli {

	private Scanner scanner;
	private VentaService venta;
	private ICobrador cobrador;
	
	public VentaAppCli(Scanner scanner, VentaService venta, ICobrador cobrador) {
		this.scanner = scanner;
		this.venta = venta;
		this.cobrador = cobrador;
	}
	
	public void mostrarTitulo() {
		System.out.println("Venta App v1.0");
		System.out.println("----------------------");		
	}
	
	public void mostrarDescripcion() {
		System.out.println();
		System.out.println(venta.description());
		System.out.println("----------------------");
	}
	
	public void mostrarOpciones() {
		System.out.println("Selecciona una opción:");
		System.out.println("----------------------");
		System.out.println("1. Agregar un producto");
		System.out.println("2. Cobrar");
		System.out.println("----------------------");
		System.out.println("0. Salir");
		System.out.println();
	}
	
	public int leerOpcion() {
		System.out.print(":> ");
		return scanner.nextInt();
	}
	
	public void opcionSalir() {
		System.out.println("¡Adiós! :)");
	}
	
	public void opcionAgregarProducto() {
		
		System.out.println("Se agregará un nuevo producto:");
		
		System.out.print("ID: ");
		long id = scanner.nextLong();
		scanner.nextLine();
		
		System.out.print("NOMBRE: ");
		String nombre = scanner.nextLine();
		
		System.out.print("PRECIO (mxn): $");
		double precio = scanner.nextDouble();
		scanner.nextLine();
		
		Producto producto = new Producto();
		
		producto.setId(id);
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		
		try {
			venta.addProducto(producto);
		} catch (PagadoException e) {
			System.out.println("NO SE PUEDE AGREGAR, LA VENTA ESTÁ PAGADA");
		}
		
		menu();
	}
	
	public void opcionCobrar() {
		System.out.println("Se realizará el cobro:");
		
//		cobrador.pagar(venta.getProductos());
		
		try {
			venta.cobrar(cobrador);
		} catch (PagadoException e) {
			System.out.println("LA VENTA YA ESTÁ PAGADA");
		} catch (CobroException e) {
			System.out.println("ERROR AL COBRAR");
		}
		
		menu();
	}
	
	public void opcionNoValida() {
		System.out.println("La opción no es válida");
		
		menu();
	}
	
	public void seleccionarOpcion(int opcion) {
		switch (opcion) {
		case 0:
			opcionSalir();
			break;
		case 1:
			opcionAgregarProducto();
			break;
		case 2:
			opcionCobrar();
			break;
		default:
			opcionNoValida();
			break;
		}
	}
	
	public void menu() {
		
		mostrarTitulo();
		
		mostrarDescripcion();
		
		mostrarOpciones();
		
		int opcion = leerOpcion();
		
		seleccionarOpcion(opcion);
		
	}
	
}
