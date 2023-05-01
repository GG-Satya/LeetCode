// 1491. Average Salary Excluding the Minimum and Maximum Salary
// =============================================================

import java.util.IntSummaryStatistics;

class Solution {

    public double average(int[] salary) {

        IntSummaryStatistics stat = Arrays.stream(salary).summaryStatistics();

        return (double) (stat.getSum()- stat.getMax()- stat.getMin()) / (stat.getCount() - 2);
    }
}