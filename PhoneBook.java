package LAB01;
class PhoneBook {
      
      private String name;
      private String surName;
      private String number;
      
      PhoneBook(String name , String surName , String number) {
         this.name = name ;
         this.surName = surName;
         this.number = number;
      } 
      
      String getName() {
          return this.name;
      }
      
      String getSurName(){
          return this.surName;
      }
      
      String getNumber() {
          return this.number;
      }
      String getRecord() {
          return this.name + "  " + this.surName + "  " + this.number; 
      }
 }
    
    
    
    

