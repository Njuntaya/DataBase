package LAB01;
class Data {
    
    private PhoneBook ph[] ;
    
    Data(int SizeArr) {
        this.ph = new PhoneBook[SizeArr];
    }   
    
    PhoneBook getArrAt(int index) {
        return this.ph[index];
    }
    
    void addMember(PhoneBook record , int index) {
        this.ph[index] = record;
    }
    
    int getLength() {
        return this.ph.length;
    }
    
    void arrSet(int index , PhoneBook set) {
        this.ph[index] = set ;
    }


}
