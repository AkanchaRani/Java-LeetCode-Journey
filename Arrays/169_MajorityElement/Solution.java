//Brute Force
class Solution {
    public int majorityElement(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            int freq=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
            }
            if(freq>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}

//Optimized approach
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq=1,ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq=1;
                ans=nums[i];
            }
            if(freq>nums.length/2){
                return ans;
            }
        }
        return -1;
    }
}
//Moore's VOting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int freq=0,ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(freq==0){
               ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}


