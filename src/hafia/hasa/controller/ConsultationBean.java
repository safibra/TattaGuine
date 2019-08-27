package hafia.hasa.controller;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hafia.hasa.dao.IConsultation;
import hafia.hasa.dao.IPatient;
import hafia.hasa.entites.Consutation;
import hafia.hasa.entites.Patient;

@ManagedBean(name="consultationBean")
@SessionScoped
public class ConsultationBean {
	
	private Consutation consultation;
	@EJB
	private IConsultation consultationdao;
	@EJB
	private IPatient patientdao;
	public ConsultationBean() {
		consultation = new Consutation();
	}

	public void save() {
		try {
			consultationdao.add(consultation);
			consultation = new Consutation();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void reset() {
		consultation =new Consutation();
	}
	public void remove() {
		try {
			consultationdao.delete(consultation.getId());
		} catch (Exception e) {
			
		}
	}
	public void edit() {
		try {
			consultation=consultationdao.get(consultation.getId());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void update() {

		try {
			consultationdao.update(consultation);
		} catch (Exception e) {
			
		}
	}
	public List<Consutation> findAll() {
		return consultationdao.getAll();
		
	}
	//methode pour la liste deroulante
		public List<Patient> getPatient()
		{
			return patientdao.getAll();
		}

	
	
	public Consutation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consutation consultation) {
		this.consultation = consultation;
	}
	
}
