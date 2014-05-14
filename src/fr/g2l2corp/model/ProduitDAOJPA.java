package fr.g2l2corp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class ProduitDAOJPA implements ProduitDAO {
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
	public Collection<Produit> findByFournisseur(Fournisseur fournisseur) {
		String query="select * from produit d where d.produit= ?1";
		Collection<Produit> list=null;
		// TODO Auto-generated method stub
		try {
		TypedQuery<Produit> q=em.createQuery(query,Produit.class);
		q.setParameter(1,fournisseur);
		 list= q.getResultList();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("creation de la requète NOK");
		}
		
		
		return list;
	}

	@Override
	public Collection<Produit> findAll() {
		ArrayList<Produit> liste = new ArrayList<>();
		try {
			
		liste.add(new Produit("Bleach",12));
		liste.add(new Produit("Ordinateur",13));
		liste.add(new Produit("chips",14));
		} catch(DAOException e){
			e.printStackTrace();
			System.out.println("liste de produit NOK");
			throw new DAOException(e.getMessage());
			
		}
		return liste;
		// TODO Auto-generated method stub
		/*try {
			String query = "select depotvente from produit l ";	
			
		}catch(SQLException es){
			es.printStackTrace();
			throw new Exception("problème d'insertion de produit :");
		}
		throw new Exception("problème de lisibilité de produits :");
		return null;
		*/
	}

	@Override
	public void create(Produit d) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("entré dans la methode create");
		try {
			ut.begin();

			em.persist(d);
			
			ut.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("problème d'insertion de produit :"
					+ d.getNom());
		}
		System.out.println("creation Produit"+d);
	}

	@Override
	public void update(Produit d) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Produit d) throws DAOException {
		// TODO Auto-generated method stub
		/* Connection con=null;
		try {
			ut.begin();
			con=CnxMySQL.getConnection();
			PreparedStatement stmt=con.prepareStatement(DELETE_REQ);
			stmt.setLong(1, obj.getId());
			stmt.executeUpdate();
		}catch(SQLException e){
			throw new DAOException(e.getMessage());
		}finally{
			try {
				if(con!=null){
					con.close();
				}
			}catch(SQLException e){
				throw new DAOException(e.getMessage());
			}
			*/
		}
	
	

	@Override
	public Produit findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produit> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
