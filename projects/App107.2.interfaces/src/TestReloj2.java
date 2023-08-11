
public class TestReloj2 {

	public static void contarCada500ms(Contador contador) {
		
		while (true) {
			contador.incrementar();
			
			if (contador.obtenerValorActual() == 10) {
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
		
		Reloj reloj = new Reloj();
		
		contarCada500ms(reloj);
		
	}
	
}
