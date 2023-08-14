import java.util.Date;

/*
 * Una expresión lambda es la contracción del único método contenido en una interfaz
 * 
 * Por ejemplo:
 * 
 * interface Runnable {
 *   public void run(); // () -> void | LAMBDA: () -> {}
 * }
 * 
 * interfaz Foo {
 * 	 public double total(double[] precios); // (double[] precios) -> double 
 *                                          // LAMBDA: (double[] precios) -> { ... return total; } 
 * }
 * 
 * 
 */

public class TestRunnableLambda {

	public static void main(String[] args) {
		
		// Las expresiones lambda contraen la implementación de una interfaz singular
		// y definen los parámetros de entrada para producir un cuerpo de salida
		Runnable disparador = () -> {
			System.out.println("SE EJECUTÓ: " + new Date());
		};
		
		disparador.run();
		disparador.run();
		disparador.run();
		
	}
	
}
