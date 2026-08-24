

class firstUniqChar {
    public int firstUniqChar(String s) {
int [] map = new int[26];
for(int i =0 ; i<s.length() ; i++){
   map[s.charAt(i)-'a'] =map[s.charAt(i)-'a'] +1; 
}
for(int i =0 ; i<s.length() ; i++){
  if(map[s.charAt(i)-'a'] == 1){
        return i;
    }
}
return -1;

    }
}


// class firstUniqChar {
//     public int firstUniqChar(String s) {
// HashMap<Character , Integer> map = new HashMap<>();

// for(int i =0 ; i<s.length() ; i++){
//    map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
// }
// for(int i =0 ; i<s.length() ; i++){
//   if(map.get(s.charAt(i))==1){
//         return i;
//     }
// }
// return -1;

//     }
// }