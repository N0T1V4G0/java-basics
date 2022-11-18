public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 5000, 2019, "red");
    Car dodge = new Car("Dodge", 11500, 2022, "black");

    System.out.println(nissan.getColor());
    System.out.println(dodge.getYear());
  }
}