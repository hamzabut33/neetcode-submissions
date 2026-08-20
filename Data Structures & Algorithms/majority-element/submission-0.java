class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
            if (s.containsKey(nums[i]))
                s.put(nums[i], s.get(nums[i])+1);
            else 
                s.put(nums[i], 1);
        
        for (int num : s.keySet()){
            if (s.get(num) > nums.length/2 )
            return num;
        }
        
        return -1;
    }
}