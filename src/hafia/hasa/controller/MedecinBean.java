package hafia.hasa.controller;


import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import hafia.hasa.dao.IMedecin;
import hafia.hasa.dao.IServices;

import hafia.hasa.entites.Medecin;
import hafia.hasa.entites.Services;

@ManagedBean(name="medecinbean")
public class MedecinBean {
	
	
	private Medecin medecin;
	@EJB
	private IMedecin medecindao;
	@EJB
	private IServices servicedao;
	
	public MedecinBean()
	{
		medecin = new Medecin();
	}
	
	public void getConnection()
	{
	//redirection
	String url = null;
		
	try {
		url ="/accueil.jsf";
		ExternalContext externalContext = FacesContext.getCurrentInstance()
														.getExternalContext();
		
	
		//pour la connection
		Medecin med = medecindao.getLogin(medecin.getEmail(), medecin.getPassword());
		
		if(med!=null)
		{
			medecin = med;
			url ="/accueil.jsf";
			//demarrage de la session
			FacesContext facesContext = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(true);
			session.setAttribute("user_session", med);
			
		}
		else
		{
			url ="/index.jsf"; 
		}
		
		externalContext.redirect(externalContext.getRequestContextPath() +url);
	}catch (IOException e) {
		
		e.printStackTrace();
	}
}
	
	public void save()
	{
		try {
			medecindao.add(medecin);
			medecin = new Medecin();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void reset()
	{
		medecin= new Medecin();
	}
	
	public void edit()
	{
		try {
			medecin=medecindao.get(medecin.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void remove()
	{
		try {
			medecindao.delete(medecin.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void update()
	{
		try {
			medecindao.update(medecin);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Medecin> findAll()
	{
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(true);
	//gestion de redirection
	if((Medecin)session.getAttribute("user_session")==null)
	{
		try {
			ExternalContext externalContext = FacesContext.getCurrentInstance()
					.getExternalContext();
			externalContext.redirect(externalContext.getRequestContextPath() +"/index.jsf");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		return medecindao.getAll();
		
		
	}
		
	//methode pour la liste deroulante
		public List<Services> getServices()
		{
			return servicedao.getAll();
		}
	
		public String logOut()
		{
			try {
				//deconnexion 
				FacesContext facesContext = FacesContext.getCurrentInstance();
				HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(false);
				session.invalidate();
				
				//redirection
				ExternalContext externalContext = FacesContext.getCurrentInstance()
						.getExternalContext();
				externalContext.redirect(externalContext.getRequestContextPath() +"/index.jsf");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return"index.jsf";
		}
	
	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
}
