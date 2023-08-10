
public class TestRecibo {

	public static void main(String[] args) {

		Recibo recibo = new Recibo();

		for (int i = 0; i < 10; i++) {
			Producto producto = new Producto();
			producto.setId(i + 1);
			producto.setNombre("PRODUCTO DEMO " + i);
			producto.setDescripcion("Este es un producto de pruebas");
			producto.setPrecio(Math.random() * 100);

			recibo.agregarProducto(producto);
		}

		// UPCASTING
		// Producto producto = new Libro(...)
		// recibo.agregarProducto(producto)
		recibo.agregarProducto(new Libro(123, "Cien a�os de soledad", "Gabriel Garc�a M�rquez", 1967,
				"\"Cien a�os de soledad\" narra la historia de la familia Buend�a a lo largo de varias generaciones en el ficticio pueblo de Macondo. La novela mezcla la realidad con elementos fant�sticos y m�gicos, siguiendo los destinos tumultuosos de los miembros de la familia mientras enfrentan amor, poder, violencia y el inevitable ciclo de la soledad y la decadencia. La obra de Gabriel Garc�a M�rquez explora temas como el tiempo c�clico, la fatalidad y la conexi�n entre lo individual y lo colectivo, creando una narrativa densa y evocadora que ha dejado una marca perdurable en la literatura mundial.",
				456.78));

		System.out.println(recibo);

	}

}
