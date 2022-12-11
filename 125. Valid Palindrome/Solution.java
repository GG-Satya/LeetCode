// Method -1 :

class Solution {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        String rev = new StringBuffer(s).reverse().toString();

        return rev.equals(s);
        
    }
}

// Method - 2

class Solution {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int i=0, j=s.length()-1;

        while(i<j) {

            if(s.charAt(i++) != s.charAt(j--))return false;
        }

        return true;
        
    }
}