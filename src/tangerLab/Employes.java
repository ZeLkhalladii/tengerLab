package tangerLab;


public abstract class Employes {

	private String nom;
	private String prenom;
	private int Age;
	private String dateDES;

	 Employes(String nom, String prenom, int Age, String dateDES) {
		this.nom = nom;
		this.prenom = prenom;
		this.Age = Age;
		this.dateDES = dateDES;
	}
	
	 Employes() {
		
	}

	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public int getAge() {
		return this.Age;
	}
	public String getDateDES() {
		return this.dateDES;
	}

	public abstract double calculerSalaire();	
}

		
