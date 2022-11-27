class Solution {
    public boolean isHappy(int n) {
       
       List<Integer> myList = new ArrayList<Integer>();
       while(n > 0) {
           if(n == 1)
                return true;
            else {
                int temp = 0;
                while(n != 0) {
                    temp = temp + ((n%10) * (n%10));
                    n = n/10;
                }
                if(myList.contains(temp))
                    return false;
                else {
                    myList.add(temp);
                    n = temp;
                }
            }
       }

       return false;
    }
}

/* Better Interesting Solution 
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(1111111111));
		
	}
	
	public static boolean isHappy(int n) {
        int slow = getItem(n);
        int fast = getItem(slow);
        while (slow != fast) {
            slow = getItem(slow);
            fast = getItem(fast);
            fast = getItem(fast);
        }
        return slow == 1;
    }

    private static int getItem(int n) {
        int total = 0;
        while (n != 0) {
            int mod = n % 10;
            n = n / 10;
            total += (mod * mod);
        }
        return total;
    }
}

*/
