package Decoratorr;

import Decorator.Shape;
import Decorator.ShapeDecorator;
// To fill shape with color
public class ColorDecorator extends ShapeDecorator {
    private String color;
    public ColorDecorator(Shape shape,String color) {
        super(shape);
        this.color=color;
    }
    public void draw(){
        decoratedShape.draw();
        System.out.println("Filling the shape with the color -> "+ color );
    }

}
