/*Author Name: Tran Nguyen
 * Date: 1/28/2022
 * Program Name: Nguyen_SpellChecker
 * Purpose: Checking the missing word.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nguyen_SpellChecker {
	
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		//Scan the input
		
		System.out.print("Enter a file:");
		String textFile = scanner.nextLine();
		
		System.out.print("Enter a dictionary file:");
		String dictFile = scanner.nextLine();
		//Create string file for the scanner input
		File text = new File(textFile);
		File dict = new File(dictFile);
		//Create file
		Scanner readtext = new Scanner(text);
		Scanner readdict = new Scanner(dict);
		//Scan the file 
		ArrayList<String> readText = new ArrayList<String>();
		ArrayList<String> readDict = new ArrayList<String>();
		//Store elements of files in the arraylist
		System.out.println("The missing words: ");
		//read dictionary file
		while(readdict.hasNext()) {
			readDict.add(readdict.nextLine());
		}
		//read test file and creat the method to compare word by word
		while(readtext.hasNext()) {
			
			String word = readtext.nextLine();
			
			boolean found = false;
			for(int i =0; i < readDict.size(); i++)
			{
				if (word.equals(readDict.get(i))){
					found = true;
					break;
				}
			}
			if (found==false) {
				System.out.println(word);
			}
			
		}
		//Another method to solve the problem
		//List<String> tempoList = new ArrayList<String>(readDict);
		//tempoList.removeAll(readText);
		
		//System.out.println("The missing words: ");
		//for(int i=0; i < tempoList.size();i++) {
			//System.out.println(tempoList.get(i));
		//}
	}
		
		
	
		
	}


