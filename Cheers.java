


public class Cheers {
        public static void main(String[] args) {

        String letter = args[0];
        int number = Integer.parseInt(args[1]);
        int length = letter.length();

        for (int i=0; i<length; i++)
        {
                char bigLetter = Character.toUpperCase(letter.charAt(i));
                if (bigLetter == 'A' || bigLetter == 'E' || bigLetter == 'F' || bigLetter == 'H' || bigLetter == 'I' || bigLetter == 'L' || bigLetter == 'N' || bigLetter == 'M' || bigLetter == 'O' || bigLetter == 'R' || bigLetter == 'S' || bigLetter == 'X' )
                        System.out.println("Give me an " + bigLetter + ": " + bigLetter + "!");
                else
                          System.out.println("Give me a  " + bigLetter + ": " + bigLetter + "!");
        }
        System.out.println("what does that spell?");
                        
         for (int j=0; j<number; j++)
         {
                 System.out.println(letter.toUpperCase() + "!!!");
         }
        }




 }

