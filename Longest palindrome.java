class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int length=0;
        boolean odd = false;
        for(Character i:map.keySet()){
            int curr = map.get(i);
            if(curr%2 == 0){
                length+=curr;
            }
            else{
                odd = true;
                length+=curr - 1;
            }
        }
        if(odd){
            length+=1;
        }
        return length;
    }
}
