
package interfacesexercises;


public class MovableRectangle implements Movable { //Movable Rectangle implementa de movable
    private  MovablePoint topLeft;
    private  MovablePoint bottomRight; //Atributos

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed ,int ySpeed) { //Constructor
        this.topLeft= new MovablePoint(x1,y1,xSpeed,ySpeed); //Se crean dos nuevos puntos uno para el topLeft y otro para el bottomRight
        this.bottomRight= new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
       topLeft.moveUp();   //Para mover hacia arriba se utliza el método moveup para los dos movable point
       bottomRight.moveUp();
       
    }

    @Override
    public void moveDown() { //Para mover hacia abajo se utliza el método movedown para los dos movable point
        topLeft.moveDown(); 
       bottomRight.moveDown();
        
    }

    @Override
    public void moveLeft() {
       topLeft.moveLeft(); //Para mover hacia la izaquierda se utliza el método moveleft para los dos movable point
       bottomRight.moveLeft();
    }

    @Override
    public void moveRight() { //Para mover hacia la derecha se utliza el método moveright para los dos movable point
        topLeft.moveRight();
       bottomRight.moveRight();
       
    }
    
}
