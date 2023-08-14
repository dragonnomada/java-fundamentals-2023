package com.example.services.impl;

import java.util.List;

import com.example.exceptions.CobroException;
import com.example.exceptions.PagadoException;
import com.example.models.ICobrador;
import com.example.models.Producto;

// Implementa una mejora a VentaTemporal
// Para guardar los productos en la base de datos
// y recuperarlos desde ahí
public class VentaBaseDatos extends VentaTemporal {

	@Override
	public void addProducto(Producto producto) throws PagadoException {
		super.addProducto(producto); // Agrega el producto en temporal
		// TODO Agrega además el producto a base datos
		// PISTA: Usar un PreparedStatement con los datos del producto
		//        para lanzar el Query de inserción
	}
	
	@Override
	public List<Producto> getProductos() {
		// TODO: Recupera los productos desde la base datos
		// PISTA: Query de selección
		return super.getProductos(); // Recupera los temporales
	}
	
	@Override
	public void cobrar(ICobrador cobrador) throws PagadoException, CobroException {
		super.cobrar(cobrador);
		
		// TODO: Guardar el recibo en la base de datos
		// SI YA ESTÁ PAGADO, guardamos el recibo en base de datos
		// PISTA: Inserción
	}
	
}
