/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package supercalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Platform;


/**
 *
 * @author errol
 */
public class FXMLDocumentController implements Initializable {
    
    Calculator calc;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new Calculator();
    } 
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private TextField resultField;
    
    @FXML
    private Label num1Label;
    
    @FXML
    private TextField num1Field;
    
    @FXML
    private Label num2Label;
    
    @FXML
    private TextField num2Field;
    
    @FXML
    private Label titleLabel;
    
    @FXML
    private Label warningLabel;
    
    @FXML
    private Label clearLabel;
    
    @FXML
    private void addHandleButtonAction(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(num1Field.getText());
            Double num2 = Double.parseDouble(num2Field.getText());
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            
            double result = calc.add();
            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Incorrect values");
        }
    }
    
    @FXML
    private void subtractHandleButtonAction(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(num1Field.getText());
            Double num2 = Double.parseDouble(num2Field.getText());
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            
            double result = calc.subtract();
            
            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Incorrect values");
        }
    }
    
    @FXML
    private void multiplyHandleButtonAction(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(num1Field.getText());
            Double num2 = Double.parseDouble(num2Field.getText());
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            
            double result = calc.multiply();
            
            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Incorrect values");
        }
    }
    
    @FXML
    private void divideHandleButtonAction(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(num1Field.getText());
            Double num2 = Double.parseDouble(num2Field.getText());
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            
            double result = calc.divide();
            if (result != 0) {
                resultField.setText(Double.toString(result));
            } else {
                warningLabel.setText("Cannot divide by 0");
                resultField.clear();
            }
        } catch (NumberFormatException e) {
            resultField.setText("Incorrect values");
        }
    }
    
    @FXML 
    private void clearHandleButtonAction(ActionEvent event) {
        num1Field.clear();
        num2Field.clear();
        resultField.clear();
    }
    
    @FXML
    private void exitHandleButtonAction(ActionEvent event) {
        Platform.exit();
    }
   
    
}
