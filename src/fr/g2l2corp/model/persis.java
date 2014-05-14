package fr.g2l2corp.model;
import javax.persistence.*;
import java.io.Serializable;

	
	@Entity
	public class persis implements Serializable{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	
	@Id
	private String isbn;
	
	private String titre;
	
	private String auteur;
	
	protected persis () {}
	public persis (String isbn, String titre, String auteur) {

	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "persistant [isbn=" + isbn + ", titre=" + titre + ", auteur="
				+ auteur + "]";
	}
	
	}

