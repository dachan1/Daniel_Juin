package daniel_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File1 {

	 public static void main(String[] args) {
	    	FileReader ficALire;
	    	BufferedReader entree;
	    	char c; int compteur=0;
	    	
	    	
	    	try {
	    		ficALire = new FileReader("/Users/dachan/desktop/monFichier.txt");
	    		entree = new BufferedReader (ficALire);
	    		while (entree.ready())
	    		{
	    			c=(char) entree.read();
		    		if(c=='a')
		    		{
		    			compteur++;
		    		}	
	    		}
	    		
	    		System.out.println(compteur);
	    		entree.close();
	    		ficALire.close();
	    	} catch (FileNotFoundException e) {
	    		System.out.println("Le fichier ne peut pas être lu");
	    		e.printStackTrace();
	    	} catch (IOException ioe) {
	    		System.out.println("Le fichier ne peut pas être lu");
	    		ioe.printStackTrace();
	    	}
	
	
}

		   
		    }