class Solution {
    public String frequencySort(String s) {

        //storing all frequencies of char
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        			
	 // sorting the frequencies in descending order
	 List<Character> list = new ArrayList<Character>(map.keySet());
	 Collections.sort(list, (a,b) -> (map.get(b)-map.get(a)));
        

	 // buiding string accoring to the sorted frequency list
	 StringBuilder sb = new StringBuilder();
	 for(char c : list) {
		 for(int i=0; i<map.get(c); i++) {
			 sb.append(c);
		 }
	 }
	 return sb.toString();
    }
}