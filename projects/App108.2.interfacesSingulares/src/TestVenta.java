import java.util.List;
import java.util.Scanner;

public class TestVenta {

	public static void main(String[] args) throws PagadoException, CobroException {
		
		Venta venta = new Venta();
		
		for (int i = 0; i < 10; i++) {
			Producto producto = new Producto();
			
			producto.setId((long)i);
			producto.setNombre("Papa tipo " + (i + 1));
			producto.setPrecio(Math.random() * 80 + 20);
			
			venta.addProducto(producto);
		}
		
		System.out.println(venta);
		
		venta.cobrar(new ICobrador() {
			
			@Override
			public String pagar(List<Producto> productos) {
				double total = 0;
				for (Producto producto : productos) {
					// TODO: Verificar que los precios no sean null
					total += producto.getPrecio();
				}
				Scanner scanner = new Scanner(System.in);
				System.out.printf("Total a pagar: $%.2f mxn %n", total);
				System.out.print("Monto de pagado: ");
				double montoPagado = scanner.nextDouble();
				if (montoPagado >= total) {
					double cambio = montoPagado - total;
					System.out.printf("ENTREGA CAMBIO: $%.2f mxn %n", cambio);
					System.out.println("La venta ha sido pagada");
					scanner.close();
					return "ABC-" + 123 + "-" + Long.toHexString((long)(Math.random() * 1_000_000_000)).toUpperCase();
				} else {
					// TODO: Notificar que el monto es inferior al total
				}
				scanner.close();
				return null;
			}
			
		});
		
		System.out.println(venta);
		
	}
	
}
