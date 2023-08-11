
/*
 * La interfaz Contador genera un tipo funcional
 * que es capaz de realizar las siguientes operaciones:
 * 
 * - int obtenerValorActual()
 * - void incrementar()
 * - void decrementar()
 * - void reiniciar()
 * 
 * Esto gener� el Estereotipo funcional capaz de hacer que
 * cualquier clase que lo implemente sea capaz de comportarse
 * como un Contador (TIPO Contador).
 * 
 * Es decir, la clase que implemente a Contador, busca
 * "ser un Contador", es decir, ser capaz de obtenerValorActual,
 * incrementar, decrementar y reiniciar.
 * 
 * Con esto cualquier clase que necesite un contador,
 * podr�a determinar su mejor implementaci�n para ese caso.
 * 
 */

public interface Contador {

	int obtenerValorActual();
	
	void incrementar();
	
	void decrementar();
	
	void reiniciar();
	
}
