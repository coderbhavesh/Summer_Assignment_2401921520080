class Solution {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
    
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {

            if (nums[readPointer] != 0) {
           
                int temp = nums[readPointer];
                nums[readPointer] = nums[writePointer];
                nums[writePointer] = temp;
                
                writePointer++;
            }
        }
    }
}