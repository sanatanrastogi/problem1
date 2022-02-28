import java.util.*;
import java.util.regex.*;
public class Problem1
{
  public static void main (String[]args)
  {
    List < String > list = new ArrayList < String > (); // List of String
    list.add ("The patient should be informed of his therapeutic options.");
    list.add ("It wouldn't be as if the lone astronaut would be completely by himself.");
    list.add ("Now, a writer is entitled to have a Roget on his desk.");
    list.add ("Somebody should let you borrow their book");
    list.add ("From the earliest times until about the 1960s");
    list.add ("whether we may not, nay ought not, to use a neutral pronoun relative");
    list.add ("phone 9280018281");
    list.add ("Notionalplurality");
    list.add ("A starting point would be to give more support");
    list.add ("abc@gmail.com");
    List < String > reg = new ArrayList < String > ();  // List of Regex
    reg.add (".*\\.$");
    reg.add (".*\\d{10}.*");
    reg.add (".*@.*");
    reg.add ("\\w+");
    reg.add (".*\\s.*");
    for (int i = 0; i < reg.size (); i++)
      {
	for (int j = 0; j < list.size (); j++)
	  {
	    if (Pattern.matches (reg.get (i), list.get (j))) //comparing rgrgex with String
	      {
		System.out.print ("String: ");
		System.out.print (j + 1);
		System.out.print (" matches regex: ");
		System.out.println (i + 1);
	      }
	  }
      }
  }
}