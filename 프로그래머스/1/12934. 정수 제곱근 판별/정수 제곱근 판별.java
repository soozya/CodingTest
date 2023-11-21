class Solution {
    public long solution(long n) {
        long answer=0;
        long num=(long)Math.sqrt(n);
        
        return (long)Math.pow(num,2)==n ? (long)Math.pow(num+1,2) : -1;
    }
}