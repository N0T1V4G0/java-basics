import java.util.Random;

public class IfElse {
  public static void main(String[] args) {
    Random rand = new Random();
    int maxGrade = 101;
    // gen rand int up to 100
    int grade = rand.nextInt(maxGrade);

    if (grade >= 65) {
      System.out.println("You did only your job, kid.");
    } else {
      System.out.println("You worthless piece of shit!");
    }
  }
}
