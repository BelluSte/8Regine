package problema8regine.model;

import java.util.ArrayList;


public class Scacchiera {

	private ArrayList<Regina> pezziPosizionati;
	
	
	/**
	 * genera una scacchiera (lista di pezzi) vuota
	 */
	public Scacchiera() {
		this.pezziPosizionati = new ArrayList<Regina>();
	}


	/**
	 * genera una scacchiera copia
	 */
	public Scacchiera(Scacchiera scacchiera) {
		this.pezziPosizionati = new ArrayList<Regina>();
		this.pezziPosizionati.addAll(scacchiera.getPezziPosizionati());
	}
	
	
	public ArrayList<Regina> getPezziPosizionati() {
		return pezziPosizionati;
	}


	public void aggiungiPezzo(Regina regina) {
		this.pezziPosizionati.add(regina);
	}
	
	
	public void rimuoviPezzo(Regina regina) {
		this.pezziPosizionati.remove(regina);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pezziPosizionati == null) ? 0 : pezziPosizionati.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scacchiera other = (Scacchiera) obj;
		if (pezziPosizionati == null) {
			if (other.pezziPosizionati != null)
				return false;
		} else if (!pezziPosizionati.equals(other.pezziPosizionati))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Scacchiera [" + pezziPosizionati + "]\n";
	}
	
}
