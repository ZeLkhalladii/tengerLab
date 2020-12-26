package tangerLab;


public class EmployesVente extends Employes{

	private double ChifreAffaire = 1000;

	EmployesVente(String nom, String prenom, int Age, String dateDES) {
		super();
	}
	

	@Override
	public double calculerSalaire() {
		return ChifreAffaire*0.2+1500;
	}

	
}
