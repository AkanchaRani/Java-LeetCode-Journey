import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int length=0;
        boolean odd=false;
        for(char ch:map.keySet()){
           
            if(map.get(ch)%2==0){
                length+=map.get(ch);
            }
            else{
                length=length+map.get(ch)-1;
                odd=true;
            }
            
        }
        if(odd){
            length=length+1;
        }
        return length;
    }
}