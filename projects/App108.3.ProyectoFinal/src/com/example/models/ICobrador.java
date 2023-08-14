package com.example.models;
import java.util.List;

public interface ICobrador {

	String pagar(List<Producto> productos); // Realiza el pago y devuelve la cadena pago
	
}
