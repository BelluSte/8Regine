package problema8regine.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private Scacchiera scacchiera;
	private List<Scacchiera> soluzioni;
	private Regina regina;
	
	
	public Model() {
		
		scacchiera = new Scacchiera();
		soluzioni = new ArrayList<Scacchiera>();
		
		posizionaRegine(scacchiera, 0);
		
	}
	
	
	public void posizionaRegine(Scacchiera scacchiera, int riga) {
		
		if (scacchiera.getScacchiera().size() == 8) {
			System.out.println(scacchiera);
			return;
		}
		
		regina = new Regina(riga, 0);
		
		for (int c=0; c<8; c++) {
			for (Regina r: scacchiera.getScacchiera()) {
				if (c != r.getColonna() && c != r.getColonna()-1 && c != r.getColonna()+1) {
					
					regina.setColonna(c);
					
					scacchiera.aggiungiPezzo(new Regina(regina));
					System.out.println(scacchiera);
					
					posizionaRegine(scacchiera, riga+1);
					
					scacchiera.rimuoviPezzo(regina);
					
				} else {
					break;
				}
			}
		}
	}
	
	
	public List<Scacchiera> getSoluzioni() {
		return soluzioni;
	}
}
