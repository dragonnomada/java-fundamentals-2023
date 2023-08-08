
// CLASE -> DISE�O -> CONSTRUIR OBJETOS
// OBJETO <- INSTANCIA DE UNA CLASE
// OBJETO <- UNA VARIABLE/CLASE (TIPO_CLASE) QUE RESERVA MEMORIA
//           SUFICIENTE PARA RETENER TODAS LAS PROPIEDADES NECESARIAS
public class Persona {

	// PROPIEDADES (Atributos)
	// * Las propiedades por defecto no est�n inicializadas
	//   por lo que tendr�n los valores base:
	//   0     - para primitivos num�ricos
	//   false - para booleanos
	//   null  - para otros tipos
	long id; // 0L
	String nombre; // null
	int edad; // 0
	double estatura; // 0.0
	double peso; // 0.0
	boolean estaCasado; // false
	boolean trabaja; // false
	boolean estudia; // false
	
	// M�TODOS
	// TIPO_RETORNO NOMBRE_M�TODO(PAR�METROS...) { BLOQUE... }
	// T nombre(T1 p1, T2 p2, ...) { ... }
	void describir() {
		System.out.println("------------------------------------------");
		System.out.printf("ID: %d %n", id);
		System.out.printf("NOMBRE: %s %n", nombre);
		System.out.printf("EDAD: %d a�os %n", edad);
		System.out.printf("ESTATURA / PESO: %.2f M / %.2f KG %n", estatura, peso);
		System.out.printf("CASADO(A): %B %n", estaCasado);
		System.out.printf("TRABAJA: %B %n", trabaja);
		System.out.printf("ESTUDIA: %B %n", estudia);
		System.out.println("------------------------------------------");
	}
	
}
