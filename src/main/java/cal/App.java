package cal;
import java.util.Scanner;
import Calculator.CalCode;
public class App {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int a,b;
        char expression,k;
        boolean ch = true;
        while(ch)
        {
        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();
   
        System.out.println("Enter Operation you want to perform : ");
        expression = sc.next().charAt(0);
        if(b==0 & expression=='/')
        {
        	System.out.println("division by zero is invalid");
        }
        else {
        CalCode calculator = new CalCode();
        double result = calculator.operations(a,b,expression);
        System.out.println("Result : " + result);
        System.out.println("do you want to continue?y/n:");
        k=sc.next().charAt(0);
        if(k == 'n')
        {
          ch=false;
        }
        else
        {
        	ch=true;
        }
        }
    }

	}
}

