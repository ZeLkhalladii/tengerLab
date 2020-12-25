package tangerLab;

import java.util.Date;

public abstract class Employes {

	private String nom;
	private String prenom;
	private int age;
	private Date dateDentrer;
	
	
	
	
	public Employes(String nom, String prenom, int age, Date dateDentrer) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateDentrer = dateDentrer;
		
	}

	public String getNom() {
	return this.nom;
}
	public String getPrenom() {
		return this.prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Date getDateDentrer() {
		return this.dateDentrer;
	}
	
	public abstract void calculerSalaire();
	
	
	public String afficherLemployer() { 
		
		return "L'employé " + getNom() + getPrenom();
	}
		
}

