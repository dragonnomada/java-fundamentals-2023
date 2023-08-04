
public class UseTypes {

	public static void main(String[] args) {

		String nombre = "Ana Ming"; // 0x41 0x6E 0x61 ... 0x67

		// 4-bits ~ 1111 | 0xF
		// 8-bits ~ 1010 0101 | 0xA5

		// 32-bit (8-bits -> 4)
		// 23d ~ 0001 0111 ~ 0x17
		int edad = 23; // 0x00 0x00 0x00 0x17 [00 00 00 17] | [32 33]

		// 126 ~ 0111 1110 ~ 0x7E
		// 8-bit (8-bit -> 1)
		byte uid = 126; // 0x7E

		System.out.println("VAL \t\t HEX");
		
		System.out.printf("%c \t\t %X %n", nombre.charAt(0), (byte) nombre.charAt(0));
		System.out.printf("%c \t\t %X %n", nombre.charAt(1), (byte) nombre.charAt(1));

		System.out.printf("%d \t\t %X %n", edad, edad);
		
		System.out.printf("%d \t\t %X %n", uid, uid);
		
		// 64-bit (8-bit -> 8)
		long segundos = 23478932897524L; // 123L
		
		System.out.printf("%d \t %X %n", segundos, segundos);
		
	}

}
