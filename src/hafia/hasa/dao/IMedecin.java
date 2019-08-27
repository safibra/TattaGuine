
  package hafia.hasa.dao;
  
  import java.util.List;
  import javax.ejb.Local;
  import hafia.hasa.entites.Medecin;
  
  @Local 
  public interface IMedecin {
  public int add(Medecin medecin); 
  public List<Medecin> getAll(); 
  public int delete(int id);
  public Medecin get(int id); 
  public int update(Medecin medecin);
  public Medecin getLogin(String email, String password);
  
  
  }
 