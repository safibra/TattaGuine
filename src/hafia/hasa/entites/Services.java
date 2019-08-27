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
public class Services {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column
	private String nom;
	
	@OneToMany(mappedBy="service")
	private List<Medecin> medecin = new ArrayList<Medecin>();

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(int id, String nom, List<Medecin> medecin) {
		super();
		this.id = id;
		this.nom = nom;
		this.medecin = medecin;
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

	public List<Medecin> getMedecin() {
		return medecin;
	}

	public void setMedecin(List<Medecin> medecin) {
		this.medecin = medecin;
	}

	
}
