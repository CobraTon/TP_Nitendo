package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	List <Achat> a = new ArrayList();
	

	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public List<Achat> getA() {
		return a;
	}

	public void setA(List<Achat> a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", a=" + a + "]";
	}

	

	
	
	
	
}
