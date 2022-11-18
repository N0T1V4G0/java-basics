public class ReturnValues {
  public static void main(String[] args) {
    double area = calculateArea(2.3, 3.5);
    System.out.println(area);
  }

  public static double calculateArea(double length, double width) {
    return length * width;
  }
}
