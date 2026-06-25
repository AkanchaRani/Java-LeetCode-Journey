import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int length=0;
        boolean odd=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)%2==0){
                length+=map.get(c);
            }
            else{
                length+=map.get(c)-1;
                odd=true;
            }
            
            
           

        }
        if(odd){
                length++;
            }
        return length;
    }
}