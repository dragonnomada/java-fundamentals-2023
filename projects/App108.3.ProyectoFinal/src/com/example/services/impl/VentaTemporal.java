package com.example.services.impl;
import java.util.ArrayList;
import java.util.List;

import com.example.exceptions.CobroException;
import com.example.exceptions.PagadoException;
import com.example.models.ICobrador;
import com.example.models.Producto;
import com.example.services.VentaService;

public class VentaTemporal implements VentaService {

	private List<Producto> productos = new ArrayList<Producto>();
	private String cadenaPago; // null
	private boolean pagado; // false
	
	public void addProducto(Producto producto) throws PagadoException {
		if (pagado) {
			throw new PagadoException();
		}
		
		productos.add(producto);
	}
	
	public void cobrar(ICobrador cobrador) throws PagadoException, CobroException {
		if (pagado) {
			throw new PagadoException();
		}
		
		cadenaPago = cobrador.pagar(productos);
		
		if (cadenaPago == null) {
			throw new CobroException();
		}
		
		pagado = true;
	}

	@Override
	public String toString() {
		return "Venta [productos=" + productos + ", cadenaPago=" + cadenaPago + ", pagado=" + pagado + "]";
	}

	@Override
	public String description() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("=== VENTA ===\n");
		
		if (pagado) {
			builder.append("PAGADO: " + cadenaPago + "\n");
		} else {
			builder.append("PAGO PENDIENTE...\n");
		}
		
		builder.append("Total de producto: " + productos.size() + "\n");
		
		if (productos.size() == 0) {
			return builder.toString();
		}
		
		builder.append("--------------------------------------\n");
		for (Producto producto : productos) {
			builder.append(String.format("[%3d] %20s $%.2f %n", producto.getId(), producto.getNombre(), producto.getPrecio()));
		}
		builder.append("--------------------------------------\n");
		builder.append(String.format("TOTAL: $%.2f %n", getTotal()));
		return builder.toString();
	}

	@Override
	public double getTotal() {
		double total = 0;
		for (Producto producto : productos) {
			// TODO: Verificar que los precios no sean null
			total += producto.getPrecio();
		}
		return total;
	}

	@Override
	public List<Producto> getProductos() {
		return productos;
	}
	
}
