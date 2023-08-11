import java.util.Arrays;

public class TestTriangulo {

	public static void main(String[] args) {
		
		Triangulo t1 = new TrianguloImpl(3, 3, true);
		
		System.out.println(t1.esValido());
		System.out.println(t1.area());

		double[] angulos1 = t1.angulos();

		System.out.println(Arrays.toString(angulos1));
		
		System.out.println(angulos1[0] * 180 / Math.PI);
		System.out.println(angulos1[1] * 180 / Math.PI);
		System.out.println(angulos1[2] * 180 / Math.PI);
		
		Triangulo t2 = new TrianguloImpl(3, 3, false);
		
		System.out.println(t2.esValido());
		System.out.println(t2.area()); // 0.0001ms | 0.00005ms (x1,000,000 -> 10ms | 5ms)

		double[] angulos2 = t2.angulos();

		System.out.println(Arrays.toString(angulos2));
		
		System.out.println(angulos2[0] * 180 / Math.PI);
		System.out.println(angulos2[1] * 180 / Math.PI);
		System.out.println(angulos2[2] * 180 / Math.PI);
		
		Triangulo t3 = new TrianguloImpl(0, 0, 1, 0, 0, 0);
		
		System.out.println(t3.esValido());
		
	}
	
}
