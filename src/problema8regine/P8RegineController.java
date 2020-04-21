package problema8regine;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import problema8regine.model.Model;
import problema8regine.model.Regina;
import problema8regine.model.Scacchiera;

public class P8RegineController {

    Model model;
    
    private boolean risolto = false;
    private File img = new File("C:\\Users\\Stefano\\git\\8Regine\\src\\img\\regina.png");
    private List<Regina> listaSel = null;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button risolvi;

    @FXML
    private ComboBox<Scacchiera> soluzioni;
    
    @FXML
    private GridPane griglia;


    @FXML
    void risolviProblema(ActionEvent event) {
    	
    	if (!risolto) {
    		soluzioni.getItems().addAll(model.Risolvi());
    		risolto = true;
    		soluzioni.setVisible(true);
    	}
    }

    @FXML
    void visualizzaSoluzione(ActionEvent event) {
    	griglia.setGridLinesVisible(false);
    	griglia.getChildren().clear();
    	griglia.setGridLinesVisible(true);
    	listaSel = new ArrayList<Regina>(soluzioni.getValue().getScacchiera());
    	for (Regina r : listaSel) {
    		ImageView casella = new ImageView(img.toURI().toString());
    		casella.setFitHeight(50);
    		casella.setFitWidth(50);
    		griglia.add(casella, r.getColonna(), r.getRiga());
    	}
    }

    @FXML
    void initialize() {
        assert risolvi != null : "fx:id=\"risolvi\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert soluzioni != null : "fx:id=\"soluzioni\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert griglia != null : "fx:id=\"griglia\" was not injected: check your FXML file 'P8Regine.fxml'.";
        
    }
    
    public void setModel(Model model) {
    	this.model = model;
    }
    
}
