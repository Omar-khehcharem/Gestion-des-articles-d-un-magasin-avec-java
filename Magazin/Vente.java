package Magazin;

public class Vente {
public static void main(String[] args) {
	
	Article obj1=new Article(1235,"ART1");
	obj1.setQte(Integer.parseInt(args[0]));
	obj1.setPHT(Double.parseDouble(args[1]));
	obj1.setTVA(Integer.parseInt(args[2]));
	System.out.println(obj1);
	Exportable.afficherMontant(obj1.prixTransport());
	System.out.println("le prixNet de ART1 est : "+obj1.prixNet(450));
	fragile obj2=new fragile(5321,"ART2", Integer.parseInt(args[0]), Double.parseDouble(args[1]), Integer.parseInt(args[2]), "STRONG", 150.5);
	

	System.out.println(obj2);
	Exportable.afficherMontant(obj2.prixTransport());
	System.out.println("le prixNet de ART2 est : "+obj2.prixNet(450));
	
}


}
