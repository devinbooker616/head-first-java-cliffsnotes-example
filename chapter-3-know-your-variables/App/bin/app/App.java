package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int x = 1;
        float y = 1;
        double z = 1.00;
        String string = "string";
        boolean truthy = true;
        System.out.println("" + x + " " + y + " " + z + " " + string + " " + truthy);
        int[] nums;
        nums = new int[7];
        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;
        for (int i : nums) {
            System.out.println(i);
        }

    }
}