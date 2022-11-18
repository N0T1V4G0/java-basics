import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    String[] staffLastYear = {"Bob", "Johannes", "Barbara"};
    // Arrays.copyOf(arrToCopy, howManyElemts)
    String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
    staffThisYear[0] = "Lucas";

    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(staffThisYear));
  }
}
