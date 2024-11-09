package programizeexamples;
import java.io.*;
public class NoOfLines {
	public static void main(String[] args) throws IOException{
	File file = new File("C:\\Users\\parva\\OneDrive\\Desktop\\6th class\\example.txt");
	FileInputStream fileInputStream= new FileInputStream(file);
	InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
	BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
	String line;
	int wordCount=0;
	int characterCount=0;
	int paraCount=0;
	int whiteSpaceCount=0;
	int sentenceCount=0;
	while ((line =bufferedReader.readLine())!=null) {
		if (line.equals("")) {
			paraCount+=1;
		}
		else {
			characterCount+=line.length();
			String word[]=line.split();
			whiteSpaceCount+=wordCount+1;
			String sentence[]=line.split("[!?.:]+");
			sentenceCount +=sentence.length;
			
		}
	}
	if (sentenceCount >=1) {
		paraCount++;
	}
	System.out.println("total word count="+wordCount);
	System.out.println("total no of sentance="+sentenceCount);
	System.out.println("total no of charecters="+characterCount);
	System.out.println("total no of paragraphs="+paraCount);
	System.out.println("total no of whitespaces="+whiteSpaceCount);


}
}
