class Solution {
    public boolean solution(int x) {
        int t=x;
        int y=0;
        
        while (t!=0){
            y += t%10;
            t /=10;
        }
        return x%y==0 ? true : false;
    }
}