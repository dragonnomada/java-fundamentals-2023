import java.util.Date;

/*
 * Una expresi�n lambda es la contracci�n del �nico m�todo contenido en una interfaz
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
		
		// Las expresiones lambda contraen la implementaci�n de una interfaz singular
		// y definen los par�metros de entrada para producir un cuerpo de salida
		Runnable disparador = () -> {
			System.out.println("SE EJECUT�: " + new Date());
		};
		
		disparador.run();
		disparador.run();
		disparador.run();
		
	}
	
}
