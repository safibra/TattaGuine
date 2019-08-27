package hafia.hasa.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import hafia.hasa.entites.Consutation;

@Stateless
public class ConsultationImp implements IConsultation {
	
	
	  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
	  
	  @Override public int add(Consutation consultation) { try {
	  em.persist(consultation); return 1; } catch (Exception e) {
	  e.printStackTrace(); return 0; } }
	  
	  @SuppressWarnings("unchecked")
	  
	  @Override public List<Consutation> getAll() { try { return (List<Consutation>
	  )em.createQuery("SELECT c FROM Consutation c") .getResultList(); } catch
	  (Exception e) { e.printStackTrace(); return null; } }
	  
	  @Override public int delete(int id) { try {
	  em.remove(em.find(Consutation.class, id)); return 1; } catch (Exception e) {
	  e.printStackTrace(); } return 0; }
	  
	  @Override public Consutation get(int id) { return (Consutation)
	  em.createQuery("SELECT c FROM Consutation c WHERE c.id=:idC")
	  .setParameter("idC", id) .getSingleResult();
	  
	  }
	  
	  @Override public int update(Consutation conultation) { try {
	  em.merge(conultation); return 1; } catch (Exception e) { e.printStackTrace();
	  } return 0; }
	 
}
