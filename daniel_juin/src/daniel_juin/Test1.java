package daniel_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		
		BufferedReader entree;
		String ligne;int compteur = 0;
		
		
		
		
			
			entree = new BufferedReader (new FileReader("monFichier.txt"));
			
			
			while (entree.ready())
			{
				ligne=entree.readLine();
				for (int i=0; i < ligne.length(); i++)
				if(ligne.charAt(i).contains("a"))
				{
					compteur++;
				}
				 
				System.out.print(compteur);
			}
			
			entree.close();
			
			
		
		}
		
		
		
	}


