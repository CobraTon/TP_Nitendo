package test;





import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Wii");
		
		
		Jeu j1 = new Jeu ("Zelda", c1);
		Jeu j2 = new Jeu ("Mario kart", c1);
		Jeu j3 = new Jeu ("Smash", c1);
		Jeu j4 = new Jeu ("DonkeyKong", c1);
		Jeu j5 = new Jeu ("Pokemon", c1);

		Boutique b1 = new Boutique("Micromania","châtelet les halles");
		Client cl1 = new Client("BOSVAL","Alexis");
		Client cl2 = new Client("BOITARD","Robin");
		
		
		
		
		
	}
	
	
	
	
	
}
