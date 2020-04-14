package problema8regine.model;

public class Regina {

	private String name;
	private int riga;
	private int colonna;
	private static int num = 1;
	
	
	/**
	 * genera una nuova regina
	 * @param riga riga della scacchiera
	 */
	public Regina(int riga, int colonna) {
		super();
		this.name = "R" + num;
		this.riga = riga;
		this.colonna = colonna;
		num++;
	}

	
	/**
	 * genera una regina copia
	 * @param regina
	 */
	public Regina(Regina regina) {
		super();
		this.name = regina.getName();
		this.riga = regina.getRiga();
		this.colonna = regina.getColonna();
	}
	

	public String getName() {
		return name;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return name + "(" + riga + "," + colonna + ") ";
	}
	
	
}
