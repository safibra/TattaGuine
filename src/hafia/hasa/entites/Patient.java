package hafia.hasa.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private int age;
	@Column
	private String adresse;
	
	@ManyToOne
	private Infirmier infirmier = new Infirmier();
	
	@ManyToOne
	private Medecin medecin = new Medecin();
	
	@OneToMany (mappedBy="patient")
	private List<Hospitalisation> hospitalisation = new ArrayList<Hospitalisation>();

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Infirmier getInfirmier() {
		return infirmier;
	}

	public void setInfirmier(Infirmier infirmier) {
		this.infirmier = infirmier;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public List<Hospitalisation> getHospitalisation() {
		return hospitalisation;
	}

	public void setHospitalisation(List<Hospitalisation> hospitalisation) {
		this.hospitalisation = hospitalisation;
	}
	
	
	
}
