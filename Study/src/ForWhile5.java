import java.util.Scanner;

public class ForWhile5 {
    public static void main(String[] args) {

        //n개의 정수를 입력받아 배열에 저장
        //이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을수 있는
        //최대값을 구하라.

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
        //0이상이니깐
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //data i~j까지를 합을 구한다음
                //그 합(1)이 현재까지 알고 있는 값보다 크다면
                //큰 값은 합(1)이 된다.
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + data[k];
                    if (sum > max) {
                        max = sum;
                    }
                }

            }
        }

        System.out.println(max);

        //다른 방법
        // i~j까지 합에 +j값다 더해주면 된다.
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum = sum + data[j];
//                if (sum > max) {
//                    max = sum;
//                }
//
//
//            }
//        }

    }
}
