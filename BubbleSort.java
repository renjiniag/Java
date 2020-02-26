
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {7,4,9,23,56,1,7,8,26,65};
		bubble_sort(array,array.length);

	}
	public  static void bubble_sort(int[] array,int len) {
		int i,j,temp;
		for(i=0;i<len;i++) {
			for (j=0;j<len-i-1;j++) {
				if (array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;				
				}
			}
		}
		for(i=0;i<len;i++) {
			System.out.println(array[i]);
		}
	}
	
}
