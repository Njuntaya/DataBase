package stacks ;

class DStacks {

    int count; 
    DNode top , temp ;

    public DStacks() {    
        this.count = 0;
    }

    void push (int item) {

        if(this.count == 0) {
            DNode newnode = new DNode();
            newnode.info = item;
            top = newnode ;
        } else {
            DNode newnode = new DNode();
            newnode.info = item;
            top.Rlink = newnode ; 
            newnode.Llink = top ;
            top = newnode ;
        }
        count ++ ;
    }

    DNode pop() {

        if(!isEmpty()) {
            if(size() == 1) {
                temp = top ; 
                top = null ;
            }
            else {
                temp = top ;
                top = top.Llink ;
                top.Rlink = null ;
                temp.Llink = null ;
            }
            count --;
        }
        else {
            System.out.println("Stacks Is empty!");
        }
        return temp ;
    }

    boolean isEmpty(){return count == 0 ;}
    int size() {return count;}

}
 