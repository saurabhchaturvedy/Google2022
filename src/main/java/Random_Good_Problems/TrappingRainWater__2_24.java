package main.java.Random_Good_Problems;

class TrappingRainWater__2_24 {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        int leftTop = 0;
        int rightTop = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftTop = Math.max(leftTop, height[left]);
                water += leftTop - height[left];
                left++;
            } else {
                rightTop = Math.max(rightTop, height[right]);
                water += rightTop - height[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater__2_24 trappingRainWater__2 = new TrappingRainWater__2_24();
        System.out.println(trappingRainWater__2.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}