/**
 * The Controller class is responsible for coordinating the interaction between the Model and the View.
 * It contains a method named 'run' that takes instances of Model and View as parameters.
 *
 * @author andoni, ander
 * @version 1.0
 */
package controller;

import model.Model;
import view.View;

public class Controller {

    /**
     * Runs the application by obtaining a greeting message from the Model and displaying it through the View.
     *
     * @param model An instance of the Model interface providing the greeting message.
     * @param view  An instance of the View interface for displaying the greeting message.
     */
    public void run(Model model, View view) {
        try{
            String str = model.getGreeting();
            view.showGreeting(str);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al acceder al saludo");
        }
    }
}
