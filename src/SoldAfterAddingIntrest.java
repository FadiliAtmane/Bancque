
public class SoldAfterAddingIntrest {
	private double solde;
	private double taux;

	public SoldAfterAddingIntrest(double solde, double taux) {
		this.solde = solde;
		this.taux = taux;
	}
	
	public  double bouclerCompte(SoldAfterAddingIntrest sol) {
		double interets = sol.taux * sol.solde;
		double nouveauSolde = sol.solde + interets;
		return nouveauSolde;
	}

}
