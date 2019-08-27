
  package hafia.hasa.dao;
  
  import java.util.List;
  
  import javax.ejb.Local;
  
  import hafia.hasa.entites.Typepaiement;
  
  @Local public interface ITypePaiement { public List<Typepaiement> getAll(); }
 