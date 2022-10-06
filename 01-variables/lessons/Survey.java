import java.util.Locale;
import java.util.Scanner;

public class Survey {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    System.out.println("Thank you for taking part in this survey.");
    System.out.println("Please, state your name:");
    String name = scan.nextLine();
    System.out.println("Your name is " + name);
    System.out.println("How much money do you spend on coffee?");
    double coffePrice = scan.nextDouble();
    System.out.printf("You spend %.2f on coffee.\n", coffePrice);
    System.out.println("How much money do you spend on fast food?");
    double fastFoodPrice = scan.nextDouble();
    System.out.printf("You spend %.2f on fast food.\n", fastFoodPrice);
    scan.close();
  }
}
