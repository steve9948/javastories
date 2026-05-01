//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.make);

        car1.drive();

        car1.brake();

        car1.drift();

        //Whether we call Ca1 or Car2 the output still remains the same ie

        Car car2 = new Car();

        System.out.println();
        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.make);

        car1.drive();

        car1.brake();

        car1.drift();

    }
}