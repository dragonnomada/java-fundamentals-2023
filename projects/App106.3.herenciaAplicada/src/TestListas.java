import java.util.ArrayList;
import java.util.List;

/*
 * La lista de Java conocida como `List<T>` es una interfaz gen�rica
 * es decir, una clase de tipo gen�rico, que permite asociar
 * otra clase T, para retener elementos (objetos/instancias) de
 * la clase T.
 * 
 * Por ejemplo, `List<A>` retendr�a objetos de clase A
 * 
 * Otro ejemplo, `List<String>` retendr�a textos de tipo String
 * 
 * M�s ejemplos: `List<Integer>` retendr�a enteros de la clase Integer
 * ya que el tipo primitivo `int` no es de tipo CLASE, es primitivo,
 * por lo que no podr�amos crear una lista de tipo `int`, pero si de su clase
 * asociada llamada `Integer`. Lo mismo aplicar�a para los siguientes primitivos:
 * 
 * `List<Short>` - Para primitivos tipo `short`
 * `List<Integer>` - Para primitivos tipo `int`
 * `List<Long>` - Para primitivos tipo `long`
 * `List<Float>` - Para primitivos tipo `float`
 * `List<Double>` - Para primitivos tipo `double`
 * `List<Boolean>` - Para primitivos tipo `boolean`
 * `List<Byte>` - Para primitivos tipo `byte`
 * `List<Character>` - Para primitivos tipo `char`
 * 
 * A estos se les conoce como las clases asociadas a los primitivos
 * o los tipos formales de los primitivos.
 * 
 * La lista es una interfaz, que requiere una implementaci�n funcional
 * para poder operarla.
 * 
 * Existen muchas implementaciones de la interfaz gen�rica `List<T>` como:
 * 
 * `ArrayList<T>` - Representa una lista a trav�s de un Array
 * `LinkedList<T>` - Representa una lista a trav�s de una lista enlazada
 * `Stack` - Representa una pila
 * `Vector` - Representa un vector
 * 
 * La interfaz gen�rica `List<T>` propone m�todos para agregar y quitar elementos:
 * 
 * `add(T value)` - Agrega un elemento de tipo `T`
 * `insert(int index, T value)` - Agrega un elemento de tipo `T` en 
 * 								  el �ndice especificado y recorre los dem�s
 * `remove(T value)` - Quita el primer elemento con ese valor
 * `remove(int index)` - Quita el elemento con el �ndice especificado y recorre los dem�s
 * `T get(int index)` - Devuelve el valor de tipo `T` del �ndice especificado
 * `set(int index, T value)` - Reemplaza el valor de tipo `T` en el �ndice especificado
 * `int size()` - Determina el total de elementos en la lista
 * 
 */

public class TestListas {

	
	public static void main(String[] args) {
		
		List<String> frutas = new ArrayList<String>();
		
		// Agregar una fruta a la lista de frutas
		frutas.add("Mazana");
		frutas.add("Pera");
		frutas.add("Mango");
		
		frutas.remove(1);
		
		// La Lista es una colecci�n iterable, por lo que
		// podemos recorrer sus elementos con un for-each
		for (String fruta : frutas) {
			System.out.printf("%s - %d %n", fruta, fruta.length());
		}
		
		// Alternativamente podemos hacer un for-tradicional
		// para recorrer cada �ndice en la lista
		// y recuperar manualmente el valor
		for (int i = 0; i < frutas.size(); i++) {
			String fruta = frutas.get(i);
		}
		
	}
	
}
