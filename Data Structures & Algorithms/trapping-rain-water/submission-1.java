class Solution {
    public int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }
        int[] premax = new int[height.length];
        int[] postmax = new int[height.length];

        int max = height[0];
        premax[1] = height[0];
        for(int i=2; i<premax.length; i++){
            max = Math.max(max, height[i-1]);
            premax[i] = max;
        }

        max = height[height.length - 1];
        postmax[height.length - 2] = height[height.length - 1];
        for(int i=height.length - 3; i>=0; i--){
            max=Math.max(max, height[i+1]);
            postmax[i] = max;
        }

        System.out.println(Arrays.toString(premax));
        System.out.println(Arrays.toString(postmax));

        int result = 0;
        for(int i=0; i<height.length; i++){
            int min_surround = Math.min(premax[i], postmax[i]);
            if(height[i] < min_surround){
                result += min_surround - height[i];
            }
        }
        return result;
    }
}
