
public class TestContador {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		contador.incrementar(); // 1
		contador.incrementar(10); // 11
		contador.incrementar(5, 3); // 58
		
		System.out.println(contador);
		
		Contador contadorImapares = new Contador(1);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(contadorImapares);
			contadorImapares.incrementar(1, 2);
		}
		
		System.out.println(contadorImapares);
		
	}
	
}
