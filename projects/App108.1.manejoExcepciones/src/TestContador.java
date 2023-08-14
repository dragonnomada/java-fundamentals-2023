
/*
 * Cuándo un método es marcado para arrojar excepciones
 * es decir, un método fue marcado con throws <TIPO EXCEPTION>
 * signfica que ese método no puede ser usado tal cual
 * 
 * Requiere un control del error, para determinar qué hacer
 * ante una posible eventualidad como que ocurra el error.
 * 
 * Existen dos formas de manejar el error:
 * 
 * 1. Encapsular el código propenso a fallar mediante try-catch (creamos un control)
 * 2. Marcar el método inmediato para que siga propagando el error
 *    y alguién más se haga responsable de controlarlo (creamos una propagación)
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
		
		// Estas líneas de código son propensas a fallar
		// ya que el método decrementar ha sido marcado para fallar
		// es decir, presupone en un caso extremo que el código
		// dejará de funcionar por un error inesperado en una
		// funcionalidad no válida o inesperada
		
		// Podemos manejar las excepciones a tráves de
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
			// no válida, por ejemplo, reportar al usuario
			// emitir una alerta, mandar un correo electrónico
			// mostrar un error en pantalla, etc.
			System.out.println(e.getMessage());
			// Imprime toda la traza de la excepción (desde dónde empezó,
			// hasta dónde terminó la falla.
			e.printStackTrace();
		}
		
		// Evalua múltiples llamadas que pueden o no fallar
		// y al final si alguna falla será controlada
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
			// Hay veces que no sabemos qué hacer si llegara a lanzarse una excepción
			e.printStackTrace();
			// TIPO EXCEPTION: MENSAJE DE ERROR/FALLA
			//     at Contador.java:31
			//     at TestContador.java:72
		}
		
	}
	
}
