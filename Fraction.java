public class Fraction{
	
	private int numerateur;
	private int denominateur;
	
	Fraction(int numer, int denom){
		numerateur = numer;
		denominateur = denom;
	}
	
	public String toString() {
		System.out.println(numerateur + "/" + denominateur);
		return numerateur + "/" + denominateur;
	}
}
