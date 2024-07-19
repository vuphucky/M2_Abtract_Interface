import java.util.Arrays;

public class Test_comparable {
    public static void main(String[] args) {
          ComparableCircle[] circles = new ComparableCircle[3];
          circles[0] = new ComparableCircle(3.6);
          circles[1] = new ComparableCircle();
          circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("pre-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("after-sorted");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }


        ComparableSquare[] squares = new ComparableSquare[4];
        squares[0] = new ComparableSquare(49);
        squares[1] = new ComparableSquare(65);
        squares[2] = new ComparableSquare(84, "black", false);
        squares[3] = new ComparableSquare(4, "red", true);

        System.out.println("square pre-sorted:");
        for (ComparableSquare square:squares){
            System.out.println(square);
        }

        Arrays.sort(squares);

        System.out.println("square after-sorted:");
        for (ComparableSquare square:squares){
            System.out.println(square);
        }

        ComparableRectangle[] rectangles = new ComparableRectangle[5];
        rectangles[0] = new ComparableRectangle(4,22);
        rectangles[1] = new ComparableRectangle(6,15);
        rectangles[2] = new ComparableRectangle(8,9);
        rectangles[3] = new ComparableRectangle(18,5);
        rectangles[4] = new ComparableRectangle(20,9);

        System.out.println("rectanggle pre-sorted:");
        for (ComparableRectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles);

        System.out.println("rectangle after-sorted:");
        for (ComparableRectangle rectangle: rectangles){
            System.out.println(rectangle);
        }
    }
}
