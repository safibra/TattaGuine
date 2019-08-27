  package hafia.hasa.dao; import java.util.List;
  
  import javax.ejb.Stateless;
  
  import javax.persistence.EntityManager; import
  javax.persistence.PersistenceContext;
  
  import hafia.hasa.entites.RDV;
  
  @Stateless public class RdvImp implements IRdv {
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @Override public int add(RDV rdv) { try { em.persist(rdv); return 1; } catch
  (Exception e) { e.printStackTrace(); return 0; } }
  
  @SuppressWarnings("unchecked")
  
  @Override public List<RDV> getAll() { try { return (List<RDV>
  )em.createQuery("SELECT r FROM RDV r") .getResultList(); } catch (Exception
  e) { e.printStackTrace(); return null; } }
  
  @Override public int delete(int id) { try { em.remove(em.find(RDV.class,
  id)); return 1; } catch (Exception e) { e.printStackTrace(); } return 0; }
  
  @Override public RDV get(int id) { return (RDV)
  em.createQuery("SELECT r FROM RDV r WHERE r.id=:idR") .setParameter("idR",
  id) .getSingleResult(); }
  
  @Override public int update(RDV rdv) { try { em.merge(rdv); return 1; } catch
  (Exception e) { e.printStackTrace(); } return 0; }
  
  
  
  }
 