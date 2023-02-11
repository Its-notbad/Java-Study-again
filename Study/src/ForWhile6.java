import java.util.Scanner;

public class ForWhile6 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //n개의 정수 입력
        int n = kb.nextInt();
        //배열정의
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        //Scanner닫음
        kb.close();

        //1.번방법 모든 구간을 검색
        int max = 0;
        for( int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                //입력 된 한자리 정수들을 하나씩 붙여 만든 정수가 소수인지 판별하고
                //판별 된 소수값들의 최대값을 구하여라
                //예) 1,2,3,4,5,6 => 12,123,1234,12345 이런수들 중 가장 큰수(소구)
                int val = 0; //10억이상의 정수값이 들어오면 정수의 변수 int에 포함을 할수 없다. ( 그럴경우 overflow)
                             //long 타입으로 변경해도 근본적인 해결책이 되지 않는다..흠..생각해봐야할 문제..(>>)
                for(int k = i ; k < j ; k++)
                {
                    val = val*10+data[k];

                }
                //소수 판별
                boolean isPrime = true;
                for(int k = 2 ; k*k < val && isPrime ; k++)  //1)val 1일 경우 해당 for문을 생략하게 된다.
                {
                    if( val % k == 0 )
                    {
                        isPrime = false;
                    }
                }

                if( isPrime && val > 1 && val>max) //1)val 1일경우 소수가 아니리 해당 경우를 예외처리 해준다.
                {
                    max = val;
                }
            }
        }
        if(max>0) {
            System.out.println("max : " + max);
        }
        else
        {
            System.out.println("소수가 아님");
        }
        
    }
}
