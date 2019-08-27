package hafia.hasa.controller;  
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import hafia.hasa.dao.IConsultation;
import hafia.hasa.dao.IOrdonance;
import hafia.hasa.entites.Consutation;
import hafia.hasa.entites.Ordonance;

  @ManagedBean(name="ordonancebean") 
  public class OrdonanceBean {
	  	@EJB
		private IOrdonance ordonancedao;
	  	@EJB
	  	private IConsultation consultationdao;
		private Ordonance ordonance = new Ordonance();
	public void save()
		{
			try {
				
				ordonancedao.add(ordonance);
				ordonance = new Ordonance();
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	public void reset() { 
		 ordonance= new Ordonance(); }
	
	public List<Ordonance> findAll() {
		return ordonancedao.getAll();
	}
	//methode pour la liste deroulante
		public List<Consutation> getConsultation()
		{
			return consultationdao.getAll();
		}
	
	
	public Ordonance getOrdonance() {
		return ordonance;
	}

	public void setOrdonance(Ordonance ordonance) {
		this.ordonance = ordonance;
	}
  }
 