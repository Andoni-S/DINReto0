/**
 * The DBModelImplementation class is an implementation of the Model interface.
 * It represents a model that interacts with a database to retrieve greeting information.
 * This class currently throws an UnsupportedOperationException for the 'getGreeting' method, indicating that it's not yet implemented.
 *
 * @authors Andoni, Ander
 */
package model;

public class DBModelImplementation implements Model {

    @Override
    public String getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }
}
