
package interfacesexercises;

import java.util.LinkedList;
import java.util.List;


public class Studio {
    private List<Player> players;  //Se crea comom atributo un lista de players
    
    public Studio()
    {
        players= new LinkedList<>();    //Se inicaliza la la lista
    }
    public void addPlayer(Player player)
    {
        players.add(player);                //Se cre aun método con el cual se puede agregar un player 
                                             //recbibiendo  como párametro un objeto player
                                          
    }
}
