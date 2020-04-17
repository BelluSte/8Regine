package problema8regine.model;

public class provaModel {

	public static void main(String[] args) {
		
		Model prova = new Model();
		
		for (Scacchiera s : prova.Risolvi()) {
			System.out.println(s);
		}
		
	}

}
