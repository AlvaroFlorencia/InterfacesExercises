
package interfacesexercises;


public class Circle implements GeometricObject {  //Circle implementa de GeometricObject
    protected double radius=1.0;   //Atributo radius especificando que es igual a 1

    public Circle(double radius) {  //Construtor recibiendo como prámetro radios
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;  //Constructor sin recibir parámetro,por lo tanto igualando a 1 el radio
    }

    @Override
    public double getPerimeter() {  //Para sacar el perímetto dr multiplics radio*2*pi
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {   
      return radius*radius*Math.PI; //Para sacar el área radio*radio*pi
    }

    
    
    
}
