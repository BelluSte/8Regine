package problema8regine.model;

public class Regina {

	private int riga;
	private int colonna;
	
	
	/**
	 * genera una nuova regina
	 * @param riga riga della scacchiera
	 */
	public Regina(int riga, int colonna) {
		super();
		this.riga = riga;
		this.colonna = colonna;
	}

	
	/**
	 * genera una regina copia
	 * @param regina
	 */
	public Regina(Regina regina) {
		super();
		this.riga = regina.getRiga();
		this.colonna = regina.getColonna();
	}


	public int getRiga() {
		return riga;
	}


	public void setRiga(int riga) {
		this.riga = riga;
	}


	public int getColonna() {
		return colonna;
	}


	public void setColonna(int colonna) {
		this.colonna = colonna;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colonna;
		result = prime * result + riga;
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
		Regina other = (Regina) obj;
		if (colonna != other.colonna)
			return false;
		if (riga != other.riga)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "(" + riga + "," + colonna + ") ";
	}
	
	
}
