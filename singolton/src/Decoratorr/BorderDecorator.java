package Decoratorr;

import Decorator.Shape;
import Decorator.ShapeDecorator;

public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape shape) {
        super(shape);
    }
    public void draw(){
        decoratedShape.draw();

        System.out.println("Setting the border");
    }
}
