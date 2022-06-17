public class HarshadNumber {
    public static void main(String[] args) {
        int[] arr = {10, 12, 11 ,13};
        boolean result = true;

        for(int i=0; i<arr.length; i++)
        {
            result = solution(arr[i]);
            System.out.println(result);
        }
    }

    public static boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        int sum = Harshad(num);

        if(x%sum == 0){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }

    // 모든 자릿수의 합 구하는 함수
    public static int Harshad(String num){
        String[] arr = new String[num.length()];
        int sum = 0;
        for(int i=0; i<num.length(); i++){
            arr[i] = num.substring(i, i+1);
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}
