package dev.java.schoolManager.deliberation;

import dev.java.schoolManager.Etudiant;

public class DelibService {

	public double delibererEtudiant (Etudiant e) {
		
		int totalGeneral = 0;
		double  totalObtenu = 0.0;
		Double pourcentage = null;
		System.out.println(" \n\n Déliberation de l'etudiant " + e.getMatricule() +"  " + e.getNomComplet() 
		+"\n points obtenus\n\n");
		 
		e.getPromotion().getCours().forEach(x ->{
//			totalGeneral = 0;
//			totalObtenu = 0.0;
//			totalGeneral += x.getCredit() * 20;
//			System.out.println(x.getIntituleCours() + " : " + x.getCote() + "    credit " + x.getCredit() + "\n");
//			
//			totalObtenu = totalObtenu +( x.getCote() * x.getCredit()); 
		});
		
		return (totalObtenu *100)/totalGeneral;
		
	}
}
