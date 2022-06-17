public class Colatz {
    public static void main(String[] args) {
        int[] num = {6, 16, 626331};
        int result = 0;
        for(int i=0; i<num.length; i++){
            result = solution(num[i]);
            System.out.println(result);
        }
    }

    public static int solution(int num) {
        int answer = 0;
        int cnt = 0;    // num값이 1이 될때까지 작업횟수 카운트
        long tmpNum = num;  // 배열의 3번째 인자값, 작업 진행할수록 값이 커져 data type long으로 선언

        while(tmpNum != 1){
            cnt++;
            if(tmpNum%2==0){
                tmpNum = tmpNum/2;
            } else{
                tmpNum = (tmpNum*3)+1;
            }
            
            if(cnt>=500){
                answer = -1;
                return answer;
            }
        }
        answer = cnt;
        return answer;
    }
}