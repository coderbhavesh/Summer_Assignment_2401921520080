import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        
        // Pick the first element
        for (int i = 0; i < nums.size(); i++) {
            // Check every element that comes AFTER it
            for (int j = i + 1; j < nums.size(); j++) {
                // If their sum is smaller than target, count it!
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        
        return count;
    }
}