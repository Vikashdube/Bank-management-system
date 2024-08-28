
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    String pinnumber;
    JButton deposit, withdraw,ministatement,pinchange,fastcash,balancequiry,exit;
    
         FastCash (String pinnumber){
             
             this.pinnumber = pinnumber ;
             setLayout(null);
             
             ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1610,900,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel image = new JLabel(i3);
             image.setBounds(0,0,1380,800);
             add(image);
           
             JLabel text = new JLabel ("SELECT WITHDRAWL AMOUNT ");
             text.setBounds(330,235,700,30);
             text.setFont(new Font("Raleway",Font.BOLD,25));
             text.setForeground(Color.WHITE);
             image.add(text);
             
             deposit = new JButton("RS 100");
             deposit.setBounds(170,365,150,30);
             deposit.addActionListener(this);
             image.add(deposit);
             
             withdraw = new JButton(" Rs 500");
             withdraw.setBounds(650,365,150,30);
             withdraw.addActionListener(this);
             image.add(withdraw);
             
             fastcash = new JButton("Rs 1000");
             fastcash.setBounds(170,400,150,30);
             fastcash.addActionListener(this);
             image.add(fastcash);
             
             ministatement = new JButton("Rs 2000");
             ministatement.setBounds(650,400,150,30);
             ministatement.addActionListener(this);
             image.add(ministatement);
             
             pinchange = new JButton("Rs 5000");
             pinchange.setBounds(170,435,150,30);
             pinchange.addActionListener(this);
             image.add(pinchange);
             
             balancequiry = new JButton("Rs 10000");
             balancequiry.setBounds(650,435,150,30);
             balancequiry.addActionListener(this);
             image.add(balancequiry);
             
             exit = new JButton("BACK");
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
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                 
             } else {
                 String amount = ((JButton)ae.getSource()).getText().substring(3);
                 Conn c = new Conn();
                 try{
                     ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "'");

                     int balance =0;
                   while(rs.next()){
                       if (rs.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(rs.getString("amount"));
                   } else {
                           balance -= Integer.parseInt(rs.getString("amount"));
                           }
                   }
                   
                   if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                       JOptionPane.showMessageDialog(null, "Insufficient Balance");
                       return;
                   }
                 //  Date date = new Date();
                //   String query = "insert into bank values('"+ pinnumber +"','"+ date +"','withdrawl','"+amount+"')";
                //   c.s.executeUpdate(query);
                //  JOptionPane.showMessageDialog(null,"Rs "+ amount + "Debited Sucessfully");
                 
                Date date = new Date();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs" +amount+"withdraw Successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
                
                
                
                
                
                //  setVisible(false);
                //  new Transaction(pinnumber).setVisible(true);
                  
                 }catch (Exception e){
                     System.out.println(e);
                 }
                 
             } 
         }
         
    public static void main(String[] args){
        new FastCash ("");
    }
}
