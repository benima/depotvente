package fr.g2l2corp.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.*;
import javax.persistence.*;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.g2l2corp.annotation.Dao;

@Dao
public class FournisseurDAOJPA implements FournisseurDAO {
	/*
	 * obtention d'un manager d'entity sur un contexte de persistance de durée
	 * transactionnelle
	 */

	@PersistenceContext
	private EntityManager em;
	/*
	 * rerere (non-Javadoc)
	 * 
	 * @see fr.demos.formation.model.DVDDAO#findById(java.lang.String)
	 */

	@Resource
	private UserTransaction ut;


	@Override
	public Collection<Fournisseur> findByProduit(Produit Produit) {
		String query="select d from fournisseur d where d.fournisseur= ?1";
		// TODO Auto-generated method stub
		TypedQuery<Fournisseur> q=em.createQuery(query,Fournisseur.class);
		Collection<Fournisseur> list= q.getResultList();
		return list;
	}

	@Override
	public Collection<Fournisseur> findAll() {
		ArrayList<Fournisseur> liste = new ArrayList<>();
		try {
		liste.add(new Fournisseur("Ben"));
		liste.add(new Fournisseur("Ty"));
		liste.add(new Fournisseur("Ty"));
		}catch(DAOException e){
			e.printStackTrace();
			throw new DAOException(e.getMessage());
		}
		
		return liste;
		// TODO Auto-generated method stub
		/*try {
			String query = "select dvdtheque from dvd l ";	
		}catch(SQLException es){
			
		}
		throw new Exception("problème de lisibilité de DVD :");
		
		return null;*/
	}

	@Override
	public void create(Fournisseur d) throws Exception {
		// TODO Auto-generated method stub
		try {
			ut.begin();

			em.persist(d);
			System.out.println("creation Produit"+d);
			ut.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("problème d'insertion de fournisseur :"
					+ d.getNom());
		}
	}

	@Override
	public void update(Fournisseur d) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Fournisseur d) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Fournisseur findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Fournisseur> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}


}
