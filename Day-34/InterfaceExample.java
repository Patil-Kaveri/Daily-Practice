interface Vehicle {

    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}