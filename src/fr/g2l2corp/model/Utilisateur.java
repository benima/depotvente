package fr.g2l2corp.model;

import javax.persistence.*;

@Entity
public class Utilisateur {
@Id
private String idUser;

private String pseudo;
private String nom;
private String prenom;
private String password;

protected Utilisateur(){
	
}

@Override
public String toString() {
	return "Utilisateur [idUser=" + idUser + ", pseudo=" + pseudo + ", nom="
			+ nom + ", prenom=" + prenom + ", password=" + password + "]";
}

public Utilisateur(String idUser, String pseudo, String nom, String prenom,
		String password) {
	super();
	this.idUser = idUser;
	this.pseudo = pseudo;
	this.nom = nom;
	this.prenom = prenom;
	this.password = password;
}

public Utilisateur(String pseudo,String password) {
	super();
	this.pseudo = pseudo;
	this.password = password;
}

public Utilisateur(String int1, String pseudo2, String pwd) {
	// TODO Auto-generated constructor stub
	this.idUser=int1;
	this.pseudo=pseudo2;
	this.password=pwd;
}

public String getIdUser() {
	return idUser;
}

public void setIdUser(String idUser) {
	this.idUser = idUser;
}

public String getPseudo() {
	return pseudo;
}

public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
