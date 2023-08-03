
public class E102 {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		double c = 5;
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.printf("Area del triángulo (%.2f, %.2f, %.2f): %.2f %n", a, b, c, area);
		
	}
	
}
