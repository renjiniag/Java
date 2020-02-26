import java.util.Scanner;

public class Int_String {

	public static String string_value(char num) {
		String n="";
		switch (num) {
		case '1':
			n="one ";
			break;
		case '2':
			n="two ";
			break;
		case '3':
			n="three ";
			break;
		case '4':
			n="four ";
			break;
		case '5':
			n="five ";
			break;
		case '6':
			n="six ";
			break;
		case '7':
			n="seven ";
			break;
		case '8':
			n="eight ";
			break;
		case '9':
			n="nine ";
			break;
		case '0':
			n="zero ";
			break;
		default:
			//System.out.println("Sorry.Wrong Input ");
			break;

		}
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Enter the number");
		String number = input.nextLine();
		for (i=0;i<number.length();i++) {
			String n=string_value(number.charAt(i));
			if(n!="") {
				System.out.print(n);
			}
			else {
				System.out.println("Sorry.It is not a digit ");
				break;
			}
			input.close();		

		}

	}
}
