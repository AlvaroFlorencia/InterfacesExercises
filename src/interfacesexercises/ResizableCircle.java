
package interfacesexercises;


public class ResizableCircle extends Circle implements Resizable{ 
                                         //ResizableCircle hereda de circulo y se implementa de Resizable
    public ResizableCircle(double radius) {  //Constructor recibiendo como párametro radio
        super(radius);
    }

    public ResizableCircle() {       ////Constructor sin recibir párametro 
        super();
    }

    @Override
    public void resize(int percentage) {       //Para redimensionar se recibe como pámetro porcentaje
        radius*=((100 + percentage)/100);     //Dentro de radio se se multiplica y guarda en si mismo el radio 
                                              // el radio se multiplica el porcentaje más 100,entre 100
        
    }
  
    
    
    
}
