/**
 * The FileModelImplementation class is an implementation of the Model interface.
 * It represents a model that retrieves a greeting message from a configuration file.
 * This class reads the greeting message from a resource bundle named "application.Config".
 *
 * @authors Andoni, Ander
 */
package model;


import java.util.ResourceBundle;

public class FileModelImplementation implements Model {

    @Override
    public String getGreeting() throws Exception{
        ResourceBundle configFile = ResourceBundle.getBundle("application.Config");
        return configFile.getString("GREETING");
    }
}
