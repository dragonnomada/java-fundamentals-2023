import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {

	private List<Producto> productos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Producto ultimoProducto() {
		if (productos.size() == 0) {
			return null;
		}
		return productos.get(productos.size() - 1);
	}
	
	public Producto buscarProducto(String codigoBarras) {
		for (Producto producto : productos) {
			if (producto.getCodigoBarras().equals(codigoBarras)) {
				return producto;
			}
		}
		return null;
	}
	
	public void quitaProducto(String codigoBarras) {
		Producto productoEncontrado = buscarProducto(codigoBarras);
		
		if (productoEncontrado == null) {
			// TODO: Marcar un error de no encontrado
			return;
		}
		
		productos.remove(productoEncontrado);
	}
	
	public void quitaTodosProductos() {
		productos.clear();
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("=== CARRITO DE COMPRAS === \n");
		builder.append(String.format("TOTAL ARTÍCULOS: %d %n", productos.size()));
		builder.append("--- ARTÍCULOS: --- \n");
		for (Producto producto : productos) {
			builder.append(String.format("%-20s $%.2f %n", producto.getNombreCorto(), producto.getPrecio()));
		}
		builder.append("--- TOTAL ACUMULADO: --- \n");
		builder.append(String.format("TOTAL: $%.2f %n", calcularTotal()));
		
		return builder.toString();
	}
	
}
