package dev.java.schoolManager.paiement;

import dev.java.schoolManager.Etudiant;

public class PaiementService {
	
	private static double TOTAL = 500.0;
	
	public PaiementService() {
	}

	public double payer(Etudiant etudiant, double montant) {
		double mount = 0;
		if (etudiant.getSolde() < TOTAL) {			
			if((etudiant.getSolde() + montant ) < TOTAL) {
				mount = montant;
			}else {
				mount = TOTAL - etudiant.getSolde();
			}
			
			etudiant.setSolde(etudiant.getSolde() + mount);
		}
		
		return mount;
	}
	
	public double soldeEtudiant(Etudiant etudiant) {
		return etudiant.getSolde();
	}
	

}
