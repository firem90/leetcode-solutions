class Solution {
    public boolean isValid(String s) {

        String input = s;
        Stack<Character> myStack = new Stack<Character>();
        HashMap<Character,Character> mine = new HashMap<Character,Character>();
        
        boolean result = false;
        if(input.length() % 2 != 0) {
            result = false;
        } else {
            mine.put(')','(');
            mine.put(']','[');
            mine.put('}','{');
            
            char[] charArray = input.toCharArray();
            for(char c : charArray) {
                if(mine.containsKey(c) && !myStack.empty()) {
                    if(myStack.peek() == (mine.get(c))){
                		myStack.pop();
                    } else {
                    result = false;
                    break;
                	}
                }
                else
                    myStack.add(c);
            }

            if(myStack.empty())
        	result = true;
            else
        	result = false;
        }
        

        return result;
    }
}
