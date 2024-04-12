// 42. Trapping Rain Water
// =======================

//Brute force
    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            int maxLeft = height[i];
            int maxRight = height[i];
            for(int j=i-1; j>=0; j--){
                if(height[j] > maxLeft) {
                    maxLeft = height[j];
                }
            }
            for(int k=i+1; k<n; k++){
                if(height[k] > maxRight){
                    maxRight = height[k];
                }
            }
            System.out.println(height[i]+" --> "+maxLeft+"--"+maxRight);
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;
    }

	
//Better
   public static int trap2(int[] height) {
        int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        int max = height[0];
        for(int i =0; i<n; i++) {
        	max = Math.max(max,height[i]);
        	prefixMax[i] = max;
        }
        max = height[n-1];
        for(int i=n-1; i>=0; i--) {
        	max = Math.max(max,height[i]);
        	suffixMax[i] = max;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            int maxLeft = prefixMax[i];
            int maxRight = suffixMax[i];
           
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;
    }