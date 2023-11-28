class Solution {
    public int solution(long num) {
        int result = 0;
        
        while (num != 1){
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            result++;
            
            if (result == 500){
                return -1;
            }
        }
        return result;
    }
}