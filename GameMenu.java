import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameMenu extends JFrame implements ActionListener {

    private JButton pongButton, guessButton, warButton, demoButton;

    public GameMenu() {
        setTitle("Game Menu");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));
        
        pongButton = new JButton("Pong");
        pongButton.addActionListener(this);
        add(pongButton);
        
        guessButton = new JButton("Guess the Number");
        guessButton.addActionListener(this);
        add(guessButton);
        
        warButton = new JButton("War");
        warButton.addActionListener(this);
        add(warButton);
        
        demoButton = new JButton("Game Demo");
        demoButton.addActionListener(this);
        add(demoButton);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pongButton) {
            Pong pong = new Pong();
            pong.start();
        } else if (e.getSource() == guessButton) {
            GuessTheNumber guess = new GuessTheNumber();
            guess.start();
        } else if (e.getSource() == warButton) {
            War war = new War();
            war.start();
        } else if (e.getSource() == demoButton) {
            GameDemo demo = new GameDemo();
            demo.start();
        }
        setVisible(false);
        }
    }

    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
    }
}
