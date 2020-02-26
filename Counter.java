import java.util.*;
import java.util.Map.Entry;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		HashMap <Integer, Integer> counter=new HashMap<Integer,Integer>();
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers are in the array ? ");
		n=input.nextInt();
		System.out.println("Enter the numbers ");
		int[] array= new int[n];
		for(i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		for(i=0;i<n;i++) {
			//number=array[i];
			if(counter.containsKey(array[i])) {
				counter.put(array[i],counter.get(array[i])+1);
			}
			else {
				counter.put(array[i],1);
			}

		}
		Iterator it=counter.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry m= (Map.Entry)it.next();
			System.out.println(m.getKey() + " --> has occured "+m.getValue() +" times" );
		}
		input.close();

	}

}
