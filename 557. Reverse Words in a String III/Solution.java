// 557. Reverse Words in a String III
// ==================================

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length && arr[i] != ' '; i++){
            int j = i;
            while(j < arr.length && arr[j] != ' ')j++;
            reverse(arr,i,j-1);
            i = j;
        }
        return new String(arr);
    }
    private void reverse(char[] arr, int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}