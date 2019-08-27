
  package hafia.hasa.controller; import java.util.List;
  
  import javax.ejb.EJB; import javax.faces.bean.ManagedBean; import
  javax.faces.bean.SessionScoped;

import hafia.hasa.dao.IConsultation;
import hafia.hasa.dao.IPatient; import hafia.hasa.dao.IRdv; import
  hafia.hasa.entites.Consutation; import hafia.hasa.entites.Patient; import
  hafia.hasa.entites.RDV;
  
  @ManagedBean(name="rdvbean")
  
  @SessionScoped
  public class RdvBean{
  
	  @EJB 
	  private IRdv rdvdao;
	  
	  @EJB 
	  private IPatient patientdao;
	  @EJB 
	  private IConsultation consultationdao;
	  
	  private RDV rdv;
  
	  public RdvBean() 
	  { 
		  rdv = new RDV();
	  }
  
	  public void save() 
  
	  { try 
	  
		  {
			  rdvdao.add(rdv); rdv = new RDV();
		  
		  } catch (Exception e) { e.printStackTrace(); } 
  
	  }
	  public void reset() {
		  
		  rdv=new RDV(); }
  
	  public void remove() 
	  { 
		  try 
	  
	  { rdvdao.delete(rdv.getId());
  
	  } catch (Exception e) { e.printStackTrace(); } }
  
	  
	  public void edit() { 
		  try { rdv=rdvdao.get(rdv.getId());
  
	  } catch (Exception e) { e.printStackTrace(); } }
  
	  public List<RDV> findAll() { return rdvdao.getAll(); }
  
	  public void update() { 
		  
		  try { rdvdao.update(rdv);
		  }
	  catch (Exception e) { e.printStackTrace(); } }
  
	//methode pour la liste deroulante
		public List<Patient> getPatient()
		{
			return patientdao.getAll();
		}
		public List<Consutation> getConsultation()
		{
			return consultationdao.getAll();
		}

  
	  public RDV getRdv() { return rdv; }
	  
	  public void setRdv(RDV rdv) { this.rdv = rdv; }
	  
	  }
 