import java.util.Arrays;

public class NumbersSpaced {
    public static void main(String[] args) throws Exception {
        int[] x = {2, 4, -4};
        int[] n = {5, 3, 2};

        for(int i=0; i<x.length; i++)
        {
            System.out.println(Arrays.toString(solution(x[i], n[i])));
        }
    }

    public static long[] solution(int x, int n){
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            answer[i] = Long.valueOf(x)*(i+1);
        }
        return answer;
    }
}
