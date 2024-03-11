// 791. Custom Sort String
// =======================

class Solution {
    public String customSortString(String order, String s) {
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Comparator<Character> comp = new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return order.indexOf(c1) - order.indexOf(c2);
            }
        };
        
        Arrays.sort(arr, comp);

        StringBuilder sb = new StringBuilder();
        for (Character ch : arr) {
            sb.append(ch);
        }
        return sb.toString();

    }
}