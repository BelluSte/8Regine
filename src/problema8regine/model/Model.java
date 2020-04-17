package problema8regine.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<Scacchiera> soluzioni = null;
	
	
	public List<Scacchiera> Risolvi() {
		
		Scacchiera scacchiera = new Scacchiera();
		soluzioni = new ArrayList<Scacchiera>();
		int riga = 0;
		
		posizionaRegine(scacchiera, riga);
		
		return soluzioni;
	}
	
	
	public void posizionaRegine(Scacchiera scacchiera, int riga) {
		
		if (scacchiera.pezziInseriti() == 8) {
			soluzioni.add(new Scacchiera(scacchiera));
			return;
		}
		
		for (int c=0; c<8; c++) {
			
			Regina regina = new Regina(riga, c);
			
			if (scacchiera.reginaValida(regina)) {
					
					scacchiera.aggiungiPezzo(new Regina(regina));
					
					posizionaRegine(scacchiera, riga+1);
					
					scacchiera.rimuoviPezzo(regina);
			}
		}
	}
}
