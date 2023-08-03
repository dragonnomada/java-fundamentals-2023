import java.util.Scanner;

public class E103 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dame los grados centigrados: ");
		
		double centigrados = scanner.nextDouble();
		
		double fahrenheit = 1.8 * centigrados + 32;
		
		System.out.printf("%.2f °C => %.2f °F %n", centigrados, fahrenheit);
		
		scanner.close();
		
	}
	
}
