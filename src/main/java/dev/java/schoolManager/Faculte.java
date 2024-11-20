package dev.java.schoolManager;

import java.util.List;

public class Faculte {

	private String faculte;
	private List<Promotion> promotions;
	
	public Faculte(String faculte, List<Promotion> promotions) {
		this.faculte = faculte;
		this.promotions = promotions;
	}
	
	public String getFaculte() {
		return faculte;
	}
	public void setFaculte(String faculte) {
		this.faculte = faculte;
	}
	public List<Promotion> getPromotions() {
		return promotions;
	}
	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
}
