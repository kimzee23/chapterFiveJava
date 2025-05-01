public class sumOfASeries {
        public static void main(String[] args) {
            System.out.printf("n", "Sum from 1 to n");
            System.out.println("----------------------------");
            long sum = 0;
    
            for (int n = 1; n <= 100; n++) {
                sum = 0;
                for (int item = 1; item <= n; item++) {
                    sum += item;
                }
                System.out.printf("%-5d%-20d%n", n, sum);
            }
        }
    }
    
    

