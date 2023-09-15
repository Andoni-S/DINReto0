/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import model.DBModelImplementation;
import model.FileModelImplementation;
import model.Model;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    
    public static Model getModel(int type){
        switch(type){
            case 0:
                return new DBModelImplementation();
            case 1:
                return new FileModelImplementation();
            default:
                return null;
        }     
    }   
}
