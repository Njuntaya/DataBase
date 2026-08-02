
package src;

public class DataQueue {
    
    private int queue[];
    private int queue_Number;
    
    public DataQueue() {
        this.queue = new int [5];
        this.queue_Number = 0;
    }
    
    public DataQueue(int size) {
        this.queue = new int[size];
        this.queue_Number = 0;
    }
    
    int getArrQueue(int index){
        return queue[index];
    }
    
    void setEnQueue(int rear){
       this.queue[rear] = getNumberQueue();
    }
    
    void setdeQueue(int front , int temp){
       this.queue[front] = temp;
    }
            
    int getSize() {
        return queue.length;
    }
    
    int getNumberQueue() {
        this.queue_Number ++;
        return queue_Number ;
    }
    
  
}
