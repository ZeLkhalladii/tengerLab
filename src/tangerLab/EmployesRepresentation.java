package tangerLab;


public class EmployesRepresentation extends Employes {

	private double ChifreAffaire = 2000;

	EmployesRepresentation(String nom, String prenom, int Age, String dateDES) {
		super();
	}

	@Override
	public double calculerSalaire() {
		return ChifreAffaire*0.2+2500;
	}
}
