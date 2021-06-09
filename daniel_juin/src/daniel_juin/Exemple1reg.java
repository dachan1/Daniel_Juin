package daniel_juin;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exemple1reg {

	public static void main(String[] args) {
		Scanner crayon = new Scanner(System.in);
		
		//input est le texte dans lequel l'expression sera recherchée
		System.out.println("Inscirire le texte pour la recherche");
		String input = crayon.nextLine();
		//Expression à rechercher
		System.out.println("Incrire le texte recherhché");
		String regEx = crayon.nextLine();
		
		//étape 1
		Pattern pattern = Pattern.compile(regEx);
		
		//étape 2
		Matcher matcher = pattern.matcher(input);
		
		/*
		 * //étape 3 while(matcher.find()) { System.out.println("Le(s) mot(s) \"" +
		 * matcher.group() + "\" débute à l'indice " + matcher.start() +
		 * " et finit à l'indice " + matcher.end()); }
		 */
		
		/*
		 * if(matcher.matches()) { System.out.println("Les deux textes sont égaux"); }
		 * else { System.out.println("les deux textes sont différentes"); }
		 */
		
		if(matcher.lookingAt())
		{
			System.out.println("On a trouvé \"" + matcher.group ()
			+"\" commençant à l'indice " + matcher.start()
			+ " et finit à l'indice" + matcher.end());		}

	}

}
