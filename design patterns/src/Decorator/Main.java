package Decorator;

public class Main {
    public static void main(String[] args) {
       // Circle circle=new Circle();
       // circle.drwa();

      //  Rectangle rectangle=new Rectangle();
      //  rectangle.drwa();

        //SolidCircle solidCircle=new SolidCircle("Red");
       // solidCircle.drwa();

        // Create a circle with a border
       // Shape circle=new Circle();
      //  ShapeDecorator circlewithBorder=new BorderDecorator(circle);
      //  circlewithBorder.draw();

        //Let s create triangle with a border
       //  Shape triangle=new Triangle();
      //  ShapeDecorator trianglwWithBorder = new BorderDecorator(triangle);
      //  trianglwWithBorder.draw();

        //Red Circle
      //  Shape circle=new Circle();
       // ShapeDecorator RedCircle=new ColorDecorater(circle,"Red");
      //  RedCircle.draw();

        // Lets create a bordered rectangle
        Shape rectangle=new Rectangle();
        ShapeDecorator BorderedRectangle=new BorderDecorator(rectangle);


        ShapeDecorator RedRectangle=new ColorDecorater(BorderedRectangle,"Red");
        RedRectangle.draw();
    }

}

// A application which can be used to draw different shapes
//circles,rectangles,Triangles,arrows
// Shape.java(parent class)
// 1.Circle.java
// 2.Rectangle.java

// 3.Triangle.java

// Red cicle -> FilledRedcircle.java,SolidRedCircle.java
// Circle with border
// circle with dotted border
// Red Rectangle
// Rectangle with border
// Functionalities and colors (same functionalities) -> too many classes
// When adding new shape too many classes with functionalities to add

//EX - Buffered streams, Filestreamems