
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Patient;
  
  @Local public interface IPatient {
  
  public int add(Patient patient); public List<Patient> getAll(); public int
  delete(int id); public Patient get(int id); public int update(Patient
  patient);
  
  
  }
 