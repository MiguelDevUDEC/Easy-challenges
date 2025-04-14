package Array;

import java.util.*;

class Solution1 {
    public int maxSum(int[] nums) {
        HashSet<Integer> subNums = new HashSet<>();
        int sum = 0;
        int lowNumber = -101;

        for(int n : nums){
            if(n > 0 && !subNums.contains(n)){
                subNums.add(n);
                sum += n;
            }
            lowNumber = Math.max(n, lowNumber);

        }
        return sum != 0 ? sum : lowNumber;
    }
}

