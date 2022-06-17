public class SquareRootDistinguish {
    public static void main(String[] args) {
        long[] num = {121, 3};
        long result = 0;

        for(int i=0; i<num.length; i++)
        {
            result = solution(num[i]);
            System.out.println(result);
        }
    }

    public static long solution(long n) {
        long answer = 0;
        long sum = 1;
        long i = 1;
        
        while(sum != n){
            i++;
            sum = i*i;
            
            if(n<i){
                answer = -1;
                return answer;
            }
        }

        i += 1;
        answer = i*i;

        return answer;
    }
}