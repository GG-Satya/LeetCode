// 2785. Sort Vowels in a String
// =============================

class Solution {
    public String sortVowels(String s) {
        String vow = "AEIOUaeiou";
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
        	if(vow.contains(arr[i]+"")){
        		vowels.add(arr[i]);
        		index.add(i);
        	}
        }Collections.sort(vowels);
        int j = 0;
        for(int i : index) arr[i] = vowels.get(j++);
        return new String(arr);
    }
}