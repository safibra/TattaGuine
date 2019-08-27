package hafia.hasa.dao;
import java.util.List;
import javax.ejb.Local;
import hafia.hasa.entites.Ordonance;

@Local
public interface IOrdonance {
	public int add(Ordonance ordonance); 
	  public List<Ordonance> getAll(); 
	  public Ordonance get(int id);
}
