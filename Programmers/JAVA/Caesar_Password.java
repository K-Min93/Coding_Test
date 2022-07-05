public class Caesar_Password {
    public static void main(String[] args) {
        String[] str = {"AB", "z", "a B z", "bC", "AaZz"};
        int[] arr = {1, 1, 4, 25, 25};
        for(int i=0; i<str.length; i++){
            System.out.println(solution(str[i], arr[i]));
        }
        
    }

    public static String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<ch.length; i++){
            int k = 0;
            int tmp = ch[i];
            
            if(tmp == 32){
                sb.append(ch[i]);
                continue;
            } else if(97<=tmp && tmp<=122){
                tmp += n;
                k = tmp - 122;
                if(122<tmp){
                    tmp = 96+k;
                    ch[i] = (char)tmp;
                } else{
                    ch[i] = (char)tmp; 
                }
            } else if(65<=tmp && tmp<=90){
                tmp += n;
                k = tmp - 90;
                if(tmp>90){
                    tmp = 64+k;
                    ch[i] = (char)tmp;
                } else{
                    ch[i] = (char)tmp; 
                }
            } else{
                tmp += n;
                ch[i] = (char)tmp;   
            }
            
            sb.append(ch[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}
