/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class Question014 {
    public static void main(String[] args) {
        String[] str = {"cair", "cairll" };
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String res = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if(!strs[i].startsWith(res)){
                res = res.substring(0,res.length()-1);
                i--;
            }

        }
            return res;
    }
}
