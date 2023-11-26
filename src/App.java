import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 20));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Number Guessing Game");
        frame.pack();
        frame.setVisible(true);



        Random  rand = new Random();

        Scanner scanner = new Scanner(System.in);

        // int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is " + randomNumber);

        int tryCount = 0;

        
        System.out.println("Between 1 and what number do you want to play?:  (For example 100, 150, 200, 2000)");
        int playerNum = scanner.nextInt();

        int randomNumber = rand.nextInt(playerNum) + 1;
        // System.out.println("Random number is " + randomNumber);

        int g = -1;
        while(g < 0){
            String firstInput = JOptionPane.showInputDialog("Between 1 and what number do you want to play?: (For example 100, 150, 200, 2000)");
            if(firstInput.length() > 0){
                g++;
                System.out.println("Thank you!");
            }else{
                System.out.println("Please enter a number!");
            }
        }

        //         String secondInput = JOptionPane.showInputDialog("Enter your guess");
        //     }else{
        //         String thirdInput = JOptionPane.showInputDialog("Please enter a guess to continue");
        //     }  

        // }
        
        
        while(true){

           

            // System.out.println("Enter your guess (1-100):");
            System.out.println("Enter your guess (1-" + playerNum + "):");

            
        
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (tryCount == 6){
                System.out.println("It took too many tries.  The number I was thinking of was " + randomNumber + "!" + " You LOSE!");
                break;
            }

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if(randomNumber > playerGuess){
                System.out.println("Nope! The number is higher.  Guess again.");
            }
            else {
                System.out.println("Nope!  The number is lower.  Guess again.");
            }
        }
        
    }
}
