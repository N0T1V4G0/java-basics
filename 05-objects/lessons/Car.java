import java.util.Arrays;

public class Car {

  private String make;
  private double price;
  private int year;
  private String color;
  private String[] parts;

  // CONSTRUCTOR -----------------------------
  public Car(
    String make,
    double price,
    int year,
    String color,
    String[] parts
  ) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = Arrays.copyOf(parts, parts.length);
  }

  // COPY CONSTRUCTOR -----------------------
  public Car(Car source) {
    this.make = source.make;
    this.price = source.price;
    this.year = source.year;
    this.color = source.color;
    this.parts = Arrays.copyOf(source.parts, source.parts.length);
  }

  // METHODS ---------------------
  public void drive() {
    System.out.printf(
      "You bought this %s for $%.0f. It was built in %d and it's %s.\n",
      this.make,
      this.price,
      this.year,
      this.color
    );

    System.out.printf("**Your car drives away**\n\n");
  }

  public String toString() {
    return String.format(
      "Make: %s\nPrice: %.0f\nYear: %d\nColor: %s\nParts: %s\n",
      this.make,
      this.price,
      this.year,
      this.color,
      Arrays.toString(this.parts)
    );
  }

  // GETTERS --------------------
  public String getMake() {
    return this.make;
  }

  public double getPrice() {
    return this.price;
  }

  public int getYear() {
    return this.year;
  }

  public String getColor() {
    return this.color;
  }

  public String[] getParts() {
    return Arrays.copyOf(this.parts, this.parts.length);
  }

  // SETTERS -------------------
  public void setMake(String make) {
    this.make = make;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setParts(String[] parts) {
    this.parts = Arrays.copyOf(parts, parts.length);
  }
}
