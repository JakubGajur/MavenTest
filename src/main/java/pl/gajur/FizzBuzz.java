package pl.gajur;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int x = i % 5;
            int y = i % 3;
            if (x == 0 && y == 0) {
                System.out.println("FizzBuzz");
            } else if (x == 0 && y != 0) {
                System.out.println("Buzz");
            } else if (x != 0 && y == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}