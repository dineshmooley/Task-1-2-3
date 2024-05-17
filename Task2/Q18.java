//18) Write a program to sort the elements in odd positions in descending order and elements in ascending order.


class Q18 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i=0; i<nums.length - 2; i+=2)   {
            for(int j=i+2; j<nums.length; j+=2) {
                if(nums[j] > nums[i])   {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }  
        }
        
        for(int i=1; i<nums.length - 2; i+=2)   {
            for(int j=i+2; j<nums.length; j+=2) {
                if(nums[j] < nums[i])   {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }  
        }
        
        for(int i: nums)    {
            System.out.println(i);
        }
    }
}
