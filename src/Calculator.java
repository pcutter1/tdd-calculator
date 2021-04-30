import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculator {

  static int add(String numbers) throws IllegalArgumentException {

    if (numbers.isEmpty()) {
      return 0;
    }

    if (numbers.startsWith("//")){
      String delimeter = numbers.substring(2,3);
      numbers = numbers.replaceAll(delimeter, ",");
      numbers = numbers.substring(4);
    }

    int[] nums = Stream.of(numbers.split("[,\\n]")).mapToInt(Integer::parseInt).toArray();

    for (int i = 0; i < nums.length; i++) {
      ArrayList<Integer> negatives = new ArrayList<>();
      if (nums[i] < 0) {
        for (int k = i; k < nums.length; k++) {
          if (nums[k] < 0) {
            negatives.add(nums[k]);
          }
        }
        throw new IllegalArgumentException("negatives not allowed " + Arrays.toString(negatives.toArray()));
      }
    }

    if (nums.length == 1){
      return nums[0];
    } else {
      return IntStream.of(nums).sum();
    }

  }

}
