


public class Stack {
    
    Node top , temp , travel;
    private int count;
    
    public Stack() {
        this.top = null ;
        this.temp = null ;
        this.count = 0 ; 
        this.travel = null ;
    }
    boolean isEmpty(){return this.count == 0;}
    int getsize(){return count;}
    
    void push (int item) {
        
        Node newnode = new Node();
        newnode.info = item;
        
        if(this.count == 0) {
            top = newnode;

        } else {
            top.Rlink = newnode;
            newnode.Llink = top;
            top = newnode;

        }
        count++;
    }
    
    
    Node pop() {
        
        if(!isEmpty()) {
            
            if(count == 1) {
                temp = top ;
                top = null ;
                
            }else{
                temp = top ;
                top = temp.Llink;
                top.Rlink = null;
                temp.Llink = null;      
                }
            
        this.count --;
        
        }else{System.out.println("Stacks is Empty!");}
    
        return temp ;
        
    }
    
    int peek() {
        if(!isEmpty()) {
            return top.info;
        }
        return -1;
        
        
    }
    
    String getopd() {
        String info_opd = "";
        if (!isEmpty()) {
            travel = top;
        
            while (travel != null && travel.Llink != null) { // if travel noteq null and travel.Llink not eqnull getloop
            travel = travel.Llink;
            }
        
            while (travel != null) { // loop until travel = null
                info_opd += (char) travel.info; 
                travel = travel.Rlink;
            }
        
        } else {
            return "Empty";
        }
    
        return info_opd;
    }
}
    
    

