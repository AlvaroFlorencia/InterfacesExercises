
package interfacesexercises;


public class MovablePoint implements Movable{ //MovablePoint implementa de Movable
    int x;
    int y;
    int xSpeed;
    int ySpeed;  //Atributos

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) { //Constructor
        this.x = x; 
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() { //To string
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    @Override
    public void moveUp() {   //Para mover el punto  hacia arriba se toma el valor de y  se le suma el ySpeed 
        
      
        
            y=y+ySpeed;    
        
       
    }

    @Override
    public void moveDown() {
                 //Para mover el punto  hacia abajo se toma el valor de y ,y  se le resta el ySpeed 
            
    
        
            y=y-ySpeed;
         
    }

    @Override
    public void moveLeft() {
       
          //Para mover el punto  hacia la izquierda se toma el valor de x,y  se le resta el xSpeed 
       
            x=x-xSpeed;
        
        
    }

    @Override
    public void moveRight() {
        //Para mover el punto  hacia la derecha se toma el valor de x,y  se le suma el xSpeed  
        
            x=x+xSpeed;
         
       
    }
    
   
}
