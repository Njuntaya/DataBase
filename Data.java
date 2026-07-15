package LAB01;
class Data {
    
    private PhoneBook ph[] ;
    
    Data(int SizeArr) {

        if(SizeArr < 0 ) {
            System.out.println("please input size Arr");
        }
        else {
            this.ph = new PhoneBook[SizeArr];
        }

    }   
    
    PhoneBook getArrAt(int index) {
        if(index < 0 || index >= this.ph.length){
            System.out.println("Input the correct Index");
            return null;
        }
        else {
            return this.ph[index];
        }
    }
    
    void addMember(PhoneBook record , int index) {
        if(index < 0 || index >= this.ph.length){
            System.out.println("Input the correct Index");
        }
        else if (record == null) {
            System.out.println("cant set null value");
        }
        else {
            this.ph[index] = record;
        }
    }
    
    int getLength() {
        return this.ph.length;
    }
    
    void arrSet(int index , PhoneBook set) {
         if(index < 0 || index >= this.ph.length){
            System.out.println("Input the correct Index");
        }
           else if (set == null) {
            System.out.println("cant set null value");
        }
         else {
            this.ph[index] = set ;
        }
    }


}
