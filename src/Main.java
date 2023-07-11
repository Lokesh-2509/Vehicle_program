abstract class Vehicle{

    abstract  public void start();

    abstract public void stop();
}
class Car extends Vehicle{

    public void start(){
        System.out.println("Car Started");
    }

    public void stop(){
        System.out.println("Car Stopped");
    }
}
class Motorcycle extends Vehicle{

public void start(){
        System.out.println("MotorCycle Started");
        }

public void stop(){
        System.out.println("MotorCycle Stop");
        }
        }

public class Main {
    public static void main(String[] args){
        Motorcycle harley = new Motorcycle();
        harley.start();
        harley.stop();
        Car tata = new Car();
        tata.start();
        tata.stop();

    }
}