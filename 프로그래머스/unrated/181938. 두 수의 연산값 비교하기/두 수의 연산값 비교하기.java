class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int num = 2*a*b;
        
            if(ab>=num){
                return ab;
            }else{
                return num;
            }
    }
}