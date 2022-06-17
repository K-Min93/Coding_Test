import java.util.Arrays;

public class NumberMinDelete {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {10};
        int[] result;

        for(int i=0; i<2; i++)
        {
            if(i==0)
            {
                result = new int[arr1.length-1];
                result = solution(arr1);
                System.out.print(Arrays.toString(result));
            }
            else
            {
                result = new int[arr1.length-1];
                result = solution(arr2);
                System.out.print(Arrays.toString(result));
            }
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int min;    // 최솟값 담을 변수
        
        if(arr.length == 1){
            answer = new int[arr.length];
            answer[0] = -1;
            return answer;
            
        } else {
            answer = new int[arr.length-1];
            min = MinSelectFunction(arr);   // 최솟값을 구하는 함수
            answer = ReturnArrReslt(min, arr);  // 최솟값을 제외한 배열값 초기화함수
        }
        
        return answer;
    }
    
    public static int MinSelectFunction(int[] arr)
    {
        int result = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(result > arr[i]){
                result = arr[i];
            }
        }
        
        return result;
    }
    
    public static int[] ReturnArrReslt(int min, int[] arr)
    {
        int[] result = new int[arr.length-1];
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                result[cnt++] = arr[i];
            }
           
        }

        return result;
    }
}
