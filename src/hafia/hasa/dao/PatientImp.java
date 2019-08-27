
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Stateless; import javax.persistence.EntityManager; import
  javax.persistence.PersistenceContext;
  
  import hafia.hasa.entites.Medecin; import hafia.hasa.entites.Patient;
  
  @Stateless public class PatientImp implements IPatient{
  
  @PersistenceContext(unitName="TattaGuine") private EntityManager em;
  
  @Override public int add(Patient patient) { try { em.persist(patient); return
  1; } catch (Exception e) { e.printStackTrace(); return 0; } }
  
  @SuppressWarnings("unchecked")
  
  @Override public List<Patient> getAll() { try { return (List<Patient>
  )em.createQuery("SELECT p FROM Patient p") .getResultList(); } catch
  (Exception e) { e.printStackTrace(); return null; } }
  
  @Override public int delete(int id) { try { em.remove(em.find(Patient.class,
  id)); return 1; } catch (Exception e) { e.printStackTrace(); } return 0; }
  
  @Override public Patient get(int id) { return (Patient)
  em.createQuery("SELECT p FROM Patient p WHERE p.id=:idP")
  .setParameter("idP", id) .getSingleResult(); }
  
  @Override public int update(Patient patient) { try { em.merge(patient);
  return 1; } catch (Exception e) { e.printStackTrace(); } return 0; }
  
  
  
  
  
  }
  
  
 