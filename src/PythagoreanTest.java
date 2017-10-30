import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTest
{ //I forgot how much fun Java was. I haven't programmed in it for years!
    
    static Scanner sc;
    static Pythagorean pyth;

    private static void init()
    {
        sc = new Scanner(System.in);
        pyth = new Pythagorean();
    }
    static void print()
    {
        System.out.println();
    }
    static void print(Object o)
    {
        System.out.println(o);
    }

    public static void main(String[] args)
    {
        init();
        boolean test = true;
        int A = 0;
        int B = 0;
        while (test) {
            test = false;
            try {
                print("Enter leg A length: ");
                A = sc.nextInt();
            } catch (InputMismatchException e) {
                test = true;
                print("Please enter a number!");
                sc.next();
            }
        }
        test = true;
        while (test) {
            test = false;
            try {
                print("Enter leg B length: ");
                B = sc.nextInt();
            } catch (InputMismatchException e) {
                test = true;
                print("Please enter a number!");
                sc.next();
            }
        }
        print(pyth.calculateHypotenuse(A, B));
    }

}
