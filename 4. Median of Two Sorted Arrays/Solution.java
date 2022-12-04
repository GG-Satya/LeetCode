class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length+nums2.length];

        merge(nums1,nums2,arr);

        int mid = arr.length/2;

        	return arr.length%2==0? (double) (arr[mid]+arr[mid-1])/2: arr[mid];
        
    }
	// Merge sort logic 
    private void merge(int[] a, int[] b, int[] c){

        int i=0,j=0,k=0;

        while(i< a.length && j<b.length){

            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]= b[j++];
        }

        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
 }