import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        runTestCase(
                new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4},
                6
        );

        runTestCase(
                new int[]{1},
                1
        );

        runTestCase(
                new int[]{5, 4, -1, 7, 8},
                23
        );
    }

    private static void runTestCase(int[] input, int expectedOutput) {

        final List<leetcode53> solutionOptions = Arrays.asList(
                new leetcode53()
        );

        solutionOptions.forEach(solution -> {
            final int actualOutput = solution.maxSubArray(input);

            System.out.println(
                    String.format(
                            "Input = %s, Expected output = %d, Actual output = %d",
                            Arrays.toString(input),
                            expectedOutput,
                            actualOutput
                    )
            );
        });
    }
}
