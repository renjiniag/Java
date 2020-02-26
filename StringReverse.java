import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int len=str.length();
		String strrev;
		strrev="";
		int i;
		for (i=len-1;i>=0;i--) {
			strrev=strrev+str.charAt(i);
		}
		System.out.println(strrev);
		input.close();

	}

}
