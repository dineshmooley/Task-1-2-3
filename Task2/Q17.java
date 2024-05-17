//17) Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

class Q17 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        
        for(int i=0; i<nums.length; i++)    {
            if(nums[i] < nums[1])   {
                int temp = nums[i];
                nums[i] = nums[1];
                nums[1] = temp;
            }
            else if(nums[i] > nums[0])  {
                int temp = nums[i];
                nums[i] = nums[0];
                nums[0] = temp;
            }
        }
        
        for(int i: nums)    {
            System.out.println(i);
        }
    }
}
