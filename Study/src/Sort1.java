import java.util.Scanner;

public class Sort1 {
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

            for(int i = n-1 ; i >0 ; i--)
            {
                for(int j = 0 ; j <i ; j++)
                {
                    //data[0]~data[j]까지 값 비교
                    if(data[j] > data[j+1])
                    {
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
            }

            for(int i = 0 ; i < n ; i++)
            {
                System.out.println(data[i]);
            }



    }
}
