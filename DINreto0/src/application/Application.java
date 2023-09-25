package application;

import controller.Controller;
import factory.ModelFactory;
import factory.ViewFactory;
import java.util.ResourceBundle;
import model.Model;
import view.View;

/**
 * The main class of the application responsible for initializing and starting the application.
 * It reads configuration values from a resource bundle and initializes the Model, View, and Controller
 * components based on the configuration.
 * 
 * The application expects configuration properties in a resource bundle named "application.Config".
 * The required properties are:
 * - "MODEL": An integer representing the desired Model implementation.
 * - "VIEW": An integer representing the desired View implementation.
 * 
 * After initializing the components, it passes them to the Controller and starts the application.
 * 
 * @author Andoni Sanz, Ander Goirigolzarri Iturburu
 */
public class Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Controller cont = new Controller();
        ResourceBundle configFile = ResourceBundle.getBundle("application.Config");
        int model = Integer.parseInt(configFile.getString("MODEL"));
	int view = Integer.parseInt(configFile.getString("VIEW"));
        
        Model m = ModelFactory.getModel(model);
        View v = ViewFactory.getView(view);
        cont.run(m, v);
    } 
}
