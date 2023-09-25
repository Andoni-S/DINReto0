/**
 * The TextViewImplementation class is an implementation of the View interface.
 * It represents a text-based view for displaying a greeting message.
 * This class prints the greeting message to the standard output using System.out.println.
 *
 * The author of this class is 2dam.
 */
package view;

public class TextViewImplementation implements View {

    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
