import java.util.*;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean playing = true;

        while (playing)
        {
            boolean YorN = true;

            System.out.println("R. Rock\nP. Paper\nS. Scissor");
            System.out.println("Input letter from the list above: ");
            String inCh = kb.nextLine();

            RPSWorse myChoice = new RPSWorse(inCh);
            System.out.println(myChoice.toString());
            System.out.println(myChoice.determineWinner2());

            while (YorN)
            {
                System.out.println("Do you want to play again? Y or N ");
                String YesNo = kb.nextLine();

                if (YesNo.equalsIgnoreCase("n"))
                {
                    playing = false;
                    break;
                }
                else if (YesNo.equalsIgnoreCase("y"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please type either \"Y\" or \"N\"");
                }
            }
        }
    }
}