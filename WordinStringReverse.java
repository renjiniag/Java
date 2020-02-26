

public class WordinStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,strWords[],word,strrev;
		int i,j;
		str="I am a good boy";
		strrev="";
		strWords=str.split(" ");
		for(i=0;i<strWords.length;i++) {
			word=strWords[i];
			for(j=word.length()-1;j>=0;j--) {
				strrev=strrev+word.charAt(j);
			}
			strrev=strrev+" ";
			
		}
		System.out.println(strrev);

	}

}
