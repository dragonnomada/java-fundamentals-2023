package test;

import java.util.List;
import java.util.Scanner;

import com.example.exceptions.CobroException;
import com.example.exceptions.PagadoException;
import com.example.models.ICobrador;
import com.example.models.Producto;
import com.example.services.VentaService;
import com.example.services.impl.VentaTemporal;
import com.example.ui.VentaAppCli;

public class TestVentaLocal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		VentaService venta = new VentaTemporal();
		
		ICobrador cobrador = (List<Producto> productos) -> {
			double total = venta.getTotal();
			System.out.printf("Total a pagar: $%.2f mxn %n", total);
			System.out.print("Monto de pagado: ");
			double montoPagado = scanner.nextDouble();
			if (montoPagado >= total) {
				double cambio = montoPagado - total;
				System.out.printf("ENTREGA CAMBIO: $%.2f mxn %n", cambio);
				System.out.println("La venta ha sido pagada");
				return "ABC-" + 123 + "-" + Long.toHexString((long)(Math.random() * 1_000_000_000)).toUpperCase();
			} else {
				System.out.println("EL MONTO DEBE SER SUPERIOR AL TOTAL (NO SE COBRARÁ)");
			}
			return null;
		};
		
		VentaAppCli ventaApp = new VentaAppCli(scanner, venta, cobrador);
		
		ventaApp.menu();
		
		scanner.close();
	}
	
}
