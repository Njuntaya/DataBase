import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {

        String infix = null;
        
        System.out.println("Input INFIX");
        Scanner in = new Scanner(System.in);

        infix = in.nextLine();
        System.out.println();
        
        try {
            infixToPostfix validator = new infixToPostfix(infix);
            validator.infixToPostfix();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}               