
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Consutation;
  
  @Local 
  public interface IConsultation {
  public int add(Consutation consultation); 
  public List<Consutation> getAll();
  public int delete(int id); 
  public Consutation get(int id); 
  public int update(Consutation conultation);
  
  }
 