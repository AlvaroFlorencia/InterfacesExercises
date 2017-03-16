
package interfacesexercises;


public class TapePlayer  implements Recorder{  //Implementa de recorder , asi mísmo recorder hereda de Player 
                                               //,por lo que Tapeplayer hereda de Player

    @Override
    public void record() {
        System.out.println("Tape player is  record");
    }

    @Override
    public void play() {
         System.out.println("Playing Tape player");
    }

    @Override                                  //Se muestra un mensaje ejemplificando esa acción
    public void stop() {
      System.out.println("Tape player is in stop");
    }

    @Override
    public void pause() {
        System.out.println("Tape player is paused");
    }

    @Override
    public void reverse() {
       System.out.println("Tape player is in  reverse");
    }
    
    
}
