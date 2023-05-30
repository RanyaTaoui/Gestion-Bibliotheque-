package Taoui.Ranya.Controle.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class LivreRANTAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idL;
    
    @Column(nullable = false)
    private String titre;
    
    @Column
    private int page;
    
    @ManyToMany
    @JoinTable(name = "livre_aut", joinColumns = @JoinColumn(name = "idL"), inverseJoinColumns = @JoinColumn(name = "idA"))
    private List<Auteur> auteurs;
    
    public int getIdL() {
        return idL;
    }
    
    public void setIdL(int idL) {
        this.idL = idL;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public int getPage() {
        return page;
    }
    
    public void setPage(int page) {
        this.page = page;
    }
    
    public List<Auteur> getAuteurs() {
        return auteurs;
    }
    
    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
