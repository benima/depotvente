package fr.g2l2corp.model;
import java.sql.SQLException;
import java.util.Collection;

import fr.g2l2corp.model.Produit;

public interface ProduitDAO {
	Produit findById(String id);
	Collection<Produit> findByNom(String nom) ;
	Collection<Produit> findAll() throws SQLException, Exception;
	Collection<Produit> findByFournisseur(Fournisseur fournisseur);
	void create(Produit d) throws DAOException, SQLException, Exception;
	void update(Produit d) throws DAOException;
	void delete(Produit d) throws DAOException;
	
}
