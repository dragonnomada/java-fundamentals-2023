
/*
 * Cu�ndo un m�todo es marcado para arrojar excepciones
 * es decir, un m�todo fue marcado con throws <TIPO EXCEPTION>
 * signfica que ese m�todo no puede ser usado tal cual
 * 
 * Requiere un control del error, para determinar qu� hacer
 * ante una posible eventualidad como que ocurra el error.
 * 
 * Existen dos formas de manejar el error:
 * 
 * 1. Encapsular el c�digo propenso a fallar mediante try-catch (creamos un control)
 * 2. Marcar el m�todo inmediato para que siga propagando el error
 *    y algui�n m�s se haga responsable de controlarlo (creamos una propagaci�n)
 * 
 * 
 */

public class TestContador {

	public static void main(String[] args) {
		
		Contador contadorPasos = new Contador();
		
		contadorPasos.incrementar();
		contadorPasos.incrementar();
		contadorPasos.incrementar();
		contadorPasos.incrementar();
		contadorPasos.incrementar();
		
		System.out.println(contadorPasos);
		
		// Estas l�neas de c�digo son propensas a fallar
		// ya que el m�todo decrementar ha sido marcado para fallar
		// es decir, presupone en un caso extremo que el c�digo
		// dejar� de funcionar por un error inesperado en una
		// funcionalidad no v�lida o inesperada
		
		// Podemos manejar las excepciones a tr�ves de
		// la estructura:
		// try { 
		//        BLOQUE DE SENTENCIAS PROPENSAS A FALLAR O NO 
		// } catch (Exception e) {
		//        BLOQUE DE SENTENCIAS PARA MITIGAR LA FALLA
		// }
		try {
			contadorPasos.decrementar();
		} catch(Exception e) {
			// Una vez que atrapamos la excepcion
			// podemos hacer algo al respecto de esta funcionalidad
			// no v�lida, por ejemplo, reportar al usuario
			// emitir una alerta, mandar un correo electr�nico
			// mostrar un error en pantalla, etc.
			System.out.println(e.getMessage());
			// Imprime toda la traza de la excepci�n (desde d�nde empez�,
			// hasta d�nde termin� la falla.
			e.printStackTrace();
		}
		
		// Evalua m�ltiples llamadas que pueden o no fallar
		// y al final si alguna falla ser� controlada
		try {
			contadorPasos.decrementar();
			
			System.out.println(contadorPasos);
			
			contadorPasos.decrementar();
			contadorPasos.decrementar();
			contadorPasos.decrementar();
			contadorPasos.incrementar();
			contadorPasos.decrementar();
			contadorPasos.decrementar(); // at TestContador.java:72
			contadorPasos.decrementar(); // NO :(
			contadorPasos.decrementar(); // NO u_u
			
			System.out.println(contadorPasos); // NO T_T
		} catch (Exception e) {
			// Hay veces que no sabemos qu� hacer si llegara a lanzarse una excepci�n
			e.printStackTrace();
			// TIPO EXCEPTION: MENSAJE DE ERROR/FALLA
			//     at Contador.java:31
			//     at TestContador.java:72
		}
		
	}
	
}
