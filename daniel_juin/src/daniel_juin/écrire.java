package daniel_juin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class écrire {

	public static void main(String[] args) {
		String Fichier="/Users/dachan/desktop/Ecrire.txt";
		final String s1="autre texte";
		final String s2="\nécrire et bous faire comprendre";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		try
		{
			ficAEcrire=new FileWriter(Fichier, true);
			sortie= new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
			
			
		}catch(IOException ioe)
		{
			System.out.println("Erreur entrée/sortie");
		}
		

	}

}
