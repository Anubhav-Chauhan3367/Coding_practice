class Solution {
    public boolean canJump(int[] nums) {
        
        
        int dest = nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i]>=dest){
                dest = i;
            }
        }
        if(dest == 0){
            return true;
        }
        return false;
    }
}