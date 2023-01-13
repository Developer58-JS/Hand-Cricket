import java.util.*;

public class Cricket
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Hand Cricket!");
        System.out.println("If you haven't, please read the README file in the github page for all the instructions.");
        System.out.println();
        
        System.out.println("Pick either 'odd' or 'even'");
        String toss = sc.next();
        
        int min = 1;
        int max = 6;
        
        switch (toss)
        {
            case "odd":
                System.out.println("Thank you, for chosing odd. Now pick a number between 1 and 6");
                int tossValue = sc.nextInt();
                int aiTossValue = rand.nextInt((max - min) + 1) + min;
                if (tossValue < 7)
                {
                    if ((tossValue+aiTossValue)%2!=0)
                    {
                        System.out.println("The AI picked " + aiTossValue);
                        System.out.println("You have won the toss!");
                        System.out.println();
                        System.out.println("Would you like to bat or bowl?");
                        String gameChoice = sc.next();
                        System.out.println();
                        switch (gameChoice)
                        {
                            case "bat":
                                System.out.println("You will bat first");
                                System.out.println();
                                int playerWickets;
                                int aiWickets;
                                int playerScore = 0;
                                int aiScore = 0;
                                int playerBalls = 1;
                                int aiBalls = 1;
                                
                                for (playerWickets = 0; playerWickets < 1; playerBalls++)
                                {
                                    System.out.println("Input your number");
                                    int userRuns = sc.nextInt();
                                    int aiRuns = rand.nextInt((max - min) + 1) + min;
                                    if ((userRuns > 0)&&(userRuns < 7))
                                    {
                                        if (userRuns!=aiRuns)
                                        {
                                            playerScore += userRuns;
                                        }
                                        else
                                        {
                                            playerWickets++;
                                        }
                                    }
                                    
                                    System.out.println();
                                    System.out.println("Player's score: " + playerScore);
                                    System.out.println("No. of Wickets: " + playerWickets);
                                    System.out.println("No. of balls: " + playerBalls);
                                    System.out.println();
                                    
                                    if (playerWickets==1)
                                    {
                                        System.out.println("Your innings have commenced, now its your turn to defend this score");
                                        System.out.println();
                                        for (aiWickets = 0; aiWickets < 1; aiBalls++)
                                        {
                                            System.out.println("Input your number");
                                            int userRuns1 = sc.nextInt();
                                            int aiRuns1 = rand.nextInt((max - min) + 1) + min;
                                            
                                            if ((userRuns1 > 0)&&(userRuns1 < 7))
                                            {
                                                if (userRuns1!=aiRuns1)
                                                {
                                                    aiScore += aiRuns1;
                                                }
                                                else
                                                {
                                                    aiWickets++;
                                                    System.out.println();
                                                    System.out.println("AI's Score: " + aiScore);
                                                    System.out.println("No. of Wickets: " + aiWickets);
                                                    System.out.println("No. of balls: " + aiBalls);
                                                    System.out.println();
                                                    if (aiScore < playerScore)
                                                    {
                                                       System.out.println("You win"); 
                                                    }
                                                    else if (aiScore==playerScore)
                                                    {
                                                        System.out.println("It's a tie");
                                                    }
                                                    break;
                                                }
                                            }
                                            
                                            System.out.println();
                                            System.out.println("AI's Score: " + aiScore);
                                            System.out.println("No. of Wickets: " + aiWickets);
                                            System.out.println("No. of balls: " + aiBalls);
                                            System.out.println();
                                            
                                            if (aiScore>playerScore)
                                            {
                                                System.out.println("You lose");
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                        
                            case "bowl":
                                System.out.println("You will bowl first");
                                System.out.println();
                                int playerWickets2;
                                int aiWickets2;
                                int playerScore2 = 0;
                                int aiScore2 = 0;
                                int playerBalls2 = 1;
                                int aiBalls2 = 1;
                                
                                for (aiWickets2 = 0; aiWickets2 < 1; aiBalls2++)
                                {
                                    System.out.println("Input your number");
                                    int userRuns2 = sc.nextInt();
                                    int aiRuns2 = rand.nextInt((max - min) + 1) + min;
                                    
                                    if ((userRuns2 > 0)&&(userRuns2 < 7))
                                    {
                                        if (userRuns2!=aiRuns2)
                                        {
                                            aiScore2 += aiRuns2;
                                        }
                                        else
                                        {
                                            aiWickets2++;
                                        }
                                    }
                                    
                                    System.out.println();
                                    System.out.println("AI's score: " + aiScore2);
                                    System.out.println("No. of Wickets: " + aiWickets2);
                                    System.out.println("No. of balls: " + aiBalls2);
                                    System.out.println();
                                    
                                    if (aiWickets2==1)
                                    {
                                        System.out.println("The AI's innings have commenced, now its their turn to defend this score");
                                        for (playerWickets2 = 0; playerWickets2 < 1; playerBalls2++)
                                        {
                                            System.out.println("Input your number");
                                            int playerRuns3 = sc.nextInt(); 
                                            int aiRuns3 = rand.nextInt((max - min) + 1) + min;
                                            
                                            if ((playerRuns3 > 0)&&(playerRuns3 < 7))
                                            {
                                                playerScore2 += playerRuns3;
                                            }
                                            else
                                            {
                                                playerWickets2++;
                                                System.out.println();
                                                System.out.println("Player's Score: " + playerScore2);
                                                System.out.println("No. of Wickets: " + playerWickets2);
                                                System.out.println("No. of balls: " + playerBalls2);
                                                System.out.println();
                                                if (playerScore2 < aiScore2)
                                                {
                                                   System.out.println("You lose"); 
                                                }
                                                else if (playerScore2==aiScore2)
                                                {
                                                    System.out.println("It's a tie");
                                                }
                                                break;
                                            }
                                            
                                            System.out.println();
                                            System.out.println("Player's Score: " + playerScore2);
                                            System.out.println("No. of Wickets: " + playerWickets2);
                                            System.out.println("No. of balls: " + playerBalls2);
                                            System.out.println();
                                            
                                            if (playerScore2 > aiScore2)
                                            {
                                                System.out.println("You win");
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            
                            default:
                                System.out.println("Error. Please restart the process, dont use caps at all at this choice.");
                        }
                    }
                    else if ((tossValue+aiTossValue)%2==0)
                    {
                        System.out.println("The AI picked " + aiTossValue);
                        System.out.println("You have lost the toss!");
                        System.out.println();
                        if (tossValue>3)
                        {
                            System.out.println("The AI choses to bat first");
                            System.out.println();
                            System.out.println("You will bowl first");
                            System.out.println();
                            int playerWickets2;
                            int aiWickets2;
                            int playerScore2 = 0;
                            int aiScore2 = 0;
                            int playerBalls2 = 1;
                            int aiBalls2 = 1;
                                
                            for (aiWickets2 = 0; aiWickets2 < 1; aiBalls2++)
                            {
                                System.out.println("Input your number");
                                int userRuns2 = sc.nextInt();
                                int aiRuns2 = rand.nextInt((max - min) + 1) + min;
                                    
                                if ((userRuns2 > 0)&&(userRuns2 < 7))
                                {
                                    if (userRuns2!=aiRuns2)
                                    {
                                        aiScore2 += aiRuns2;
                                    }
                                    else
                                    {
                                        aiWickets2++;
                                    }
                                }
                                    
                                System.out.println();
                                System.out.println("AI's score: " + aiScore2);
                                System.out.println("No. of Wickets: " + aiWickets2);
                                System.out.println("No. of balls: " + aiBalls2);
                                 System.out.println();
                                    
                                if (aiWickets2==1)
                                {
                                    System.out.println("The AI's innings have commenced, now its their turn to defend this score");
                                    for (playerWickets2 = 0; playerWickets2 < 1; playerBalls2++)
                                    {
                                        System.out.println("Input your number");
                                        int playerRuns3 = sc.nextInt(); 
                                        int aiRuns3 = rand.nextInt((max - min) + 1) + min;
                                            
                                        if ((playerRuns3 > 0)&&(playerRuns3 < 7))
                                        {
                                            playerScore2 += playerRuns3;
                                        }
                                        else
                                        {
                                            playerWickets2++;
                                            System.out.println();
                                            System.out.println("Player's Score: " + playerScore2);
                                            System.out.println("No. of Wickets: " + playerWickets2);
                                            System.out.println("No. of balls: " + playerBalls2);
                                            System.out.println();
                                            if (playerScore2 < aiScore2)
                                            {
                                                System.out.println("You lose"); 
                                            }
                                            else if (playerScore2==aiScore2)
                                            {
                                                System.out.println("It's a tie");
                                            }
                                            break;
                                            }
                                            
                                        System.out.println();
                                        System.out.println("Player's Score: " + playerScore2);
                                        System.out.println("No. of Wickets: " + playerWickets2);
                                        System.out.println("No. of balls: " + playerBalls2);
                                        System.out.println();
                                            
                                        if (playerScore2 > aiScore2)
                                        {
                                            System.out.println("You win");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("The AI choses to bowl first");
                            System.out.println();
                            System.out.println("You will bat first");
                            System.out.println();
                            int playerWickets;
                            int aiWickets;
                            int playerScore = 0;
                            int aiScore = 0;
                            int playerBalls = 1;
                            int aiBalls = 1;
                                
                            for (playerWickets = 0; playerWickets < 1; playerBalls++)
                            {
                                System.out.println("Input your number");
                                int userRuns = sc.nextInt();
                                int aiRuns = rand.nextInt((max - min) + 1) + min;
                                if ((userRuns > 0)&&(userRuns < 7))
                                {
                                    if (userRuns!=aiRuns)
                                    {
                                        playerScore += userRuns;
                                    }
                                    else
                                    {
                                        playerWickets++;
                                    }
                                }
                                    
                                System.out.println();
                                System.out.println("Player's score: " + playerScore);
                                System.out.println("No. of Wickets: " + playerWickets);
                                System.out.println("No. of balls: " + playerBalls);
                                System.out.println();
                                    
                                if (playerWickets==1)
                                {
                                    System.out.println("Your innings have commenced, now its your turn to defend this score");
                                    System.out.println();
                                    for (aiWickets = 0; aiWickets < 1; aiBalls++)
                                    {
                                        System.out.println("Input your number");
                                        int userRuns1 = sc.nextInt();
                                        int aiRuns1 = rand.nextInt((max - min) + 1) + min;
                                            
                                        if ((userRuns1 > 0)&&(userRuns1 < 7))
                                        {
                                            if (userRuns1!=aiRuns1)
                                            {
                                                aiScore += aiRuns1;
                                            }
                                            else
                                            {
                                                aiWickets++;
                                                System.out.println();
                                                System.out.println("AI's Score: " + aiScore);
                                                System.out.println("No. of Wickets: " + aiWickets);
                                                System.out.println("No. of balls: " + aiBalls);
                                                System.out.println();
                                                if (aiScore < playerScore)
                                                {
                                                    System.out.println("You win"); 
                                                }
                                                else if (aiScore==playerScore)
                                                {
                                                    System.out.println("It's a tie");
                                                }
                                                break;
                                                }
                                        }
                                            
                                        System.out.println();
                                        System.out.println("AI's Score: " + aiScore);
                                        System.out.println("No. of Wickets: " + aiWickets);
                                        System.out.println("No. of balls: " + aiBalls);
                                        System.out.println();
                                            
                                        if (aiScore>playerScore)
                                        {
                                            System.out.println("You lose");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            
            case "even":
                System.out.println("Thank you, for chosing even. Now pick a number between 1 and 6");
                int tossValue1 = sc.nextInt();
                int aiTossValue1 = rand.nextInt((max - min) + 1) + min;
                
                if (tossValue1 < 7)
                {
                    if ((tossValue1+aiTossValue1)%2==0)
                    {
                        System.out.println("The AI picked " + aiTossValue1);
                        System.out.println("You have won the toss!");
                        System.out.println();
                        System.out.println("Would you like to bat or bowl?");
                        String gameChoice = sc.next();
                        System.out.println();
                        switch (gameChoice)
                        {
                            case "bat":
                                System.out.println("You will bat first");
                                System.out.println();
                                int playerWickets;
                                int aiWickets;
                                int playerScore = 0;
                                int aiScore = 0;
                                int playerBalls = 1;
                                int aiBalls = 1;
                                
                                for (playerWickets = 0; playerWickets < 1; playerBalls++)
                                {
                                    System.out.println("Input your number");
                                    int userRuns = sc.nextInt();
                                    int aiRuns = rand.nextInt((max - min) + 1) + min;
                                    if ((userRuns > 0)&&(userRuns < 7))
                                    {
                                        if (userRuns!=aiRuns)
                                        {
                                            playerScore += userRuns;
                                        }
                                        else
                                        {
                                            playerWickets++;
                                        }
                                    }
                                    
                                    System.out.println();
                                    System.out.println("Player's score: " + playerScore);
                                    System.out.println("No. of Wickets: " + playerWickets);
                                    System.out.println("No. of balls: " + playerBalls);
                                    System.out.println();
                                    
                                    if (playerWickets==1)
                                    {
                                        System.out.println("Your innings have commenced, now its your turn to defend this score");
                                        System.out.println();
                                        for (aiWickets = 0; aiWickets < 1; aiBalls++)
                                        {
                                            System.out.println("Input your number");
                                            int userRuns1 = sc.nextInt();
                                            int aiRuns1 = rand.nextInt((max - min) + 1) + min;
                                            
                                            if ((userRuns1 > 0)&&(userRuns1 < 7))
                                            {
                                                if (userRuns1!=aiRuns1)
                                                {
                                                    aiScore += aiRuns1;
                                                }
                                                else
                                                {
                                                    aiWickets++;
                                                    System.out.println();
                                                    System.out.println("AI's Score: " + aiScore);
                                                    System.out.println("No. of Wickets: " + aiWickets);
                                                    System.out.println("No. of balls: " + aiBalls);
                                                    System.out.println();
                                                    if (aiScore < playerScore)
                                                    {
                                                       System.out.println("You win"); 
                                                    }
                                                    else if (aiScore==playerScore)
                                                    {
                                                        System.out.println("It's a tie");
                                                    }
                                                    break;
                                                }
                                            }
                                            
                                            System.out.println();
                                            System.out.println("AI's Score: " + aiScore);
                                            System.out.println("No. of Wickets: " + aiWickets);
                                            System.out.println("No. of balls: " + aiBalls);
                                            System.out.println();
                                            
                                            if (aiScore>playerScore)
                                            {
                                                System.out.println("You lose");
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                        
                            case "bowl":
                                System.out.println("You will bowl first");
                                System.out.println();
                                int playerWickets2;
                                int aiWickets2;
                                int playerScore2 = 0;
                                int aiScore2 = 0;
                                int playerBalls2 = 1;
                                int aiBalls2 = 1;
                                
                                for (aiWickets2 = 0; aiWickets2 < 1; aiBalls2++)
                                {
                                    System.out.println("Input your number");
                                    int userRuns2 = sc.nextInt();
                                    int aiRuns2 = rand.nextInt((max - min) + 1) + min;
                                    
                                    if ((userRuns2 > 0)&&(userRuns2 < 7))
                                    {
                                        if (userRuns2!=aiRuns2)
                                        {
                                            aiScore2 += aiRuns2;
                                        }
                                        else
                                        {
                                            aiWickets2++;
                                        }
                                    }
                                    
                                    System.out.println();
                                    System.out.println("AI's score: " + aiScore2);
                                    System.out.println("No. of Wickets: " + aiWickets2);
                                    System.out.println("No. of balls: " + aiBalls2);
                                    System.out.println();
                                    
                                    if (aiWickets2==1)
                                    {
                                        System.out.println("The AI's innings have commenced, now its their turn to defend this score");
                                        for (playerWickets2 = 0; playerWickets2 < 1; playerBalls2++)
                                        {
                                            System.out.println("Input your number");
                                            int playerRuns3 = sc.nextInt(); 
                                            int aiRuns3 = rand.nextInt((max - min) + 1) + min;
                                            
                                            if ((playerRuns3 > 0)&&(playerRuns3 < 7))
                                            {
                                                playerScore2 += playerRuns3;
                                            }
                                            else
                                            {
                                                playerWickets2++;
                                                System.out.println();
                                                System.out.println("Player's Score: " + playerScore2);
                                                System.out.println("No. of Wickets: " + playerWickets2);
                                                System.out.println("No. of balls: " + playerBalls2);
                                                System.out.println();
                                                if (playerScore2 < aiScore2)
                                                {
                                                   System.out.println("You lose"); 
                                                }
                                                else if (playerScore2==aiScore2)
                                                {
                                                    System.out.println("It's a tie");
                                                }
                                                break;
                                            }
                                            
                                            System.out.println();
                                            System.out.println("Player's Score: " + playerScore2);
                                            System.out.println("No. of Wickets: " + playerWickets2);
                                            System.out.println("No. of balls: " + playerBalls2);
                                            System.out.println();
                                            
                                            if (playerScore2 > aiScore2)
                                            {
                                                System.out.println("You win");
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            
                            default:
                                System.out.println("Error. Please restart the process, dont use caps at all at this choice.");
                        }
                    }
                    else if ((tossValue1+aiTossValue1)%2!=0)
                    {
                        System.out.println("The AI picked " + aiTossValue1);
                        System.out.println("You have lost the toss!");
                        System.out.println();
                        if (tossValue1>3)
                        {
                            System.out.println("The AI choses to bat first");
                            System.out.println();
                            System.out.println("You will bowl first");
                            System.out.println();
                            int playerWickets2;
                            int aiWickets2;
                            int playerScore2 = 0;
                            int aiScore2 = 0;
                            int playerBalls2 = 1;
                            int aiBalls2 = 1;
                                
                            for (aiWickets2 = 0; aiWickets2 < 1; aiBalls2++)
                            {
                                System.out.println("Input your number");
                                int userRuns2 = sc.nextInt();
                                int aiRuns2 = rand.nextInt((max - min) + 1) + min;
                                    
                                if ((userRuns2 > 0)&&(userRuns2 < 7))
                                {
                                    if (userRuns2!=aiRuns2)
                                    {
                                        aiScore2 += aiRuns2;
                                    }
                                    else
                                    {
                                        aiWickets2++;
                                    }
                                }
                                    
                                System.out.println();
                                System.out.println("AI's score: " + aiScore2);
                                System.out.println("No. of Wickets: " + aiWickets2);
                                System.out.println("No. of balls: " + aiBalls2);
                                 System.out.println();
                                    
                                if (aiWickets2==1)
                                {
                                    System.out.println("The AI's innings have commenced, now its their turn to defend this score");
                                    for (playerWickets2 = 0; playerWickets2 < 1; playerBalls2++)
                                    {
                                        System.out.println("Input your number");
                                        int playerRuns3 = sc.nextInt(); 
                                        int aiRuns3 = rand.nextInt((max - min) + 1) + min;
                                            
                                        if ((playerRuns3 > 0)&&(playerRuns3 < 7))
                                        {
                                            playerScore2 += playerRuns3;
                                        }
                                        else
                                        {
                                            playerWickets2++;
                                            System.out.println();
                                            System.out.println("Player's Score: " + playerScore2);
                                            System.out.println("No. of Wickets: " + playerWickets2);
                                            System.out.println("No. of balls: " + playerBalls2);
                                            System.out.println();
                                            if (playerScore2 < aiScore2)
                                            {
                                                System.out.println("You lose"); 
                                            }
                                            else if (playerScore2==aiScore2)
                                            {
                                                System.out.println("It's a tie");
                                            }
                                            break;
                                            }
                                            
                                        System.out.println();
                                        System.out.println("Player's Score: " + playerScore2);
                                        System.out.println("No. of Wickets: " + playerWickets2);
                                        System.out.println("No. of balls: " + playerBalls2);
                                        System.out.println();
                                            
                                        if (playerScore2 > aiScore2)
                                        {
                                            System.out.println("You win");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("The AI choses to bowl first");
                            System.out.println("The AI choses to bowl first");
                            System.out.println();
                            System.out.println("You will bat first");
                            System.out.println();
                            int playerWickets;
                            int aiWickets;
                            int playerScore = 0;
                            int aiScore = 0;
                            int playerBalls = 1;
                            int aiBalls = 1;
                                
                            for (playerWickets = 0; playerWickets < 1; playerBalls++)
                            {
                                System.out.println("Input your number");
                                int userRuns = sc.nextInt();
                                int aiRuns = rand.nextInt((max - min) + 1) + min;
                                if ((userRuns > 0)&&(userRuns < 7))
                                {
                                    if (userRuns!=aiRuns)
                                    {
                                        playerScore += userRuns;
                                    }
                                    else
                                    {
                                        playerWickets++;
                                    }
                                }
                                    
                                System.out.println();
                                System.out.println("Player's score: " + playerScore);
                                System.out.println("No. of Wickets: " + playerWickets);
                                System.out.println("No. of balls: " + playerBalls);
                                System.out.println();
                                    
                                if (playerWickets==1)
                                {
                                    System.out.println("Your innings have commenced, now its your turn to defend this score");
                                    System.out.println();
                                    for (aiWickets = 0; aiWickets < 1; aiBalls++)
                                    {
                                        System.out.println("Input your number");
                                        int userRuns1 = sc.nextInt();
                                        int aiRuns1 = rand.nextInt((max - min) + 1) + min;
                                            
                                        if ((userRuns1 > 0)&&(userRuns1 < 7))
                                        {
                                            if (userRuns1!=aiRuns1)
                                            {
                                                aiScore += aiRuns1;
                                            }
                                            else
                                            {
                                                aiWickets++;
                                                System.out.println();
                                                System.out.println("AI's Score: " + aiScore);
                                                System.out.println("No. of Wickets: " + aiWickets);
                                                System.out.println("No. of balls: " + aiBalls);
                                                System.out.println();
                                                if (aiScore < playerScore)
                                                {
                                                    System.out.println("You win"); 
                                                }
                                                else if (aiScore==playerScore)
                                                {
                                                    System.out.println("It's a tie");
                                                }
                                                break;
                                                }
                                        }
                                            
                                        System.out.println();
                                        System.out.println("AI's Score: " + aiScore);
                                        System.out.println("No. of Wickets: " + aiWickets);
                                        System.out.println("No. of balls: " + aiBalls);
                                        System.out.println();
                                            
                                        if (aiScore>playerScore)
                                        {
                                            System.out.println("You lose");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
                
            default:
                System.out.println("Stop behaving like Krishiv"); 
        }
    }
}
