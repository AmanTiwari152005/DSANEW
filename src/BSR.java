public class BSR {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,89};
        int target=10;

        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search( arr,target,s,m-1);
        }
            return search(arr,target,m+1,e);

    }
}
