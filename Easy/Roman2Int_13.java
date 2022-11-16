class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> myMap = new HashMap<>();
        int val = 0;
        int num = 0;

       myMap.put("I",1);
       myMap.put("V",5);
       myMap.put("X",10);
       myMap.put("L",50);
       myMap.put("C",100);
       myMap.put("D",500);
       myMap.put("M",1000);
       myMap.put("IV",4);
       myMap.put("IX",9);
       myMap.put("XL",40);
       myMap.put("XC",90);
       myMap.put("CD",400);
       myMap.put("CM",900);

       String[] strArray = new String[]{"IV","IX","XL","XC","CD","CM"};

        for(String sub : strArray) {
            if(s.contains(sub)) {
                val = val + myMap.get(sub);
                s = s.replace(sub,"");
            }
        }
      

       char[] charArray = s.toCharArray();

       for(int i = 0; i < s.length(); i++) {
           val = val + myMap.get(String.valueOf(charArray[i]));
       }

        return val;

    }
}