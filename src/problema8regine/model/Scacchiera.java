package problema8regine.model;

import java.util.ArrayList;
import java.util.List;


public class Scacchiera {

	private List<Regina> scacchiera = null;
	private static int num = 1;
	private String nome;
	
	/**
	 * genera una scacchiera (lista di pezzi) vuota
	 */
	public Scacchiera() {
		this.scacchiera = new ArrayList<Regina>();
	}


	/**
	 * genera una scacchiera copia
	 */
	public Scacchiera(Scacchiera s) {
		this.scacchiera = new ArrayList<Regina>(s.getScacchiera());
		this.nome = "Soluzione " + num;
		num++;
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
		if (regina.getRiga() == 0) {
			return true;
		} else {
			for (Regina r : scacchiera) {
				int d = regina.getRiga() - r.getRiga();
				if (regina.getColonna() == r.getColonna()) {
					return false;
				} else if (regina.getColonna() == r.getColonna()-d || regina.getColonna() == r.getColonna()+d) {
					return false;
				}
			}
			return true;
		}
	}


	@Override
	public String toString() {
		return nome;
	}


}
