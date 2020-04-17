package problema8regine.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private Scacchiera scacchiera;
	private List<Scacchiera> soluzioni;
	private List<Integer> colonneValide;
	
	
	public Model() {
		
		scacchiera = new Scacchiera();
		soluzioni = new ArrayList<Scacchiera>();
		
		posizionaRegine(scacchiera, 0);
		
	}
	
	
	public void posizionaRegine(Scacchiera scacchiera, int riga) {
		
		if (scacchiera.getScacchiera().size() == 8) {
			soluzioni.add(new Scacchiera(scacchiera));
			return;
		}
		
		
		boolean trovata = false;
		
		for (int c=0; c<8; c++) {
			for (Regina r: scacchiera.getScacchiera()) {
				if (c == r.getColonna() && c == r.getColonna()-1 && c == r.getColonna()+1) {
					break;
				} else {
					trovata = true;
				}
			}
			if (trovata) {
				Regina regina = new Regina(riga, c);
				
			}
		}
		
		//scacchiera.aggiungiPezzo(new Regina(regina));
		colonneValide.add(colonna);
			
		posizionaRegine(scacchiera, riga+1);
			
		//scacchiera.rimuoviPezzo(regina);
		colonneValide.remove(colonna);
		
	}
	
	
	public List<Scacchiera> getSoluzioni() {
		return soluzioni;
	}
}
