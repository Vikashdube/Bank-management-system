
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {
    String pinnumber;
    JButton deposit, withdraw,ministatement,pinchange,fastcash,balancequiry,exit;
    
         Transaction (String pinnumber){
             this.pinnumber = pinnumber ;
             setLayout(null);
             
             ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1610,900,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel image = new JLabel(i3);
             image.setBounds(0,0,1380,800);
             add(image);
           
             JLabel text = new JLabel ("Please Select Your Transaction ");
             text.setBounds(330,235,700,30);
             text.setFont(new Font("Raleway",Font.BOLD,25));
             text.setForeground(Color.WHITE);
             image.add(text);
             
             deposit = new JButton("Deposit");
             deposit.setBounds(170,365,150,30);
             deposit.addActionListener(this);
             image.add(deposit);
             
             withdraw = new JButton("Withdrow");
             withdraw.setBounds(650,365,150,30);
             withdraw.addActionListener(this);
             image.add(withdraw);
             
             fastcash = new JButton("Fast Cash");
             fastcash.setBounds(170,400,150,30);
             fastcash.addActionListener(this);
             image.add(fastcash);
             
             ministatement = new JButton("Mini Statement");
             ministatement.setBounds(650,400,150,30);
             ministatement.addActionListener(this);
             image.add(ministatement);
             
             pinchange = new JButton("Pin Change");
             pinchange.setBounds(170,435,150,30);
             pinchange.addActionListener(this);
             image.add(pinchange);
             
             balancequiry = new JButton("Balance Enquiry");
             balancequiry.setBounds(650,435,150,30);
             balancequiry.addActionListener(this);
             image.add(balancequiry);
             
             exit = new JButton("Exit");
             exit.setBounds(650,470,150,30);
             exit.setBackground(Color.GREEN);
             exit.addActionListener(this);
             image.add(exit);
             
             
             setSize(1610,1250);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
         }
    
         public void actionPerformed(ActionEvent ae){
             if(ae.getSource()== exit){
                 System.exit(0);
             } else if(ae.getSource()== deposit){
                 setVisible(false);
                 new Deposit(pinnumber).setVisible(true);
             } else if(ae.getSource()== withdraw){
                 setVisible(false);
                 new Withdrawl(pinnumber).setVisible(true);
                 
             }else if (ae.getSource()==fastcash){
                 setVisible(false);
                 new FastCash(pinnumber).setVisible(true);
                 
             }else if(ae.getSource()==pinchange){
                 setVisible(false);
                 new PinChange(pinnumber).setVisible(true);
                 
             }else if(ae.getSource()==balancequiry){
                 setVisible(false);
                 new BalanceEnquiry(pinnumber).setVisible(true);
                 
             }else if(ae.getSource() == ministatement){
                
                 new MiniStatement(pinnumber).setVisible(true);
             }
         }
         
    public static void main(String[] args){
        new Transaction ("");
    }
}