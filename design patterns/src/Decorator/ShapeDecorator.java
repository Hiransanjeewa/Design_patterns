package Decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;  // All the decoraters must have shape
    public ShapeDecorator(Shape shape){
        this.decoratedShape=shape;
    }
    public void draw() {
        decoratedShape.draw();
    }
}
