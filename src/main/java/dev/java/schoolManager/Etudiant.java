package dev.java.schoolManager;

import java.time.LocalDate;

public class Etudiant {

	private String nomComplet;
	private int matricule;
	private LocalDate dateNaissance;
	private char sexe;
	private Faculte faculte;
	
	public Etudiant() {
	}


	public Etudiant(String nomComplet, int matricule, LocalDate dateNaissance, char sexe, Faculte faculte) {
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


	public Faculte getFaculte() {
		return faculte;
	}


	public void setFaculte(Faculte faculte) {
		this.faculte = faculte;
	}

}
