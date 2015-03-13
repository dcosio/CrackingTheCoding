package ch1;

public class q15 {

	/**
	 * performs basic string compression using the counts of repeated characters. Ex. aabccccaaa compresses to
	 * a2b1c4a3
	 * @param str
	 * @return
	 */
	public static String compressString(String str) {
		if(str ==  null ) return str;//return null str
		char[] cstr = str.toCharArray();//convert to char array
		String nstr = new String();//new compressed string
		//iterate over the char array
		for(int i = 0 ; i < cstr.length;) {
			char c = cstr[i];//get the character
			int count = 0;//keep a count of the current character
			//loop over the array counting the same character.
			while(c == cstr[i]) {
				count++;
				i++;
				if(i == cstr.length) break;//break out when we reach the end of the char array
			}
			
			nstr = nstr+c+count;//append to compressed string
		}
		return (nstr.length()==str.length())? str : nstr;//if length is the same as original, just return the original
	}
	public static void main(String[] args) {
		System.out.println(compressString("aabbccc"));

	}

}
