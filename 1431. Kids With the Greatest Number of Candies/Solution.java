// 1431. Kids With the Greatest Number of Candies
// ==============================================

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int candy : candies){
            list.add((candy + extraCandies) >= max);
        }
        return list;
    }
}