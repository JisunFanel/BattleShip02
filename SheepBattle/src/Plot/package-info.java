package Plot;

public class Plot {
	private int colonne;
	private int ligne;
	
	private char caractereInitial = 'A';
	
	public Coordonnes (String coordonnees) {
		
		colonne = coordonnees.charAt(0) - caractereInitial;
		
		String ligne = coordonnees.substring(1, 2);
		this.ligne = Integer.parseInt(ligne);
	}
	
	public int getColonne() {
		return colonne;
	}
	
	public int getLigne() {
		return ligne;
	}
	
	public String toString() {
		
		String coordonnees = new String();
		
		coordonnees = coordonnees + (char)(colonne + caractereInitial) + ligne;
		coordonnees = (char)(colonne + caractereInitial) + "" + ligne;
	}
}