import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControladorFracciones {

    @FXML
    private Button cmdLimpiaDatos;

    @FXML
    private Button cmdSuma;

    @FXML
    private Button cmdResta;

    @FXML
    private Button cmdMultiplica;

    @FXML
    private Button cmdDivide;

    @FXML
    private CheckBox simplicar1;

    @FXML
    private TextField txtNumerador1;

    @FXML
    private TextField txtDenominador1;

    @FXML
    private CheckBox simplificar2;

    @FXML
    private TextField txtNumerador2;

    @FXML
    private TextField txtDenominador2;

    @FXML
    private CheckBox simplificarFinal;

    @FXML
    private TextField txtNumeradorF;

    @FXML
    private TextField txtDenominadorF;

    @FXML
    private ImageView imgDinosaurio;

    private Fraccionario fraccionario;
    
    public ControladorFracciones(){
      fraccionario = new Fraccionario();
    }

    @FXML
    public void cmdSuma() {
      fraccionario.setNumerador(Integer.parseInt(txtNumerador1.getText()));
      fraccionario.setDenominador(Integer.parseInt(txtDenominador1.getText()));

    }
    
    @FXML
    public void cmdLimpiaDatos() {
      fraccionario.setNumerador(0);
      fraccionario.setDenominador(0);
      
        
      txtNumerador1.setText("0");
      txtNumerador2.setText("0");
      txtNumeradorF.setText("0");
      txtDenominador1.setText("0");
      txtDenominador2.setText("0");
      txtDenominadorF.setText("0");
      
    }

}



