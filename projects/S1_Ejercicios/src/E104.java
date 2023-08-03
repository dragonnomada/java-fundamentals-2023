
public class E104 {

	public static void main(String[] args) {
		
		double a1x = 0;
		double a1y = 0;
		double a2x = 1;
		double a2y = 1;
		double b1x = 0;
		double b1y = 1;
		double b2x = 1;
		double b2y = 0;
		
		// a * t + b * s = f
		// c * t + d * s = g
		double a = (a2x - a1x);
		double b = -(b2x - b1x);
		double c = (a2y - a1y);
		double d = -(b2y - b1y);
		double f = b1x - a1x;
		double g = b1y - a1y;
		
		double t = (d * f - b * g) / (a * d - b * c);
		double s = (-c * f + a * g) / (a * d - b * c);
		
		double px = a1x + t * (a2x - a1x);
		double py = a1y + t * (a2y - a1y);
		
		double qx = b1x + s * (b2x - b1x);
		double qy = b1y + s * (b2y - b1y);
		
		System.out.printf("La intersección es: (%.1f, %.1f) %n", px, py);
		System.out.printf("La intersección es: (%.1f, %.1f) %n", qx, qy);
		
	}
	
}
