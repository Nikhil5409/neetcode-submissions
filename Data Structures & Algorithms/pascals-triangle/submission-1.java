class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==0 || j==0 || i==j){
                    curr.add(1);
                    continue;
                }
                curr.add(pascal.get(i-1).get(j)+ pascal.get(i-1).get(j-1));
            }
            pascal.add(curr);
        }
        return pascal;
    }
}