
public class LargestThree {
	
	public static void findThreeLargest(int[] array,int len) {
		if (len<3) {
			System.out.println("The array doesnt have three elements");
			return;
		}
		int max1,max2,max3;
		max1=max2=max3=0;
		for (int i =0;i<len;i++) {
			if (array[i]>max1) {
				max3=max2;
				max2=max1;					
				max1=array[i];
						
			}
			else if (array[i]>max2){
				max3=max2;
				max2=array[i];
			}
			else if (array[i]>max3){
				max3=array[i];
			}
		}
		System.out.printf(" %d, %d, %d",max1,max2,max3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array= {100,200,2345,400,600,900,150,250,1255,34322};
		int len = array.length;
		findThreeLargest(array,len);
		

	}

}
