
public class Coordonnee{

			private String nom ;
			private String ville; 
			private double soldPrive;
			private double soldEpargne;
			
			public Coordonnee(String nom, String ville, double soldPrive, double soldEpargne ) {
				
				this.nom   = nom;
				this.ville = ville;
				this.soldPrive  = soldPrive;
				this.ville = ville;
				this.soldEpargne  = soldEpargne;
			}
			
			public  void afficherClient( Coordonnee cord) {
				// Cette méthode affiche les données du client
				System.out.println(" Client " + cord.nom + " de " + cord.ville);
				System.out.println(" Compte prive: " + cord.soldPrive + " francs");
				System.out.println(" Compte d'epargne: " + cord.soldEpargne + " francs");
				}

}
			
			
	

