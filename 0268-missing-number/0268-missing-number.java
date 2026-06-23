import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
      int Xor=0;
         for(int i=0;i<=nums.length;i++){
            Xor^=i;
         }
         for(int i=0;i<nums.length;i++){
            Xor=Xor^nums[i];
         }
         return Xor;
      }
     

    }
