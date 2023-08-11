
/*
 * En el diseño de una clase abstracta
 * se hace exactamente lo mismo que en una clase normal:
 * 
 * - Se definen las propiedades y sus valores iniciales.
 * - Se definen los constructores.
 * - Se definen los métodos.
 * - Pero, se deja alternativo la implementación de todos o algunos métodos.
 * 
 */

public abstract class Triangulo {

	protected double x1;
	protected double y1;
	protected double x2;
	protected double y2;
	protected double x3;
	protected double y3;
	
	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public Triangulo(double base, double altura, boolean sesgado) {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = base;
		this.y2 = 0;
		this.x3 = sesgado ? base : base / 2;
		this.y3 = altura;
	}
	
	public abstract double area();
	
	public boolean esValido() {
		double d12 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double d13 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double d23 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		return (d12 < d13 + d23) && (d13 < d12 + d23) && (d23 < d12 + d13);
	}
	
	public abstract double[] angulos();
	
}
