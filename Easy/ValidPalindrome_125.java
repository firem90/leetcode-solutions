class Solution {
    public boolean isPalindrome(String s) {
        
        String regex = "[^A-Za-z0-9]";
        
        s = s.replaceAll(regex,"").trim().toLowerCase();

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev))
            return true;
        else
            return false;
    }
}
