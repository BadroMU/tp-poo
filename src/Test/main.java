package Test;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	Etudiant e = new Etudiant();
	System.out.println("entrez son nom");
	Scanner scanner = new Scanner(System.in);
	e.setLastName(scanner.nextLine());
	System.out.println("entrez son prenom");
	scanner = new Scanner(System.in);
	e.setFirstName(scanner.nextLine());
	System.out.println("entrez son matricule");
	scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	for(int i=0;i<s.length();i++) {
		e.setMatricule(Character.getNumericValue((s.charAt(i))), i);
	}
	System.out.println(e.toString());
	
	
	
	
	
	}

}
