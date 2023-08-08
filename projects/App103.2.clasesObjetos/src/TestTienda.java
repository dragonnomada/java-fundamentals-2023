import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		
		/*
		
		// T[] -> Arreglo de tipo T
		//        = new T[<tamaño>]
		
		int[] numeros = new int[10];
		
		// El arreglo es un tipo de dato propagado en memoria e indexado
		// nos permite almacenar múltiples valores de un mismo tipo
		// y acceder o reemplzar mediante su índice
		
		// 0...9 (10: 0 1 2 3 4 5 6 7 8 9)
		System.out.println(numeros[0]);
		
		Producto[] productos = new Producto[5];
		
		// Objeto producto en el índice 0 del arreglo de productos
		productos[0] = new Producto();
		
		System.out.println(productos[0]);
		
		*/
		
		Producto[] productos = new Producto[100];
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Selecciona una opción:");
			System.out.println("1. Ver producto");
			System.out.println("2. Buscar producto");
			System.out.println("3. Registrar producto");
			System.out.println("4. Editar producto");
			System.out.println("5. Quitar producto");
			System.out.println("--------------------------");
			System.out.println("0. Salir");
			System.out.println();
			
			System.out.print(":> ");
			int opcion = scanner.nextInt(); scanner.nextLine();
			
			if (opcion == 1) {
				// TODO: Ver un producto
				System.out.print("Índice: ");
				int indice = scanner.nextInt(); scanner.nextLine();
				Producto producto = productos[indice];
				System.out.println(producto);
			} else if (opcion == 2) {
				// TODO: Buscar un producto
			} else if (opcion == 3) {
				// TODO: Registrar un producto
				System.out.print("Índice: ");
				int indice = scanner.nextInt(); scanner.nextLine();
				System.out.print("Nombre: ");
				String nombre = scanner.nextLine();
				System.out.print("Precio: ");
				double precioUnitario = scanner.nextDouble();  scanner.nextLine();
				
				Producto producto = new Producto();
				producto.setNombre(nombre);
				producto.setPrecioUnitario(precioUnitario);
				
				productos[indice] = producto;
				
				System.out.println("Producto registrado en el índice: " + indice);
				System.out.println(producto);
			} else if (opcion == 0) {
				break;
			} else {
				System.out.println("La opción no es válida");
			}
			
		}
		
	}
	
}
