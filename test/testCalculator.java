import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCalculator {

  @Test
  public void testEmpty() {
    String empty = "";
    int expectedEmpty = 0;
    int actualEmpty = Calculator.add(empty);
    assertEquals(expectedEmpty, actualEmpty, "Empty strings should return 0");
  }

  @Test
      public void testOneNumber(){
    String one = "5";
    int expectedOne = 5;
    int actualOne = Calculator.add(one);

    assertEquals(expectedOne, actualOne, "Strings with one number, should return that number's value");
  }

  @Test
      public void testTwoNumbers() {
    String two = "1,2";
    int expectedTwo = 3;
    int actualTwo = Calculator.add(two);
    assertEquals(expectedTwo, actualTwo, "Strings with two numbers should return the sum of the two numbers");
  }

  @Test
      public void testTwoNumsDoubleDigits() {
    String two2 = "21,99";
    int expectedTwo2 = 120;
    int actualTwo2 = Calculator.add(two2);

    assertEquals(expectedTwo2, actualTwo2, "Testing double digit numbers for two-number strings");
  }


  @Test
  public void testUnknownAmountOfNumsInString() {

    String multipleNumbers = "1,4,76,23,4";
    int expected = 108;
    int actual = Calculator.add(multipleNumbers);

    assertEquals(expected, actual, "Testing add method for unknown number of numbers in String");
  }

  @Test
  public void testNewLinesOrCommas() {

    String multipleNumbers = "1,4\n76,23\n4";
    int expected = 108;
    int actual = Calculator.add(multipleNumbers);

    assertEquals(expected, actual, "Testing add method for newLines and commas in String");
  }

}
