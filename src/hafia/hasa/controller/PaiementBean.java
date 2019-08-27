
  package hafia.hasa.controller;
  
  import java.util.List;
  
  import javax.ejb.EJB; import javax.faces.bean.ManagedBean;
  
  import hafia.hasa.dao.IConsultation; import hafia.hasa.dao.IPaiement; import
  hafia.hasa.dao.ITypePaiement; import hafia.hasa.entites.Consutation; import
  hafia.hasa.entites.Infirmier; import hafia.hasa.entites.Medecin; import
  hafia.hasa.entites.Paiement; import hafia.hasa.entites.Patient; import
  hafia.hasa.entites.Typepaiement;
  
  
  @ManagedBean(name="paiementbean") public class PaiementBean {
  
  
  @EJB private IPaiement paiementdao;
  
  @EJB private IConsultation consultationdao;
  
  @EJB private ITypePaiement typePaiementdao;
  
  private Paiement paiement;
  
  public PaiementBean() { paiement= new Paiement(); }
  
  
  public void save() {
	  try { paiementdao.add(paiement); 
	  paiement = new Paiement();
  
    } catch (Exception e) { e.printStackTrace(); } }
  
	  public void reset() 
	  { paiement= new Paiement(); }
  
	  public void remove() {
		  try { paiementdao.delete(paiement.getId());
  
		  } catch (Exception e) { e.printStackTrace(); } }
  
  
	  public void edit() { 
		  try { paiement=paiementdao.get(paiement.getId());
  
		  } catch (Exception e) {
  
			  e.printStackTrace(); 
			  } 
		  }
  
  
	  	public List<Paiement>findAll() {
  
	  		return paiementdao.getAll(); }
  
	  	public void update() {
	  		try { paiementdao.update(paiement); }
  
	  		catch (Exception e) { e.printStackTrace(); } }
  
	  		public List<Typepaiement> getTypePaiement() {
	  		return typePaiementdao.getAll(); }
	  		
	  	public List<Consutation> getConsultation() {
	  		return consultationdao.getAll();
	  	}
  
  
  
	  	public Paiement getPaiement() { 
	  		return paiement; }
  
	  	public void setPaiement(Paiement paiement) { 
	  		this.paiement = paiement; }
  
  
  
  }
 