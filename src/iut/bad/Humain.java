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
	
	public void ami(Humain humain) {
		System.out.println(this.nom+" est ami avec : "+humain.nom);
	}
	
	private String nom;
	private String prenom;
	private int age;

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}
