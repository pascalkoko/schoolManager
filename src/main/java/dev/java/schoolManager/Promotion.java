package dev.java.schoolManager;

import java.util.List;

public class Promotion {

	private String promotion;
	private List<Cours> cours;

	public Promotion(String promotion, List<Cours> cours) {
		super();
		this.promotion = promotion;
		this.cours = cours;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

}
