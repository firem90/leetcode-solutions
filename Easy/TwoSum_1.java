class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i =0; i < nums.length; i++)
            myMap.put(nums[i],i);

        for(int i = 0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(myMap.containsKey(diff) && myMap.get(diff) != i)
                return new int[] {myMap.get(diff),i};
        }

        return nums;
    }
}
