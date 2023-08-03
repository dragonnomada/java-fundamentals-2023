
public class GeneradorReporteSimple {

	public static void main(String[] args) {
		
		System.out.println("Generador de Reportes Simple v1.0.0");
		
		// Formatos -> "TEXTO CON TOKENS DE REEMPLAZO"
		// Tokens:
		//   %c -> Reemplaza un caracter (char)
		//   %s -> Reemplaza un texto (String)
		//   %d -> Reemplaza un entero (byte, short, int, long, ...)
		//   %f -> Reemplaza un decimal (float, double, decimal, ...)
		//   %b | %B -> Reemplaza un valor lógico (boolean: true | false)
		//   %x | %X -> Reemplaza un entero en formato hexadecimal [0-9a-fA-F] (byte)
		//   %o -> Reemplaza un entero en formato octal [0-7] (byte)
		//   %n -> NO-REEMPLAZA pero pone un salto de línea
		//   %% -> NO-REEMPLAZA pero pone el símbolo de %
		
		int total = 3;
		
		// System.out.println(total); // -> "3"
		
		System.out.printf("Total: %d %n", total); // -> Total: 3
		
		System.out.println("----------------------------------");
		
		char grupo = 'A';
		String grupoNombre = "Analistas de Datos";
		
		System.out.printf("Grupo: (%c) %s %n", grupo, grupoNombre);
		
		double promedio = 9.9;
		
		// %f -> %.2f
		System.out.printf("Promedio: %.2f / 10.00 %n", promedio);
		
		float porcetanjeAprobados = 85.4999f; // decimal-corto (f)
		
		// %% -> '%'
		System.out.printf("%% Aprobados: %.0f%% %n", porcetanjeAprobados);
		
		
		
	}
	
}
