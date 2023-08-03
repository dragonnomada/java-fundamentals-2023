import java.io.IOException;

// Importamos clases, interfaces y tipos

// Declaraci�n clase/interfaz/enumeraci�n/...
/**
 * Esta es una clase de prueba que imprime un Hola mundo 
 * en la salida est�ndar.
 * 
 * Tiene un m�todo principal para ejecutar la prueba 
 * (esta clase es ejecutable).
 * 
 * @author Alan
 * 
 * @version 1.0.0 alpha1
 * 
 * {@code 
 * 
 * 	 Hola hola = new Hola(); 
 * 
 * }
 * 
 */
public class Hola {

	// propiedades est�ticas
	
	// m�todos est�ticos
	
	// propiedades de la clase
	
	// m�todos de la clase
	
	// m�todo main (si la clase ser� ejecutable)
	/*
	 * Este es un comentario de m�ltiples l�neas
	 * pero si uso DIAGONAL-ASTERISCO-ASTERISCO
	 * se convertir� en documentaci�n de JAVADOC
	 * que ser� utilizada para describir clases, m�todos
	 * y propiedades usando diferentes anotaciones
	 * para describir par�metros (@param)
	 * tipo de retorno (@retun)
	 * el autor (@author)
	 * si est� obsoleto y porqu� (@deprecate)
	 * si arrojar� alguna excepci�n y cu�ndo (@throws)
	 * referencias a otros tipos (@see)
	 */
	/**
	 * Este es el m�todo principal de la clase Hola
	 * para que ejecute una prueba unitaria
	 * @param args String[] - Los argumentos enviados desde la terminal
	 * 
	 * @author Alan Badillo
	 * @deprecated El m�todo dejo de ser funcional por lo que no se recomienda su uso
	 * 
	 * @throws IOException si el archivo no existe
	 * @see IOException
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		// String literal "hola mundo" -> (String)
		System.out.println("Hola mundo");
		
	}
	
}
