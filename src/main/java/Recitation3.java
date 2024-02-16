import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv) {
        Scanner vergil = new Scanner(System.in);

        int x = vergil.nextInt();
        int y = vergil.nextInt();

        Circle circle16 = new Circle(new Point(x, y), 16);

        Circle circle40 = new Circle(new Point(14, 12), 40);

        if (circle16.intersects(circle40)) {
            System.out.println("Circles intersect!");

        } else {
            System.out.println("Circles do not intersect!");
        }


    }
}