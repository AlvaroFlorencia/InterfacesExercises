
package interfacesexercises;

public class NobodySpecial extends Human{  //NobodySpecial hereda de Human 

    public NobodySpecial(String Name) {  //Constructor
        super(Name);
    }

    @Override
    public String toString() {
        return "NobodySpecial{" + super.toString()+ '}';  //To string
    }
    
}
