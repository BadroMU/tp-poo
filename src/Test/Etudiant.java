package Test;
import java.util.Arrays;
public class Etudiant {
private String firstName;
private String lastName;
private int [] matricule = new int[12];
public String toString () {
	return "Etudiant [firstName="+ firstName +",lastName="+ lastName +",matricule="+Arrays.toString(matricule)+"]";
}
	public Etudiant() { }
public String getFirstName() {
			return firstName ;
}
public void setFirstName(String firstName) {
	this.firstName=firstName;

}
public String getLastName() {
	return lastName ;
}
public void setLastName(String lastName) {
this.lastName=lastName;	
}
public int[] getMatricule() {
	return matricule;
}
public void setMatricule(int chiffre,int i) {
	this.matricule[i]=chiffre;
}





}

