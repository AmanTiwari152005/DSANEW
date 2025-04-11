public class Find {
    public static void main(String[] args) {
        int [] arr={5,9,7,12,85};
        System.out.println(find(arr,12,0));
        System.out.println(findIndex(arr,12,0));
    }
    static boolean find(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }else{
            return arr[index]==target || find(arr,target,index+1);
        }
    }

    static  int findIndex(int [] arr,int target , int  index){
        if(index== arr.length){
            return -1;
        }if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr,target,index+1);

            }
        }
    }

