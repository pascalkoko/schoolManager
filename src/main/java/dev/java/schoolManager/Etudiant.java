package dev.java.schoolManager;

import java.time.LocalDate;

public class Etudiant {

	private String nomComplet;
	private int matricule;
	private LocalDate dateNaissance;
	private char sexe;
	private String faculte;
	private Promotion promotion;
	
	public Etudiant() {
	}


	public Etudiant(String nomComplet, int matricule, LocalDate dateNaissance, char sexe, String faculte) {
		this.nomComplet = nomComplet;
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.faculte = faculte;
	}



	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public String getFaculte() {
		return faculte;
	}

	public void setFaculte(String faculte) {
		this.faculte = faculte;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

}
