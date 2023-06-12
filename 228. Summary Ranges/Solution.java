// 228. Summary Ranges
// ===================

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        for(int i = 0; i<nums.length; i++){
            int start = nums[i];
            while(i+1<nums.length && nums[i+1] == (nums[i]+1)) i++;
            if(start == nums[i]){
                list.add(start+"");
            }else{
                list.add(start+"->"+nums[i]);
            }   
        }
        return list;
    }
}