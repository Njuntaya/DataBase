package LAB01;
class list {
     
     private int count ;
     private Data da;
       
     list (Data da) {
         this.da = da ;
         this.count = 0 ;
     }
     
     void addMember(String name , String surName , String number) {
         
         if(!isFull()) {
             PhoneBook ph = new PhoneBook(name , surName , number);
             da.addMember(ph, count);
             System.out.println("The Member add now!");
             count ++ ;
         }
         
         else {
             System.out.println("Sorry the PhoneBook isFull");
         }
         
     }
     
     void delete(int index) {

        if(index < 0 || index >= this.count) {
            System.out.println("input the collect choice number");
            return;
        }
         
         if(!isEmpthy()) {
            for(int i = index ; i < count - 1 ; i++) { 
               PhoneBook Member = da.getArrAt(i + 1); 
               da.arrSet(i, Member);
            }
            count -- ;
        }
         else {
           System.out.println("this Member this epmthy");
        }
     }
     
     boolean search (String name , String surName , String number) {
        boolean found = false ;            
            for(int i = 0 ; i < count ; i ++) {
                PhoneBook Member = da.getArrAt(i);
                if(Member.getName().equals(name) && 
                   Member.getSurName().equals(surName) &&                           
                   Member.getNumber().equals(number)) {
                                       
                    found = true ;
                }
            }
            return found ;
     }
     
     void insert(int index , String name , String surName , String number) {
         
         if (index < 0 || index > count ) {
             System.out.println("Wrong index!");
             return;
         }
         if(!isFull()){
             for(int i = count ; i > index ; i--) {
                 PhoneBook memberTemp = da.getArrAt(i - 1);
                 da.arrSet(i, memberTemp);
             }
             PhoneBook ph = new PhoneBook(name , surName , number);
             da.arrSet(index, ph);
             count ++;
         }
         else{
             System.out.println("Sorry the Member isFull!");
         }
     }
     
     void sort() {
         if(!isEmpthy()) {
             for(int i = 0 ; i < count ; i ++) {
                 for(int j = i + 1 ; j < count ; j++) {
                     if(da.getArrAt(i).getName().compareTo(da.getArrAt(j).getName()) > 0) {   
                         PhoneBook tempMember = da.getArrAt(i);
                         da.arrSet(i, da.getArrAt(j));
                         da.arrSet(j, tempMember);
                     }
                 }
             }
         }
         else {
             System.out.println("Sorry the Member is Epmthy!");
         }
    }
    
     
     boolean isFull() {
         return this.count == this.da.getLength();
     }
     
     void showAll() {
         if(!isEmpthy()){
            for(int i = 0 ; i < count ; i++) {
                PhoneBook Member = da.getArrAt(i);               
                System.out.println("Member: " + (i + 1) + "Name:  " 
                + Member.getName() + "    "
                + Member.getSurName() + "    "
                + Member.getNumber());
            }
         }
         else {
             System.out.println("we cant showAll cuz we have no member!");
         }
     }
     
     boolean isEmpthy() {
         return this.count == 0 ;
     }

     
     
}
