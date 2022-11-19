public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 5000, 2020, "red");

    Car dodge = new Car("Dodge", 11000, 2022, "black");

    System.out.printf("This %s is worth $%.0f. It was built in %d and it's %s.\n", nissan.getMake(), nissan.getPrice(), nissan.getYear(), nissan.getColor());
    System.out.printf("This %s is worth $%.0f. It was built in %d and it's %s.\n", dodge.getMake(), dodge.getPrice(), dodge.getYear(), dodge.getColor());
  }
}