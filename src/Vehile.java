
/*Create a base class 'Vehicle' with properties make, model, and method start().
Create a derived class 'Car' that adds property numberOfDoors and method display().
In main(), create an object of Car and demonstrate inheritance by calling methods from both classes.
*/

import java.util.Scanner;

public class Vehile {
    String make;
    String model;

    void start() {
        System.out.println("make: " + make + ",\nmodel: " + model);
    }
}

class Car extends Vehile {
    int numberOfDoors;

    void display() {
        System.out.println("numberOfDoors: " + numberOfDoors);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car cr= new Car();
        System.out.println("Enter makkers name");
        cr.make=sc.nextLine();
        System.out.println("Enter model name");
        cr.model=sc.nextLine();
        System.out.println("Enter numberOfDoors for car ");
        cr.numberOfDoors=sc.nextInt();

        cr.start();
        cr.display();
        }
}

