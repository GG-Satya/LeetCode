// 2024. Maximize the Confusion of an Exam
// =======================================

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int res = 0, maxf = 0, count[] = new int[128];
        for (int i = 0; i < answerKey.length(); ++i) {
            maxf = Math.max(maxf, ++count[answerKey.charAt(i)]);
            if (res - maxf < k)
                res++;
            else
                count[answerKey.charAt(i - res)]--;
        }
        return res;
    }
}