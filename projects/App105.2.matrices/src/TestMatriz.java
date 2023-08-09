
public class TestMatriz {

	public static void main(String[] args) {
		
		Matriz m1 = new Matriz(3, 3);
		
		m1.set(1, 1, 10);
		m1.set(0, 2, 5);
		
		System.out.println(m1);
		
		Matriz m2 = new Matriz(4, 7);
		
		m2.fill(1);
		m2.diag();
		m2.set(0, 6, 5);
		
		System.out.println(m2);
		
		Matriz m3 = m2.T();
		m3.set(0, 3, 8);
		m3.set(6, 1, 2);
		m3.set(5, 2, 3);
		
		System.out.println(m3);
		
		Matriz m4 = m3.adyacente(1, 1);
		
		System.out.println(m4);
		
	}
	
}
