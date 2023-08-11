
public class TrianguloImpl extends Triangulo {

	public TrianguloImpl(double base, double altura, boolean sesgado) {
		super(base, altura, sesgado);
	}

	public TrianguloImpl(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1, x2, y2, x3, y3);
	}

	@Override
	public double area() {
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		
		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double[] angulos() {
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // d12
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)); // d13
		double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // d23
		
		// a^2 = b^2 + c^2 - 2*b*c*cos(aa)
		// cos(aa) = (b^2 + c^2 - a^2) / (2*b*c)
		// b^2 = a^2 + c^2 - 2*a*c*cos(bb)
		// cos(bb) = (a^2 + c^2 - b^2) / (2*a*c)
		// c^2 = a^2 + b^2 - 2*a*b*cos(cc)
		// cos(cc) = (a^2 + b^2 - c^2) / (2*b*b)
		
		double aa = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double bb = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		double cc = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		
		return new double[] { cc, bb, aa };
	}

}
