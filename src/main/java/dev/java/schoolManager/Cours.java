package dev.java.schoolManager;

public class Cours {

	private String intituleCours;
	private int credit;
	
	public Cours() {
	}

	public Cours(String intituleCours, int credit) {
		super();
		this.intituleCours = intituleCours;
		this.credit = credit;
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

}
