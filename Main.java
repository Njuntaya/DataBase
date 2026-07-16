package LAB01;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        Data da = new Data(5);

        if(checkData(da)) {
                System.out.println("");
                System.out.println("the data member cannot lower than 0!!");
                System.out.println("");
                return ;
        }

        list l = new list(da);
        
        boolean run = true ;
        
        Scanner input = new Scanner(System.in);

            System.out.println("====================================");
            System.out.println("Input the number to use function");
            System.out.println(" add        showAll");
            System.out.println(" Insert     Delete");
            System.out.println(" search     Sort");
            System.out.println(" Edit       End");
            System.out.println("====================================");
            System.out.println("====================================");

            // test setup
            l.addMember("bruce", "wayne", "676767");
            l.addMember("tony", "stark", "23234");
            l.addMember("pony", "gorsee", "612376767");

        while(run) {


            System.out.printf("Command>  ");
            String choice = input.nextLine().trim().toLowerCase();
            
            switch(choice) {
                
                case "add": System.out.println(">Add");
                        System.out.printf("Name:   ");
                        String name = input.nextLine();
                        System.out.printf("SurName:   ");
                        String surName = input.nextLine();
                        System.out.printf("Number:   ");
                        String number = input.nextLine();   
                        l.addMember(name , surName , number); 
                        break;
                        
                case "showall": System.out.println(">showAll");
                     l.showAll();
                     break;

                case "insert":
                        System.out.println(">Insert");
                        System.out.printf("Input position you wanna insert: ");
                        int insertChoice = input.nextInt();
                        input.nextLine(); // clear buffer

                        System.out.printf("Name: ");
                        String insertName = input.nextLine();

                        System.out.printf("Surname: ");
                        String insertSurName = input.nextLine();

                        System.out.printf("Number: ");
                        String insertNumber = input.nextLine();

                        l.insert(insertChoice - 1, insertName, insertSurName, insertNumber);
                        break;

                        
                case "delete": 
                       System.out.printf(">Delete");
                       int choiceDelete = input.nextInt();
                            input.nextLine();
                            l.delete(choiceDelete - 1);
                            break;
                            
                case "search": System.out.println(">Search");

                       System.out.printf("Search Name:  ");
                       String searchName = input.nextLine();
                       System.out.printf("Search SurName:  ");
                       String searchSurName = input.nextLine();
                       System.out.printf("Search Number:  ");
                       String searchNumber  = input.nextLine();
                       
                       boolean found = l.search(searchName , searchSurName , searchNumber);
                       
                       if(found) {
                           System.out.println("the member is in the phonebook");
                       }
                       else {
                           System.out.println("We dont have this member in phonebook");
                       }
                       break;
                       
                case "sort": System.out.println(">Sort");
                
                        l.sort();
                        System.out.println("sort successfully!");
                        break;

                case "edit": String choiceEdit ;
                             System.out.println("Edit name?");
                             System.out.println("Edit surName?");
                             System.out.println("Edit Number?");
                             System.out.printf(">command  ");
                             choiceEdit  = input.nextLine().trim();

                             if(choiceEdit.equals("name")) {

                                System.out.printf("what position you wanna fix Name?  ");
                                int index = input.nextInt();
                                input.nextLine(); //clear buffer
                                System.out.printf("Type Name:  ");
                                String nameFix = input.nextLine();
                                l.editName(index - 1, nameFix);
                                break;

                             }
                             
                             else if (choiceEdit.equals("surname")) {
                                System.out.printf("what position you wanna fix surName?  ");
                                int index = input.nextInt();
                                input.nextLine(); //clear buffer
                                System.out.printf("Type surname:  ");
                                String surNameFix = input.nextLine();
                                l.editSurName(index - 1, surNameFix);
                                break;

                             }

                             else if (choiceEdit.equals("number")) {
                                System.out.printf("what position you wanna fix Nunber?  ");
                                int index = input.nextInt();
                                input.nextLine(); //clear buffer
                                System.out.printf("Type Number:  ");
                                String numberFix = input.nextLine();
                                l.editnumber(index - 1, numberFix);
                                break;

                             }

                             else {
                                System.out.println("please input the correct command");
                             }

                             break;
                        
                case "end": run = false;
                        break;
                
                default: System.out.println("please input the correct command ");
                        break;
          
            }
        }
        input.close();
    }
    //validate datasize // ไม่ต้องสร้าง obj 
        static boolean checkData(Data da) {

            boolean check = false ;

            if(da.getLength() == 0 || da.getLength() < 0) {
                return check = true ;
            }
            else {
                return check;
            }
        }
}
