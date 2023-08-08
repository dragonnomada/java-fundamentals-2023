
public class TestPersona {

	public static void main(String[] args) {
		
		// Creamos un objeto llamado persona1
		// Creamos una nueva instancia de la clase Persona
		// con el constructor por defecto
		// y retiene todos los valores para sus propiedades (id, nombre, edad, ...)
		Persona persona1 = new Persona();
		
		persona1.describir();
		
		Persona persona2 = new Persona();
		
		persona2.id = 123; // Modifiqu� el ID
		persona2.nombre = "Ana"; // Modifiqu� el nombre
		persona2.edad = 23; // Modifiqu� la edad
		persona2.trabaja = true; // Modifiqu� si trabaja
		
		persona2.describir();
		
		// ADVERTENCIA: Permitir modificar los atributos de una clase
		//              es peligroso.
		// 1. Alteraci�n no esperada de los datos, por ejemplo, si el objeto
		//    se comparte entre diversos lugares del c�digo, en alg�n lugar
		//    podr�a ser alterado y perder su integridad (por ejemplo, entre
		//    el c�digo donde se trae de la base de datos y el c�digo d�nde
		//    se reportan sus estad�sticos)
		// 2. Perdemos el control de la integridad del objeto y aumentar�a
		//    el mantenimiento de detectar en qu� lugares se actualiz� el objeto
		// 3. Se rompe el concepto de Encapsulamiento (Encapsulaci�n) que
		//    dice que un objeto deber�a mantenerse siempre en un estado esperado
		
	}
	
}
