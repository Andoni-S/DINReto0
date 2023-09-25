/**
 * This is the ModelFactory class, which provides a method to create and retrieve instances of the Model interface.
 * It contains a method named getModel that takes an integer parameter 'type' and returns an instance of the Model interface
 * based on the specified type.
 *
 * @author Andoni, Ander
 */
package factory;

import model.DBModelImplementation;
import model.FileModelImplementation;
import model.Model;

public class ModelFactory {

    /**
     * Retrieves an instance of the Model interface based on the specified type.
     *
     * @param type An integer value representing the type of model to create.
     *             - 0 for FileModelImplementation.
     *             - 1 for DBModelImplementation.
     * @return An instance of the Model interface corresponding to the specified type,
     *         or null if an invalid type is provided.
     */
    public static Model getModel(int type) {
        switch (type) {
            case 0:
                return new FileModelImplementation();
            case 1:
                return new DBModelImplementation();
            default:
                return null;
        }
    }
}
