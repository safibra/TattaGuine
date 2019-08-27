package hafia.hasa.entites;

import java.util.Date;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RDV {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Temporal(TemporalType.DATE)
	private Date datejour=new Date();
	
	@ManyToOne
	private Patient patient = new Patient();
	@ManyToOne
	private Consutation consutation = new Consutation();
	public RDV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RDV(int id, Date datejour, Patient patient, Consutation consutation) {
		super();
		this.id = id;
		this.datejour = datejour;
		
		this.patient = patient;
		this.consutation = consutation;
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
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Consutation getConsutation() {
		return consutation;
	}
	public void setConsutation(Consutation consutation) {
		this.consutation = consutation;
	}
	
}
