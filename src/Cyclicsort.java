import java.util.Arrays;
public class Cyclicsort {
    public static void main(String[] args) {
        int [] arr={3,4,2,5,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void cyclicsort(int [] arr){
        int i=0;
        while(i< arr.length){

            int correct=arr[i];

           if(arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }

        }
    }
}
