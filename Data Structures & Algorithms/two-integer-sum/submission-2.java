class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        HashMap<Integer, Integer> numbers = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numbers.containsKey(complement)) {
                array[0] = numbers.get(complement);
                array[1] = i;
                return array;
            } else {
                numbers.put(nums[i], i);
            }
        }
        return array;
    }
}
