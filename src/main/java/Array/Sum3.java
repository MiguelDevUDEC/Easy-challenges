package Array;

import java.util.*;

public class Sum3 {
    class Solution3 {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>> result = new HashSet<>();
            if(nums.length<3 || nums == null) return new ArrayList<>();
            for(int i = 0, j, k, sum; i<nums.length-2; i++){
                j=i+1;
                k= nums.length-1 ;
                while(j<k){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum==0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;}
                    else if(sum<0) j++;
                    else k--;
                }
            }
            return new ArrayList(result);
        }
    }
}
