
package Sort;
import java.util.Random;

 class DataArr {
     
     int Array[];
     
     public DataArr(int n) {
         this.Array = new int[n];
         Random ran = new Random();
         
         for(int i = 0 ; i < n ; i ++) {
             this.Array[i] = ran.nextInt(n);
         }
     }
     
     int[] getClone(){
        int[] cloneArr = this.Array.clone();
        return cloneArr;
     }
     
}
