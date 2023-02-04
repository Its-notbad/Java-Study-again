import java.util.Scanner;
public class ForWhile1 {
          public static void main(String[] args)
          {
            //사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여
            //출력하는 코드
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();

            int [] a = new int[n];

            for(int i = 0 ; i < n ; i++)
            {
                a[i] = kb.nextInt();
            }
            //Scanner 닫는다.
            kb.close();

            int sum = 0;
            int max = a[0];

            for( int i = 0 ; i < n ; i++)
            {
                sum = sum + a[i];
                if(a[i] > max)
                {
                    max = a[i];
                }

            }
            System.out.println("합계 : "+sum+" 최대값은 : "+max);

        }



}
