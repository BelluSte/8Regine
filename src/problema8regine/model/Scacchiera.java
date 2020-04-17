package problema8regine.model;

import java.util.ArrayList;
import java.util.List;


public class Scacchiera {

	private List<Regina> scacchiera = null;
	
	
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
		this.scacchiera = new ArrayList<Regina>(scacchiera.getScacchiera());
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


	public int pezziInseriti() {
		return scacchiera.size();
	}
	
	
	public boolean reginaValida(Regina regina) {
		for (Regina r : scacchiera) {
			if (regina.getColonna() == r.getColonna() || regina.getColonna() == r.getColonna()-1 || regina.getColonna() == r.getColonna()+1) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return scacchiera + "\n";
	}
	
}
