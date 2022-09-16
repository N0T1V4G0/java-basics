public class TypeCasting {
  public static void main(String[] args) {
    double decimal = 5.7;
    int integer = (int)decimal;
    System.out.println(integer); // out: 5

    double salary = 5833.33333;
    int roundedSalary = (int)salary;
    System.out.printf("Percy's salary is $%d", roundedSalary); // out: Percy's salary is $5833
  }
}
