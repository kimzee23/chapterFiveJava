public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; 
        int years = 10; 

        System.out.printf("%-10s", "Year");
        
        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("%10s", rate + "%");
        }
        System.out.println();

      
        for (int year = 1; year <= years; year++) {
            System.out.printf("%-10d", year);

            for (int rate = 5; rate <= 10; rate++) {
                double amount = principal * Math.pow(1 + rate / 100.0, year);
                System.out.printf("%10.2f", amount);
            }

            System.out.println();
        }
    }
}
