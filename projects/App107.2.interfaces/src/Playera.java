
public class Playera implements Producto {

	private String codigoBarras = "123456789"; // 071234995
	private String tipo = "POLO"; // POLO, CUELLO-V, CUELLO-R, DEPORTIVA
	private String talla = "CH"; // XCH, CH, M, G, EG
	private String color = "DESCONOCIDO"; // ROJO, AZUL, VERDE, BLANCO
	private double precioBase = 1.0; // 9.99 (XCH, CH, M -> 9.99 | G, EG -> 14.98)
	private double factorChicaMediana = 1.0; // 1.0
	private double factorGrandeMas = 1.0;    // 1.5

	public boolean chicaAMedianda() {
		return tipo.matches("XCH|CH|M");
	}
	
	public boolean grandeMas() {
		return !chicaAMedianda();
	}
	
	public double getPrecioEfectivo() {
		return precioBase * (chicaAMedianda() ? factorChicaMediana : factorGrandeMas);
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getFactorChicaMediana() {
		return factorChicaMediana;
	}

	public void setFactorChicaMediana(double factorChicaMediana) {
		this.factorChicaMediana = factorChicaMediana;
	}

	public double getFactorGrandeMas() {
		return factorGrandeMas;
	}

	public void setFactorGrandeMas(double factorGrandeMas) {
		this.factorGrandeMas = factorGrandeMas;
	}

	@Override
	public String getNombreCorto() {
		return "PLY " + tipo + " " + talla;
	}

	@Override
	public String getNombre() {
		return tipo + " - " + color + " (" + talla + ")"; 
	}

	@Override
	public String getDescripcion() {
		return String.format("PLAYERA TIPO %s COLOR %s TALLA %s", tipo, color, talla);
	}

	@Override
	public double getPrecio() {
		return getPrecioEfectivo();
	}

}
