package hafia.hasa.entites;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dossier {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column
	private String traitement;
	@Column
	private String antecedant;
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dossier(int id, String traitement,  String antecedant) {
		super();
		this.id = id;
		this.traitement = traitement;
		
		this.antecedant = antecedant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	
	public String getAntecedant() {
		return antecedant;
	}
	public void setAntecedant(String antecedant) {
		this.antecedant = antecedant;
	}
	
	

}
