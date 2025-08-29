package calculatrice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ResistorColor extends JFrame{
    //JFrame fen;
    private JTextField resistanceValue;
    private JPanel zoneDeDessin;
    
    public ResistorColor(){
        initialisationComposents();
    }
    
    private void initialisationComposents() {
        setTitle("Code de couleur 1.0");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        resistanceValue=new JTextField(8);
        JButton drawButton = new JButton("AFFICHER");
        
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawResistor();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Entrer la résistance (ohms):"));
        inputPanel.add(resistanceValue);
        inputPanel.add(drawButton);

        zoneDeDessin = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawResistorGraphics(g, 0, 0, getWidth(), getHeight());
            }
        };

        add(inputPanel, BorderLayout.NORTH);
        add(zoneDeDessin,BorderLayout.CENTER);
    }
    
    private void drawResistor() {
        zoneDeDessin.repaint();
    }
    
    private void drawResistorGraphics(Graphics g, int x, int y, int width, int height) {
        String resistValue = resistanceValue.getText();
        
        // Convert the resistance value to color bands
        Color[] colors = getColorBands(resistValue);

        
        // Draw the resistor body
        g.setColor(Color.BLACK);
        g.fillRect(10, 110, 100, 4);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(110, 100, 150, 25);
        g.setColor(Color.BLACK);
        g.fillRect(260, 110, 110, 4);
        
        //Affichage des bandes de couleur
        g.setColor(/*Color.GREEN*/colors[0]);
        g.fillRect(125,100, 15, 25);
        
        g.setColor(/*Color.RED*/colors[1]);
        g.fillRect(155,100, 15, 25);
        
        g.setColor(/*Color.YELLOW*/colors[2]);
        g.fillRect(185,100, 15, 25);
        
        g.setColor(/*Color.ORANGE*/colors[3]);
        g.fillRect(215,100, 15, 25);

        // Display the resistance value below the resistor
        g.setColor(Color.BLACK);
        g.drawString("Résistance: " + resistValue + " ohms", 90,140);
    }
    
    private Color[] getColorBands(String resistanceVal) {
        Color[] colors = new Color[4];
        
        try {
            Color[] lcol={Color.BLACK,Color.getHSBColor(0, 59, 41)/*.marroon*/,Color.RED,Color.orange,Color.YELLOW,Color.green,Color.blue,
            Color.getHSBColor(300, 100, 25)/*.purple*/,Color.LIGHT_GRAY,Color.WHITE};
            int value = Integer.parseInt(resistanceVal);//conversion de la valeur en entier
            char[] v=String.valueOf(value).toCharArray();//segmentation en tableau de caracteres
            // conversion de la resistance en couleur
            for(int i=0;i<lcol.length;i++){
                if(v[0]-'0'==i){
                    colors[0]=lcol[i];//Affectation de la couleur au 1er anneau
                }
                if(v[1]-'1'==i){
                    colors[1]=lcol[i];//Affectation de la couleur au 2e anneau
                }
                if(v.length-2==i){
                    colors[2]=lcol[i];//Affectation de la couleur au 3e anneau
                }
                //couleur de l'anneau de tolerance
                
                colors[3]=getCouleurIncertitude(getIncertitude(Double.parseDouble(resistanceVal)));
                
                
            }      
        } catch (NumberFormatException e) {
            // Default color bands in case of invalid input
            colors[0] = Color.GRAY;
            colors[1] = Color.GRAY;
            colors[2] = Color.GRAY;
            colors[3] = Color.GRAY;
        }

        return colors;
    }
    
    public static double getIncertitude(double resistance) {
        // La formule pour calculer l'incertitude est la suivante :
        // incertitude = (valeur maximale - valeur minimale) / 2
        // On suppose que la valeur maximale et minimale sont définies par la norme EIA.
        double valeurMaximale = resistance * 1.1; // 10% de plus que la valeur nominale
        double valeurMinimale = resistance * 0.9; // 10% de moins que la valeur nominale
        double incertitude = (valeurMaximale - valeurMinimale) / 2;
        return incertitude;
    }
    
    public static Color getCouleurIncertitude(double incertitude) {
        if (incertitude <= 0.05) {
            return Color.orange;
        } else if (incertitude <= 0.1) {
            return Color.getHSBColor(300, 100, 25)/*.purple*/;
        } else if (incertitude <= 0.25) {
            return Color.BLUE;
        } else if (incertitude <= 0.5) {
            return Color.green;
        } else if (incertitude <= 1) {
            return Color.getHSBColor(0, 59, 41)/*.marroon*/;
        } else if (incertitude <= 2) {
            return Color.red;
        } else {
            return Color.GRAY;
        }
    }
    
    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResistorColor().setVisible(true);
            }
        });
    }
}