class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int m = nums1.length , n = nums2.length, mid = (m+n)/2;

        int[] arr = new int[m+n];

        while(i<m && j<n){
            if(nums1[i] < nums2[j])arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }

        while(i<m)arr[k++] = nums1[i++];
        while(j<n)arr[k++] = nums2[j++];

        return (arr.length & 1) == 0 ? (double)(arr[mid]+arr[mid-1])/2: arr[mid];
    }
}