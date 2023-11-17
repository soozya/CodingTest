class Solution {
    public String solution(String str1, String str2) {
        String answer="";
        
        for(int i=0; i<str1.length(); i++){
            
            char s = str1.charAt(i);
            char t = str2.charAt(i);
            
            answer += String.valueOf(s)+String.valueOf(t);
        }
        return answer;
    }
}