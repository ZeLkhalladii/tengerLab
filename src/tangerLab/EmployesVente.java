package tangerLab;

import java.util.Date;

public class EmployesVente extends Employes{

	private double salair;
	private double SalairCA;
	
	public double getSalairCA() {
		return SalairCA;
	}

	public void setSalairCA(double salairCA) {
		SalairCA = salairCA;
	}

	public double getSalair() {
		return salair;
	}

	public void setSalair(double salair) {
		this.salair = salair;
	}

	
	public EmployesVente(String nom, String prenom, int age, Date dateDentrer, double salair, double SalairCA) {
		super(nom, prenom, age, dateDentrer);
		this.salair =salair;
		this.SalairCA =SalairCA;
	}
	

	public void calculerSalaire() {
		
		
		salair = SalairCA - 20% + 1500;
		
	}
	
	public String afficherEmployeur() {
		return "le Salair mensuel est : " + getSalair();
	}

	
}
