import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {

        int []arr={5,3,4,1,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int []arr){
        for (int i = 0; i < arr.length; i++) {   //3 4 1 2 5

            for(int j = 1; j<arr.length-i;j++){
                if(arr[j]<=arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;

                }
            }

        }

    }
}
