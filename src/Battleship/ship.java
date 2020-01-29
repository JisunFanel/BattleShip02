package Battleship;

public class Ship {
	
	private Coordonnees debut;
	private Coordonnees fin;
	private Coordonnees[] partiesTouchees;
	private int nbTouchees;
	
	public Ship (Coordonnees debut, int longueur, boolean estVertical) {
		this.debut = debut;
		
		this.debut = debut;
		
		if(estVertical) {
			
			fin = new Coordonnees(this.debut.getColonne(), debut.getLigne() + longueur - 1);
			
		}else{
			
			fin = new Coordonnees(this.debut.getColonne()+ longeur - 1, this.debut.getLigne());
		}
		
		partiesTouchees = new Coordonnees[longueur];
		nbTouchees = 0;
		
	}
	
	public Coordonnee getDebut () {
		return debut;
		}
	public Coordonnee getFin() {
		return fin;
	}
	public boolean contient(Coordonnees c) {
		
		return c.getColonne() >= debut.getColonne() 
				&& c.Colonne() <= fin.getColonne()
				&& c.getLigne() >= debut.getLigne()
				&& c.getLigne() <= fin.getLigne();		
	}
	public boolean chevauche(Ship n){
		
		if(this.debut.getLigne() == this.fin.getLigne()) {
			
			return n.debut.getColonne() <= this.debut.getColonne()
			&& this.debut.getLigne() >= n.debut.getColonne()
			&& this.debut.getLigne() <= n.fin.getLigne();
		
		}else{
			n.debut.getLigne() >= this.debut.getLigne()
			&& n.debut.getligne() <= this.fin getLigne()
			&& this.debut.getColonne() >= n.debut.getColonne()
			&& this.debut.getColonne() <= n.fin.getColonne();
			
		}
	}

	public boolean estTouche(Coordonnees c) {
		
		for (int = 0; i < partiesTouchees.length; i++) {
			if(partiesTouchees[i].equals(c)) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public boolean recoitTir(Coordonnees c) {
		
		if(this.contient(c)) {
			partiesTouchees[nbTouchees] = c;
			nbTouchees= nbTouchees +1;
			return true;
		}
		
		return false;
	}
	
	public boolean estTouche() {
		return nbTouchees > 0;
	}
	
	public boolean estCoule() {
		return partiesTouchees.length == nbTouchees; 
	}
}
