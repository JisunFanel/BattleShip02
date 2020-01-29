
public class BoardPlot implements Plot {

	private int abscisse;
	private int ordonnee;
	
	
	
	public BoardPlot(int abscisse, int ordonnee) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	@Override
	public int getAbscisse() {
		return abscisse;
	}

	@Override
	public int getOrdonnee() {
		return ordonnee;
	}

	@Override
	public Plot getPlotTo(Direction d) {
		// TODO Auto-generated method stub
		
		// calculer les nouvelles coordonnées
		switch(d) {
		case Nord:
			return new BoardPlot(this.abscisse +1,this.ordonnee);
		case Sud: 
			return new BoardPlot(this.abscisse -1, this.ordonnee);
		case Ouest: 
			return new BoardPlot(this.abscisse, this.ordonnee -1);
		case Est: 
			return new BoardPlot(this.abscisse, this.ordonnee +1);
			
		}
		// return new Plot (nouvelX, nouvelY);
		
		
		
	}

}
