//  OOp showing simple inheritance
//  (Main method will call class car as an abject) as Car car1 = new Car();

public class Car {

    String make = "Volkswagen";
    String model = "Golf Tsi";
    int year = 2024;
    String color = "Slick Black";
    Double price = 25000.00;

    void drive(){
        System.out.println("The car is driving");

    }
    void brake(){
        System.out.println("Use the brakes to stop the car");
    }

    void drift(){
        System.out.println("If you wish to make a drift, modify the car");
    }
}
