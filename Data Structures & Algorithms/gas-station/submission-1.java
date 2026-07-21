class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;   // total gas - total cost
        int tank = 0;    // current tank
        int start = 0;   // candidate start index

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            total += diff;
            tank += diff;

            // cannot reach next station
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total >= 0 ? start : -1;
    }
}