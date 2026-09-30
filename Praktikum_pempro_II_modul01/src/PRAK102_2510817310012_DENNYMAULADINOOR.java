import java.util.Scanner;

public class PRAK102_2510817310012_DENNYMAULADINOOR{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int startingNum = input.nextInt();

        int i = 0;
        while (i <= 10){

            if (startingNum % 5 == 0){
                System.out.print((startingNum / 5) - 1);
            } else{
                System.out.print(startingNum);
            }


            if (i < 10){
                System.out.print(",");
            }

            startingNum++;
            i++;
        }
    }
}