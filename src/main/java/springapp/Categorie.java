package springapp;

import java.util.ArrayList;

public class Categorie {
    Integer id;
    String nom;
    Integer dureenchere;
    Integer pourcentage;
    ArrayList<TypeProduit> typeProduits;
    Integer nbr_ventes;
    Integer argent_genere;

    public Categorie() {
    }

    public Categorie(Integer id, String nom, Integer dureenchere, Integer pourcentage,
            ArrayList<TypeProduit> typeProduits, Integer nbr_ventes, Integer argent_genere) {
        this.id = id;
        this.nom = nom;
        this.dureenchere = dureenchere;
        this.pourcentage = pourcentage;
        this.typeProduits = typeProduits;
        this.nbr_ventes = nbr_ventes;
        this.argent_genere = argent_genere;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getDureenchere() {
        return this.dureenchere;
    }

    public void setDureenchere(Integer dureenchere) {
        this.dureenchere = dureenchere;
    }

    public Integer getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(Integer pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Integer getNbr_ventes() {
        return this.nbr_ventes;
    }

    public void setNbr_ventes(Integer nbr_ventes) {
        this.nbr_ventes = nbr_ventes;
    }

    public ArrayList<TypeProduit> getTypeProduits() {
        return this.typeProduits;
    }

    public void setTypeProduits(ArrayList<TypeProduit> typeProduits) {
        this.typeProduits = typeProduits;
    }

    public Integer getArgent_genere() {
        return this.argent_genere;
    }

    public void setArgent_genere(Integer argent_genere) {
        this.argent_genere = argent_genere;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nom='" + getNom() + "'" +
                ", dureenchere='" + getDureenchere() + "'" +
                ", pourcentage='" + getPourcentage() + "'" +
                ", typeProduits='" + getTypeProduits() + "'" +
                ", nbr_ventes='" + getNbr_ventes() + "'" +
                ", argent_genere='" + getArgent_genere() + "'" +
                "}";
    }
}
