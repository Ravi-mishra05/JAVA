package Dailly_Questions_LC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CountNumberOfBadPairs2364 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(countBadPairs(arr));
    }
    // correct but time limit exceeded.
//    public static long countBadPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                if ((i < j) && ((j - i )!= (nums[j] - nums[i]))) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }

    public static int countBadPairs(int[] arr) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        return count;
    }
}
