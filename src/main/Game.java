/*
 This class is going to consist of the game loop that would manage everything!
*/

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

// customs
import GameMechanics.BackgroundChooser;

public class Game {
    public static void refresh(JFrame frame) {
        // just a method that setSize xd
        frame.setSize(1279, 719);
        frame.setSize(1280, 720);
    }

    public static void main(String[] args) {
        // start running the game loop right here.

        // first create JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        frame.setTitle("Java Platformer");

        // layout
        frame.setLayout(new BorderLayout());

        // set the background
        // the Background class will manage changing the background image.
        // We can just set the background here.

        // BackgroundChooser: get Image for convienience.
        BackgroundChooser backgroundChooser
        = new BackgroundChooser(1280, 720, "../../assets/images/");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setIcon(
            backgroundChooser.getImage("xenoblade_copypasta_background.png")
        );
        frame.setContentPane(backgroundLabel);
        refresh(frame);
    }
}
