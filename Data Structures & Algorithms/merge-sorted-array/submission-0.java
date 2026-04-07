class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] new_arr = new int[nums1.length];
        int c=0;
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                new_arr[c] = nums1[i];
                i++;
            } else{
                new_arr[c] = nums2[j];
                j++;
            }
            c++;
        }

        while(i<m){
            new_arr[c] = nums1[i];
            i++;
            c++;
        }

        while(j<n){
            new_arr[c] = nums2[j];
            j++;
            c++;
        }

        for(int k=0; k<nums1.length; k++){
            nums1[k] = new_arr[k];
        }
    }
}