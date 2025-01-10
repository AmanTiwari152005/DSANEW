//leetcode question number 367(easy)
public class ValidPS {
    public static void main(String[] args) {
       ValidPS v=new ValidPS();
       boolean ans=v.isPerfectSquare(12);
        System.out.println(ans);
    }

        public boolean isPerfectSquare(int num) {
            int start=0;
            int end=num;

            while(start<=end){
                int mid=start+(end-start)/2;

                if (mid == 0) {  // Avoid division by zero.
                    start = mid + 1;
                    continue;
                }
                int div = num / mid;

                if (div == mid && num%mid == 0) {
                    return true;
                }
                if(div>mid){
                    start=mid+1;
                }else{
                    end=mid-1;
                }

            }
            return false;
        }
    }


