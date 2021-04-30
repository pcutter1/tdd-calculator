public class Calculator {

  static int add(String numbers) {

    if (numbers.isEmpty()) {
      return 0;
    } else if (numbers.length() > 1) {
      String[] nums = numbers.split(",");
      int x = Integer.parseInt(nums[0]);
      int y = Integer.parseInt(nums[1]);
      return x+y;
  } else {
      return Integer.parseInt(numbers);
    }

  }

}
