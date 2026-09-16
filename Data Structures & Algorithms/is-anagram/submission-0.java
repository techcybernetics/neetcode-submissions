class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
          Map<Character,Integer> mp = new HashMap<>();
           for(char x:s.toCharArray()) {
            if(mp.containsKey(x)) {
                mp.put(x,mp.get(x)+1);
            }
            else{
                   mp.put(x,1);
            }
         
           }
             for(char x:t.toCharArray()) {
             if(mp.containsKey(x)) {
                mp.put(x,mp.get(x)-1);
            }
           }
           return mp.values()
                  .stream()
                  .allMatch(value -> value == 0);
    }
}
