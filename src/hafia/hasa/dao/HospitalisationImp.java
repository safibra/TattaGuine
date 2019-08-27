package hafia.hasa.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import hafia.hasa.entites.Hospitalisation;
import hafia.hasa.entites.Patient;

@Stateless
public class HospitalisationImp implements IHospitalisation{
	
	  @PersistenceContext(unitName="TattaGuine")
	  private EntityManager em;
	  
	  @Override 
	  public int add(Hospitalisation hospitation)
	  { 
		  try {
			  em.persist(hospitation); return 1; 
		  } 
		  catch (Exception e) 
		  {
			  e.printStackTrace(); return 0; } 
	  }
	  
	  @SuppressWarnings("unchecked")
	  
	  @Override
	  public List<Hospitalisation> getAll() { 
		  try { 
			  return (List<Hospitalisation> )em.createQuery("SELECT h FROM Hospitalisation h")
					  .getResultList(); } 
		  catch (Exception e) 
		  	{ e.printStackTrace(); return null; }
	  }
	  
	  @Override 
	  public Hospitalisation get(int id)
	  
	  {  
		  return (Hospitalisation) em.createQuery("SELECT h FROM Hospitalisation h WHERE h.id=:idH")
				  	.setParameter("idH", id) .getSingleResult(); }	
}



