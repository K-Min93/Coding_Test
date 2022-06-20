
public class IntDesOrder {
    public static void main(String[] args) {
        long num = 118372;
        System.out.println(solution(num));

    }

    public static long solution(long n) {
        long answer = 0;
        String strTmp = Long.toString(n);
        char[] chNum = strTmp.toCharArray();
        StringBuilder strSb = new StringBuilder();

        chNum = deSort(chNum);

        for(int i=0; i<chNum.length; i++){
            strSb.append(chNum[i]);
        }

        answer = Long.parseLong(strSb.toString()); 

        return answer;
    }
    
    public static char[] deSort(char[] chNum){
        int len = chNum.length;
        char chTmp = '';

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(chNum[j] > chNum[i]){
                    chTmp = chNum[j];
                    chNum[j] = chNum[i];
                    chNum[i] = chTmp;
                }
            }
        }

        return chNum;
    }
}