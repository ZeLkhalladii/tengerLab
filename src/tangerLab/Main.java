package tangerLab;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	

	
	public static void main(String[] args) throws SQLException{
		Database.Db();
		System.out.println("connected !");
		
		Scanner scanner = new Scanner(System.in);

		boolean Quit = false;
		while (Quit !=true) {
			
			System.out.println("choisi le type d'employeur !");
			System.out.println(" =========== les types ======== \n ");
			
			System.out.println("Employeur vendeur ! 1 :");
			System.out.println("Employeur producteur ! 2 : ");
			System.out.println("Employeur representeur ! 3 : ");
			System.out.println("Employeur manutentieur! 4 : ");

			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				
				
				break;
				
			case 2:
				
				
				break;
				
			case 3:
				
				
				break;

			case 4:
				
				
				break;
			default:
				break;
			}
			
		}
		scanner.close();
	
		
	}	
		
}
