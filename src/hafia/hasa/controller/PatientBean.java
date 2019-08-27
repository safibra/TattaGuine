package hafia.hasa.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import hafia.hasa.dao.IInfirmier;
import hafia.hasa.dao.IMedecin;
import hafia.hasa.dao.IPatient;
import hafia.hasa.entites.Infirmier;
import hafia.hasa.entites.Medecin;
import hafia.hasa.entites.Patient;
import hafia.hasa.entites.Services;

@ManagedBean(name="patientbean")
public class PatientBean {
	
	@EJB
	private IPatient patientdao;
	@EJB
	private IInfirmier infirmierdao;
	@EJB
	private IMedecin medecindao;
	
	private Patient patient;

	public PatientBean()
	{
		patient = new Patient();
	}
	public void save()
	{
		try {
			patientdao.add(patient);
			patient = new Patient();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void reset()
	{
		patient= new Patient();
	}
	
	public void remove() {
		try {
			patientdao.delete(patient.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void edit() {
		try {
			patient=patientdao.get(patient.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Patient> findAll() {
			return patientdao.getAll();
	}
	
	public void update()
	{
		try {
			patientdao.update(patient);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//methode pour la liste deroulante
			public List<Infirmier> getInfirmier()
			{
				return infirmierdao.getAll();
			}
			
	//methode pour la liste deroulante
	public List<Medecin> getMedecin()
		{
			return medecindao.getAll();
		}
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
