
public class TestRobot1D {

	public static void main(String[] args) {
		
		Robot1D r1 = new Robot1D();
		
		System.out.println(r1);
		
		r1.avanzar(); // 1
		r1.avanzar(6); // 7
		r1.retroceder(3); // 4
		
		System.out.println(r1);
		
	}
	
}
