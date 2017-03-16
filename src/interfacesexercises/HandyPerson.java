
package interfacesexercises;


public class HandyPerson extends Human implements IPlumber,Electrician {

    public HandyPerson(String Name) {           //HandyPerson hereda de Human y se impimenta de dos interfaces,
        super(Name);                           //IPlumber y Electrician
    }
                                               //Constructor
    @Override
    public String uplugdrain() {
      return this.Name+"Unplugs a drain";   //Métodos correspondientes a las dos interfaces
    }

    @Override
    public String changeBulb() {
       return this.Name+ "Changes a bulb" ;
    }

    @Override
    public String toString() {
        return "HandyPerson{" + super.toString()+ '}';
    }
    
}
