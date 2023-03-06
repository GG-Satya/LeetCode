// 1539. Kth Missing Positive Number
// =================================

//method-01
-----------

class Solution {

    public int findKthPositive(int[] arr, int k) {

        for(int i : arr){

			if(i <= k) k++; else break;
		}
        return k;
    }
}

//method-02
-----------

class Solution {

    public int findKthPositive(int[] arr, int k) {

        int l = 0, r = arr.length, m;

        while (l < r) {

            m = (l + r) / 2;

            if (arr[m] - 1 - m < k)

                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }
}