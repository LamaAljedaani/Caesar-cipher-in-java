/*
 TASK 1
 Lama Aljedaani
 Thank you for this amazing challenge !!
 */

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("Welcome to Java Programming Camp!");
		System.out.println("----------------------------------");
		
		char letter[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char LETTER[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your massage: ");
		String word = scan.nextLine();
			
		char[] charArray = word.toCharArray();
		int NumberofCells = 0;
		for (var c : charArray) {
			NumberofCells = NumberofCells + 1;
		}

		
		for (int i = 0; i< NumberofCells; i++)
		{
			for (int j = 0; j< 26; j++)
			{
				if (j >= 21 & charArray[i] == letter[j])
				{
					int rem = (j % 20) - 1;
					charArray[i] = letter[rem];
					break;
				}
				
				else if (j >= 21 & charArray[i] == LETTER[j])
				{
					int rem = (j % 20) - 1;
					charArray[i] = LETTER[rem];
					break;
				}
				
				else if ( charArray[i] == letter[j])
				{
					 int number = j + 5;
					charArray[i] = letter[number];
					break;
				}
				
				else if ( charArray[i] == LETTER[j])
				{
					 int number = j + 5;
					charArray[i] = LETTER[number];
					break;
				}
			}
			
		}
		
		System.out.print("Coded massage: ");
		System.out.println(charArray);
		
	}

}
