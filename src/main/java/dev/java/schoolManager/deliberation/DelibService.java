package dev.java.schoolManager.deliberation;

import java.util.Iterator;
import java.util.List;

import dev.java.schoolManager.Etudiant;

public class DelibService {

	public double delibererEtudiant (Etudiant e) {
		
		
		System.out.println(" \n\n Déliberation de l'etudiant " + e.getMatricule() +"  " + e.getNomComplet() 
		+"\n points obtenus\n\n");
		 
		e.getPromotion().getCours().forEach(x ->{
			int totalGeneral = 0;
			totalGeneral += x.getCredit() * 20;
			System.out.println(x.getIntituleCours() + " : " + x.getCote() + "    credit " + x.getCredit() + "\n");
		});
		
		for (int i = 0; i < e.getPromotion().getCours().size(); i++) {
			
			int totalObtenu = 0;
			
			e.getPromotion().getCours().forEach(x ->{
				int totalGeneral = 0;
				totalGeneral += x.getCredit() * 20;
				System.out.println(x.getIntituleCours() + " : " + x.getCote() + "    credit " + x.getCredit() + "\n");
			});
			
		}
		
		
		return 0;
		
	}
}
