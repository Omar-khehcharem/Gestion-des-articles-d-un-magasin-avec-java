package Magazin;

public class Article implements Exportable {
	private int Code;
	private String Ref;
	private int Qte;
	private double PHT;
	private double TVA;
	private double PTR;
	
	
	
	public Article(int code, String ref, int qte, double pHT, double tVA) {
		
		Code = code;
		Ref = ref;
		Qte = qte;
		PHT = pHT;
		TVA = tVA;
	}



	public Article(int code, String ref) {
		super();
		Code = code;
		Ref = ref;
	}



	public int getCode() {
		return Code;
	}



	public void setCode(int code) {
		Code = code;
	}



	public String getRef() {
		return Ref;
	}



	public void setRef(String ref) {
		Ref = ref;
	}



	public int getQte() {
		return Qte;
	}



	public void setQte(int qte) {
		Qte = qte;
	}



	public double getPHT() {
		return PHT;
	}



	public void setPHT(double pHT) {
		PHT = pHT;
	}



	public double getTVA() {
		return TVA;
	}



	@Override
	public String toString() {
		return "Article [Code=" + Code + ", Ref=" + Ref + ", Qte=" + Qte + ", PHT=" + PHT + ", TVA=" + TVA + "]";
	}



	public void setTVA(double tVA) {
		TVA = tVA;
	}
	public double prixTransport() {
		PTR=PHT*2;
		return PTR;
	}


	@Override
	public double prixNet(double fraisDouane) {
		
		return Qte*PHT*TVA + Qte*PHT + Qte*prixTransport() + droitsDeDouane(fraisDouane, Qte);
	
	}

}
