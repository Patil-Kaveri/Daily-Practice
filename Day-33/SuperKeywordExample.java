class Animal {

    String color = "White";
}

class Dog extends Animal {

    String color = "Black";

    void printColor() {
        System.out.println("Dog Color: " + color);
        System.out.println("Animal Color: " + super.color);
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.printColor();
    }
}