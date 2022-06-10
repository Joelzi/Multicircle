/*Write a class called Circle that contains instance data that represents the circle’s radius.
Define the Circle constructor to accept and initialize the radius, and include getter and setter methods
 for the radius. Include methods that calculate and return the circumference and area of the sphere.
 Include a toString method that returns a one-line description of the circle.
 Create a driver class called MultiCircle, whose
main method instantiates and updates several Circle objects. [Circumference = 2pr and Area = pr2].
 */

import java.util.*;

public class Circle {

    public static void main(String[] args) {
        double r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius");
        r = scan.nextDouble();


        class Circletest {


            private final double PI = 3.143;
            private double radius;
            Circle r = new Circle();


            public void setRadius(double r) {
                radius = r;
            }

            public double getRadius() {
                return radius;
            }

            public double getArea() {
                return PI * radius * radius;

            }
            public double area(){
                Object instance = new Circletest().getArea();
                return getArea();
            }
        }

        System.out.println(Circletest.getArea());
    }
}