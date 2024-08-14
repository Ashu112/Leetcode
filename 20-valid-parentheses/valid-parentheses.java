class Solution {
    public boolean isValid(String s) {
        // 1. create an empty stack
        // 2. for each char in string
        //         i. add the char for open braces
        //         ii. check if char is close bracket and top of stack is open than pop.
        // 3. if stack is empty after loop return true else false.
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(c =='(' || c == '{' || c == '[')st.add(c);
            else{
                if(st.empty())return false;

                if(c==')' && st.peek() == '(' ||
                   c=='}' && st.peek() == '{' ||
                    c==']' && st.peek() == '[' )st.pop();
                    else return false;
            }
            
        }
        return st.isEmpty();
    }
}