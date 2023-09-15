/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import view.JavaFXViewImplementation;
import view.TextViewImplementation;
import view.View;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    public static View getView(int type){
        switch(type){
            case 0:
                return new TextViewImplementation();
            case 1:
                return new JavaFXViewImplementation();
            default:
                return null;
        }     
    }   
}
