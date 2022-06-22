import java.util.Arrays;

public class NumReverseArr {
    public static void main(String[] args) {
        long n = 12345;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        int[] answer = {};
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        
        answer = new int[ch.length];
        
        int k = 0;
        for(int i=ch.length-1; i>=0; i--){
            answer[i] = ch[k++]-48;   // 배열에 담길때 아스키 코드값으로 담기기 때문에 -48을 해줌
        }
        
        return answer;
    }
}
