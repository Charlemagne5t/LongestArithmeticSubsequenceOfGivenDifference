import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestSubsequenceTest1() {
        int[] arr = {1, 2, 3, 4};
        int difference = 1;
        int output = 4;
        Assert.assertEquals(output, new Solution().longestSubsequence(arr, difference));
    }

    @Test
    public void longestSubsequenceTest2() {
        int[] arr = {1, 3, 5, 7};
        int difference = 1;
        int output = 1;
        Assert.assertEquals(output, new Solution().longestSubsequence(arr, difference));
    }

    @Test
    public void longestSubsequenceTest3() {
        int[] arr = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        int difference = -2;
        int output = 4;
        Assert.assertEquals(output, new Solution().longestSubsequence(arr, difference));
    }

    @Test
    public void longestSubsequenceTest4() {
        int[] arr = {3, 4, -3, -2, -4};
        int difference = -5;
        int output = 2;
        Assert.assertEquals(output, new Solution().longestSubsequence(arr, difference));
    }
}
