import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recibo {

	List<Producto> productos;
	Date fechaEmision;
	
	public Recibo() {
		productos = new ArrayList<Producto>();
		fechaEmision = new Date();
	}
	
	public Recibo(List<Producto> productos) {
		this.productos = productos;
		fechaEmision = new Date();
	}
	
	public Recibo(Producto[] productos) {
		this.productos = new ArrayList<Producto>();
		for (Producto producto : productos) {
			this.productos.add(producto);
		}
		fechaEmision = new Date();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
//		for (int i = 0; i < productos.size(); i++) {
//			Producto producto = productos.get(i);
//			total = total + producto.getPrecio();
//		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(String.format("=== %20s ===%n", "RECIBO " + fechaEmision.toString()));		
		builder.append("-------------------------------------------\n");
		builder.append(String.format(" TOTAL ARTÍCULOS: %d %n", productos.size()));
		builder.append("-------------------------------------------\n");
		
		for (Producto producto : productos) {
			builder.append(String.format(" %-20s $%.2f %n", producto.nombre.substring(0, Math.min(20, producto.nombre.length())), producto.precio));
		}

		builder.append("-------------------------------------------\n");
		builder.append(String.format(" MONTO TOTAL:         $%.2f %n", calcularTotal()));
		builder.append("-------------------------------------------\n");
		
		return builder.toString();
	}
	
}
