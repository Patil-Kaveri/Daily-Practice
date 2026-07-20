public class MethodOverloading {

    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String name) {
        System.out.println("String: " + name);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.display();
        obj.display(100);
        obj.display("Kaveri");
    }
}