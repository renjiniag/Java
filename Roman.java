
public class Roman {
	

	public static int roman_value(char num) {
		int n=0;
		switch (num) {
		case 'X':
			n=10;
			break;
		case 'V':
			n=5;
			break;
		case 'I':
			n=1;
			break;
		case 'L':
			n=50;
			break;
		case 'C':
			n=100;
			break;
		case 'D':
			n=500;
			break;
		case 'M':
			n=1000;
			break;
		default:
			//System.out.println("Sorry.Wrong Input ");
		    break;
		
		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		str="MMDCXLVI";
		int i,num,prev;
		int sum=0;
		num=prev=0;
		for (i=str.length()-1;i>=0;i--) {
			num=roman_value(str.charAt(i));
			if(num<prev) {
				sum=sum-num;
			}
			else {
				sum=sum+num;
			}
			prev=num;
		}			
		
		System.out.println(sum);
		
		}

	}
	


