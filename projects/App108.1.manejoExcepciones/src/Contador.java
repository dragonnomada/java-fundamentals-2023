
/*
 * Una excepción es un marcado en código para advertir
 * mediante un error que hay funcionalidad no válida o no esperada
 * 
 */

public class Contador {

	private int conteo = 0;

	public void incrementar() {
		conteo++;
	}

	// El método ha sido marcado para fallar (puede "tronar")
	// es decir, este método es capaz de en algún punto fallar
	// o en términos formales arrojar una exception (hacer un throw <TIPO EXCEPTION>)
	public void decrementar() throws Exception {
		conteo--;
		
		if (conteo < 0) {
			// Lanzamos una Excepción de la clase Exception
			// con un mensaje sobre el error o funcionalidad no válida
			// o inesperada que le advierta al usuario que en este punto
			// para esta clase, en esta línea de código, surgió una Excepción
			// No podemos lanzar excepciones dentro un método, si no advertimos
			// que el método es capaz de "tronar", por lo que el método
			// tiene que advertir a quién lo use que puede fallar
			// mediante la incrustación en su definición de throws <TIPO EXCEPTION>
			throw new Exception("El contador se ha vuelto negativo"); // Contador.java:31
		}
	}

	@Override
	public String toString() {
		return "Contador [conteo=" + conteo + "]";
	}

}
