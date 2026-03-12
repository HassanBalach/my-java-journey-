public class Vehicle {
    int Speed;
    void displayCarProperties(){
        System.out.println("Speed : " + Speed);
    }
}

class Car extends Vehicle{
    int doorQantity ;
    String carColor;
    int carEngine;
    void displayCar(){
        displayCarProperties();
        System.out.println("carColor: "+ carColor);
        System.out.println("carDoorQantity: " + doorQantity);
        System.out.println("CarEngineSize: " +carEngine);
    }
}

// - MultiLevel Inheritance example ElectricCar, Car , Vehicle :
class ElectricCar extends Car{
    void electricCarDetail(){
            displayCar();
    }
}

// - Hierarchical Inheritance example :


class  bike extends Vehicle{

}

class Truck extends Vehicle{


}
