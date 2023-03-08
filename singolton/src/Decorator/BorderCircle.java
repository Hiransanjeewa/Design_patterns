package Decorator;

public class BorderCircle implements  Shape{
    @Override
    public void draw() {
        System.out.println("drawing circle");
        System.out.println("Add a border to the circle");
    }
}
