class Solution {
    public void reverseString(char[] s) {
        
        char temp;

        for(int i = 0; i < s.length; i++) {
            
                if(i < s.length/2) {
	                    temp = s[i];
	                    s[i] = s[s.length - (i+1)];
	                    s[s.length - (i+1)] = temp;
//	                    System.out.println(s[i] + "<->" + s[s.length - (i+1)]);  //Ignore, added for debug
	            } else if(s.length%2 == 0 && i == s.length/2)  {
	                	temp = s[i];
	                	s[i] = s[s.length - i];
	                	s[s.length - i] = temp;
	                }
	                else
	                    break;

            
        }
    }
}

/* Mine beats 99.95%, but still, Another simple implementation using WHILE loop: 
class Solution {
    public void reverseString(char[] s) {
        
        int i=0;
        int len = s.length - 1;
        
        while(i<len) {
            char temp = s[i];
            s[i] = s[len];
            s[len] = temp;
            i++;
            len--;
        }
        
    }
}
*/
