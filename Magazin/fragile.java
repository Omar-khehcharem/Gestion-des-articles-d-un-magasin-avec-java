package Magazin;

public class fragile extends Article {
	
	
private  String Emballage;
private double prixEmballage;
public String getEmballage() {
	return Emballage;
}
public void setEmballage(String emballage) {
	Emballage = emballage;
}
public double getPrixEmballage() {
	return prixEmballage;
}
public void setPrixEmballage(double prixEmballage) {
	this.prixEmballage = prixEmballage;
}
public fragile(int code, String ref, int qte, double pHT, double tVA,String Emballage, double prixEmballage) {
		super(code, ref, qte, pHT, tVA);
		this.Emballage=Emballage;
		this.prixEmballage=prixEmballage;
		
		
}
@Override
public double prixTransport() {
	
	return super.prixTransport()*2;
}
@Override
public double prixNet(double fraisDouane) {
	
	return super.prixNet(fraisDouane)+prixEmballage*getQte();
}
@Override
public String toString() {
	return "fragile [Emballage=" + Emballage + ", prixEmballage=" + prixEmballage + "]";
}
	


}
