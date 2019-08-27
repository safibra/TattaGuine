package hafia.hasa.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ordonance {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Temporal(TemporalType.DATE)
	private Date datejour;
	@Column
	private String produit;
	
	@ManyToOne
	private Consutation consultation = new Consutation();

	public Ordonance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ordonance(int id, Date datejour, String produit, Consutation consultation) {
		super();
		this.id = id;
		this.datejour = datejour;
		this.produit = produit;
		this.consultation = consultation;
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

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public Consutation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consutation consultation) {
		this.consultation = consultation;
	}
	
}
