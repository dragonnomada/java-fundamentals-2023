
public class TestProducto {

	public static void main(String[] args) throws ProductoPrecioNegativoException, ProductoPrecioCeroException, ProductoPrecioAltoException {
		
		Producto producto = new Producto(123, "Coca Cola");
		
		System.out.println(producto);
		
//		double nuevoPrecio = -10;
//		double nuevoPrecio = 0;
		double nuevoPrecio = 2_000_000; // Formato Java 8+ (Mejorar la legibilidad humana)
		
		try {
			producto.actualizarPrecio(nuevoPrecio);
		} catch (ProductoPrecioNegativoException e) {
			producto.actualizarPrecio(-nuevoPrecio);
			System.out.println("El precio fue negativo, por lo que se asume que el signo está mal");
		} catch (ProductoPrecioCeroException e) {
			producto.actualizarPrecio(0.01);
			System.out.println("El precio fue cero, por lo que se estable como 1 centavo mínimo");
		} catch (ProductoPrecioAltoException e) {
			producto.actualizarPrecio(999_999.99);
			System.out.println("El precio excede el límite, se ajustó a $999,999.99");
		} catch (Exception e) {
			// Exception siempre atrapa cualquier exception
			System.out.println("No se pudo actualizar el precio: " + e.getMessage());
			// SI ES NEGATIVO: actualizarPrecio(-nuevoPrecio);
			// SI ES CERO: actualizarPrecio(0.01);
			// SI ES ALTO: actualizarPrecio(999999.99)
			
			// Tenemos un problema porque no sabemos cuál fue la razón fina
			// por la que se generó la falla
		}
		
		System.out.println(producto);
		
		producto.actualizarPrecio(-200);
		
	}
	
}
