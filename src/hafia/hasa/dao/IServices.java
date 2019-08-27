
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Services;
  
  @Local public interface IServices { public List<Services> getAll(); }
 