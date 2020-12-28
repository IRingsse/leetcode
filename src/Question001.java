import java.util.HashMap;

public class Question001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//输入
        int target = 9;//输入
        int[] last = new int[2];//输出

        HashMap<Integer, Integer> hashMap = new HashMap<>();//创立一个HashMap当查询到
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) != null) {
                last[0] = hashMap.get(nums[i]);
                last[1] = i;
            }
            hashMap.put(target - nums[i], i);
        }
        for (int i = 0; i < last.length; i++) {
            System.out.println(last[i]);
        }


    }
}
