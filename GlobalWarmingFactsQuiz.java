import java.util.Scanner;
public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sorce = 0;
        System.out.println("Welcome to the Global Warming Facts Quiz!");
        System.out.println("=".repeat(40));
        System.out.println("""
          1. What is the main cause of recent global warming, according to the Intergovernmental Panel on Climate Change (IPCC)?

            a)Increased solar activity

            b)Natural long-term climate cycles

            c)Human activities such as burning fossil fuels

            d)Ocean currents shifting over time

                
                """);
        System.out.println("Enter you answer (a, b, c, d): ");
        String answerOne = input.nextLine();

                switch (answerOne) {
                    case "a" :
                    case "b":
                    case "d":
                        break;
                    case "c":
                    sorce++;
                    break;
                    default:
                    System.out.println("Invalid answer. Please enter a, b, c, or d.");

                }
                System.out.println("=".repeat(40));
        System.out.println("""
            2. What is the main greenhouse gas responsible for global warming?

            a)Ozone

            b)Carbon dioxide (CO2)

            c)Methane (CH4)

            d)Nitrous oxide (N2O)

                
                """);
        System.out.println("Enter you answer (a, b, c, d): ");
        String answerTwo = input.nextLine();

                switch (answerTwo) {
                    case "a" :
                    case "d":
                    case "b":
                        break;
                    case "c":
                    sorce++;
                    break;
                    default:
                    System.out.println("Invalid answer. Please enter a, b, c, or d.");

                }
                System.out.println("=".repeat(40));
        System.out.println("""
            3. What is one argument made by some global warming skeptics?

                a)Climate models have accurately predicted every weather event

                b)Rising temperatures are entirely caused by the ozone layer

                c)Climate change is a myth with no supporting data

                D)The climate has always changed naturally, so recent changes are not necessarily man-made
                """
                        
        );
        System.out.println("Enter you answer (a, b, c, d): ");
        String answerThree = input.nextLine();

                switch (answerThree) {
                    case "a" :
                    case "b":
                    case "c":
                        break;
                    case "d":
                    sorce++;
                    break;
                    default:
                    System.out.println("Invalid answer. Please enter a, b, c, or d.");

                }
                System.out.println("=".repeat(40));
                System.out.println("""
                   4. Which of the following is a potential effect of global warming supported by scientific studies?
                
                    a) Global cooling
                    b) Melting ice caps and rising sea levels
                    c) Immediate extinction of all species
                    d) Reduction in the Earth's gravity
                """);
        System.out.println("Enter you answer (a, b, c, d): ");
        String answerFour = input.nextLine();

                switch (answerFour) {
                    case "a" :
                    case "c":
                    case "d":
                        break;
                    case "b":
                    sorce++;
                    break;
                    default:
                    System.out.println("Invalid answer. Please enter a, b, c, or d.");

                }
                System.out.println("=".repeat(40));
                System.out.println("""
                  1.  What was the goal of the film “An Inconvenient Truth”?

                a) To argue that global warming is a hoax
                b) To promote space colonization
                c) To raise awareness about human-caused climate change
                d) To advertise renewable energy companies
        """);
        
        System.out.println("Enter you answer (a, b, c, d): ");
        String answerFive = input.nextLine();

                switch (answerFive) {
                    case "a" :
                    case "b":
                    case "d":
                        break;
                    case "c":
                    sorce++;
                    break;
                    default:
                    System.out.println("Invalid answer. Please enter a, b, c, or d.");

                }
     System.out.println("Your score is: " + sorce + " out of 5.");
        if (sorce == 5) {
                System.out.println("Excellent! You are well-informed about global warming.");
            } else if (sorce >= 3) {
                System.out.println("Good job! You have a decent understanding of global warming.");
            } else {
                System.out.println("Time to brush up on your knowledge of global warming");
                System.out.println("=".repeat(40));
                System.out.println("""
                    You can vistit the following link for more information:
                    https://www.nationalgeographic.com/environment/article/global-warming-overview
                    https://en.wikipedia.org/wiki/Climate_change
                    """);
            }
           
                

          
    }
    
}
