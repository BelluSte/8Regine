package problema8regine.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private Scacchiera scacchiera;
	private List<Scacchiera> soluzioni;
	
	
	public Model() {
		
		scacchiera = new Scacchiera();
		soluzioni = new ArrayList<Scacchiera>();
		
		for (int i=0; i<8; i++) {
			posizionaRegine(scacchiera, i);
		}
	}
	
	
	public void posizionaRegine(Scacchiera scacchiera, int riga) {
		
		if (scacchiera.getPezziPosizionati().size() == 8) {
			soluzioni.add(new Scacchiera(scacchiera));
			return;
		}
		
		Regina regina = new Regina(riga, 0);
		boolean trovata = false;
		
		for (int c=0; c<8; c++) {
			for (Regina reg: scacchiera.getPezziPosizionati()) {
				if (c != reg.getColonna() && c != reg.getColonna()-1 && c != reg.getColonna()+1) {
					trovata = true;
					regina.setColonna(c);
					break;
				}
			}
			if (trovata) {
				break;
			}
		}
			
		scacchiera.aggiungiPezzo(new Regina(regina));
			
		posizionaRegine(scacchiera, riga+1);
			
		scacchiera.rimuoviPezzo(regina);
		
	}
	
	
	public List<Scacchiera> getSoluzioni() {
		return soluzioni;
	}
}
