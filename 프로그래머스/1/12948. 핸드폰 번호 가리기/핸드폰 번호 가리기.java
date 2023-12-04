class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "";
        
        for (int i = 0; i < phone_number.length() - 4 ; i++){
            answer += "*" ;
        }
        
        star = phone_number.substring(phone_number.length() - 4, phone_number.length());
            answer += star;
            
        return answer;
    }
}