public class MathOperations {
  public static void main(String[] args) {
    int bagOfSweets1 = 30;
    int bagOfSweets2 = 20;
    System.out.printf("Fred and George collected %d sweets\n", bagOfSweets1 + bagOfSweets2);
    System.out.printf("Fred has %d more sweets than George\n", bagOfSweets1 - bagOfSweets2);
    System.out.printf("Fred and George used a special spell to multiply their sweets to: %d\n", bagOfSweets1 * bagOfSweets2);
    System.out.printf("Originally, Fred had %d times more sweets than George\n", bagOfSweets1 / bagOfSweets2);
    // Fred and George collected 50 sweets
    // Fred has 10 more sweets than George
    // Fred and George used a special spell to multiply their sweets to: 600
    // Originally, Fred had 1 times more sweets than George

    long starsInMilkyWay = 200000000000L;
    long starsInAndromeda = 1000000000000L;
    System.out.printf("There are %d stars in the Milky Way and Andromeda galaxies.\n", starsInMilkyWay + starsInAndromeda);
    System.out.printf("The Andromeda Galaxy has %d more stars than the Milky Way\n", starsInAndromeda - starsInMilkyWay);
    System.out.printf("Andromeda has %d times more stars than Milky Way\n", starsInAndromeda / starsInMilkyWay);
    // There are 1200000000000 stars in the Milky Way and Andromeda galaxies.
    // The Andromeda Galaxy has 800000000000 more stars than the Milky Way
    // Andromeda has 5 times more stars than Milky Way
    
    double testScore = 6.7;
    double bonusMarks = 2.5;
    System.out.printf("With bonus marks, Ron scored %.1f/10 on his potions test. Snape wasn't too thrilled\n", testScore + bonusMarks);
    System.out.printf("Snape ended up removing marks. Ron actually scored %.1f on his potions test\n", testScore - bonusMarks);
    System.out.printf("Snape made an error on his excel, accidentally multiplying Ron's score to: %.2f/10\n", testScore * bonusMarks);
    System.out.printf("Snape caught the error. Furious, he divided Ron's score to: %.2f/10\n", testScore / bonusMarks);
    // With bonus marks, Ron scored 9,2/10 on his potions test. Snape wasn't too thrilled
    // Snape ended up removing marks. Ron actually scored 4,2 on his potions test
    // Snape made an error on his excel, accidentally multiplying Ron's score to: 16,75/10
    // Snape caught the error. Furious, he divided Ron's score to: 2,68/10
  }
}