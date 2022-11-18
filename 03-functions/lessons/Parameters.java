import java.util.Locale;

public class Parameters {
  public static void main(String[] args) {
    double area = measureRectangle(5, 10);
    System.out.printf(Locale.US, "The area of the rectangle is %.2f", area);
  }

  public static double measureRectangle(double length, double width) {
    return length * width;
  }
}
