import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 행
        int b = sc.nextInt();   // 열
        
        for(int i=0; i<b; i++)
        {
            for(int j=0; j<a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
