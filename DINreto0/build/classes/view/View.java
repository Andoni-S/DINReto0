/**
 * The View interface defines the contract for classes representing a user interface that displays greeting messages.
 *
 * Shows a greeting inside a user interface.
 *
 * @authors Andoni, Ander
 */
package view;

public interface View {
    /**
     * Displays a greeting message inside the user interface.
     *
     * @param greeting The greeting message to display.
     */
    void showGreeting(String greeting);
}
