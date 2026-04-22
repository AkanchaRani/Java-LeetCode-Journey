package Arrays.2965_FindMissingAndRepeatedValue;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int freq[]=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int repeated=-1,missing=-1;
        for(int i=1;i<=size;i++){
            if(freq[i]==2){
                repeated=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }

public class Main {
    public static void main(String[] args) {

        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        Solution obj = new Solution();
        int[] ans = obj.findMissingAndRepeatedValues(grid);

        System.out.println("Repeated: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}