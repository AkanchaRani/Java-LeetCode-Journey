class Solution {
    public int maxProduct(int n) {
       
       // int temp=n;
        int max=-1;
        int a=-1;
        while(n!=0){
           int r=n%10;
           if(max<r){
            a=max;
            max=r;
           }
           else if(a<r){
              a=r;
           }
           n=n/10;
        }
        
        
        return max*a;
    }
}