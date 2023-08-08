
public class TestPersona {

	public static void main(String[] args) {
		
		// Creamos un objeto llamado persona1
		// Creamos una nueva instancia de la clase Persona
		// con el constructor por defecto
		// y retiene todos los valores para sus propiedades (id, nombre, edad, ...)
		Persona persona1 = new Persona();
		
		persona1.describir();
		
		Persona persona2 = new Persona();
		
		persona2.id = 123; // Modifiqué el ID
		persona2.nombre = "Ana"; // Modifiqué el nombre
		persona2.edad = 23; // Modifiqué la edad
		persona2.trabaja = true; // Modifiqué si trabaja
		
		persona2.describir();
		
		// ADVERTENCIA: Permitir modificar los atributos de una clase
		//              es peligroso.
		// 1. Alteración no esperada de los datos, por ejemplo, si el objeto
		//    se comparte entre diversos lugares del código, en algún lugar
		//    podría ser alterado y perder su integridad (por ejemplo, entre
		//    el código donde se trae de la base de datos y el código dónde
		//    se reportan sus estadísticos)
		// 2. Perdemos el control de la integridad del objeto y aumentaría
		//    el mantenimiento de detectar en qué lugares se actualizó el objeto
		// 3. Se rompe el concepto de Encapsulamiento (Encapsulación) que
		//    dice que un objeto debería mantenerse siempre en un estado esperado
		
	}
	
}
