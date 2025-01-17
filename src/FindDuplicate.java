//leetcode question number 287(medium)
public class FindDuplicate {
    public static void main(String[] args) {
        int [] nums={3,1,3,4,2};
        FindDuplicate f=new FindDuplicate();
        int a=f.findDuplicate(nums);
        System.out.println(a);
    }
    public static int findDuplicate(int[] nums) {
        int ans=-1;
        int i=0;
        while(i< nums.length){

            int correct=nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        for(int index=0;index< nums.length;index++){
            if(nums[index]!=index+1){
                ans=nums[index];
            }
        }
        return ans;

    }
    static void swap(int [] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
