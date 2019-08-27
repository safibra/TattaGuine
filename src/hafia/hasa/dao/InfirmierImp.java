
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local; import javax.ejb.Stateless; import
  javax.persistence.EntityManager; import javax.persistence.PersistenceContext;
  
  import hafia.hasa.entites.Infirmier; import hafia.hasa.entites.Services;
  
  @Stateless public class InfirmierImp implements IInfirmier {
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @Override public List<Infirmier> getAll() { try { return (List<Infirmier>
  )em.createQuery("SELECT i FROM Infirmier i") .getResultList(); } catch
  (Exception e) { e.printStackTrace(); return null; } }
  
  
  }
 