
public class VL_111223_Kreis {
	// Klassenatribut
	public static final double PI = 3.1415926;
	
//	// Instanzattribut
//	public double radius;
	
	// Instanzattribut
	private double radius; // Besser da Geheimnisprinzip eingeschaltet
	
	
	// Instanzmethode: weise Radius zu // This und Setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// get-Methode
	public double getRadius() {
		return radius;
	}
	
	/* Methoden */
	// Klassenmethode: Bogengrad
	public static double berechneRadiantGrad(double rads) {
		return rads * 180 / PI;
	}
	// Instanzmethode: Umfang
	public double berechneUmfang() {
		return 2 * PI * this.radius; 
	}
	// Instanzmethode: Fläche
	public double berechneFlaeche() {
		return PI * this.radius * this.radius;
	}
}
