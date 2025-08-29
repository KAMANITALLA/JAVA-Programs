package calculatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResistorColorCod extends JFrame {
    private JTextField resistanceInput;
    private JPanel resistorPanel;

    public ResistorColorCod() {
        setTitle("Code Couleur Résistor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        resistanceInput = new JTextField(5);
        JButton drawButton = new JButton("Dessiner Résistor");

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawResistor();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Entrer la résistance (ohms):"));
        inputPanel.add(resistanceInput);
        inputPanel.add(drawButton);

        resistorPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawResistorGraphics(g, 0, 0, getWidth(), getHeight());
            }
        };

        add(inputPanel, BorderLayout.NORTH);
        add(resistorPanel, BorderLayout.CENTER);
    }

    private void drawResistor() {
        resistorPanel.repaint();
    }

    private void drawResistorGraphics(Graphics g, int x, int y, int width, int height) {
        String resistanceValue = resistanceInput.getText();
        
        // Convert the resistance value to color bands
        Color[] colors = getColorBands(resistanceValue);

        // Draw the resistor body
        
//        g.setColor(Color.BLACK);
//        g.fillRect(10, 110, 100, 4);
//        g.setColor(Color.LIGHT_GRAY);
//        g.fillRect(110, 100, 150, 25);
//        g.setColor(Color.BLACK);
//        g.fillRect(260, 110, 110, 4);
//        
//        //Affichage des bandes de couleur
//        g.setColor(/*Color.GREEN*/colors[0]);
//        g.fillRect(125,100, 15, 25);
//        
//        g.setColor(/*Color.RED*/colors[1]);
//        g.fillRect(155,100, 15, 25);
//        
//        g.setColor(/*Color.YELLOW*/colors[2]);
//        g.fillRect(185,100, 15, 25);
//        
//        g.setColor(/*Color.ORANGE*/colors[3]);
//        g.fillRect(215,100, 15, 25);
        
        g.setColor(Color.GRAY);
        g.fillRect(x + width / 4, y + height / 2 - 10, width / 2, 20);

        // Draw the color bands
        for (int i = 0; i < colors.length; i++) {
            g.setColor(colors[i]);
            g.fillRect(x + width / 4 - (15 * (colors.length - i)), y + height / 2 - 10, 15, 20); // Left side bands
//            g.fillRect(x + width * 3 / 4 + (15 * i), y + height / 2 - 10, 15, 20); // Right side bands
        }

        // Display the resistance value below the resistor
        g.setColor(Color.BLACK);
        g.drawString("Résistance: " + resistanceValue + " ohms", x + width / 4 - (15 * colors.length), y + height / 2 + 30);
    }

    private Color[] getColorBands(String resistanceValue) {
        Color[] colors = new Color[4];

        try {
            int value = Integer.parseInt(resistanceValue);
            // Simplified logic for color mapping
            if (value < 1000) {
                colors[0] = Color.RED;   // First digit color
                colors[1] = Color.BLUE;  // Second digit color
                colors[2] = Color.GREEN; // Multiplier color
                colors[3] = Color.YELLOW; // Tolerance color
            } else {
                // Handle larger values (this is just an example)
                colors[0] = Color.BLACK;
                colors[1] = Color.ORANGE;
                colors[2] = Color.CYAN;
                colors[3] = Color.MAGENTA;
            }
        } catch (NumberFormatException e) {
            // Default color bands in case of invalid input
            colors[0] = Color.WHITE;
            colors[1] = Color.WHITE;
            colors[2] = Color.WHITE;
            colors[3] = Color.WHITE;
        }

        return colors;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ResistorColorCod frame = new ResistorColorCod();
            frame.setVisible(true);
        });
    }
}
