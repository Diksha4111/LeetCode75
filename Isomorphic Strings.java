class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || s.length()<=1) return true;
        HashMap<Character,Character> m = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if(!m.containsKey(x)){
                if(!m.containsValue(y)){
                    m.put(x,y);
                }
                else{
                    return false;
                }
            }
            else{
                if(m.get(x).equals(y)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
