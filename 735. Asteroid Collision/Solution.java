// 735. Asteroid Collision
// =======================

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        int len = asteroids.length;
        for(int val : asteroids){
            if(val > 0){
                st.push(val);
            }else {
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -val)st.pop();
                if(!st.isEmpty() && st.peek() == -val){
                    st.pop();
                }else if(!st.isEmpty() && st.peek() > -val){
                    continue;
                }else{
                    st.push(val);
                }
            }
        }
        int[] ans = new int[st.size()];
        int index = st.size() - 1;
        while (index >= 0) {
            ans[index--] = st.pop();
        }

        return ans;
    }
}