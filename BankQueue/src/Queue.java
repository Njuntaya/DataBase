
package src;

public class Queue {

    private int count,f,r;
    private DataQueue ba;
    private int callingPointer;
    
    public Queue() {
        this.ba = new DataQueue(5);
        this.count = 0 ;
        this.f = 0 ;
        this.r = 0 ;
        this.callingPointer = 0;
    }
    
    public Queue(int size) {
        this.ba = new DataQueue(size);
        this.count = 0 ;
        this.f = 0 ;
        this.r = 0 ;
        this.callingPointer = 0;
    }
    
    void enqueue() {
        
        if(!IsFull()) {
           ba.setEnQueue(r); 
           r = (r + 1) % ba.getSize(); //r + 1 untill EQ length queue and then gonna reset
           System.out.println("add Queue to Data");
           count ++;
        }
        else {
            System.out.println("Sorry you cannot get ticket now because Queue is Full");
        }
    };
    void dequeue() {
        if(!IsEmpty()){
            int temp = -1 ;
            ba.setdeQueue(f, temp);
            f = (f + 1) % ba.getSize();
            count --;
        }
        else {
            System.out.println("Queue is Empty");
        }
    };
    
    public int RunningQueue() {
        
        if (IsEmpty()) {
            callingPointer = f;
            return -1;
        }
    
        int ticket = ba.getArrQueue(callingPointer);
    
        if (ticket == -1) {
            return -1;
        }
    
        callingPointer = (callingPointer + 1) % ba.getSize();

        return ticket;
    }
    
    boolean IsFull() { return size() == ba.getSize(); }
    boolean IsEmpty() { return size() == 0; }
    int size() { return count; }
    
    void showAll() {       
                for (int i = 0; i < ba.getSize() ; i ++) {
                System.out.printf(ba.getArrQueue(i) + " ");
            }
                System.out.println();
        }
     
        
    }
   
    


