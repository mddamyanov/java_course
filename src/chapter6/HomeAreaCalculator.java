package chapter6;

/*
WRite a class that creates instances of the Rectangle class to find t he total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        //RECTANGLE 1
        //Create instance of Rectangle class
        Rectangle bedroom = new Rectangle();
        bedroom.setLength(3.50);
        bedroom.setWidth(2.50);

        double areaOfBedroom = bedroom.calculateArea();

        //RECTANGLE 2
        //Create instance of Rectangle class
        Rectangle kitchen = new Rectangle(6, 5);
        double areaOfKitchen = kitchen.calculateArea();

        double totalArea = areaOfBedroom + areaOfKitchen;
        System.out.println("Total area is: " + totalArea);
    }
}
