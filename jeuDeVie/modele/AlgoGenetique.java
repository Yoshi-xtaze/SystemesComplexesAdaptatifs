package jeuDeVie.modele;

public class AlgoGenetique {
	
	protected Modele m;

	public AlgoGenetique(Modele m) {
		this.m = m;
	}
	
	public Carte[][] algo(int nbIteration){
		Carte[][] solution = new Carte[m.hauteur][m.largeur];
		return solution;
		
	}

}