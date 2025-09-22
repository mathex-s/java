import java.util.Scanner;

public class aa5 {

    public abstract static class Shape {
        public abstract void printArea();
    }

    public static class Rectangle extends Shape {
        private double l, w;
        public Rectangle(double l, double w) { this.l = l; this.w = w; }
        @Override
        public void printArea() { System.out.printf("Area: %.2f\n", l * w); }
    }

    public static class Triangle extends Shape {
        private double b, h;
        public Triangle(double b, double h) { this.b = b; this.h = h; }
        @Override
        public void printArea() { System.out.printf("Area: %.2f\n", 0.5 * b * h); }
    }

    public static class Circle extends Shape {
        private double r;
        public Circle(double r) { this.r = r; }
        @Override
        public void printArea() { System.out.printf("Area: %.2f\n", Math.PI * r * r); }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Area Calculator ---");
            System.out.println("1. Rectangle\n2. Triangle\n3. Circle\n4. Exit");
            System.out.print("Enter choice: ");
            try {
                choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("L & W: ");
                        new Rectangle(s.nextDouble(), s.nextDouble()).printArea();
                        break;
                    case 2:
                        System.out.print("B & H: ");
                        new Triangle(s.nextDouble(), s.nextDouble()).printArea();
                        break;
                    case 3:
                        System.out.print("Radius: ");
                        new Circle(s.nextDouble()).printArea();
                        break;
                    case 4:
                        System.out.println("exit"); 
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                s.next();
                choice = 0;
            }
        } while (choice != 4);
        s.close();
    }
}
