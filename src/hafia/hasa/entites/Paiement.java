package hafia.hasa.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paiement {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	//@Column
	@Temporal(TemporalType.DATE)
	private Date datepaie;
	@Column
	private String description;
	@Column
	private double montant;	
	 
	
	@ManyToOne
	private Consutation consultation = new Consutation();
	@ManyToOne
	private Typepaiement typepaiement=new Typepaiement();
	
	
	public Typepaiement getTypepaiement() {
		return typepaiement;
	}

	public void setTypepaiement(Typepaiement typepaiement) {
		this.typepaiement = typepaiement;
	}

	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paiement(int id, Date datepaie, String description, double montant, List<Typepaiement> typepaiement,
			Consutation consultation) {
		super();
		this.id = id;
		this.datepaie = datepaie;
		this.description = description;
		this.montant = montant;
		
		this.consultation = consultation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatepaie() {
		return datepaie;
	}

	public void setDatepaie(Date datepaie) {
		this.datepaie = datepaie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Consutation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consutation consultation) {
		this.consultation = consultation;
	}

	
}
