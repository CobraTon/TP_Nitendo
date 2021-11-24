package test;





import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Wii");
		Boutique b1 = new Boutique("Micromania","ch�telet les halles");
		
		
		Jeu j1 = new Jeu ("Zelda", b1, c1);
		Jeu j2 = new Jeu ("Mario kart", b1, c1);
		Jeu j3 = new Jeu ("Smash", b1, c1);
		Jeu j4 = new Jeu ("DonkeyKong", b1, c1);
		Jeu j5 = new Jeu ("Pokemon", b1, c1);
		
        Client cl1 = new Client("BOSVAL","Alexis");
        Client cl2 = new Client("BOITARD","Robin");
        Client cl3 = new Client ("GITLINUX", "Robin");
	}
	
	
	
	
	
}
