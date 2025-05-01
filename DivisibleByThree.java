public class DivisibleByThree {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int num = 0;
        for(int item = 0; item <= 30; item++) {
            if (item % 3 == 0) {
                count++;
                sum += item;
            }
        }
        System.out.println("Count of numbers divisible by 3: " + count);
        System.out.println("Sum of numbers divisible by 3: " + sum);

    
}
}