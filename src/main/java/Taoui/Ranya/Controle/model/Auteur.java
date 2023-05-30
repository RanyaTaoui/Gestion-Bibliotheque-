package Taoui.Ranya.Controle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Auteur {
@Id
@GeneratedValue( strategy=GenerationType.IDENTITY)
private int idA;
@Column
private String nom;
public int getIdA() {
	return idA;
}
public void setIdA(int idA) {
	this.idA = idA;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

	
}
