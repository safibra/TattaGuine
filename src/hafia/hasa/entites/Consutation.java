package hafia.hasa.entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consutation {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date datejour;
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
	@OneToOne
	@JoinColumn(name = "rdv_id")
	private RDV rdv;
	
	public RDV getRdv() {
		return rdv;
	}

	public void setRdv(RDV rdv) {
		this.rdv = rdv;
	}
	@ManyToOne
	private Patient patient = new Patient();
	
	@OneToMany(mappedBy="consultation")
	private List<Ordonance> ordonance = new ArrayList<Ordonance>();
	
	@OneToMany(mappedBy="consultation") 
	private List<Paiement> paiement = new ArrayList<Paiement>();

	public Consutation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consutation(int id, Date datejour, double poids, double taille, double pouls, double fre, double temp,
			String motif, RDV rdv, Patient patient, List<Ordonance> ordonance, List<Paiement> paiement) {
		super();
		this.id = id;
		this.datejour = datejour;
		this.poids = poids;
		this.taille = taille;
		this.pouls = pouls;
		this.fre = fre;
		this.temp = temp;
		this.motif = motif;
		this.rdv = rdv;
		this.patient = patient;
		this.ordonance = ordonance;
		this.paiement = paiement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatejour() {
		return datejour;
	}

	public void setDatejour(Date datejour) {
		this.datejour = datejour;
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

	public List<Ordonance> getOrdonance() {
		return ordonance;
	}

	public void setOrdonance(List<Ordonance> ordonance) {
		this.ordonance = ordonance;
	}

	public List<Paiement> getPaiement() {
		return paiement;
	}

	public void setPaiement(List<Paiement> paiement) {
		this.paiement = paiement;
	}



	
}
