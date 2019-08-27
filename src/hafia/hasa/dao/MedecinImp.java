  package hafia.hasa.dao;
  import java.util.List;
  import javax.ejb.Stateless; 
  import javax.persistence.EntityManager;
  import javax.persistence.PersistenceContext;
  import hafia.hasa.entites.Medecin;
  
  @Stateless 
  public class MedecinImp implements IMedecin {
 
	  @PersistenceContext(unitName="TattaGuine")
	  private EntityManager em;
  
  @Override public int add(Medecin medecin) 
  	{ try 
  	{ em.persist(medecin); 
  		return 1; 
  	}
  	
  	catch (Exception e) { e.printStackTrace(); return 0; } }
  
  @SuppressWarnings("unchecked")
  
  @Override 
  public List<Medecin> getAll() { 
	  try { return (List<Medecin>)em.createQuery("SELECT m FROM Medecin m") 
			  .getResultList(); } catch
	  	(Exception e) { e.printStackTrace(); 
  		return null; } }
  
  @Override 
  public int delete(int id) 
  { try { em.remove(em.find(Medecin.class,id)); 
  	return 1; } 
  	catch (Exception e) { e.printStackTrace(); }  
  	return 0; }
  
  @Override 
  public Medecin get(int id) {
	  return (Medecin) em.createQuery("SELECT m FROM Medecin m WHERE m.id=:idM")
			  .setParameter("idM", id) .getSingleResult(); }
  
  @Override 
  public int update(Medecin medecin) 
  { try { em.merge(medecin);
  		return 1; } 
  	catch (Exception e) { e.printStackTrace(); } 
  	return 0;
  }

@Override
public Medecin getLogin(String email, String password) {
	Medecin m = null;
	try {
		m= (Medecin)em.createNamedQuery("Medecin.Login")
				.setParameter("emailM", email)
				.setParameter("passwordM", password)
				.getSingleResult();
	} catch (Exception e) {
		e.printStackTrace();
		m= null;
	}
	return m;
}
    
  }
 