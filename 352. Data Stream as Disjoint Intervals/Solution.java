// 352. Data Stream as Disjoint Intervals
// ======================================

public class SummaryRanges {

    private TreeMap<Integer, Integer> startToEndIntervals;

    public SummaryRanges() {
        startToEndIntervals = new TreeMap<>();
    }

    public void addNum(int value) {

        Map.Entry<Integer,Integer> closestBefore = startToEndIntervals.floorEntry(value);

        if(closestBefore != null && value >= closestBefore.getKey() && value <= closestBefore.getValue()){
            return;
        }

        Map.Entry<Integer,Integer> closestAfter = startToEndIntervals.ceilingEntry(value);

        int min = value;

        int max = value;

        //[closestBefore] value [closestAfter]

        if(closestBefore != null && closestBefore.getValue() + 1 == value){

            startToEndIntervals.remove(closestBefore.getKey());

            min = closestBefore.getKey();
        }

        if(closestAfter != null && closestAfter.getKey() - 1 == value){

            startToEndIntervals.remove(closestAfter.getKey());

            max = closestAfter.getValue();
        }

        startToEndIntervals.put(min,max);
    }

    public int[][] getIntervals() {

        int[][] intervals = new int[startToEndIntervals.size()][2];

        int i =0;

        for(Map.Entry<Integer,Integer> entry : startToEndIntervals.entrySet()){

            intervals[i++] = new int[]{entry.getKey(),entry.getValue()};
        }
        return intervals;
    }
}
