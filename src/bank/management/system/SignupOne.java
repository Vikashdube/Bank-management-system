

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    JButton next;
    
    SignupOne ( ){
        
        setLayout(null);
        
        Random ran =new Random();
        long random = Math.abs((ran.nextLong() % 9000L)+1000L);
        
        
        JLabel formno =new JLabel("APLICATION FROM NO : "+random);
        formno.setForeground(Color.BLACK);
        formno.setFont(new Font("Ralway",Font.BOLD,38));
        formno.setBounds(400,20,600,40);
        add(formno);
        
        JLabel personDetail =new JLabel("Page 1: Person Details");
        personDetail.setFont(new Font("Ralway",Font.BOLD,22));
        personDetail.setBounds(530,80,800,25);
        add(personDetail);
        
        
        JLabel name =new JLabel("Enter Name : ");
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Ralway",Font.PLAIN,25));
        name.setBounds(220,140,1000,25);
        add(name);
        
              nameTextField =new JTextField();
              nameTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              nameTextField.setBounds(400,140,800,30);
              add(nameTextField);
              
              
              
              
        JLabel fname =new JLabel(" Father Name : ");
        fname.setForeground(Color.WHITE);
        fname.setFont(new Font("Ralway",Font.PLAIN,25));
        fname.setBounds(210,195,1250,25);
        add(fname);
             
               fnameTextField =new JTextField();
              fnameTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              fnameTextField.setBounds(400,195,800,30);
              add(fnameTextField);
              
        
        JLabel dob =new JLabel(" Date Of Birth : ");
        dob.setForeground(Color.WHITE);
        dob.setFont(new Font("Ralway",Font.PLAIN,25));
        dob.setBounds(210,240,1450,25);
        add(dob);
        
               dateChooser =new JDateChooser();
              dateChooser.setBounds(400,240,800,30);
              add(dateChooser);
        
        
        JLabel gender =new JLabel(" Select Gender : ");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Ralway",Font.PLAIN,25));
        gender.setBounds(210,280,1650,25);
        add(gender);
        
              male =new JRadioButton("Male");
             male.setBounds(400,280,100,30);
             add(male);
             
              female =new JRadioButton("Female");
             female.setBounds(550,280,100,30);
             add(female);     
             
             ButtonGroup gendergroup =new ButtonGroup();
             gendergroup.add(male);
             gendergroup.add(female);
        
        JLabel email =new JLabel(" Email Id : ");
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Ralway",Font.PLAIN,25));
        email.setBounds(210,320,1850,25);
        add(email);
        
               emailTextField =new JTextField();
              emailTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              emailTextField.setBounds(400,320,800,30);
              add(emailTextField);
              
        
        JLabel marital  =new JLabel(" Marital Status : ");
        marital.setForeground(Color.WHITE);
        marital.setFont(new Font("Ralway",Font.PLAIN,25));
        marital.setBounds(210,360,2050,25);
        add(marital);
        
              married =new JRadioButton("Married");
             married.setBounds(400,360,100,30);
             add(married);
             
             
            unmarried =new JRadioButton("UnMarried");
             unmarried.setBounds(550,360,100,30);
             add(unmarried); 
             
              other =new JRadioButton("Other");
             other.setBounds(700,360,100,30);
             add(other); 
             
             
             ButtonGroup maritalgroup =new ButtonGroup();
             maritalgroup.add(married);
             maritalgroup.add(unmarried);
             maritalgroup.add(other);
             
        
        JLabel address  =new JLabel(" Your Address : ");
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Ralway",Font.PLAIN,25));
        address.setBounds(210,400,2250,25);
        add(address);
            
               addressTextField =new JTextField();
              addressTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              addressTextField.setBounds(400,400,800,30);
              add(addressTextField);
              
  
        JLabel city =new JLabel(" City : ");
        city.setForeground(Color.WHITE);
        city.setFont(new Font("Ralway",Font.PLAIN,25));
        city.setBounds(210,440,2450,25);
        add(city);
  
              cityTextField =new JTextField();
              cityTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              cityTextField.setBounds(400,440,800,30);
              add(cityTextField);
              
              
        JLabel state =new JLabel(" State : ");
        state.setForeground(Color.WHITE);
        state.setFont(new Font("Ralway",Font.PLAIN,25));
        state.setBounds(210,480,2650,25);
        add(state);
        
              stateTextField =new JTextField();
              stateTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              stateTextField.setBounds(400,480,800,30);
              add(stateTextField);
              
        
        JLabel pincode =new JLabel(" Pincode : ");
        pincode.setForeground(Color.WHITE);
        pincode.setFont(new Font("Ralway",Font.PLAIN,25));
        pincode.setBounds(210,520,2850,25);
        add(pincode);
        
              pinTextField =new JTextField();
              pinTextField .setFont (new Font ("Raleway",Font.PLAIN,22));
              pinTextField.setBounds(400,520,800,30);
              add(pinTextField);
              
        
        next =new JButton("Next");
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway",Font.BOLD,15));
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        getContentPane().setBackground(Color.gray);
        
        setSize(1600,1250);
        setLocation(0,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno =""+random;
        String name = nameTextField.getText();
        String fname =fnameTextField.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
        if(male.isSelected()){
            gender ="Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital =null;
        if(married.isSelected()){
            marital ="Married";
        }else if(unmarried.isSelected()){
            marital ="unmarred";
        }else if(other.isSelected()){
            marital="other";
        }
      String address = addressTextField.getText();
      String city = cityTextField.getText();
      String state = stateTextField.getText();
      String pin =pinTextField.getText();
        
      try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null, "name is requeired");
          } else {
              Conn c = new Conn();
              String query = " insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"' ,'"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new SignupTwo(formno).setVisible(true);
              
          
          }
      }catch (Exception e){
          System.out.println(e);
      }
    }
      
    
    
    
    public static void main(String []args){
        
        new SignupOne();
        
    }
}
