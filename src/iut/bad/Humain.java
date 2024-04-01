package iut.bad;

public class Humain {
	
	public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details() {
		System.out.println("nom : "+nom+ "Prenom : "+prenom+ "Age : "+age);
	}
	
	public void boire() {
		
	}
	
	public void manger() {
		
		
	}
	private String nom;
	private String prenom;
	private int age;
	
	/*@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}*/
	
}
