package Decorator;

public class ColorDecorater extends ShapeDecorator{
    private String color;

    public ColorDecorater(Shape shape,String color) {
        super(shape);
        this.color=color;
    }
    public void draw(){
        decoratedShape.draw();
        System.out.println("Filling the shape with the color"+ color);
    }
}
