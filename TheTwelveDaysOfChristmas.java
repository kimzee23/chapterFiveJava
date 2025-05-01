public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        System.out.println("The Twelve Days of Christmas\n");
        System.out.println("On the first day of Christmas my true love gave to me:");
        System.out.println("A Partridge in a Pear Tree\n");
        
    for(int day = 1; day <= 12; day++) {
        System.out.println("On the " + day + " day of Christmas my true love gave to me:");

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
        }
        System.out.println();
    }
    System.out.println("And a Partridge in a Pear Tree!");
    
}
}