import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCalculator {

  @Test
  public void testInputs() {
    String empty = "";
    String one = "5";
    String two = "1,2";
    String two2 = "21,99";

    int expectedEmpty = 0;
    int expectedOne = 5;
    int expectedTwo = 3;
    int expectedTwo2 = 120;

    int actualEmpty = Calculator.add(empty);
    int actualOne = Calculator.add(one);
    int actualTwo = Calculator.add(two);
    int actualTwo2 = Calculator.add(two2);

    assertEquals(expectedEmpty, actualEmpty, "Empty strings should return 0");
    assertEquals(expectedOne, actualOne, "Strings with one number, should return that number's value");
    assertEquals(expectedTwo, actualTwo, "Strings with two numbers should return the sum of the two numbers");
    assertEquals(expectedTwo2, actualTwo2, "Testing double digit numbers for two-number strings");

  }

}
