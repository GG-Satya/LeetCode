class Solution {

    public int findGCD(int[] nums) {

        int big = nums[0];

        int small = nums[0];
       
        for(int i=0; i<nums.length; i++) {

           	if(nums[i]<small) {
                				small = nums[i]; // extracting small elements
                			}
		else{
               	 if(nums[i]>big) {big = nums[i];}  // extracting big elements
                }
        } 

        return gcd(small, big);
    }

	// Euclidian algo to compute GCD fastest 
    private int gcd(int a, int b){
        
        if(a==0)return b; // base condition to stop recurrsion

        return gcd(b%a , a);  //recurrsive call 
    }
}