
public class TestVector {

	public static void main(String[] args) {
		
		Vector vector1 = new Vector(3);
		
		vector1.set(0, 5);
		vector1.set(1, -3);
		vector1.set(2, 8);
		
		System.out.println(vector1);
		
		Vector vector2 = new Vector(3);
		
		vector2.set(0, 1);
		vector2.set(1, -2);
		vector2.set(2, 3);
		
		System.out.println(vector2);
		
		double p = Vector.dot(vector1, vector2);
		double nu = Vector.norm(vector1);
		double nv = Vector.norm(vector2);
		double a = Vector.angle(vector1, vector2);
		
		System.out.println(p);
		System.out.println(nu);
		System.out.println(nv);
		System.out.println(a);
		
		Vector u = new Vector(2);
		u.set(0, 0);
		u.set(1, 1);
		
		Vector v = new Vector(2);
		v.set(0, -1);
		v.set(1, 1);
		
		System.out.println(Vector.angle(u, v) * 180 / Math.PI);
		
	}
	
}
