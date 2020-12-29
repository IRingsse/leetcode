
public class Question011 {
    public static void main(String[] args) {
        int[] height = {4, 4, 2, 11, 0, 11, 5, 11, 13, 8};
        int maxa = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right) {
            maxa = Math.max(maxa, Math.min(height[left], height[right]) * (right - left));
            if (height[right] > height[left]) {
                left++;
                while (height[left - 1] > height[left] && left != right ) {
                    left++;

                }
            } else {
                right--;
                while (height[right] < height[right+1] && left != right ) {
                    right--;
                }
            }
        }
        System.out.println(maxa);
    }
}
