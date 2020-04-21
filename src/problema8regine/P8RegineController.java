package problema8regine;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import problema8regine.model.Model;
import problema8regine.model.Regina;
import problema8regine.model.Scacchiera;

public class P8RegineController {

    Model model;
    private boolean view = false;
    private boolean risolto = false;
    private List<ImageView> caselle = null;
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
    private ImageView C0_0;

    @FXML
    private ImageView C0_1;

    @FXML
    private ImageView C0_2;

    @FXML
    private ImageView C0_3;

    @FXML
    private ImageView C0_4;

    @FXML
    private ImageView C0_5;

    @FXML
    private ImageView C0_6;

    @FXML
    private ImageView C0_7;

    @FXML
    private ImageView C1_0;

    @FXML
    private ImageView C1_1;

    @FXML
    private ImageView C1_2;

    @FXML
    private ImageView C1_3;

    @FXML
    private ImageView C1_4;

    @FXML
    private ImageView C1_5;

    @FXML
    private ImageView C1_6;

    @FXML
    private ImageView C1_7;

    @FXML
    private ImageView C2_0;

    @FXML
    private ImageView C2_1;

    @FXML
    private ImageView C2_2;

    @FXML
    private ImageView C2_3;

    @FXML
    private ImageView C2_4;

    @FXML
    private ImageView C2_5;

    @FXML
    private ImageView C2_6;

    @FXML
    private ImageView C2_7;

    @FXML
    private ImageView C3_0;

    @FXML
    private ImageView C3_1;

    @FXML
    private ImageView C3_2;

    @FXML
    private ImageView C3_3;

    @FXML
    private ImageView C3_4;

    @FXML
    private ImageView C3_5;

    @FXML
    private ImageView C3_6;

    @FXML
    private ImageView C3_7;

    @FXML
    private ImageView C4_0;

    @FXML
    private ImageView C4_1;

    @FXML
    private ImageView C4_2;

    @FXML
    private ImageView C4_3;

    @FXML
    private ImageView C4_4;

    @FXML
    private ImageView C4_5;

    @FXML
    private ImageView C4_6;

    @FXML
    private ImageView C4_7;

    @FXML
    private ImageView C5_0;

    @FXML
    private ImageView C5_1;

    @FXML
    private ImageView C5_2;

    @FXML
    private ImageView C5_3;

    @FXML
    private ImageView C5_4;

    @FXML
    private ImageView C5_5;

    @FXML
    private ImageView C5_6;

    @FXML
    private ImageView C5_7;

    @FXML
    private ImageView C6_0;

    @FXML
    private ImageView C6_1;

    @FXML
    private ImageView C6_2;

    @FXML
    private ImageView C6_3;

    @FXML
    private ImageView C6_4;

    @FXML
    private ImageView C6_5;

    @FXML
    private ImageView C6_6;

    @FXML
    private ImageView C6_7;

    @FXML
    private ImageView C7_0;

    @FXML
    private ImageView C7_1;

    @FXML
    private ImageView C7_2;

    @FXML
    private ImageView C7_3;

    @FXML
    private ImageView C7_4;

    @FXML
    private ImageView C7_5;

    @FXML
    private ImageView C7_6;

    @FXML
    private ImageView C7_7;

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
    	if (view) {
    		for (ImageView v : caselle) {
    			if (v.isVisible()) {
    				v.setVisible(false);
    			}
    		}
    	}
    	view = true;
    	listaSel = new ArrayList<Regina>(soluzioni.getValue().getScacchiera());
    	
