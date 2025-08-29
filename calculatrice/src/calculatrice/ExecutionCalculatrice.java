/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatrice;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author GENERAL STORES
 */
public class ExecutionCalculatrice implements ActionListener{
    JFrame fenetre;
    JTextField afficheur;
    
    JButton[] number=new JButton[10];
    JButton[] function=new JButton[9];
    
    JButton add,sub,mul,div,Clr,neg,dec,equal,del;
    JPanel panel;//bloc de la fenetre
    
    Font myfont=new Font("Times New Roman",Font.BOLD,30);
    double num1=0,num2=0,result=0;
    char operator;
    
    public ExecutionCalculatrice(){
        fenetre= new JFrame("CALCULATRICE KARI :-)");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(420, 550);
        fenetre.setLayout(null);
        fenetre.setLocationRelativeTo(null);// pour que la fenetre s'ouvre au centre de l'ecran
        
        afficheur=new JTextField();//creation de l'afficheur
        afficheur.setBounds(50, 25, 300, 50);//son 
        afficheur.setFont(myfont);
        afficheur.setEditable(false);
      
        
        //creation/instanciation des boutons
        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        dec=new JButton(".");
        equal=new JButton("=");
        del=new JButton("DEL");
        Clr=new JButton("Clr");
        neg=new JButton("(-)");
        
        function[0]=add;
        function[1]=sub;
        function[2]=mul;
        function[3]=div;
        function[4]=dec;
        function[5]=equal;
        function[6]=del;
        function[7]=Clr;
        function[8]=neg;
        
        for(int i=0;i<9;i++){
            function[i].addActionListener(this);
            function[i].setFont(myfont);
            function[i].setFocusable(false);
        }
        for(int i=0;i<10;i++){
            number[i]=new JButton(String.valueOf(i));
            number[i].addActionListener(this);
            number[i].setFont(myfont);
            number[i].setFocusable(false);
        }
        
        neg.setBounds(50,430,100,50);
        del.setBounds(150,430,100,50);
        Clr.setBounds(250,430,100,50);
        
        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(number[1]);
        panel.add(number[2]);
        panel.add(number[3]);
        panel.add(add);
        panel.add(number[4]);
        panel.add(number[5]);
        panel.add(number[6]);
        panel.add(sub);
        panel.add(number[7]);
        panel.add(number[8]);
        panel.add(number[9]);
        panel.add(mul);
        panel.add(dec);
        panel.add(number[0]);
        panel.add(equal);
        panel.add(div);
        
        fenetre.add(panel);
        fenetre.add(neg);
        fenetre.add(del);
        fenetre.add(Clr);
        fenetre.add(afficheur);
        fenetre.setVisible(true);
         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource()==number[i]){
                afficheur.setText(afficheur.getText().concat(String.valueOf(i)));  
            }
        }
        if(e.getSource()==add){
            num1=Double.parseDouble(afficheur.getText());
            operator='+';
            afficheur.setText("");
        }
        if(e.getSource()==sub){
            num1=Double.parseDouble(afficheur.getText());
            operator='-';
            afficheur.setText("");
        }
        if(e.getSource()==mul){
            num1=Double.parseDouble(afficheur.getText());
            operator='*';
            afficheur.setText("");
        }
        if(e.getSource()==div){
            num1=Double.parseDouble(afficheur.getText());
            operator='/';
            afficheur.setText("");
        }
        if(e.getSource()==equal){
            num2=Double.parseDouble(afficheur.getText());
            switch(operator){
                case'+':
                    result=num1+num2;
                    break;
                case'-':
                    result=num1-num2;
                    break;
                case'*':
                    result=num1*num2;
                    break;
                case'/':
                    result=num1/num2;
                    break;
            }
            
            afficheur.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==Clr){
            afficheur.setText("");
        }
        if(e.getSource()==dec){
            afficheur.setText(afficheur.getText()+'.');
            
        }
        if(e.getSource()==del){
            String string=afficheur.getText();
            afficheur.setText("");
            
            for(int i=0;i<string.length()-1;i++){
                afficheur.setText(afficheur.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==neg){
            double inv=Double.parseDouble(afficheur.getText());
            inv *= (-1);
            afficheur.setText(String.valueOf(inv));
        }
        
    }
    
    public static void main(String[]args){
        ExecutionCalculatrice cal= new ExecutionCalculatrice();
    }
}
