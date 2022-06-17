public class Average {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};
        double result = 0;

        for(int i=0; i<2; i++)
        {
            if(i==0)
            {
                result = solution(arr1);
                System.out.println(result);
            }
            else
            {
                result = solution(arr2);
                System.out.println(result);
            }
        }
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int len = arr.length;
        double sum = 0;
        
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        
        answer = sum/len;
        return answer;
    }
}
