class Solution {

    public boolean isCircularSentence(String str) {
        
        if(str.charAt(0) != str.charAt(str.length()-1))return false;
		 
	        String[] arr = str.split(" ");
	        
	        char prev = arr[0].charAt(0);
	        
	        for(String s: arr) {
	        	if(prev != s.charAt(0))return false;
	        	prev = s.charAt(s.length()-1);
	        	
	        }
	        return true;
    }
}