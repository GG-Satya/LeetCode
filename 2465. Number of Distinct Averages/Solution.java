class Solution {

    public int distinctAverages(int[] nums) {
        
        Set<Integer> ans =  new HashSet<Integer>(); // taking set to ignore repeted value
        
        Arrays.sort(nums);  // sorting array to easily locate small and large elements
        
        for(int i=0 ; i<nums.length/2; i++){
            
            ans.add(nums[i]+nums[nums.length-i-1]);  //Instead of Avg. taking the sum and store it inside set, ( bcz no. of unique avgs. == no. of unique sums )
            
        }

        return ans.size();  //returning total values stored inside set
        
    }
}