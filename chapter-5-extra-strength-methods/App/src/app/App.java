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

        // This is casting
        long y = 42;
        int x = (int) y;
        System.out.println(x);

        long z = 40002;
        short i = (short) z;
        System.out.println(i);

        float f = 3.14f;
        int h = (int) f;
        // This is the end of the casting
        System.out.println(h);
        String[] list = { "Something ", "about ", "a ", "foreach ", "loop " };
        for (String words : list) {
            System.out.print(words);
        }

    }
}