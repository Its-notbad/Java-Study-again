//import java.util.Scanner;

public class DeciamlFraction {
    @SuppressWarnings("IfStatementMissingBreakInLoop")
    public static void main(String[] args) {
        //각각의 정수 n에 대해서 for문을 돌면서 2보다 크거나
        //같은 약수가 있는지 검사한다.
        //하나라도 약수가 있다면 소수가 아니므로 다음으로 패스
        // 1~100000까지 숫자사이의 소수확인

        //2,3,4.......n-1
        // n/2 약수-> 예를 들어 8일 경우 8의 약수는 5, 6, 7이 될수 없음.

        //Scanner kb = new Scanner(System.in);
        //System.out.println("소수체크를 위한 숫자를 입력 하세요 : ");
        //kb.close();
        //int n = kb.nextInt();
        for (int n = 2; n <= 10000; n++) {
            boolean isTrue = true;
            //1) break문을 쓰지 않는 방법이 존재 .
            //2) root (n) 까지 도는 방법. squareRoot = sqrt
            for (int i = 2; i*i <= n && isTrue ; i++) //1) for(int i = 2 ; i < n/2 && isTrue; i++) &&조건으로 false일경우 수행 중지
            {                              //2) for(int i = 2 ; i * i <= n && isTrue; i++)
                if (n % i == 0) {
                    //약수가 존재.
                    isTrue = false; //소수가 아니다. 약수가 존재

                    //약수가 하나라도 있으면 for문을 빠져나온다.
                    //  break;
                }
            }

            //noinspection PointlessBooleanExpression
            if (isTrue==true) {
                System.out.println("약수이다 : " + n);
            }
        }


    }

    //보다 더 단순한 소수 구하는 방법
    //자바에서 제공하는 Math.sqrt를 사용
//    public int isPrime(int n)
//    {
//        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
//        {
//            if(n%2 ==0)
//            {
//                return 0;
//            }
//        }
//        return 1;
//    }
}
