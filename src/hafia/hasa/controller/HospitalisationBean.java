package hafia.hasa.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hafia.hasa.dao.IHospitalisation;
import hafia.hasa.dao.IPatient;
import hafia.hasa.entites.Hospitalisation;
import hafia.hasa.entites.Infirmier;
import hafia.hasa.entites.Patient;

@ManagedBean(name="hospitalisationbean")
@SessionScoped
public class HospitalisationBean {
	
	@EJB
	private IHospitalisation hospitalisationdao;
	@EJB
	private IPatient patientdao;
	private Hospitalisation hospitalisation = new Hospitalisation();
	

	public void save()
	{
		try {
			
			hospitalisationdao.add(hospitalisation);
			hospitalisation = new Hospitalisation();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	//methode pour la liste deroulante
	public List<Patient> getPatient()
	{
		return patientdao.getAll();
	}
	
	
	 public void reset() { 
		 hospitalisation= new Hospitalisation(); }
	
	public List<Hospitalisation> findAll() {
		return hospitalisationdao.getAll();
	}
	
	public Hospitalisation getHospitalisation() {
		return hospitalisation;
	}

	public void setHospitalisation(Hospitalisation hospitalisation) {
		this.hospitalisation = hospitalisation;
	}

}
