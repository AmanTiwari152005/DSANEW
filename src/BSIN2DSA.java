//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class BSIN2DSA {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(matrix,8)));
    }



    static int [] binarysearch(int [][]matrix,int row,int cs,int ce,int target){
        while(cs<=ce){
            int mid=cs + (ce-cs)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                ce=mid-1;

            }else{
                cs=mid+1;

            }
        }
        return new int[]{-1,-1};
    }
    static int [] search(int [][] matrix,int target){
        int rows = matrix.length;
        int cols=matrix[0].length;

        if(rows == 1){
           return binarysearch(matrix,0,0,cols-1,target);
        }

        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;

        //run the loop untill 2 rows are remaining

        while(rstart < (rend-1)){
                  int mid=rstart + (rend-rstart)/2;

                  if(matrix[mid][cmid]==target){
                      return new int[]{mid,cmid};
                  }
                  if(matrix[mid][cmid]>target){
                      rend=mid;
                  }
                  else{
                      rstart=mid;

            }
        }
        //now we have 2 rows left, now search in the cols of that two rows

        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //search in the first part
        if(target <= matrix[rstart][cmid-1] ){
            return binarysearch(matrix,rstart,0,cmid-1,target);
        }
        //search in the second half
        if(target >= matrix[rstart][cmid + 1] &&target <=matrix[rstart][cols - 1]){
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);
        }
        //search in the third half
        if(target <= matrix[rstart+1][cmid-1]){
            return binarysearch(matrix,rstart+1,0,cmid-1,target);
        }
        //search in the fourth half
        if(target >= matrix[rstart][cmid+1] && target <= matrix[rstart+1][cols-1]){
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
        }
        return new int[]{-1,-1};
    }
}
