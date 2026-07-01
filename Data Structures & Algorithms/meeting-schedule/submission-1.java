/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));
        boolean possible = true;
        int currStart = 0;
        int currEnd = 0;
        for(int i=0;i<intervals.size();i++){
            Interval currInterval = intervals.get(i);
            int start = currInterval.start;
            int end = currInterval.end;
            if(start<currEnd){
                possible = false;
                return possible;
            }
            currStart = start;
            currEnd = end;
        }
        return possible;
    }
}
