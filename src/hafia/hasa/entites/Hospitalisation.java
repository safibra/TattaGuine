package hafia.hasa.entites;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Hospitalisation {
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
	@Temporal(TemporalType.DATE)
	private Date datehos;
	@Column
	private double poids;
	@Column
	private double taille;
	@Column
	private double pouls;
	@Column
	private double fre;
	@Column
	private double temp;
	@Column
	private String motif;
	@ManyToOne /* (cascade = {CascadeType.DETACH, CascadeType.REMOVE}) */
	private Patient patient = new Patient();
	public Hospitalisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospitalisation(int id, String nom, String prenom, int age, String adresse, Date datehos, double poids,
			double taille, double pouls, double fre, double temp, String motif, Patient patient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.datehos = datehos;
		this.poids = poids;
		this.taille = taille;
		this.pouls = pouls;
		this.fre = fre;
		this.temp = temp;
		this.motif = motif;
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
	public Date getDatehos() {
		return datehos;
	}
	public void setDatehos(Date datehos) {
		
		this.datehos = datehos;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public double getPouls() {
		return pouls;
	}
	public void setPouls(double pouls) {
		this.pouls = pouls;
	}
	public double getFre() {
		return fre;
	}
	public void setFre(double fre) {
		this.fre = fre;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
