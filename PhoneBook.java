package LAB01;
class PhoneBook {
      
      private String name;
      private String surName;
      private String number;
      
      PhoneBook(String name , String surName , String number) {
         if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(surName == null || surName.trim().isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        if(number == null ) {
            throw new IllegalArgumentException("Number must be digits only and not null");
        }

         this.name = name.trim() ;
         this.surName = surName.trim();
         this.number = number.trim();
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

      void editName(String namefix) {
        this.name = namefix ;
      }

      void editSurName(String surNameFix) {
        this.surName = surNameFix ;
      }

      void editNumber(String numberFix) {
        this.number = numberFix;
      }
 }
    
    
    
    

