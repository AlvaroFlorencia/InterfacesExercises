
package interfacesexercises;


public class CDPlayer  implements  Player{//Implementación de métodos de la interfaz player

    @Override
    public void play() {
         System.out.println("Playing CD");
    }

    @Override                                  //Se muestra un mensaje ejemplificando esa acción
    public void stop() {
      System.out.println("CD is in stop");
    }

    @Override
    public void pause() {
        System.out.println("CD is paused");
    }

    @Override
    public void reverse() {
       System.out.println("CD is in  reverse");
    }
    
    
}
