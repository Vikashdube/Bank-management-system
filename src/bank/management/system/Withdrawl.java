
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl  extends JFrame implements ActionListener{
   
    JTextField amount ;
    JButton withdraw,back ;
   String pinnumber; 
    Withdrawl(String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1610,900,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel image = new JLabel(i3);
             image.setBounds(0,0,1380,700);
             add(image);
       
            JLabel text = new JLabel (" Enter the amount you want to withdraw");
            text.setForeground(Color.WHITE);
            text.setFont(new Font ("Raleway",Font.BOLD,20));
            text.setBounds(320,200,400,25);
            image.add(text);
             
            amount = new JTextField ();
            amount.setFont(new Font ("Raleway",Font.BOLD,20));
            amount.setBounds(310,250,400,30);
            image.add(amount);
            
           withdraw = new JButton ("Withdraw");
           withdraw.addActionListener(this);
           withdraw.setBounds(640,380,155,30);
           image.add(withdraw);
           
           back = new JButton ("Back");
           back.addActionListener(this);
           back.setBounds(640,415,155,30);
           back.setBackground(Color.GREEN);
           image.add(back);
            
             
         setSize(1610,1250);
        setLocation(0,0);
      //  setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== withdraw){
            String number = amount.getText();
            Date date = new Date();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                
            }else{
                try{
                    
               Conn conn = new Conn();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+number+"')";
               conn.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs" +number+"withdraw Successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
                    
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        else if (ae.getSource()==back){
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
        }
    }
    
    
    public static void main(String []args){
        new Withdrawl("");
    }
}
