
public class TestFrutaRepository {

	public static void main(String[] args) {
		
		FrutaRepository frutaReposity = new FrutaRepository();
		
		frutaReposity.agregarFrutaFinal(1, "Manzana", 45.6);
		frutaReposity.agregarFrutaFinal(23, "Mango", 12.8);
		frutaReposity.agregarFrutaFinal(78, "Pera", 76.3);
		frutaReposity.agregarFrutaFinal(99, "Melón", 76.3);
		frutaReposity.agregarFrutaFinal(45, "Piña", 29.99);
		frutaReposity.agregarFrutaFinal(17, "Kiwi", 15.66);
		frutaReposity.agregarFrutaFinal(33, "Manzana Golden", 45.99);
		
		System.out.println(frutaReposity);
		
//		Fruta fruta1 = frutaReposity.consultarFrutaPorIndice(0);
//		Fruta fruta2 = frutaReposity.consultarFrutaPorIndice(4);
//		
//		System.out.println(fruta1);
//		System.out.println(fruta2);
		
		Fruta fruta3 = frutaReposity.consultarFrutaPorId(78);
		Fruta fruta4 = frutaReposity.consultarFrutaPorId(100);
		
		System.out.println(fruta3);
		System.out.println(fruta4);
		
		Fruta fruta5 = frutaReposity.consultaFrutaPorNombre("pera");
		Fruta fruta6 = frutaReposity.consultaFrutaPorNombre("gol");
		
		System.out.println(fruta5);
		System.out.println(fruta6);
		
		Fruta fruta7 = frutaReposity.quitarFrutaFinal();
		Fruta fruta8 = frutaReposity.quitarFrutaFinal();
		
		System.out.println(fruta7);
		System.out.println(fruta8);
		
		System.out.println(frutaReposity);
		
		Fruta fruta9 = frutaReposity.quitarFrutaPorId(23);
		Fruta fruta10 = frutaReposity.quitarFrutaPorId(45);
		
		System.out.println(fruta9);
		System.out.println(fruta10);
		
		System.out.println(frutaReposity);
		
	}
	
}
