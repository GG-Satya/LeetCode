// 1822. Sign of the Product of an Array
// =====================================

class Solution01 {
    public int arraySign(int[] nums) {
        int negCount =0 ;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0) return 0;
            if(nums[i] < 0) negCount++;
        }
        return (negCount % 2 == 0) ? 1 : -1;
    }
}

class Solution02 {
    public int arraySign(int[] nums) {
        int sign = 1 ;
        for(int i : nums){
            if(i == 0) return 0;
            if(i < 0) sign = -sign;
        }
        return sign;
    }
}