import java.util.Arrays;
import java.util.Comparator;

public class Test_Comparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.6);
        circles[2] = new Circle(3.5,"yellow", false);

        System.out.println("circle pre-sorted:");
        for (Circle circle: circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("circle after-sortd:");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        Square[] squares = new Square[4];
        squares[0] = new Square(15);
        squares[1] = new Square(2);
        squares[2] = new Square(50);
        squares[3] = new Square(25);

        System.out.println("square pre-sorted");
        for (Square square:squares){
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("square after-sorted:");
        for (Square square:squares) {
            System.out.println(square);
        }



        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(15,20);
        rectangles[1] = new Rectangle(9,8);
        rectangles[2] = new Rectangle(1,2);

        System.out.println("rectangle pre-sorted:");
        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("rectangle after-sorted: ");
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }
    }
}
