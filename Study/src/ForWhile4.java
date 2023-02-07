import java.util.Scanner;

public class ForWhile4 {

    public static void main(String[] args) {

/*        사용자로부터 n개의 개수를 입력 받고
        n의 정수를 배열에 저장.
        중복된 정수쌍의 갯수를 카운트.
        예) n = 6 이고
        2,4,2,4,5,2일 경우
        (2,2),(2,2),(2,2),(4,4)*/
        Scanner kb = new Scanner(System.in);
        //n개의 정수 입력
        int n = kb.nextInt();
        //배열정의
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = kb.nextInt();
        }
        //Scanner닫음
        kb.close();

        int cnt = 0;
        for(int i=0 ; i<n;i++) //n-1은 매 마지막 숫자 비교할 필요가 없다.
        {
            for(int j=i+1 ; j<n ;j++)
            {
                if(data[i] == data[j])
                {
                    cnt++;
                }
            }
        }

        System.out.println("총 쌍은 : "+cnt);
    }

}
