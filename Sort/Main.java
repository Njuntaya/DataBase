package Sort;
class Main {
    
    public static void main (String[] args) {
        
        int size[] = {500 , 1000 ,10000 , 50000 , 100000} ;
        TimeCalculator timer = new TimeCalculator();
        Method_Sort m = new Method_Sort();
 
        for (int i = 0 ; i <= size.length - 1 ; i ++) {
            DataArr Data = new DataArr(size[i]);
            
            int[] arrBub = Data.getClone();
            int[] arrIn = Data.getClone();
            int[] arrSel = Data.getClone();
            int[] arrQuick = Data.getClone();
            
            timer.start();
            m.bubble_sort(arrBub);
            timer.stop();
            double timerBubble = timer.getElapsedTimeMs();
            
            timer.start();
            m.insert_sort(arrIn);
            timer.stop();
            double timer_insert = timer.getElapsedTimeMs();
            
            timer.start();
            m.selection_sort(arrSel);
            timer.stop();
            double timer_selection = timer.getElapsedTimeMs();
            
            timer.start();
            m.quick_sort(arrQuick, 0, arrQuick.length - 1);
            timer.stop();
            double timer_quick = timer.getElapsedTimeMs();
            
            System.out.printf("Bubble: %.3f ms | Insertion: %.3f ms | Selection: %.3f ms | Quick: %.3f ms\n", timerBubble, timer_insert, timer_selection, timer_quick);
        }
    }
        
}