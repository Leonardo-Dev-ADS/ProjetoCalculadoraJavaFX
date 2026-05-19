/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSomar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnFechar;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnDividir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnSomar_Click(ActionEvent event) {
        int n1, n2, res = 0;
        
        try {
            //obtem os dados da tela e faz parsing
            n1 = Integer.parseInt(txtNumero1.getText());
            n2 = Integer.parseInt(txtNumero2.getText());

            //faz a soma
            res = n1 + n2;
        }
        catch (NumberFormatException ex)
        {
            mensagem("Utilize somente números...");
            return; //finaliza o método
        }
        
        //exibe na tela
        txtResultado.setText(String.valueOf(res));
    }

    @FXML
    private void btnSubtrair_Click(ActionEvent event) {
        int n1, n2, res = 0;
        
        try {
            //obtem os dados da tela e faz parsing
            n1 = Integer.parseInt(txtNumero1.getText());
            n2 = Integer.parseInt(txtNumero2.getText());

            //faz a subtração
            res = n1 - n2;
        }
        catch (NumberFormatException ex)
        {
            mensagem("Utilize somente números...");
            return; //finaliza o método
        }
        
        //exibe na tela
        txtResultado.setText(String.valueOf(res));
    }

    @FXML
    private void btnFechar_Click(ActionEvent event) {
        Stage stage = (Stage)btnFechar.getScene().getWindow();
        stage.close();
    }
    
    private void mensagem(String msg) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Mensagem");
        alerta.setHeaderText(msg);
        alerta.setContentText("");

        alerta.showAndWait(); //exibe a mensage
    }

    @FXML
    private void btnMultiplicar_Click(ActionEvent event) {
        int n1, n2, res = 0;
        
        try {
            //obtem os dados da tela e faz parsing
            n1 = Integer.parseInt(txtNumero1.getText());
            n2 = Integer.parseInt(txtNumero2.getText());

            //faz a Multiplicacao
            res = n1 * n2;
        }
        catch (NumberFormatException ex)
        {
            mensagem("Utilize somente números...");
            return; //finaliza o método
        }
        
        //exibe na tela
        txtResultado.setText(String.valueOf(res));
    }

    @FXML
    private void btnDividir_Click(ActionEvent event) {
        int n1, n2;
        float res = 0;
        
        try {
            //obtem os dados da tela e faz parsing
            n1 = Integer.parseInt(txtNumero1.getText());
            n2 = Integer.parseInt(txtNumero2.getText());

            //faz a subtração
            //faz casting para resultado da operação correto
            res = (float)n1 / n2;
            
            if(Float.isInfinite(res)) {
                mensagem("Não é permitido divisão por (0)");
                return;
            }
        }
        catch (NumberFormatException ex)
        {
            mensagem("Utilize somente números...");
            return; //finaliza o método
        }
        
        //exibe na tela
        txtResultado.setText(String.valueOf(res));
    }


}
