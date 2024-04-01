package iut.bad;

public class Femme extends Humain {
	
	public Femme(String nom,String prenom,int age) {
		super(nom,prenom,age);
	}
	
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public static void main(String args[]) {
	
		Femme f = new Femme("Angela","Patricia",10);
		f.details();
	}
}
