import java.util.Scanner;

public class TestCarritoCompras {

	public static void main(String[] args) {

		CarritoCompras carrito = new CarritoCompras();

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Bienvenido, este es el carrito de compras.");
			System.out.println("------------------------------------------");
			System.out.println(carrito);
			System.out.println("------------------------------------------");
			System.out.println("Selecciona una opción:");
			System.out.println("1. Buscar por código de barras");
			System.out.println("2. Quitar por código de barras");
			System.out.println("2. Quitar todos los productos");
			System.out.println("------------------------------------------");
			System.out.println("100. Agregar una playera");
			System.out.println("101. Agregar un libro");
			System.out.println("102. Agregar una fruta");
			System.out.println("------------------------------------------");
			System.out.println("0. Salir");

			System.out.println();
			System.out.print(":> ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			if (opcion == 0) {
				System.out.println("ADIÓS :)");
				break;
			} else if (opcion == 1) {
				System.out.print("CÓDIGO BARRAS: ");
				String codigoBarras = scanner.nextLine();
				Producto productoEncontrado = carrito.buscarProducto(codigoBarras);
				if (productoEncontrado != null) {
					System.out.println("PRODUCTO ENCONTRADO:");
					System.out.println(productoEncontrado.getDescripcion());
				} else {
					System.out.println("PRODUCTO NO ENCONTRADO");
				}
			} else if (opcion == 2) {
				System.out.print("CÓDIGO BARRAS: ");
				String codigoBarras = scanner.nextLine();
				Producto productoEncontrado = carrito.buscarProducto(codigoBarras);
				if (productoEncontrado != null) {
					System.out.println("PRODUCTO ENCONTRADO:");
					System.out.println(productoEncontrado.getDescripcion());
					carrito.quitaProducto(codigoBarras);
				} else {
					System.out.println("PRODUCTO NO ENCONTRADO");
				}
			} else if (opcion == 3) {
				System.out.print("¿ESTÁS SEGURO DE QUITAR TODOS? [S/N]: ");
				String respuesta = scanner.nextLine();
				if (respuesta.matches("s|S|y|Y|1|0")) {
					carrito.quitaTodosProductos();
					System.out.println("EL CARRITO FUE VACIADO");
				}
			} else if (opcion == 100) {
				System.out.print("CÓDIGO BARRAS: ");
				String codigoBarras = scanner.nextLine();
				System.out.print("TIPO PLAYERA: ");
				String tipo = scanner.nextLine();
				System.out.print("TALLA PLAYERA [XCH, CH, M, G, EG]: ");
				String talla = scanner.nextLine();
				System.out.print("COLOR PLAYERA: ");
				String color = scanner.nextLine();
				System.out.print("PRECIO BASE PLAYERA: ");
				double precio = scanner.nextDouble();
				scanner.nextLine();
				
				Playera playera = new Playera();
				playera.setCodigoBarras(codigoBarras);
				playera.setTipo(tipo);
				playera.setTalla(talla);
				playera.setColor(color);
				playera.setPrecioBase(precio);
				
				carrito.agregarProducto(playera);
				
				System.out.println("PLAYERA AGREGADA");
				System.out.println(carrito.ultimoProducto().getDescripcion());
			}

		}

		scanner.close();

	}

}
