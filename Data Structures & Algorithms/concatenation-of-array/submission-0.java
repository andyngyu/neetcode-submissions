class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;

        int[] result = new int[length];

        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
        }

        for(int j = nums.length; j < length; j++){
            result[j] = result[j - nums.length];
        }
        return result;
    }
}