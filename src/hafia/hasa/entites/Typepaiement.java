package hafia.hasa.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Typepaiement {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column
	private String nom;
	
	/*
	 * @ManyToOne private Paiement paiement = new Paiement();
	 */
	public Typepaiement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Typepaiement(int id, String nom, Paiement paiement) {
		super();
		this.id = id;
		this.nom = nom;
		//this.paiement = paiement;
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

	/*
	 * public Paiement getPaiement() { return paiement; }
	 * 
	 * public void setPaiement(Paiement paiement) { this.paiement = paiement; }
	 */
	

}
