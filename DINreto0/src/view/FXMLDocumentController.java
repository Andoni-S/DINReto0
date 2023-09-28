/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @authors Andoni Sanz
 */
package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author andoni,ander
 */
public class FXMLDocumentController {

    @FXML
    private Label label;
    private String greeting;

    public void setGreeting(String greeting) {
        label.setText(greeting);
    }

    public String getGreeting() {
        return greeting;
    }

}
