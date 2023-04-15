class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] conver = new long[nums.length];
        long max = nums[0];

        //creating conver array
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            conver[i] = nums[i] + max;
        }

        //creating conver score array
        for(int i=1 ; i<conver.length ; i++){
            conver[i] = conver[i] + conver[i-1];
        }
        
        return conver;
    }

    
}
