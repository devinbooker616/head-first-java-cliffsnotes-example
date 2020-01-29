package app;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.err.println(i);
            }

        }
        int randomNum = (int) (Math.random() * 5);
        System.out.println(randomNum);

        String[] list = { "Something ", "about ", "a ", "foreach ", "loop " };
        for (String words : list) {
            System.out.print(words);
        }

    }
}