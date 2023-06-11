package Decorator;

public class SolidCircle implements Shape{
    private String color;
    SolidCircle(String color){
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Add "+color+" color to a circle");
    }
}
