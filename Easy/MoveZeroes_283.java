class Solution {
    public void moveZeroes(int[] nums) {
        
        int topPointer = 0;
		for(int bottomPointer = 0; bottomPointer <= nums.length - 1; bottomPointer++) {
			if(nums[bottomPointer] != 0) {
				int temp = nums[bottomPointer];
				nums[bottomPointer] = nums[topPointer];
				nums[topPointer] = temp;
				topPointer++;
			}
		}
    }
}
