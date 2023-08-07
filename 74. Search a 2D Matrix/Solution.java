// 74. Search a 2D Matrix
// ======================

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // len1 will define the main matrix length
        // len2 will define the internal array length
        int len1 = matrix.length, len2 = matrix[0].length;

        //if target is outside matrix range , return false
    	if(target < matrix[0][0] || target > matrix[len1-1][len2-1]){
            return false;
        }

        for(int i=0; i<len1; i++){
            // search for the number only if the taget is less than end element of current array
            if(target <= matrix[i][len2-1]){
                    //we can use in-buld method Arrays.binarySearch()
            		return binarySearch(matrix[i],target);
            }
        }

        return false;
    }

    // Implemented binary search manully
    private static boolean binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target) return true;
            else if(target < arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
}



// Clean code 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len1 = matrix.length, len2 = matrix[0].length;
    	if(target < matrix[0][0] || target > matrix[len1-1][len2-1]){
            return false;
        }
        for(int i=0; i<len1; i++){
            if(target <= matrix[i][len2-1]){
            	return Arrays.binarySearch(matrix[i],target);
            }
        }
        return false;
    }
}