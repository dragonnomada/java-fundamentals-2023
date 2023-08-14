
public class TestRutinaContador {

	// Seguimos propagando el error, hasta que alguien m�s lo resuelva
	public static void main(String[] args) throws Exception {
		
		RutinaContador rutina = new RutinaContador();
		
		rutina.avanzar(100);
		rutina.avanzar(200);

		System.out.println(rutina); // 300
		
		rutina.avanzar(40);
		rutina.avanzar(32);
		
		System.out.println(rutina); // 372
		
		rutina.retroceder();
		
		System.out.println(rutina);
		
		rutina.avanzar(5);
		rutina.avanzar(15);
		
		System.out.println(rutina);
		
		rutina.retroceder();
		
		System.out.println(rutina);
		
		rutina.pasosTotal = 100;
		
		try {
			rutina.retroceder();
		} catch(Exception e) {
			// TODO: Hay un uso mal intencionado de la rutina
			// TODO: Reportar la incidencia
			System.out.println("[ADVERTENCIA] El uso de la rutina gener� una violaci�n al c�digo");
			System.out.println("Esta incidencia ser� reportada y se intentar� rescatar la rutina");
			rutina.reiniciar();
		}

		System.out.println(rutina);
		
	}
	
}
