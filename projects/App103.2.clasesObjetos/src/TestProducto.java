
public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto();
		
		// producto1.nombre = "Coca Cola"; // No es posible modificar atributos privados fuera de la clase
		
		producto1.setNombre("Coca Cola 600ml ");
		producto1.setNombre("Coca Cola 600ml :D");
		producto1.setNombre("Coca Cola 600ml");
		
		System.out.println(producto1);
		
		// System.out.println(producto1.nombre); // No es posible acceder
		System.out.println(producto1.getNombre());
		
		System.out.println(producto1.getDescripcion());
		
	}
	
}
