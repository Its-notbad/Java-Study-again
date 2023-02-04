import java.util.Scanner;

public class ForWhile2 {
    //n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런 다음 모든 정수들을 한칸씩
    //오른쪽으로 shift하라. 마지막 정수는 배열의 첫 칸으로 이동한다.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("배열크기를 입력하시오!");
        int n = kb.nextInt();
        int [] array = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            array[i] = kb.nextInt();
        }

        kb.close();

        //배열 맨뒤의 숫자를 temp에 넣는다.
        int temp = array[n-1];
        for(int i= n-2 ; i >=0 ; --i)
        {
            array[i+1] = array[i];
        }
        array[0] = temp;

        for(int i = 0 ; i <  n ; i++)
        {
            System.out.println("배열을 봐보자 : "+array[i]);
        }
    }
}

