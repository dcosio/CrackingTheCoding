package fitbit;

public class ReversePairs {
	
	
	public static String reversePairs(String text) {
		int sindex = text.length();
		String ntext = new String();
		
		while(sindex > 0) {

			 ntext = ntext + text.substring(sindex -2,sindex);
			 sindex = sindex-2;
			
		}
		
		return ntext;	
		
	}
	public static void main(String[] args) {
		String stext = "abcd1234";
		System.out.println(reversePairs(stext));
	}

}
