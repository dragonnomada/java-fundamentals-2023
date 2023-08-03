import java.io.IOException;

// Importamos clases, interfaces y tipos

// Declaración clase/interfaz/enumeración/...
/**
 * Esta es una clase de prueba que imprime un Hola mundo 
 * en la salida estándar.
 * 
 * Tiene un método principal para ejecutar la prueba 
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

	// propiedades estáticas
	
	// métodos estáticos
	
	// propiedades de la clase
	
	// métodos de la clase
	
	// método main (si la clase será ejecutable)
	/*
	 * Este es un comentario de múltiples líneas
	 * pero si uso DIAGONAL-ASTERISCO-ASTERISCO
	 * se convertirá en documentación de JAVADOC
	 * que será utilizada para describir clases, métodos
	 * y propiedades usando diferentes anotaciones
	 * para describir parámetros (@param)
	 * tipo de retorno (@retun)
	 * el autor (@author)
	 * si está obsoleto y porqué (@deprecate)
	 * si arrojará alguna excepción y cuándo (@throws)
	 * referencias a otros tipos (@see)
	 */
	/**
	 * Este es el método principal de la clase Hola
	 * para que ejecute una prueba unitaria
	 * @param args String[] - Los argumentos enviados desde la terminal
	 * 
	 * @author Alan Badillo
	 * @deprecated El método dejo de ser funcional por lo que no se recomienda su uso
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
