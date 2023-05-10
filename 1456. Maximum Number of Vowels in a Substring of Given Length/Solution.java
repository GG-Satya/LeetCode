// 1456. Maximum Number of Vowels in a Substring of Given Length
// =============================================================

class Solution {
    public int maxVowels(String s, int k) {
      Set<Character> vowels = Set.of('a','e','i','o','u');
		int count = 0;
		for(int i=0; i< k; i++) if(vowels.contains(s.charAt(i))) count++;
		int answer = count;
		
		for(int i = k; i< s.length(); i++) {
			if(vowels.contains(s.charAt(i))) ++count;
			if(vowels.contains(s.charAt(i-k))) --count;
			if(count > answer)answer = count;
		}
		return answer;
    }
}