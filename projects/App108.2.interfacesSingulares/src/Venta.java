import java.util.ArrayList;
import java.util.List;

class PagadoException extends Exception {

	private static final long serialVersionUID = 4154617316772261391L;
	
}

class CobroException extends Exception {

	private static final long serialVersionUID = 1890856215560446609L;
	
}

public class Venta {

	private List<Producto> productos = new ArrayList<Producto>();
	private String cadenaPago; // null
	private boolean pagado; // false
	
	public void addProducto(Producto producto) {
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
	
}
