package dev.java.schoolManager;

public class Cours {

	private String intituleCours;
	private int credit;
	private double cote;
	
	public Cours() {
	}

	public Cours(String intituleCours, int credit, double cote) {
		
		if (cote > 20) {
			System.out.println(" l etdiant ne doit pas obtenir une note supérieur à 20");
			
		}
		
		this.intituleCours = intituleCours;
		this.credit = credit;
		this.cote = cote;
	}
	

	public String getIntituleCours() {
		return intituleCours;
	}

	public void setIntituleCours(String intituleCours) {
		this.intituleCours = intituleCours;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}

}
