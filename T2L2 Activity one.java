import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    String userInput = " ";
    String stop = "STOP";
    System.out.println("Please enter words, enter STOP to stop the loop.");
    ArrayList <String> words = new ArrayList <String> ();
    while(!userInput.equals(stop))
    {
      userInput = scan.nextLine();
      words.add(userInput);
    }
    for(int i = 0; i < words.size(); i++)
    {
      for(int n = 0; n < words.get(i).length(); n++)
      {
        if(n == words.get(i).length() - 1)
        {
          if(words.get(i).substring(n) == "a")
          {
             System.out.println(words.get(i));
          }
        }
        else
        {
           if(words.get(i).substring(n, n+1) == "a")
           {
              System.out.println(words.get(i));
           }
        }
      }
    }
  }
}
