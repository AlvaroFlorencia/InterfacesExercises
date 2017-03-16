
package interfacesexercises;


public class Human {
    protected String Name; //Atributos

    public Human(String Name) {    //Constructor
        this.Name = Name;
    }

    @Override
    public String toString() {   //To string mostrando el nombre del humano
        return "Human{" + "Name=" + Name + '}';
    }
    
}
