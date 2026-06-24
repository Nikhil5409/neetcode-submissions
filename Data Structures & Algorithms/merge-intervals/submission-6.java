class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=currEnd || currStart>=intervals[i][1] ){
                currStart = Math.min(currStart, intervals[i][0]);
                currEnd = Math.max(currEnd, intervals[i][1]);
            }else{
                ArrayList<Integer> currAl = new ArrayList<>();
                currAl.add(currStart);
                currAl.add(currEnd);
                al.add(currAl);
                currStart = intervals[i][0];
                currEnd = intervals[i][1];
            }
        }
        ArrayList<Integer> currAl = new ArrayList<>();
        currAl.add(currStart);
        currAl.add(currEnd);
        al.add(currAl);
        int[][] ans = new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i][0] = al.get(i).get(0);
            ans[i][1] = al.get(i).get(1);
        }
        return ans;
        
    }
}



/*
public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=currEnd || currStart>=intervals[i][1] ){
                currStart = Math.min(currStart, intervals[i][0]);
                currEnd = Math.max(currEnd, intervals[i][1]);
            }else if(intervals[i][0]>currEnd || currStart>intervals[i][1]){
                ArrayList<Integer> currAl = new ArrayList<>();
                currAl.add(currStart);
                currAl.add(currEnd);
                al.add(currAl);
                currStart = intervals[i][0];
                currEnd = intervals[i][1];
            }
        }
        ArrayList<Integer> currAl = new ArrayList<>();
        currAl.add(currStart);
        currAl.add(currEnd);
        al.add(currAl);
        int[][] ans = new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i][0] = al.get(i).get(0);
            ans[i][1] = al.get(i).get(1);
        }
        return ans;
        
    }
    */
