public class Decimals {

  public static void main(String[] args) {
    double ex1 = 15.5;
    System.out.printf("%f\n", ex1); // out: 15,500000
    System.out.println(ex1); // out: 15.5

    int ex2 = 25;
    int ex3 = 2;
    double ex4 = ex2 / ex3;
    System.out.println(ex4); // out: 12.0

    double ex5 = 25;
    int ex6 = 2;
    double ex7 = ex5 / ex6;
    System.out.println(ex7); // out: 12.5

    int ex8 = 25;
    int ex9 = 2;
    int ex10 = ex8 / ex9;
    System.out.println(ex10); // out: 12
  }
}