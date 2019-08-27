
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Hospitalisation;
  
  @Local 
  public interface IHospitalisation {
  public int add(Hospitalisation hospitation); 
  public List<Hospitalisation> getAll(); 
  public Hospitalisation get(int id);
  
  }
 