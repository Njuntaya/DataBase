
package DoublyLinkedList;

public class NodeDLL {
    int count = 0 ;
    DNode head,tail,temp,travel,search;
    
    void add(int item) {
        DNode newnode = new DNode();
        newnode.info = item;
        
        if(count == 0) { // If create FirstNode           
            head = newnode ;
            tail = newnode ;
            count ++ ;
        }else {
            tail.Rlink = newnode;
            newnode.Llink = tail ;
            tail = newnode ;
            count ++ ;
        }
                             
    }
    void front_insert(int item , DNode pos) { //pos = remember address ;
        
        DNode newnode = new DNode();
        newnode.info = item;
        
        
        
        if (pos == head) { // insert first Node
            newnode.Rlink = head;
            head.Llink = newnode;
            head = newnode;
            count ++;
        }else {
            
        newnode.Rlink = pos;
        pos.Llink.Rlink = newnode ;
        newnode.Llink = pos.Llink;
        pos.Llink = newnode;
        count++;
        
        }
    }
    void behide_insert(int item , DNode pos) {
        DNode newnode = new DNode();
        newnode.info = item;
        
        if(pos == tail) {
            tail.Rlink = newnode;
            newnode.Llink = tail;
            tail = tail.Rlink;
            count ++ ;
        }else {
            newnode.Rlink = pos.Rlink;
            newnode.Llink = pos;
            pos.Rlink.Llink = newnode;
            pos.Rlink = newnode;
            count++;
        }
    }
    void front_remove(DNode pos) {
        if(pos!=head) {
            temp = pos.Llink;
            pos.Llink = temp.Llink;
            temp.Llink.Rlink = pos;
            temp.Llink = null;
            temp.Rlink = null;
            count-- ;
        }
    }
    void behide_remove(DNode pos) {
        if(pos != tail) {
            temp = pos.Rlink;
            pos.Rlink = temp.Rlink;
            temp.Rlink.Llink = pos;
            temp.Llink = null ;
            temp.Rlink = null ;
            count--;
        }
    }
    void showAll() {
        travel = head ;
        while(travel != null) {
            System.out.println(travel.info);
            travel = travel.Rlink;
        }
    }
    boolean search(int item) {
        
        search = head; 
        boolean find ;
        
        while(search != null) {
            
            if(item == search.info) {
               return find = true ; 
            }
            
            search = search.Rlink;
            
        }
        
        return find = false;
        
    }
}
