import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if (n==1){
			return 1;
		}
		else {
			return(n*fact(n-1));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n=input.nextInt();
		int i;
		i=fact(n);						
		System.out.printf("The factorial of %d is %d",n,i);
		input.close();
	}

}
