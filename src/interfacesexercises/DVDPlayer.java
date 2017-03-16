
package interfacesexercises;


public class DVDPlayer implements Player {     //Implementación de métodos de la interfaz player

    @Override
    public void play() {
         System.out.println("Playing DVD");
    }

    @Override                                  //Se muestra un mensaje ejemplificando esa acción
    public void stop() {
      System.out.println("DVD is in stop");
    }

    @Override
    public void pause() {
        System.out.println("DVD is paused");
    }

    @Override
    public void reverse() {
       System.out.println("DVD is in  reverse");
    }
    
    
    
}
