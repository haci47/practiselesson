  import java.util.Scanner;
  public class Main {

      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("Enter a 4 digit number : ");

        int number=scan.nextInt();

        a=number-((number/10)*10);

        number=number/10;

        b=number-((number/10)*10);

        number=number/10;

        c=number-((number/10)*10);

        number=number/10;

        d=number;
        int sum = a+b+c+d;
        System.out.println("sum :" +sum);


    }
}