    	for (Regina r : listaSel) {
    		selezionaCasella(r).setVisible(true);
    	}
    }

    @FXML
    void initialize() {
        assert risolvi != null : "fx:id=\"risolvi\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert soluzioni != null : "fx:id=\"soluzioni\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_0 != null : "fx:id=\"C0_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_1 != null : "fx:id=\"C0_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_2 != null : "fx:id=\"C0_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_3 != null : "fx:id=\"C0_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_4 != null : "fx:id=\"C0_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_5 != null : "fx:id=\"C0_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_6 != null : "fx:id=\"C0_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C0_7 != null : "fx:id=\"C0_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_0 != null : "fx:id=\"C1_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_1 != null : "fx:id=\"C1_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_2 != null : "fx:id=\"C1_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_3 != null : "fx:id=\"C1_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_4 != null : "fx:id=\"C1_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_5 != null : "fx:id=\"C1_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_6 != null : "fx:id=\"C1_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C1_7 != null : "fx:id=\"C1_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_0 != null : "fx:id=\"C2_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_1 != null : "fx:id=\"C2_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_2 != null : "fx:id=\"C2_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_3 != null : "fx:id=\"C2_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_4 != null : "fx:id=\"C2_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_5 != null : "fx:id=\"C2_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_6 != null : "fx:id=\"C2_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C2_7 != null : "fx:id=\"C2_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_0 != null : "fx:id=\"C3_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_1 != null : "fx:id=\"C3_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_2 != null : "fx:id=\"C3_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_3 != null : "fx:id=\"C3_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_4 != null : "fx:id=\"C3_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_5 != null : "fx:id=\"C3_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_6 != null : "fx:id=\"C3_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C3_7 != null : "fx:id=\"C3_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_0 != null : "fx:id=\"C4_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_1 != null : "fx:id=\"C4_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_2 != null : "fx:id=\"C4_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_3 != null : "fx:id=\"C4_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_4 != null : "fx:id=\"C4_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_5 != null : "fx:id=\"C4_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_6 != null : "fx:id=\"C4_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C4_7 != null : "fx:id=\"C4_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_0 != null : "fx:id=\"C5_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_1 != null : "fx:id=\"C5_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_2 != null : "fx:id=\"C5_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_3 != null : "fx:id=\"C5_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_4 != null : "fx:id=\"C5_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_5 != null : "fx:id=\"C5_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_6 != null : "fx:id=\"C5_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C5_7 != null : "fx:id=\"C5_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_0 != null : "fx:id=\"C6_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_1 != null : "fx:id=\"C6_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_2 != null : "fx:id=\"C6_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_3 != null : "fx:id=\"C6_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_4 != null : "fx:id=\"C6_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_5 != null : "fx:id=\"C6_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_6 != null : "fx:id=\"C6_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C6_7 != null : "fx:id=\"C6_7\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_0 != null : "fx:id=\"C7_0\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_1 != null : "fx:id=\"C7_1\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_2 != null : "fx:id=\"C7_2\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_3 != null : "fx:id=\"C7_3\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_4 != null : "fx:id=\"C7_4\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_5 != null : "fx:id=\"C7_5\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_6 != null : "fx:id=\"C7_6\" was not injected: check your FXML file 'P8Regine.fxml'.";
        assert C7_7 != null : "fx:id=\"C7_7\" was not injected: check your FXML file 'P8Regine.fxml'.";

        caselle = new ArrayList<ImageView>();
        caselle.add(C0_0);
        caselle.add(C0_1);
        caselle.add(C0_2);
        caselle.add(C0_3);
        caselle.add(C0_4);
        caselle.add(C0_5);
        caselle.add(C0_6);
        caselle.add(C0_7);
        caselle.add(C1_0);
        caselle.add(C1_1);
        caselle.add(C1_2);
        caselle.add(C1_3);
        caselle.add(C1_4);
        caselle.add(C1_5);
        caselle.add(C1_6);
        caselle.add(C1_7);
        caselle.add(C2_0);
        caselle.add(C2_1);
        caselle.add(C2_2);
        caselle.add(C2_3);
        caselle.add(C2_4);
        caselle.add(C2_5);
        caselle.add(C2_6);
        caselle.add(C2_7);
        caselle.add(C3_0);
        caselle.add(C3_1);
        caselle.add(C3_2);
        caselle.add(C3_3);
        caselle.add(C3_4);
        caselle.add(C3_5);
        caselle.add(C3_6);
        caselle.add(C3_7);
        caselle.add(C4_0);
        caselle.add(C4_1);
        caselle.add(C4_2);
        caselle.add(C4_3);
        caselle.add(C4_4);
        caselle.add(C4_5);
        caselle.add(C4_6);
        caselle.add(C4_7);
        caselle.add(C5_0);
        caselle.add(C5_1);
        caselle.add(C5_2);
        caselle.add(C5_3);
        caselle.add(C5_4);
        caselle.add(C5_5);
        caselle.add(C5_6);
        caselle.add(C5_7);
        caselle.add(C6_0);
        caselle.add(C6_1);
        caselle.add(C6_2);
        caselle.add(C6_3);
        caselle.add(C6_4);
        caselle.add(C6_5);
        caselle.add(C6_6);
        caselle.add(C6_7);
        caselle.add(C7_0);
        caselle.add(C7_1);
        caselle.add(C7_2);
        caselle.add(C7_3);
        caselle.add(C7_4);
        caselle.add(C7_5);
        caselle.add(C7_6);
        caselle.add(C7_7);
        
    }
    
    public void setModel(Model model) {
    	this.model = model;
    }
    
    public ImageView selezionaCasella(Regina r) {
    	int i = r.getColonna();
    	int j = r.getRiga();
    	return caselle.get(i*8+j);
    }
}
