// 1502. Can Make Arithmetic Progression From Sequence
// ===================================================

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 1 || arr.length == 2) return true;
        Arrays.sort(arr);
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]-arr[i-1] != arr[i+1]-arr[i])return false;
        }
        return true;
    }
}