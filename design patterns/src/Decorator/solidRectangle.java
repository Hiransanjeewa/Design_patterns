package Decorator;

public class solidRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
        System.out.println("Add colour to the rectangle");
    }
}
