package fr.g2l2corp.model;

import java.sql.SQLException;
import java.util.Collection;

import fr.g2l2corp.model.DAOException;

public interface UtilisateurDAO {
	Utilisateur verif(String pseudo, String pwd);
	void create(Utilisateur d) throws DAOException, SQLException;
	void update(Utilisateur d) throws DAOException;
	void delete(Utilisateur d) throws DAOException;
	Collection<Utilisateur> findAll();
}
