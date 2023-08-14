
/*
 * Una excepci�n es un marcado en c�digo para advertir
 * mediante un error que hay funcionalidad no v�lida o no esperada
 * 
 */

public class Contador {

	private int conteo = 0;

	public void incrementar() {
		conteo++;
	}

	// El m�todo ha sido marcado para fallar (puede "tronar")
	// es decir, este m�todo es capaz de en alg�n punto fallar
	// o en t�rminos formales arrojar una exception (hacer un throw <TIPO EXCEPTION>)
	public void decrementar() throws Exception {
		conteo--;
		
		if (conteo < 0) {
			// Lanzamos una Excepci�n de la clase Exception
			// con un mensaje sobre el error o funcionalidad no v�lida
			// o inesperada que le advierta al usuario que en este punto
			// para esta clase, en esta l�nea de c�digo, surgi� una Excepci�n
			// No podemos lanzar excepciones dentro un m�todo, si no advertimos
			// que el m�todo es capaz de "tronar", por lo que el m�todo
			// tiene que advertir a qui�n lo use que puede fallar
			// mediante la incrustaci�n en su definici�n de throws <TIPO EXCEPTION>
			throw new Exception("El contador se ha vuelto negativo"); // Contador.java:31
		}
	}

	@Override
	public String toString() {
		return "Contador [conteo=" + conteo + "]";
	}

}
