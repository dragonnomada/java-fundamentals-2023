package com.example.services;

import java.util.List;

import com.example.exceptions.CobroException;
import com.example.exceptions.PagadoException;
import com.example.models.ICobrador;
import com.example.models.Producto;

public interface VentaService {

	String description();
	
	List<Producto> getProductos();
	
	void addProducto(Producto producto) throws PagadoException;
	
	double getTotal();
	
	void cobrar(ICobrador cobrador) throws PagadoException, CobroException;
	
}
