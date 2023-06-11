package Decoratorr;

import Decorator.*;
import Decorator.Circle;
import Decorator.Shape;
import Decorator.Triangle;

public class Main {

    public static void main(String[] args) {
        // Aplpication we can used to draw different shapes
        // Circle,Triangle,Arrows,Rectangle
        // Shape.java as a parent class

        // Drawing Circle with border

        Shape circl=new Circle();
        ShapeDecorator circleWithBorder=new BorderDecorator(circl);
        //   circleWithBorder.draw();

        Shape circle=new Circle();
        ShapeDecorator redCircle=new ColorDecorator(circle,"red");
        // redCircle.draw();
        System.out.println("-------------------------------");










        // TRiangle with Border
        Shape triangle=new Triangle();
        ShapeDecorator trianglewithBorder = new BorderDecorator(triangle);

        Shape redTriangleWithBorder=new ColorDecorater(trianglewithBorder,"red");
        redTriangleWithBorder.draw();
        //  trianglewithBorder.draw();









        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        // Bordered red triangle
        Shape triangle2=new Triangle();
        Shape triangle2withBorder=new BorderDecorator(triangle2);
        Shape redTriangle2WithBorder=new ColorDecorater(triangle2withBorder,"red");
        redTriangle2WithBorder.draw();



        //Red circle - > FilledCircle.java
        //bordered circle - > BorderedCircle
        // Rectangle with border
        // rectangle with dotted border


        // In java IO
        // InputStream s we can see this pattern
    }
}
