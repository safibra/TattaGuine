  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Stateless; import javax.persistence.EntityManager; import
  javax.persistence.PersistenceContext;
  
  import hafia.hasa.entites.Paiement;
  
  @Stateless public class PaiementImp implements IPaiement{
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @Override public int add(Paiement paiement) { try { em.persist(paiement);
  return 1; } catch (Exception e) { e.printStackTrace(); return 0; } }
  
  @SuppressWarnings("unchecked")
  
  @Override public List<Paiement> getAll() { try { return (List<Paiement>
  )em.createQuery("SELECT p FROM Paiement p") .getResultList(); } catch
  (Exception e) { e.printStackTrace(); return null; } }
  
  @Override public int delete(int id) { try { em.remove(em.find(Paiement.class,
  id)); return 1; } catch (Exception e) { e.printStackTrace(); } return 0; }
  
  @Override public Paiement get(int id) { return (Paiement)
  em.createQuery("SELECT p FROM Paiement p WHERE p.id=:idP")
  .setParameter("idP", id) .getSingleResult(); }
  
  @Override public int update(Paiement paiement) { try { em.merge(paiement);
  return 1; } catch (Exception e) { e.printStackTrace(); } return 0; }
  
  }
 