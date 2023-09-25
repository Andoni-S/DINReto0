/**
 * The Model interface defines the contract for classes representing a model that retrieves greeting messages.
 * Implementing classes should provide the implementation for the 'getGreeting' method, which retrieves the greeting message.
 *
 * @authors Andoni, Ander
 */
package model;

public interface Model {
    /**
     * Retrieves a greeting message.
     *
     * @return A greeting message.
     */
    public String getGreeting();
}
