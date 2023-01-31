class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer>map=new HashMap<>();
        int bulls = 0,cows = 0;

        int i=0;
        while(i<secret.length()){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1==ch2){
                bulls++;
            }
            else{
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                }
                else{
                    map.put(ch1,1);
                }
            }
            i++;
        }

        i=0;
        while(i<guess.length()){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1!=ch2){
                if(map.containsKey(ch2)){
                    cows++;
                    if(map.get(ch2)==1){
                        map.remove(ch2);
                    }
                    else{
                        map.put(ch2,map.get(ch2)-1);
                    }
                }
            }
            i++;
        }

        return bulls+"A"+cows+"B";
    }
}
