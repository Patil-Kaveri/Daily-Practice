interface Message {
    void display();
}

public class LambdaExpressionExample {

    public static void main(String[] args) {

        Message msg = () -> {
            System.out.println("Hello from Lambda Expression!");
        };

        msg.display();
    }
}