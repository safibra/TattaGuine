
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.RDV;
  
  @Local public interface IRdv {
  
  public int add(RDV rdv); public List<RDV> getAll(); public int delete(int
  id); public RDV get(int id); public int update(RDV rdv);
  
  
  
  }
 