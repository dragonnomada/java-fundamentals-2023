
public class TestRobot2D {

	public static void main(String[] args) {
		
		Robot2D r2 = new Robot2D();
		
		System.out.println(r2); // (0, 0) ESTE
		
		// ESTE
		r2.avanzar(); // (1, 0)
		r2.avanzar(6); // (7, 0)
		r2.retroceder(3); // (4, 0)
		r2.girarIzquierda(); // NORTE
		r2.avanzar(); // (4, 1)
		
		System.out.println(r2); // (4, 1) NORTE
		
		// UPCASTING
		// Es tratar a una clase inferior como una clase superior
		// Pero todo lo definido en las clases inferiores no podría ser utilizado
		// Esto sirve para soportar tipos de datos T y que todos los derivados U
		// puedan comportarse como T.
		Robot1D r3 = new Robot2D();
		
		r3.avanzar(); // (1, 0) ESTE
		r3.avanzar(6); // (7, 0) ESTE
		r3.retroceder(3); // (4, 0) ESTE
		//r3.girarDerecha(); // ERROR: No existe ese método para un robot 1D
		
	}
	
}
