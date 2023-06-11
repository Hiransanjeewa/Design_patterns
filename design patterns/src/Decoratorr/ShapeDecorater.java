package Decoratorr;

public abstract class ShapeDecorater implements Shape{
    private final Shape decoratedShape; // All the decorators should have a shape to decorate

    public ShapeDecorater(Shape shape){
      this.decoratedShape=shape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
