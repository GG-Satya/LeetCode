// 287. Find the Duplicate Number
// ==============================

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = slow;
        do{
            slow =  nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }return slow;
    }
}