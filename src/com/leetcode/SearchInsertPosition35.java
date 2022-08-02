package com.leetcode;


//35. Search Insert Position
/* Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1
Input: nums = [1,3,5,6], target = 7
Output: 4

*
* */
public class SearchInsertPosition35 {


    public static void main(String[] args) {
        int[] nums  = {1,3,5,6};
        int target = 5;

        searchInsert(nums,target);
    }
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while(s<=e){

            int mid = s + (e-s) / 2;

            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }

        return s ;
    }
}
