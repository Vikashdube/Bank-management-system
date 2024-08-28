
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        
        JLabel l1 =new JLabel("Pase 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        l1.setBounds(450,50,800,40);
        add(l1);
        
        JLabel type =new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(210,140,200,30);
        add(type);
        
          r1 =new JRadioButton("Saving Account");
          r1.setFont(new Font("Raleway",Font.BOLD,17));
          r1.setBackground(Color.GRAY);
          r1.setBounds(210,180,150,25);
          add(r1);
        
          
          r2 =new JRadioButton("Fixed Deposite Account");
          r2.setFont(new Font("Raleway",Font.BOLD,17));
          r2.setBackground(Color.GRAY);
          r2.setBounds(420,180,250,25);
          add(r2);
          
          r3 =new JRadioButton("Current Account");
          r3.setFont(new Font("Raleway",Font.BOLD,17));
          r3.setBackground(Color.GRAY);
          r3.setBounds(700,180,200,25);
          add(r3);
        
          r4 =new JRadioButton("Recuring Deposite Account");
          r4.setFont(new Font("Raleway",Font.BOLD,17));
          r4.setBackground(Color.GRAY);
          r4.setBounds(900,180,250,25);
          add(r4);
          
            ButtonGroup groupaccount =new ButtonGroup();
            groupaccount.add(r1);
            groupaccount.add(r2);
            groupaccount.add(r3);
            groupaccount.add(r4);
            
          JLabel card =new JLabel("Card Number : ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(210,240,200,30);
        add(card);
          
         JLabel number =new JLabel("XXXX-XXXX-XXXX-5421");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(450,240,300,30);
        add(number);
            
        JLabel carddetail =new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(210,270,300,20);
        add(carddetail);
        
        
        JLabel pin =new JLabel("PIN Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(210,320,200,30);
        add(pin);
          
        JLabel pindetail =new JLabel("Your 4 Digit Card Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(210,350,300,20);
        add(pindetail);
        
        
         JLabel pnumber =new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(450,320,300,30);
        add(pnumber);
             
        JLabel services =new JLabel("Service Required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(210,410,200,30);
        add(services);
        
        c1 =new JCheckBox("ATM CARD");
        c1.setBackground(Color.GRAY);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(210,470,200,30);
        add(c1);
        
         c2 =new JCheckBox("Internet Banking");
        c2.setBackground(Color.GRAY);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(510,470,200,30);
        add(c2); 
        
         c3 =new JCheckBox("Mobile Banking");
        c3.setBackground(Color.GRAY);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(750,470,200,30);
        add(c3);
        

         c4 =new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.GRAY);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(210,520,200,30);
        add(c4);
        
        c5 =new JCheckBox("E-Statement");
        c5.setBackground(Color.GRAY);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(510,520,200,30);
        add(c5);
        
        c6 =new JCheckBox("Cheque Book");
        c6.setBackground(Color.GRAY);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(750,520,200,30);
        add(c6);
               
        c7 =new JCheckBox("I Here Declares that The Above Enter Details Are Correct To The Best Of My Knowlage ");
        
        c7.setBackground(Color.GRAY);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(210,560,600,30);
        add(c7);
        
        submit =new JButton ("Submit");
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font( "Raleway",Font.BOLD,14));
        submit.setBounds(460,620,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel =new JButton ("Cancel");
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font( "Raleway",Font.BOLD,14));
        cancel.setBounds(700,620,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        setSize(1600,1250);
        setLocation(0,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
              
            String accountType =null;
            if(r1.isSelected()){
                accountType ="Saving Account";
            }else if(r2.isSelected()){
                accountType ="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType ="Current Account";
            }else if(r4.isSelected()){
                accountType ="Reccuring Deposit Account";
            }
          Random random = new Random();
          String cardnumber =""+ Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
          
          String pinnumber = ""+Math.abs((random.nextLong() % 9000L)+ 1000L);
            
          String facility ="";
          if(c1.isSelected()){
              facility = facility + " ATM CARD";  
          } else if(c2.isSelected()){
              facility = facility + " Internet Banking";
          } else if(c3.isSelected()){
              facility = facility +" Mobile Banking";
          }else if (c4.isSelected()){
              facility = facility +"Email % SMS Alerts";
          }else if (c5.isSelected()){
              facility = facility +" Cheque Book";
          }else if(c6.isSelected()){
              facility = facility +" E-Statement";
          }
          try{
              if(accountType.equals("")){
                  JOptionPane.showMessageDialog(null, "Account Type is Required");
              }else {
                  Conn conn =new Conn();
                  String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                  
                  conn.s.executeUpdate(query1);
                  conn.s.executeUpdate(query2);
                  JOptionPane.showMessageDialog(null, "Card Number :" + cardnumber + "\n Pin :" + pinnumber);
                  
                  setVisible(false);
                  new Deposit (pinnumber).setVisible(false);
                  
              }
              
          }catch (Exception  e){
              System.out.println(e);
          }
          
          
          
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    
    public static void main(String []args){
        new SignupThree("");
    }
}
