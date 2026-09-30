import java.util.Scanner;

public class PRAK103_2510817310012_DENNYMAULADINOOR{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int startingNum = input.nextInt();

        do{
            if (startingNum % 2 == 0) {
                startingNum++;
                continue;
            }

            System.out.print(startingNum);

            n--;

            if (n > 0){
                System.out.print(", ");
            }

            startingNum++;
        } while (n > 0);
    }
}