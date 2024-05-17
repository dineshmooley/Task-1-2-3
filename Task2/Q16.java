//16) Given two sorted arrays, merge them such that the elements are not repeated

class Q16 {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] nums2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        int n = nums1.length, m = nums2.length;
        
        int[] ans = new int[n + m];
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || ans[k - 1] != nums1[i]) ans[k++] = nums1[i++];
            } 
            else if (nums1[i] > nums2[j]) {
                if (k == 0 || ans[k - 1] != nums2[j]) ans[k++] = nums2[j++];
            } 
            else { 
                if (k == 0 || ans[k - 1] != nums1[i]) ans[k++] = nums1[i++];
                j++;
            }
        }
        
        while (i < n) {
            if (k == 0 || ans[k - 1] != nums1[i]) ans[k++] = nums1[i++];
        }
        
        while (j < m) {
            if (k == 0 || ans[k - 1] != nums2[j]) ans[k++] = nums2[j++];
        }
        
        for (int l = 0; l < k; l++) {
            System.out.print(ans[l] + " ");
        }
    }
}
