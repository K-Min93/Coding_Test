public class Yaksu_Plus {
    public static void main(String[] args) {
        int[] arr = {12, 5};

        for(int i=0; i<arr.length; i++){
            System.out.println(solution(arr[i]));
        }
    }

    public static int solution(int n) {
        int answer = 0;
        int cnt = 1;
        
        while(true){
            if(cnt<=n){
                if(n%cnt == 0){
                    answer += cnt;
                }
            }else{
                break;
            }
            cnt++;
        }
        
        return answer;
    }
}
