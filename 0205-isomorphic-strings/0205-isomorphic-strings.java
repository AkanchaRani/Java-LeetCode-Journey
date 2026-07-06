import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            if(map1.containsKey(ch)){
                if(map1.get(ch)!=c){
                    return false;
                }
            }else{
                map1.put(ch,c);
            }
            if(map2.containsKey(c)){
                if(map2.get(c)!=ch){
                    return false;
                }
            }else{
                map2.put(c,ch);
            }
              
        }
        return true;
        
        
    }
}