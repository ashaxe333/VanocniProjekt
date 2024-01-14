import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Calculation calculation = new Calculation();
        boolean repeat = true;
        while (repeat){
            try {
                System.out.println("How many digits?");
                Scanner scanner = new Scanner(System.in);
                calculation.setPrecision(scanner.nextInt());
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Numbers only");
            }
        }
        System.out.println(calculation.result());
    }
}
