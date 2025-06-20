/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

//program

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
            int sum = nums[i]+nums[j];
            if(sum==target){
                 ans[0]=i;
                 ans[1]=j;
                 break;
            }
         }
        }
         return ans;
    }
}
