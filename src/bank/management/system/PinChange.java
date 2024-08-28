
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
   
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber =pinnumber;
    
        setLayout(null);
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1610,900,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel image = new JLabel(i3);
             image.setBounds(0,0,1380,700);
             add(image);
             
        JLabel text = new JLabel (" CHANGE YOUR PIN");
            text.setForeground(Color.WHITE);
            text.setFont(new Font ("Raleway",Font.BOLD,20));
            text.setBounds(400,200,400,25);
            image.add(text);     
             
         JLabel pintext = new JLabel ("New Pin :");
            pintext.setForeground(Color.WHITE);
            pintext.setFont(new Font ("Raleway",Font.BOLD,20));
            pintext.setBounds(250,240,400,25);
            image.add(pintext);    
         
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(400,240,300,25);
        image.add(pin);
             
        JLabel repintext = new JLabel ("Re-Enter Pin:");
            repintext.setForeground(Color.WHITE);
            repintext.setFont(new Font ("Raleway",Font.BOLD,20));
            repintext.setBounds(250,280,400,25);
            image.add(repintext);     
         
         repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(400,280,300,25);
        image.add(repin);   
            
           
        change = new JButton("CHANGE");
        change.setBounds(650,387,150,30);
        change.setBackground(Color.BLUE);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(650,422,150,30);
        back.setBackground(Color.GREEN);
        back.addActionListener(this);
        image.add(back);
        
            
            setSize(1610,1250);
        setLocation(0,0);
      //  setUndecorated(true);
        setVisible(true);
           
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== change){
          try{
           String npin = pin.getText();
           String rpin = repin.getText();
           
           if(!npin.equals(rpin)){
               JOptionPane.showMessageDialog(null, "Enter Pin Does Not Match");
               return ;
           }
           
           if(npin.equals("")){
               JOptionPane.showMessageDialog(null, "Please Enter Pin");
               return ;
           }
           if(rpin.equals("")){
               JOptionPane.showMessageDialog(null, "Please re-Enter Pin");
               return ;
           }
          Conn conn = new Conn();
          String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pinnumber+"'   ";
          String query2 = "update login set pin = '"+rpin+"' where pin ='"+pinnumber+"'   ";
          String query3 = "update signupthree set pin = '"+rpin+"' where pin ='"+pinnumber+"'   ";
          
          conn.s.executeUpdate(query1);
          conn.s.executeUpdate(query2);
          conn.s.executeUpdate(query3);
          
          JOptionPane.showMessageDialog(null, "Pin Change Successfully");
          
          setVisible(false);
          new Transaction(rpin).setVisible(true);
          
          
        }catch(Exception e){
            System.out.println(e);
        }
          
        }else {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
            
        }
    }
    
    
    public static void main(String []args){
       new PinChange ("").setVisible(true);
    }
}
