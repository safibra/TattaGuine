package hafia.hasa.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Infirmier {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@OneToMany(mappedBy = "infirmier"/* , cascade = {CascadeType.DETACH, CascadeType.REMOVE} */)
	private List<Patient> patient = new ArrayList<Patient>();
	public Infirmier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Infirmier(int id, String nom, String prenom, List<Patient> patient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.patient = patient;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	
	
	
}
