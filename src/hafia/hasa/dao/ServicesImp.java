
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Stateless; import javax.persistence.EntityManager; import
  javax.persistence.PersistenceContext;
  
  import hafia.hasa.entites.Services;
  
  @Stateless public class ServicesImp implements IServices {
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @Override public List<Services> getAll() { try { return (List<Services>
  )em.createQuery("SELECT s FROM Services s") .getResultList(); } catch
  (Exception e) { e.printStackTrace(); return null; }
  
  }
  
  
  }
 