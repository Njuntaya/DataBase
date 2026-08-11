
package com.mycompany.linklist;

public class LinkedCollection {
    
    int s;
    Node head,travel,tail;
            
    void add (int item) {
        
        Node n = new Node();
        n.info = item;
        
        if(s==0) {
            head = n; // pointer firstNode
            tail = n; // pointer LastNode
            s++;
        }
        
        else {            
            tail.link = n ;
            tail = n;
            s++;
        }
    }
    void showAll() {
        travel = head;
        while(travel!=null) {
            System.out.println(travel.info);
            travel = travel.link;
        }
    }
    void remove(int order) {
        Node pre = null; 
        
            if(order == 1) { // delete FirstNode
                travel = head;
                if(travel.link == null) { //ถ้า Node มี Node เดียว 
                        
                    head = null ;
                    s-- ;
                    
                }
                else { // ถ้ามีมากกว่า 1 Node
                    head = travel.link;
                    travel.link = null ;
                    s--;
                }
            }
            
            else if (order == s) { // delete Last Node
                travel = head;
                while(travel.link.link!=null) {
                    travel = travel.link;
                }
                travel.link = null;
                tail = travel;
                s--;
            }
                
            else if (order > 1 && order < s){ // ลบ Node หลังตัวชี้ 
                
                travel = head; 
                
                while(order > 1) {
                    pre = travel ;
                    travel = travel.link;
                    order --;
                }
                pre.link = travel.link;
                s--;  
            }
    }

    void insert(int order) {
        if(order == 1 ) {
            
        }
    }

}

