package problema8regine.model;

import java.util.ArrayList;
import java.util.List;


public class Scacchiera {

	private List<Regina> scacchiera;
	
	
	/**
	 * genera una scacchiera (lista di pezzi) vuota
	 */
	public Scacchiera() {
		this.scacchiera = new ArrayList<Regina>();
	}


	/**
	 * genera una scacchiera copia
	 */
	public Scacchiera(Scacchiera scacchiera) {
		this.scacchiera = new ArrayList<Regina>();
		this.scacchiera.addAll(scacchiera.getScacchiera());
	}


	public List<Regina> getScacchiera() {
		return scacchiera;
	}
	
	
	public void aggiungiPezzo(Regina regina) {
		this.scacchiera.add(regina);
	}
	
	
	public void rimuoviPezzo(Regina regina) {
		this.scacchiera.remove(regina);
	}


	@Override
	public String toString() {
		return "Scacchiera [" + scacchiera + "]\n";
	}
	
}
