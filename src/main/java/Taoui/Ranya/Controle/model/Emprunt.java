package Taoui.Ranya.Controle.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprunt {
@Id
@GeneratedValue( strategy= GenerationType.IDENTITY)
private int idE;
@Column 
private LocalDate date;

@ManyToOne
private LivreRANTAO livre;

@ManyToOne
private Adherent adherent;

public int getIdE() {
	return idE;
}

public void setIdE(int idE) {
	this.idE = idE;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public LivreRANTAO getLivre() {
	return livre;
}

public void setLivre(LivreRANTAO livre) {
	this.livre = livre;
}

public Adherent getAdherent() {
	return adherent;
}

public void setAdherent(Adherent adherent) {
	this.adherent = adherent;
}


}
