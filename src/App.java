import model.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            List<String> names = List.of("Alice", "Bob", "Charlie", "Diana");
            GameLogic game = new GameLogic(names);

            JFrame frame = new JFrame("Tarot Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JTextArea textArea = new JTextArea();
            for (Player player : game.getPlayers()) {
                textArea.append(player.getName() + " has: \n");
                for (Card card : player.getHand()) {
                    textArea.append(" - " + card + "\n");
                }
                textArea.append("\n");
            }

            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
