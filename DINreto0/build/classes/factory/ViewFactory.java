/**
 * The ViewFactory class provides a method to create and retrieve instances of the View interface.
 * It contains a method named 'getView' that takes an integer parameter 'type' and returns an instance of the View interface
 * based on the specified type.
 *
 * This class is responsible for creating different implementations of the View interface.
 *
 * @author Andoni, Ander
 */
package factory;

import view.JavaFXViewImplementation;
import view.TextViewImplementation;
import view.View;

public class ViewFactory {

    /**
     * Retrieves an instance of the View interface based on the specified type.
     *
     * @param type An integer value representing the type of view to create.
     *             - 0 for TextViewImplementation.
     *             - 1 for JavaFXViewImplementation.
     * @return An instance of the View interface corresponding to the specified type,
     *         or null if an invalid type is provided.
     */
    public static View getView(int type) {
        switch (type) {
            case 0:
                return new TextViewImplementation();
            case 1:
                return new JavaFXViewImplementation();
            default:
                return null;
        }
    }
}
