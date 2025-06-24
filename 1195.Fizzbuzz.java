import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int current = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 3 == 0 && current % 5 != 0)) {
                wait();
            }
            if (current > n) break;
            printFizz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 5 == 0 && current % 3 != 0)) {
                wait();
            }
            if (current > n) break;
            printBuzz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 3 == 0 && current % 5 == 0)) {
                wait();
            }
            if (current > n) break;
            printFizzBuzz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while (current <= n) {
            while (current <= n && (current % 3 == 0 || current % 5 == 0)) {
                wait();
            }
            if (current > n) break;
            printNumber.accept(current);
            current++;
            notifyAll();
        }
    }
}

// Local test class with main method
public class Main {
    public static void main(String[] args) {
        int limit = 15; // Change this value for testing different inputs
        FizzBuzz fizzBuzz = new FizzBuzz(limit);

        Thread threadA = new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.print("fizz,"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.print("buzz,"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.print("fizzbuzz,"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                fizzBuzz.number(number -> System.out.print(number + ","));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
            threadD.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(); // newline after output
    }
}