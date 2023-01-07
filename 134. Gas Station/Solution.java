// 134. Gas Station
// ================


//Approach - 01
//-------------

class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sum = 0, n = gas.length;

        int gasInTank = 0, start = 0;

        for(int i=0;i<n;i++) {

            gasInTank += gas[i]-cost[i];

            sum += gas[i]-cost[i];

            // if we are not able to reach next station from i, 
            if(gasInTank < 0) {
                start = i+1;
                gasInTank = 0;
            }
        }
        
        return sum >= 0 ? start : -1;
    }
}

// Approach-02
// -----------

class Solution02 {

    public int canCompleteCircuit02(int[] gas, int[] cost) {

        int sum = 0, n = gas.length;

        for(int i=0;i<n;i++) {

            sum += gas[i]-cost[i];
        }
        if(sum < 0) return -1;
		
        int gasInTank = 0, start = 0;
	  n = gas.length;

        for(int i=0;i<n;i++) {

            gasInTank += gas[i]-cost[i];

            // if we are not able to reach next station from i, 
            if(gasInTank < 0) {
                start = i+1;
                gasInTank = 0;
            }
        }
        
        return gasInTank >= 0 ? start : -1; // we can as well just return "start" as we know circular route is possible
    }
}