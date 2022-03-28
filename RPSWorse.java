import java.util.*;
import static java.lang.System.*;

public class RPSWorse
{
    // 0 = rock, 1 = paper, 2 = scissors
    Scanner kb = new Scanner(System.in);
    private String playChoice;
    private String compChoice;
    int playCh;
    int compCh = (int)(Math.random() * 3);

    public RPSWorse(String player)
    {
        playChoice = player;
    }

    public RPSWorse()
    {
        playChoice = compChoice = "";
    }

    public String determineWinner() // at most 6 comparisons might be required 
    {
        String winner = "The winner is ";
        
        if (playCh == 0 && compCh == 2)
        {
            winner = winner + "you since " + playChoice + " breaks " + compChoice + ".";
        }
        else if (compCh == 0 && playCh == 2)
        {
            winner = winner + "the computer since " + compChoice + " breaks " + playChoice + ".";
        }
        else if (playCh > compCh)
        {
            winner = winner + "you since ";
            
            if (playCh == 1 && compCh == 0)
            {
                winner = winner + playChoice + " covers " + compChoice + ".";
            }
            else
            {
                winner = winner + playChoice + " cuts " + compChoice + ".";
            }
        }
        else if (compCh > playCh)
        {
            winner = winner + "the computer since ";
            
            if (compCh == 1 && playCh == 0)
            {
                winner = winner + compChoice + " covers " + playChoice + ".";
            }
            else
            {
                winner = winner + compChoice + " cuts " + playChoice + ".";
            }
        }
        else if (playCh == compCh)
        {
            winner = "It's a tie since " + playChoice + " does not beat " + compChoice + ".";
        }

        return winner;
    }
    
    public String determineWinner2() // at most 14 comparisons might be required
    {
        String winner = "The winner is ";
        
        if (playChoice.equals("rock") && compChoice.equals("scissor") || playChoice.equals("paper") && compChoice.equals("rock") || playChoice.equals("scissor") && compChoice.equals("paper"))
        {
            winner = winner + "you since ";
            
            if (playChoice.equals("rock"))
            {
                winner = winner + playChoice + " breaks " + compChoice + ".";
            }
            else if (playChoice.equals("paper"))
            {
                winner = winner + playChoice + " covers " + compChoice + ".";
            }
            else
            {
                winner = winner + playChoice + " cuts " + compChoice + ".";
            }
        }
        else if (compChoice.equals("rock") && playChoice.equals("scissor") || compChoice.equals("paper") && playChoice.equals("rock") || compChoice.equals("scissor") && playChoice.equals("paper"))
        {
            winner = winner + "the computer since ";
            
            if (compChoice.equals("rock"))
            {
                winner = winner + compChoice + " breaks " + playChoice + ".";
            }
            else if (compChoice.equals("paper"))
            {
                winner = winner + compChoice + " covers " + playChoice + ".";
            }
            else
            {
                winner = winner + compChoice + " cuts " + playChoice + ".";
            }
        }
        else
        {
            winner = "It's a tie since " + playChoice + " does not beat " + compChoice + ".";
        }

        return winner;
    }
    
    public String determineWinner3()
    {
        
    }

    public String toString()
    {
        switch(compCh)
        {
            case 0:
                compChoice = "rock";
                break;
            case 1:
                compChoice = "paper";
                break;
            case 2:
                compChoice = "scissor";
                break;
        }
        
        boolean strIn = true;
        String output = "You chose ";

        while (strIn)
        {
            switch(playChoice)
            {
                case "R":
                case "r":
                    playChoice = "rock";
                    playCh = 0;
                    strIn = false;
                    break;
                case "P":
                case "p":
                    playChoice = "paper";
                    playCh = 1;
                    strIn = false;
                    break;
                case "S":
                case "s":
                    playChoice = "scissor";
                    playCh = 2;
                    strIn = false;
                    break;
                default:
                    System.out.println("Please enter R, P, or S: ");
                    playChoice = kb.nextLine();
            }
        }

        output = output + playChoice + ". The computer chose " + compChoice + ".";

        return output;
    }
}
