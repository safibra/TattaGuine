
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Stateless; import javax.persistence.EntityManager; import
  javax.persistence.PersistenceContext; import hafia.hasa.entites.Typepaiement;
  
  @Stateless public class TypePaiementImp implements ITypePaiement {
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @SuppressWarnings("unchecked")
  
  @Override public List<Typepaiement> getAll() { try { return
  (List<Typepaiement> )em.createQuery("SELECT t FROM Typepaiement t")
  .getResultList(); } catch (Exception e) { e.printStackTrace(); return null; }
  
  }
  
  }
 