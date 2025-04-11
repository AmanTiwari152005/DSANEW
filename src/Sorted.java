public class Sorted {
    public static void main(String[] args) {
        int [] array={1,2,9,4,5};
        System.out.println(sort(array,0));
    }
    public static boolean sort(int [] array,int index) {
        //base condition
        if (index == array.length - 1) {
            return true;
        }else{
            return array[index] < array[index+1] && sort(array,index+1);
        }
    }
}
