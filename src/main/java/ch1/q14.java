package ch1;

public class q14 {

	/**
	 * substitutes the spaces with %20 up to the given index length
	 * @param text
	 * @param tindex
	 * @return
	 */
	public static char[] replaceSpace(char[] text,int tindex) {
		if(tindex > text.length ) throw new IllegalArgumentException("return index length is greater than original text");
		int spaceCount = 0;
		
		//count the amount of spaces
		for(int i = 0 ; i < tindex ;i++){
			if(text[i]==' ') spaceCount++;
		}

		char[] ftext = new char[tindex + (spaceCount*2)];//create a new char array expanded to fit additional chars
		
		int findex = 0;
		for(int j = 0 ; j < tindex ; j++) {
			if(text[j]!=' ') {
				ftext[findex++] = text[j];				
			} else
			{
				//replace the space with the new chars
				ftext[findex++] = '%';
				ftext[findex++] = '2';
				ftext[findex++] = '0';
			}
		}
		return ftext;
		
	}
	public static void main(String[] args) {
		String text = new String("Mr John Smith   ");
		System.out.println(replaceSpace(text.toCharArray(),13));
		
		

	}

}
