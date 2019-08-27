package hafia.hasa.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import hafia.hasa.entites.Hospitalisation;
import hafia.hasa.entites.Ordonance;

@Stateless
public class OrdonanceImp implements IOrdonance {

	@PersistenceContext(unitName="TattaGuine")
	  private EntityManager em;
	@Override
	public int add(Ordonance ordonance) {
		try {
			  em.persist(ordonance); return 1; 
		  } 
		  catch (Exception e) 
		  {
			  e.printStackTrace(); return 0; } 
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ordonance> getAll() {
		try { 
			  return (List<Ordonance> )em.createQuery("SELECT o FROM Ordonance o")
					  .getResultList(); } 
		  catch (Exception e) 
		  	{ e.printStackTrace(); return null; }
	}

	@Override
	public Ordonance get(int id) {
		return (Ordonance) em.createQuery("SELECT o FROM Ordonance o WHERE o.id=:idO")
			  	.setParameter("idO", id) .getSingleResult(); 
	}

}
