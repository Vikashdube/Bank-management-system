
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame   implements ActionListener {

    JButton login  , signup  , clear ;
    JTextField cardTextField;
     JPasswordField  PinTextField;
    
    
Login(){
    setTitle("AUTOMATED TELLER MACHINE");
    
    setLayout(null);
    
 //   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
 //   Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
 //   ImageIcon i3 = new ImageIcon(i2);
 //   JLabel label =new JLabel(i3);
  //  label.setBounds(70, 30, 100, 100);
  //  add(label);
  
  ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atmm.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1400,700,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel image = new JLabel(i3);
             image.setBounds(0,0,1380,700);
             add(image);
    
  
    
    JLabel text =new JLabel("WELCOME TO ATM");
    text.setFont(new Font("Osward",Font.BOLD,80));
    text.setForeground(Color.WHITE);
    text.setBounds(340,40,800,60);
     image. add(text);
    
    JLabel CardNo =new JLabel("Card No ");
    CardNo.setFont(new Font("Osward",Font.BOLD,40));
    CardNo.setForeground(Color.WHITE);
    CardNo.setBounds(420,250,400,40);
    image. add(CardNo);
    
       cardTextField =new JTextField();
       cardTextField.setBounds(610,250,400,40);
       cardTextField.setBackground(Color.gray);
       cardTextField.setFont(new Font("Arial", Font.BOLD,24));
       image.  add(cardTextField);
               
           
    
    JLabel Pin =new JLabel("Enter Pin");
    Pin.setFont(new Font("Osward",Font.BOLD,40));
    Pin.setBounds(420,380,400,40);
    Pin.setForeground(Color.WHITE);
    image.add(Pin);
    
       PinTextField =new JPasswordField ();
       PinTextField.setBounds(610,380,400,33);
       PinTextField.setBackground(Color.GRAY);
       PinTextField.setFont(new Font("Arial", Font.BOLD,24));
     image.  add(PinTextField);
               
    
        login =new JButton("SING IN");
       login.setBounds(420,530,100,30);
       login.setBackground(Color.GREEN);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       image. add(login);
       
       
       clear =new JButton("CLIEAR");
       clear.setBounds(680,530,100,30);
       clear.setBackground(Color.RED);
       clear.setForeground(Color.WHITE);
       clear.addActionListener(this);
       image. add(clear);
       
       
       signup =new JButton("SIGN UP");
       signup.setBounds(900,530,100,30);
       signup.setBackground(Color.blue);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);
       image. add(signup);
       
       
    getContentPane().setBackground( Color.PINK);
    
    
    setSize(1600,1250);
    setVisible(true);
    setLocation(0,0);
}    

public void  actionPerformed(ActionEvent ae){
  
    
    
    
    
    
    
    
    if(ae.getSource()==clear){
        cardTextField.setText("");
        PinTextField.setText("");
    } else if(ae.getSource()==login){
        Conn conn = new Conn();
        String cardnumber = cardTextField.getText();
        String pinnumber = PinTextField.getText();
        String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
        
        try {
          ResultSet rs =  conn.s.executeQuery(query);
        if(rs.next()){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
            
        }
          
        } catch(Exception e)
                {
            System.out.println(e);
        }
        
    }else if(ae.getSource()==signup){
        
        setVisible(false);
        new SignupOne().setVisible(true);
    }
}



public static void main(String[]args){
    new Login();
}
}
