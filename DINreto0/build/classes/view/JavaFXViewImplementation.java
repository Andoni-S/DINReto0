/**
 * The JavaFXViewImplementation class is an implementation of the View interface.
 * It represents a view using JavaFX for displaying a greeting message.
 * This class currently throws an UnsupportedOperationException for the 'showGreeting' method, indicating that it's not yet implemented.
 *
 * @authors Andoni, Ander
 */
package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXViewImplementation extends javafx.application.Application implements View {

    public static String greeting;
    
    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        FXMLDocumentController viewController = loader.getController();
    
        viewController.setGreeting(greeting);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Hello World!"); 
        
        primaryStage.show();
    }
}
