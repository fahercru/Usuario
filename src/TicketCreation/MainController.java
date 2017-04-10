/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketCreation;

import java.net.URL;
import javafx.scene.control.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.*;
import javafx.scene.layout.*;
import com.mxrck.autocompleter.*;
import javafx.scene.input.KeyEvent;
import javafx.collections.FXCollections;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Fabian Hernandez
 */
public class MainController implements Initializable {
    
    public String userId;
    private String tecAfectT;
    private String Descripccion;
    Lista list = new Lista();
    @FXML
    private ChoiceBox<Tecnologia> tecAfect = new ChoiceBox<>();
    public TextArea Descp;
    public TextField mytext;
    private Label label;
    
    
    public MainController() {
       //TextAutoCompleter auto = new TextAutoCompleter();

    }
    
    @FXML
    private void testing2(ActionEvent event) {
        
    }

    @FXML
    public void testing(ActionEvent event) {
        userId = mytext.getText();
        tecAfectT = tecAfect.getValue().toString();
        Descripccion = Descp.getText();
        list.setTecAfect(tecAfectT);
        list.setUsuario(userId);
        list.setDescripccion(Descripccion);
        list.print();
        JOptionPane.showMessageDialog(null, "Ticket creado");
        mytext.clear();
        tecAfect.setValue(Tecnologia.blanco);
        

    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tecAfect.setItems( FXCollections.observableArrayList( Tecnologia.values()));
        mytext.onKeyPressedProperty();
    }

    public String getUserId() {
        return userId;
    }

    public String getTecAfectT() {
        return tecAfectT;
    }

    public ChoiceBox<Tecnologia> getTecAfect() {
        return tecAfect;
    }

    public TextField getMytext() {
        return mytext;
    }

    public Label getLabel() {
        return label;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTecAfectT(String tecAfectT) {
        this.tecAfectT = tecAfectT;
    }

    public void setTecAfect(ChoiceBox<Tecnologia> tecAfect) {
        this.tecAfect = tecAfect;
    }

    public void setMytext(TextField mytext) {
        this.mytext = mytext;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
    
    
    
}
