
public class E101 {

	public static void main(String[] args) {
		
		double px = 2;
		double py = 2;
		double cx = 3;
		double cy = 5;
		double r = 4;
		
		double dx = px - cx;
		double dy = py - cy;
		
		double d = Math.sqrt(dx * dx + dy * dy);
		
		// d > r ~> true | false (boolean) -> %B
		System.out.printf("FUERA: %B %n", d > r);
		System.out.printf("DENTRO: %B %n", d <= r);
		
	}
	
}
