package fr.g2l2corp.model;

import java.util.Collection;

import javax.persistence.*;
@Entity
@Table(name="produit")
public class Produit {


@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private int idProduit;
@Column(name="nom")
private String nom;
private double prixunitaire;
@Enumerated(EnumType.STRING)
@Column(name="fournisseur")
@JoinColumn(name="fournisseur")
@ManyToOne()
private Fournisseur fournisseur;
@Column(name="quantite")
private int quantite;
@Column(name="lot")
private boolean lot;
@Column(name="envente")
private boolean enVente;

public Produit(){
	
}

public Produit(int idProduit, String nom) {
	super();
	this.idProduit = idProduit;
	this.nom = nom;
}


public Produit(String nom, double prixunitaire) {
	super();
	this.nom = nom;
	this.prixunitaire = prixunitaire;
}

public Produit(String nom, double prixunitaire, Fournisseur fournisseur,
		int quantite, boolean lot) {
	super();
	this.nom = nom;
	this.prixunitaire = prixunitaire;
	this.fournisseur = fournisseur;
	this.quantite = quantite;
	this.lot = lot;
}

public Produit(int idProduit, String nom, double prixunitaire,
		Fournisseur fournisseur, int quantite, boolean lot, boolean enVente) {
	super();
	this.idProduit = idProduit;
	this.nom = nom;
	this.prixunitaire = prixunitaire;
	this.fournisseur = fournisseur;
	this.quantite = quantite;
	this.lot = lot;
	this.enVente = enVente;
}

public int getIdProduit() {
	return idProduit;
}

public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getPrixunitaire() {
	return prixunitaire;
}

public void setPrixunitaire(double prixunitaire) {
	this.prixunitaire = prixunitaire;
}

public Fournisseur getFournisseur() {
	return fournisseur;
}

public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public boolean isLot() {
	return lot;
}

public void setLot(boolean lot) {
	this.lot = lot;
}

public boolean isEnVente() {
	return enVente;
}

public void setEnVente(boolean enVente) {
	this.enVente = enVente;
}

@Override
public String toString() {
	return "produit " + ", nom=" + nom
			+ ", prixunitaire=" + prixunitaire + ", fournisseur=" + fournisseur
			+ ", quantite=" + quantite + ", lot=" + lot +"]";
}


}
