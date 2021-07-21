
public class Execute {
	public static void main(String[] args) {
		
		SoldAfterAddingIntrest comptePrive= new SoldAfterAddingIntrest(1000.0,0.01);
		SoldAfterAddingIntrest compteEpargne= new SoldAfterAddingIntrest(2000.0,0.02);
		System.out.print("Donnees avant le bouclement des comptes:");
		Coordonnee client1BeforaddingIntrest = new Coordonnee("Pedro", "Geneve", 1000.0, 2000.0);
		client1BeforaddingIntrest.afficherClient(client1BeforaddingIntrest);
		
		Coordonnee client2BeforaddingIntrest = new Coordonnee("Alexandra", "Lausanne", 3000 , 4000.0);
		client2BeforaddingIntrest.afficherClient(client2BeforaddingIntrest);
		

		
		SoldAfterAddingIntrest comptePrive2= new SoldAfterAddingIntrest(3000.0,0.01);
		SoldAfterAddingIntrest compteEpargn2= new SoldAfterAddingIntrest(4000.0,0.02);
		System.out.print("Donnees apres le bouclement des comptes:");

		Coordonnee client1 = new Coordonnee("Pedro", "Geneve", comptePrive.bouclerCompte(comptePrive), compteEpargne.bouclerCompte(compteEpargne));
		client1.afficherClient(client1);
		Coordonnee client2 = new Coordonnee("Alexandra", "Lausanne", comptePrive2.bouclerCompte(comptePrive2), compteEpargn2.bouclerCompte(compteEpargn2));
		client1.afficherClient(client2);
		
	}

}

