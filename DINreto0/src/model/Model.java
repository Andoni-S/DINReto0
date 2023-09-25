/**
 * The Model interface defines the contract for classes representing a model that retrieves greeting messages.
 * Implementing classes should provide the implementation for the 'getGreeting' method, which retrieves the greeting message.
 *
 * @authors Andoni Sanz, Ander Goirigolzarri Iturburu
 */
package model;

public interface Model {
    /**
     * Retrieves a greeting message.
     *
     * @return A greeting message.
     * @throws java.lang.Exception
     */
    public String getGreeting()throws Exception;
}
