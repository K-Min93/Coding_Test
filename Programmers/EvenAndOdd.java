public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {3, 4};
        String result = "";

        for(int i=0; i<arr.length; i++)
        {
            result = solution(arr[i]);
            System.out.println(result);
        }
    }

    public static String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        } else{
            answer = "Odd";
        }
        return answer;
    }
}
