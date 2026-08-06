import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumTask implements Callable<Integer> {

    @Override
    public Integer call() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }
}

public class CallableFutureExample {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new SumTask());

        System.out.println("Calculating...");

        int result = future.get();

        System.out.println("Sum = " + result);

        executor.shutdown();
    }
}