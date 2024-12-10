package Magazin;

public interface Exportable {
	abstract double prixNet(double fraisDouane) ;
	static void afficherMontant(double montant) 
	{
		System.out.println(montant);
	}
	default double droitsDeDouane(double fraisDouane, double QteExpo) {
		return  fraisDouane*QteExpo ;
	}
		


}
