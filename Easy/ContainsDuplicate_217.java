class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        HashSet<Integer> mySet = new HashSet();
        for(int i : nums) {
            if(mySet.contains(i)) {
                return true;
            }
            else {
                mySet.add(i);
            }
        }

        return false;
    }
}
