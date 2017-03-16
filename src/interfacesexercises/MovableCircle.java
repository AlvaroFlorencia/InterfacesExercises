
package interfacesexercises;


public class MovableCircle  implements Movable{ //MovableCircle implementa de Movable

    private int radius;
    private MovablePoint center;  //Atributos

    public MovableCircle(int radius,int x, int y, int xSpeed, int ySpeed) {  //Constructor 
        this.radius = radius;                                 
        this.center = new MovablePoint(x,y,xSpeed,ySpeed); //Se crea con los párametros un nuevo movable point
    }

    @Override
    public String toString() {  //To string
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveUp() { //Para mover el circulo hacia arriba se toma el valor del centro de y  se le suma el ySpeed 
        this.center.y+=this.center.ySpeed;
    }

    @Override
    public void moveDown() { //Para mover el circulo hacia abajo se toma el valor del centro de y  se le resta el ySpeed 
          this.center.y-=this.center.ySpeed;
    }

    @Override
    public void moveLeft() { //Para mover el circulo hacia la izquierda se toma el valor del centro de x, y se le resta el xSpeed 
        this.center.x-=this.center.xSpeed;
       
    }

    @Override
    public void moveRight() { //Para mover el circulo hacia la derecha se toma el valor del centro de x, y se le suma el xSpeed 
         this.center.x+=this.center.xSpeed;
    }
    
}
