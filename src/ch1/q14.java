package ch1;

public class q14 {

	
	public static char[] replaceSpace(char[] text,int tindex) {
		
		int spaceCount = 0;
		for(int i = 0 ; i < tindex ;i++){
			if(text[i]==' ') spaceCount++;
		}

		char[] ftext = new char[tindex + (spaceCount*2)];
		
		int findex = 0;
		for(int j = 0 ; j < tindex ; j++) {
			if(text[j]!=' ') {
				ftext[findex++] = text[j];				
			} else
			{
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
