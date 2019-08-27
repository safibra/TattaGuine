
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Paiement;
  
  @Local public interface IPaiement {
  
  public int add(Paiement paiement); public List<Paiement> getAll(); public int
  delete(int id); public Paiement get(int id); public int update(Paiement
  paiement);
  
  
  
  }
 