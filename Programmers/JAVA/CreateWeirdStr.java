public class CreateWeirdStr {
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.print(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length; i++){
            char[] ch = str[i].toCharArray();
            for(int k=0; k<ch.length; k++){
                if(k%2 != 0){
                    sb.append(Character.toLowerCase(ch[k]));
                } else if(k%2 == 0){
                    sb.append(Character.toUpperCase(ch[k]));
                }
            }
            
            if(i != str.length-1){
                sb.append(" ");
            }
        }
        while(true){
            if(sb.length() != s.length()){
                sb.append(" ");
            } else{
                break;
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}
