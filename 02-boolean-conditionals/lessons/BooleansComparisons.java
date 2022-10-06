public class BooleansComparisons {
  public static void main(String[] args) {
    int mathGrade = 95;
    int biologyGrade = 70;
    System.out.println(biologyGrade > mathGrade);

    double sales = 35.99;
    double costs = 10.01;
    System.out.println(costs < sales);

    // equals and !equals are string comparison operators
    // don't use == or != when comparing strings
    String sentence = "I think I prefer Golang";
    String sentence2 = "I think I prefer Golang";
    System.out.println(sentence.equals(sentence2)); // true
    System.out.println(!sentence.equals(sentence2)); // false
  }
}
