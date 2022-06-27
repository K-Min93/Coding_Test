public class IndexAdd {
    public static void main(String[] args) {
        int[] n = {123, 987};
        
        for(int i=0; i<n.length; i++){
            System.out.print(solution(n[i]));
        }
    }

    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] ch = new String[str.length()];
        
        for(int i=0; i<ch.length; i++){
            ch[i] = str.substring(i, i+1);
            answer += Integer.parseInt(ch[i]);
        }

        return answer;
    }
}
