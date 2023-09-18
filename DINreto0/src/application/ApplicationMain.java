

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 /* and open the template in the editor.
 */
package application;

import controller.Controller;
import factory.ModelFactory;
import factory.ViewFactory;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;
import view.View;

/**
 *
 * @author andoni,ander
 */
public class ApplicationMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Controller cont = new Controller();
        ResourceBundle configFile = ResourceBundle.getBundle("application.Config");
        int model = Integer.parseInt(configFile.getString("MODEL"));
	int view = Integer.parseInt(configFile.getString("VIEW"));
        
        Model m = ModelFactory.getModel(model);
        View v = ViewFactory.getView(view);
        
        if(view==1){
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));    
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        cont.run(m, v);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //start();
        
    }
    
}
