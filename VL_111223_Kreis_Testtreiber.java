
public class VL_111223_Kreis_Testtreiber {
//	public static void main(String [] args) {
//		VL_111223_Kreis meinKreis = new VL_111223_Kreis();
//		System.out.println(VL_111223_Kreis.PI);
//		System.out.println(VL_111223_Kreis.berechneRadiantGrad(2.5));
//		System.out.println(meinKreis.radius);
//		meinKreis.radius = 5.0;
//		System.out.println(meinKreis.radius);
	
//		System.out.println(meinKreis.berechneUmfang());
//		System.out.println(meinKreis.berechneFlaeche());
//		
//	}
	// Version 2 BESSER
	public static void main(String [] args) {
		// default Konstruktor this wird impliziert gebaut
		VL_111223_Kreis meinKreis = new VL_111223_Kreis();
		VL_111223_Kreis deinKreis = new VL_111223_Kreis();
		VL_111223_Kreis grosserKreis = new VL_111223_Kreis();
		
		
//		meinKreis.radius = 5.0;
//		deinKreis.radius = 10.0;
//		grosserKreis.radius = 100.0;
//		System.out.println("Radius von meinKreis: " + meinKreis.radius);
//		System.out.println("Radius von deinKreis: " + deinKreis.radius);
//		System.out.println("Radius von grosserKreis: " + grosserKreis.radius);
		meinKreis.setRadius(5.0);
		deinKreis.setRadius(10.0);
		grosserKreis.setRadius(100.0);
		System.out.println("Radius von meinKreis: " + meinKreis.getRadius());
		System.out.println("Radius von deinKreis: " + deinKreis.getRadius());
		System.out.println("Radius von grosserKreis: " + grosserKreis.getRadius());
		
		
		
		System.out.println("Umfang von meinKreis: " + meinKreis.berechneUmfang());
		System.out.println("Umfang von deinKreis: " + deinKreis.berechneUmfang());
		System.out.println("Umfang von grosserKreis: " + grosserKreis.berechneUmfang());

		
	}
}
