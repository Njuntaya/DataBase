public class infixToPostfix {

    private String infix;

    public infixToPostfix(String s) {
        s.trim();
        isAlphabetic(s);
        if (!checkParen(s)) {
            throw new IllegalArgumentException("Error Paren");
        }
        this.infix = validate_operator(s);
        this.infix = infixSceening(this.infix);
    }
     
    void infixToPostfix() {
        
        String fullPostFix = "";
        Stack s = new Stack();
        String format = "| %-8s | %-18s | %-35s |\n";
        
        System.out.println("+----------+--------------------+-------------------------------------+");
        System.out.printf(format, "c_infix", "Stack (Top)", "Postfix (fullinfix)");
        System.out.println("+----------+--------------------+-------------------------------------+");

        for (int i = 0; i < infix.length(); i++) {
            char c_infix = infix.charAt(i);

            if (c_infix == ' ') {
                if (!fullPostFix.isEmpty() && !fullPostFix.endsWith(" ")) {
                fullPostFix = fullPostFix + c_infix;
                }
                continue;
            }

            if (!isOperator(c_infix) && !isParen(c_infix)) { // condition 1.1
                fullPostFix = fullPostFix + c_infix;
                System.out.printf("| %-8s | %-18s | %-28s \n", "'" + c_infix + "'", s.isEmpty() ? "Empty" : s.getopd(), fullPostFix);
                continue;
            } else if ((c_infix == '-' && !isOperator(infix.charAt(i + 1))) && (c_infix == '-' && infix.charAt(i + 1) != ' ')) {
                fullPostFix = fullPostFix + c_infix;
                System.out.printf("| %-8s | %-18s | %-28s \n", "'" + c_infix + "'", s.isEmpty() ? "Empty" : s.getopd(), fullPostFix);
                continue;
            }

            if (isOperator(c_infix)) { // condition 2.2
                if (s.isEmpty()) {
                    s.push(c_infix);
                } else {
                    if (check_Operator(c_infix) > check_Operator((char) s.peek())) {
                        s.push(c_infix);
                    } else {
                        while (!s.isEmpty() && check_Operator((char) s.peek()) >= check_Operator(c_infix)) {
                            char temp_infix = (char) s.pop().info;
                            fullPostFix = fullPostFix + temp_infix;
                        }
                        s.push(c_infix);
                    }
                }
                System.out.printf("| %-8s | %-18s | %-28s \n", "'" + c_infix + "'", s.isEmpty() ? "Empty" : s.getopd() , fullPostFix);
            } else if (c_infix == '(') {
                s.push(c_infix);
                System.out.printf("| %-8s | %-18s | %-28s \n", "'" + c_infix + "'", s.isEmpty() ? "Empty" : s.getopd(), fullPostFix);
            } else if (c_infix == ')') {
                for (int j = s.getsize(); j > 0; j--) {
                    if ((char) s.peek() == '(') {
                        s.pop();
                        break;
                    }
                    fullPostFix = fullPostFix + (char) s.pop().info;
                }
                System.out.printf("| %-8s | %-18s | %-28s \n", "'" + c_infix + "'", s.isEmpty() ? "Empty" : s.getopd(), fullPostFix);
            }
        }

        if (!s.isEmpty()) {
             if(!fullPostFix.isEmpty() && !fullPostFix.endsWith(" ")) {
                fullPostFix = fullPostFix + " ";
            }
            for (int i = s.getsize(); i > 0; i--) {
                if(!fullPostFix.isEmpty() && fullPostFix.endsWith(" "))
                fullPostFix = fullPostFix + (char) s.pop().info + " ";
            }
            System.out.printf("| %-8s | %-18s | %-28s \n", "POP ALL", s.isEmpty() ? "Empty" : s.getopd() , fullPostFix);
        }

        System.out.println("+----------+--------------------+------------------------------+");
    }
    
    boolean isOperator(char c) {return c == '+' || c == '-' || c == '*' || c == '/' || c == '%'|| c== '^' ;}
    boolean isParen(char c) {return c == '(' || c == ')';}
    
    int check_Operator(char op) {
        
        switch(op) {
            case'+':
               return 1;
            case'-':
               return 1;
            case'*': 
               return 2;
            case'%': 
               return 2;
            case'/': 
               return 2;
            case'^': 
               return 3;
            case'(': 
               return 0;
            default :
                return -1;
        }
        
    }
    
    String infixSceening(String infix) {
    String completeInfix = ""; 

    for (int i = 0; i < infix.length(); i++) {
        char tempC = infix.charAt(i);
        
        if (tempC == '-' && i + 1 < infix.length() && isParen(infix.charAt(i - 1))){
            completeInfix += " " + tempC + " ";
            continue; 
        }
        
        if (isOperator(tempC) && i + 1 < infix.length() && infix.charAt(i + 1) == '-') {
            completeInfix += " " + tempC + " ";
            continue;
        }


        if (tempC == '-' && i > 0 && (isOperator(infix.charAt(i - 1)) || infix.charAt(i - 1) == '(')) {
            completeInfix +=  tempC ; // keep -
            continue;
        }
        

        if (isOperator(tempC) || isParen(tempC)) {
            completeInfix += " " + tempC + " ";
            continue;
        }

        if (tempC >= '0' && tempC <= '9' ||tempC == '.') {
            completeInfix += tempC;
        }
    }
    System.out.println(completeInfix);
    return completeInfix;
    }

    void isAlphabetic(String infix) {
        
        //null \ empty
        if (infix == null || infix.isEmpty()) {
            throw new IllegalArgumentException("The infix Cant be null and Empty");
        }
        
        for (int i = 0; i < infix.length(); i++) {

            char c = infix.charAt(i);

            if (!((c >= '0' && c <= '9') || c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')' || c == '^' || c == '%' || c == '.' || c == ' ')) {
                throw new IllegalArgumentException("Dont type the Alphabetic");
            }
        }
    }
    
    boolean checkParen(String infix){
        
        int openParen = 0 ;
        int closeParen = 0 ;
        boolean complete_pair = false;
        
        for(int i = 0 ; i < infix.length() ; i++) {
            char find = infix.charAt(i);
            
            if(find == '(') {
                openParen ++;
            }
            else if (find == ')'){
                closeParen ++;
            }     
            //validate the Paren cannot be )( )(
            if(closeParen > openParen) {return complete_pair;}
        }
            //noParen
            if(openParen == 0 && closeParen == 0) {complete_pair = true; return complete_pair;}  //when the infix haveno Paren 
            //Paren correct
            if(openParen == closeParen ){complete_pair = true;}//check set Paren 
            // check when 2+(2-3)(
            
            return complete_pair;
    }
    
    String validate_operator (String infix) { //check ex *+ // ++ 
        
        char operator ;
        
        
        //validate the first infix cant be the operation
        if(isOperator(infix.charAt(0))) { // TheFirstinfix
            throw new IllegalArgumentException("First infix cant be operation"); 
        }
        
        //validate the last infix cant be the operation except )
        char lastInfix = infix.charAt(infix.length() - 1);
        
        if(isOperator(lastInfix)) {
            
            if(lastInfix != ')'){
            throw new IllegalArgumentException("Last infix cant be operation"); 
            }
            
        }
        
        for(int i = 0 ; i < infix.length() - 1 ; i ++) { // dupicate_operator
            
            operator = infix.charAt(i);
            
            if(isOperator(operator) && isOperator(infix.charAt(i + 1))) { //check duplicate operator
                
                if(!(infix.charAt(i+1) == '-' || infix.charAt(i + 1) == '*' && operator == '*')) {                    
                throw new IllegalArgumentException("No duplicate devices allowed");                
                }
            }
            
            if(operator == '(' && infix.charAt(i + 1) == ')') { // validate when ex. 2+3()
                throw new IllegalArgumentException("ErrorParen");            }
        }    
        return infix;
    }        
}
    
    
