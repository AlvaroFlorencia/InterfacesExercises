/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author alvar
 */
public class IndustrialPumbler extends Human  implements IPlumber {   
                                              //Industrial plumber herada de Human y se implementa de IPlumber
    public IndustrialPumbler(String Name) { //Constructor
        super(Name);                               
    }

    @Override
    public String uplugdrain() {
        return this.Name+"Unplugs a drain";
    }

    
}
