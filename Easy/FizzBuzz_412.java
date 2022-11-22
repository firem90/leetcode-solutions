class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> answer = new ArrayList<String>();

        for(int i = 1; i <= n; i++) {
            String fb = "";
           if(i%3 == 0) 
                fb += ("Fizz");
           if(i%5 == 0)
                fb += ("Buzz");
            if("".equals(fb))
                fb = Integer.toString(i);
            
            answer.add(fb);
        }

        return answer;
        
    }
}

/*Another solution: 

class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> answer = new ArrayList<String>();

        for(int i = 1; i <= n; i++) {
            if(i%15 == 0) 
                answer.add("FizzBuzz");
            else if(i%3 == 0) 
                answer.add("Fizz");
            else if(i%5 == 0)
                answer.add("Buzz");
            else
                answer.add(String.valueOf(i));
        }

        return answer;
        
    }
}

*/
