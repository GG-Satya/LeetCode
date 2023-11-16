// 1980. Find Unique Binary String
// ===============================

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = Arrays.stream(nums).collect(Collectors.toSet());
        StringBuilder sb = new StringBuilder(nums[0]);
        for(int i=0; i<nums.length; i++){
            char insert = (sb.charAt(i) == '0') ? '1' : '0';
            sb.setCharAt(i, insert);
            String test = sb.toString();
            if(!set.contains(test))return test;
        }
        return "";
    }
}