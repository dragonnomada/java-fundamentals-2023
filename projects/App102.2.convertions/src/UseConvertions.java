
public class UseConvertions {

	public static void main(String[] args) {
		
		// String  -> <n>-byte (<n/4>-bits | <n/8>-mem)
		// byte    -> 1-byte   (8-bits     | 1-mem)
		// char    -> 1-byte   (8-bits     | 1-mem)
		// boolean -> 1-byte   (8-bits     | 1-mem)
		// short   -> 4-byte   (16-bits    | 4-mem)
		// int     -> 8-byte   (32-bits    | 8-mem)
		// long    -> 16-byte  (64-bits    | 16-mem)
		// float   -> 8-byte   (32-bits    | 8-mem)
		// double  -> 16-byte  (64-bits    | 16-mem)
		
		String nombre = "Ana Ming Lee";
		String correo = "ana@gmail.com";
		int edad = 23;
		float estatura = 1.56F; // 123.456F | 123.456f
		float peso = 58.4f;
		double salario = 9578.93;
		boolean casado = false;
		boolean estudia = true;
		boolean trabaja = true;
		char siglaPrincipal = 'M';
		char siglaSecundaria = 'L';
		short pasosCaminados = 4521;
		byte colorR = (184 - 128);
		byte colorG = (76 - 128);
		byte colorB = (23 - 128);
		
		String nombreText = nombre;
		String correoText = correo;
		String edadText = String.valueOf(edad);
		String estaturaText = String.valueOf(estatura);
		String pesoText = String.valueOf(peso);
		String salarioText = String.valueOf(salario);
		String casadoText = String.valueOf(casado);
		String estudiaText = String.valueOf(estudia);
		String siglaPrincipalText = String.valueOf(siglaPrincipal);
		String siglaSecundariaText = String.valueOf(siglaSecundaria);
		String pasosCaminadosText = String.valueOf(pasosCaminados);
		String colorRText = String.valueOf(colorR);
		String colorGText = String.valueOf(colorG);
		String colorBText = String.valueOf(colorB);
		
		// Codificar los valores a un texto con formato especial
		
		String linea1 = String.format("%s - %s", nombre, correo);
		String linea2 = String.format("%d | %.2f | %.2f", edad, estatura, peso);
		String linea3 = String.format("%.8f", salario);
		String linea4 = String.format("%B %B %B", casado, estudia, trabaja);
		String linea5 = String.format("%c : %c", siglaPrincipal, siglaSecundaria);
		String linea6 = String.format("%d, %d, %d", colorR, colorG, colorB);
		
		System.out.println(linea1); // String linea1 = "%s - %s"
		System.out.println(linea2); // String linea2 = "%d | %.2f | %.2f"
		System.out.println(linea3); // String linea3 = "%.8f"
		System.out.println(linea4); // String linea4 = "%B %B %B"
		System.out.println(linea5); // String linea5 = "%c : %c"
		System.out.println(linea6); // String linea6 = "%d, %d, %d"
		
	}
	
}
