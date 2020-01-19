/**
 * Sample Skeleton for 'ejercicio.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert; 
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Alert.AlertType;
public class Control {

    @FXML // fx:id="cmdLimpiar"
    private Button cmdLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="cmdSumar"
    private Button cmdSumar; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRestar"
    private Button cmdRestar; // Value injected by FXMLLoader

    @FXML // fx:id="cmdMulti"
    private Button cmdMulti; // Value injected by FXMLLoader

    @FXML // fx:id="cmdDividir"
    private Button cmdDividir; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumerador1"
    private TextField txtNumerador1; // Value injected by FXMLLoader

    @FXML // fx:id="txtDenominador1"
    private TextField txtDenominador1; // Value injected by FXMLLoader

    @FXML // fx:id="chexSimplificar1"
    private CheckBox chexSimplificar1; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumerador3"
    private TextField txtNumerador3; // Value injected by FXMLLoader

    @FXML // fx:id="txtDenominador3"
    private TextField txtDenominador3; // Value injected by FXMLLoader

    @FXML // fx:id="chexSimplificar3"
    private CheckBox chexSimplificar3; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumerador2"
    private TextField txtNumerador2; // Value injected by FXMLLoader

    @FXML // fx:id="txtDenominador2"
    private TextField txtDenominador2; // Value injected by FXMLLoader

    @FXML // fx:id="chexSimplificar2"
    private CheckBox chexSimplificar2; // Value injected by FXMLLoader
    
    private Fraccionario f1;
    private Fraccionario f2;
    private Fraccionario f3;
    
    public Control(){
     f1 = new Fraccionario();   
     f2 = new Fraccionario();
    }
    @FXML
    void div() {
        pedir();
        f3 = f1.dividir(f2);
         if(chexSimplificar3.isSelected()){
        f3.simplificar();
    }
        mostrar();
    }

    @FXML
    void limpiar() {
        f1.setDenominador(1);
        f2.setDenominador(1);
        f3.setDenominador(1);
        f1.setNumerador(0);
        f2.setNumerador(0);
        f3.setNumerador(0);
        txtNumerador1.setText(String.valueOf("0"));
        txtNumerador2.setText(String.valueOf("0"));
        txtNumerador3.setText(String.valueOf("0"));
        txtDenominador1.setText(String.valueOf("1"));
        txtDenominador2.setText(String.valueOf("1"));
        txtDenominador3.setText(String.valueOf("1"));
        chexSimplificar1.setSelected(false);
        chexSimplificar2.setSelected(false);
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Informacion");
        alert.setHeaderText(null);
        alert.setContentText("Se limpiaron los datos");
        alert.showAndWait();
    }

    @FXML
    void mostrar() {
        txtNumerador3.setText(String.valueOf(f3.getNumerador()));
        txtDenominador3.setText(String.valueOf(f3.getDenominador()));
    }

    @FXML
    void mult() {
        pedir();
        f3 = f1.multiplicar(f2);
         if(chexSimplificar3.isSelected()){
        f3.simplificar();
    }
        mostrar();
    }

    @FXML
    void pedir() {
        f1.setNumerador(Integer.parseInt(txtNumerador1.getText()));
        f1.setDenominador(Integer.parseInt(txtDenominador1.getText()));
        f2.setNumerador(Integer.parseInt(txtNumerador2.getText()));
        f2.setDenominador(Integer.parseInt(txtDenominador2.getText()));
    }

    @FXML
    void restar() {
        pedir();
        f3 = f1.restar(f2);
        
        if(chexSimplificar3.isSelected())
        f3.simplificar();
        
        mostrar();
    
}

    @FXML
    void simplificar1() {
        f1.setNumerador(Integer.parseInt(txtNumerador1.getText()));
        f1.setDenominador(Integer.parseInt(txtDenominador1.getText()));
        if(chexSimplificar1.isSelected())
        f1.simplificar();
        txtNumerador1.setText(String.valueOf(f1.getNumerador()));
        txtDenominador1.setText(String.valueOf(f1.getDenominador()));
    }

    @FXML
    void simplificar2() {
        
        f2.setNumerador(Integer.parseInt(txtNumerador2.getText()));
        f2.setDenominador(Integer.parseInt(txtDenominador2.getText()));
        if(chexSimplificar2.isSelected()){
        f2.simplificar();
    }
    
        txtNumerador2.setText(String.valueOf(f2.getNumerador()));
        txtDenominador2.setText(String.valueOf(f2.getDenominador()));
}
    @FXML
    void simplificar3() {
         if(chexSimplificar3.isSelected()){
             f3.simplificar();
    }
    mostrar();
    }

    @FXML
    void sumar() {
        pedir();
        f3 = f1.sumar(f2);
        if(chexSimplificar3.isSelected()){
        f3.simplificar();
    }
        mostrar();
}
}
