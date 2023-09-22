/**
 * The JavaFXViewImplementation class is an implementation of the View interface.
 * It represents a view using JavaFX for displaying a greeting message.
 * This class currently throws an UnsupportedOperationException for the 'showGreeting' method, indicating that it's not yet implemented.
 *
 * @authors Andoni, Ander
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXViewImplementation implements View {

    @FXML private Label lblOutput;
    
    @Override
    public void showGreeting(String greeting) {
       /* Parent root = null; 
        try {
            root = FXMLLoader.load(getClass().getResource("application/FXMLDocument.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(JavaFXViewImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage stage = new Stage();
        stage.setTitle("Hello World!");
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //Label label = new Label();
        //root.getChildren().add(label);
        
        lblOutput.setText(greeting);
        
        
        //stage.setScene(new Scene(root, 300, 200));
        stage.show();*/
    }

}
