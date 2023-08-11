
public class TestAbecedario2 {

	/**
	 * @param contador
	 */
	public static void contarCada500ms(Contador contador) {
		
		while (true) {
			contador.incrementar();
			
			if (contador.obtenerValorActual() == 27) {
				contador.reiniciar();
			}
			
			System.out.printf("CONTEO: %d %n", contador.obtenerValorActual());
			System.out.println(contador);
			System.out.println("----------------------------");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				//
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Abecedario abc = new Abecedario();
		
		contarCada500ms(abc);
		
	}
	
}
