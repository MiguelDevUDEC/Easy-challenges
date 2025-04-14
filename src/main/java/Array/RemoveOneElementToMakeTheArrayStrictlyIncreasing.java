package Array;

import java.util.Arrays;


class Solution2 {

    public boolean canBeIncreasing(int[] nums) {
        if(nums.length <= 2) return true;
        for(int i = 1, prev = nums[0], broke = 0; i < nums.length; i++){
            if(prev >= nums[i]){
                broke++;
                if(broke>=2) return false;
                if(i==1 || nums[i]>nums[i-2]) prev = nums[i];
            }else{
                prev = nums[i];
            }
        }
        return true;
    }

}
