import java.util.Scanner;
public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Twelve Days of Christmas\n");
        System.out.println("Enter the number of days (1-12): ");
        int days = input.nextInt();
        if (days < 1 || days > 12) {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
            return;
        }
        System.out.println("The Twelve Days of Christmas\n");

        
    for(int day = 1; day <= 12; day++) {
        switch (day) {
            case 1:
                System.out.println("On the first day of Christmas my true love gave to me:");
                break;
            case 2:
                System.out.println("On the second day of Christmas my true love gave to me:");
                break;
            case 3:
                System.out.println("On the third day of Christmas my true love gave to me:");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas my true love gave to me:");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas my true love gave to me:");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas my true love gave to me:");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas my true love gave to me:");
                break;
            case 8:
                System.out.println("On the eighth day of Christmas my true love gave to me:");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas my true love gave to me:");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas my true love gave to me:");
                break;
            case 11:
                System.out.println("On the eleventh day of Christmas my true love gave to me:");
                break;
            case 12:
                System.out.println("On the twelfth day of Christmas my true love gave to me:");
                break;

    }
        for (int item = day; item >= 1; item--) {
            switch (item) {
                case 1:
                    System.out.println("A Partridge in a Pear Tree");
                    break;
                case 2:
                    System.out.println("Two Turtle Doves");
                    break;
                case 3:
                    System.out.println("Three French Hens");
                    break;
                case 4:
                    System.out.println("Four Calling Birds");
                    break;
                case 5:
                    System.out.println("Five Gold Rings");
                    break;
                case 6:
                    System.out.println("Six Geese a Laying");
                    break;
                case 7:
                    System.out.println("Seven Swans a Swimming");
                    break;
                case 8:
                    System.out.println("Eight Maids a Milking");
                    break;
                case 9:
                    System.out.println("Nine Ladies Dancing");
                    break;
                case 10:
                    System.out.println("Ten Lords a Leaping");
                    break;
                case 11:
                    System.out.println("Eleven Pipers Piping");
                    break;
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                    break;
            }
        
        System.out.println();
    }
    System.out.println("And a Partridge in a Pear Tree!");
    
}
System.out.println("Merry Christmas!");
    }
    
}