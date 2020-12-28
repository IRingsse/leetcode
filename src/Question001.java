/**
 * 问题1
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 **/


import java.util.HashMap;

public class Question001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//输入数组
        int target = 9;//输入目标
        int[] last = new int[2];//输出数组

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //本算法利用查询key值是否已经存在的方法找出相加等于target，
        // key存的是target-当前值，value是当前的位置，在以后每次查询当前值时如果存在则证明当前值+old key = target
        //get返回值到old key的位置，i为当前值位置
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) != null) {
                last[0] = hashMap.get(nums[i]);
                last[1] = i;
            }
            hashMap.put(target - nums[i], i);
        }

        //打印last数组
        for (int i = 0; i < last.length; i++) {
            System.out.println(last[i]);
        }
    }
}
