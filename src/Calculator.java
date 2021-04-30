import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculator {

  static int add(String numbers) {

    if (numbers.isEmpty()) {
      return 0;
    }

    int[] nums = Stream.of(numbers.split("[,\\n]")).mapToInt(Integer::parseInt).toArray();

    if (nums.length == 1){
      return nums[0];
    } else {
      return IntStream.of(nums).sum();
    }

  }

}
