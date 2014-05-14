package fr.g2l2corp.model;
import java.sql.SQLException;
import java.util.Collection;

import fr.g2l2corp.model.Produit;

public interface FournisseurDAO {
	Fournisseur findById(String id);
	Collection<Fournisseur> findByNom(String nom) ;
	Collection<Fournisseur> findAll() throws SQLException, Exception;
	Collection<Fournisseur> findByProduit(Produit Produit);
	void create(Fournisseur d) throws DAOException, SQLException, Exception;
	void update(Fournisseur d) throws DAOException;
	void delete(Fournisseur d) throws DAOException;
	
}
