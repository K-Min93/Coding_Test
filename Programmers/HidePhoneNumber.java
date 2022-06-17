public class HidePhoneNumber {
    public static void main(String[] args) {
        String[] phone_number = {"01033334444", "027778888"};
        String[] strResult = new String[phone_number.length];

        for(int i=0; i<strResult.length; i++)
        {
            strResult[i] = solution(phone_number[i]);
            System.out.println(strResult[i]);
        }
    }

    public static String solution(String phone_number){
        String answer = "";
        int len = phone_number.length();
        String str1 = phone_number.substring(0, len-4);
        String str2 = phone_number.substring(len-4);
        
        str1 = StarChangeStr(str1);
        answer = str1 + str2;
        
        return answer;
    }

    public static String StarChangeStr(String str){
        char[] ch = str.toCharArray();
        String star = "";
        
        for(int i = 0; i<ch.length; i++){
            ch[i] = '*';
            star += ch[i];
        }
        
        return star;
    }
}
