package stacks;

public class UseStacks {

    public static void main(String[] args) {
        DStacks st = new DStacks() ;

        st.push(14);
        st.push(7);
        st.push(2);
        st.push(9);
        st.push(3);
        st.push(1);

        for (int i = st.size() ; i > 0 ; i --) {
            System.err.println(st.pop().info);
        }

        // String 

        String s = "Data Structure";
        String sumAlphabetic = " ";
        char tempAlphabetic ; 

        for (int i = 0 ; i < s.length() ; i ++) {
            st.push(s.charAt(i));
        }

        for (int i = st.size() ; i > 0 ; i --) {

            tempAlphabetic = (char) st.pop().info;
            sumAlphabetic = sumAlphabetic + tempAlphabetic ;
        }

        System.err.println(sumAlphabetic);
    }    
}
