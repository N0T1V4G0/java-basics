public class Main {

  public static void main(String[] args) {
    String[] parts = { "Wheels", "Windows" };
    Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
    Car dodge = new Car("Dodge", 11000, 2022, "black", parts);
    Car dodge2 = new Car(dodge);

    dodge.drive();
    nissan.drive();
    dodge2.drive();

    dodge2.setParts(new String[] { "Keys", "Pot" });

    System.out.println(dodge);
    System.out.println(dodge2);
    System.out.println(nissan);
  }
}
