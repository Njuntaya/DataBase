package LAB01;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        Data da = new Data(5);
        list l = new list(da);
        
        boolean run = true ;
        
        Scanner input = new Scanner(System.in);

            System.out.println("====================================");
            System.out.println("Input the number to use function");
            System.out.println(" 1.add        2.showAll");
            System.out.println(" 3.Insert     4.Delete");
            System.out.println(" 5.search     6.Sort");
            System.out.println(" 0 Exit program");
            System.out.println("====================================");
            System.out.println("====================================");
        
        
        while(run) {

                
            int choice ;
            System.out.printf("Command>  ");
            
            if(input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            }
            
            else {
                System.out.println("only number");
                input.nextLine();
                continue;
            }
            
            switch(choice) {
                
                case 1: System.out.println(">Add");
                        System.out.printf("Name:   ");
                        String name = input.nextLine();
                        System.out.printf("SurName:   ");
                        String surName = input.nextLine();
                        System.out.printf("Number:   ");
                        String number = input.nextLine();   
                        l.addMember(name , surName , number); 
                        break;
                        
                case 2: System.out.println(">showAll");
                     l.showAll();
                     break;
                     
                case 3: System.out.println(">Insert");
                        int insertChoice = input.nextInt();
                        input.nextLine();
                        String insertName = input.nextLine();
                        String insertSurName = input.nextLine();
                        String insertNumber = input.nextLine();
                        l.insert(insertChoice, insertName, insertSurName, insertNumber);
                        break;
                        
                case 4: System.out.println(">Delete");
                       int choiceDelete = input.nextInt();
                            input.nextLine();
                            l.delete(choiceDelete);
                            break;
                            
                case 5: System.out.println(">Search");

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
                       
                case 6: System.out.println(">Sort");
                
                        l.sort();
                        break;
                        
                case 0: run = false;
                        break;
                
                default: System.out.println("please input index 1-6 ");
                        break;
          
            }
        }
        input.close();
    }
}
