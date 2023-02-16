import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {
        System.out.println("첫번째날");

        String number = "123";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("    입력해 : ");

        //nextint : 숫자, next 문자
        //int input = keyboard.nextInt();
        String input = keyboard.next();

        if (input.equals(number)){
            System.out.print("일치");
        } else {
            System.out.print("불일치");
        }
        keyboard.close();
    }
}
