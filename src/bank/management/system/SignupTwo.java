

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField pan ,aadhar;
    JRadioButton syes,sno,eyes,eno;
    
    JButton next;
    JComboBox religion, category,income, occupation,education ;
    String formno ;
    SignupTwo ( String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT FROM - PAGE 2");
       
        
        
        
        JLabel additionalDetail =new JLabel("Page 2: Additional Details");
        additionalDetail.setFont(new Font("Ralway",Font.BOLD,38));
        additionalDetail.setBounds(500,50,800,40);
        add(additionalDetail);
        
        
        JLabel name =new JLabel("Religion : ");
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Ralway",Font.PLAIN,25));
        name.setBounds(220,140,1000,25);
        add(name);
           
           String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
            religion = new JComboBox(valReligion);
           religion.setBounds(400,140,800,30);
              add(religion);
              
              
        JLabel fname =new JLabel(" Category : ");
        fname.setForeground(Color.WHITE);
        fname.setFont(new Font("Ralway",Font.PLAIN,25));
        fname.setBounds(210,195,1250,25);
        add(fname);
             
             String valcategory[]= {"General","OBC","SC","ST","Other"};
              category = new JComboBox(valcategory);
              category.setBounds(400,195,800,30);
              add(category);
              
        
        JLabel dob =new JLabel(" Income : ");
        dob.setForeground(Color.WHITE);
        dob.setFont(new Font("Ralway",Font.PLAIN,25));
        dob.setBounds(210,240,1450,25);
        add(dob);
               String incomecategory[]= {"Null"," < 1,50,000","< 2,00,000","< 5,00,000","Up to 10,00,000"};
              income = new JComboBox(incomecategory);
              income.setBounds(400,240,800,30);
              add(income);
              
        
        JLabel gender =new JLabel(" Educational  ");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Ralway",Font.PLAIN,25));
        gender.setBounds(210,280,1650,25);
        add(gender);
    
        
        JLabel email =new JLabel(" Qualification : ");
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Ralway",Font.PLAIN,25));
        email.setBounds(210,305,1850,25);
        add(email);
        
              String educationValue[]= {"Non Graduate"," Graduate"," Post Graduate","Doctrate","Others"};
              education = new JComboBox(educationValue);
              education.setBounds(400,305,800,30);
              add(education); 
              
               
              
        
        JLabel marital  =new JLabel(" Occupation : ");
        marital.setForeground(Color.WHITE);
        marital.setFont(new Font("Ralway",Font.PLAIN,25));
        marital.setBounds(210,360,2050,25);
        add(marital);
        
        
          String occupationaValue[]= {"Slaried","Self Employed ","Bussniess","Student","Retired","Other"};
              occupation = new JComboBox(occupationaValue);
            occupation.setBounds(400,360,800,30);
              add(occupation); 
        
              
        JLabel address  =new JLabel(" PAN Number : ");
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Ralway",Font.PLAIN,25));
        address.setBounds(210,400,2250,25);
        add(address);
            
               pan =new JTextField();
              pan.setFont (new Font ("Raleway",Font.PLAIN,22));
              pan.setBounds(400,400,800,30);
              add(pan);
              
  
        JLabel city =new JLabel(" Adhar Number : ");
        city.setForeground(Color.WHITE);
        city.setFont(new Font("Ralway",Font.PLAIN,25));
        city.setBounds(210,440,2450,25);
        add(city);
  
              aadhar =new JTextField();
              aadhar .setFont (new Font ("Raleway",Font.PLAIN,22));
              aadhar.setBounds(400,440,800,30);
              add(aadhar);
              
              
        JLabel state =new JLabel(" Seniour Citizon : ");
        state.setForeground(Color.WHITE);
        state.setFont(new Font("Ralway",Font.PLAIN,25));
        state.setBounds(210,480,2650,25);
        add(state);
        
                syes =new JRadioButton("Yes");
             syes.setBounds(480,480,100,30);
             syes.setBackground(Color.GRAY);
             add(syes);
             
             
            sno =new JRadioButton("No");
             sno.setBounds(680,480,100,30);
             sno.setBackground(Color.gray);
             add(sno);
             
             
             ButtonGroup maritalgroup =new ButtonGroup();
             maritalgroup.add(syes);
             maritalgroup.add(sno);
              
        
        
        
        JLabel pincode =new JLabel(" Exisiting Account : ");
        pincode.setForeground(Color.WHITE);
        pincode.setFont(new Font("Ralway",Font.PLAIN,25));
        pincode.setBounds(210,520,2850,25);
        add(pincode);
        
        eyes =new JRadioButton("Yes");
             eyes.setBounds(480,520,100,30);
             eyes.setBackground(Color.gray);
             add(eyes);
             
             
            eno =new JRadioButton("No");
             eno.setBounds(680,520,100,30);
             eno.setBackground(Color.gray);
             add(eno);
             
             
             ButtonGroup emaritalgroup =new ButtonGroup();
             emaritalgroup.add(eyes);
             emaritalgroup.add(eno);
              
              
        
        next =new JButton("Next");
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway",Font.BOLD,15));
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(1600,1250);
        setLocation(0,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
      
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccupation =(String) occupation.getSelectedItem();
        
        String seniorcitizen =null;
        if(syes.isSelected()){
            seniorcitizen  ="YES";
        }else if(sno.isSelected()){
            seniorcitizen  = "No";
        }
       
        String exisitingaccount =null;
        if(eyes.isSelected()){
            exisitingaccount  ="YES";
        }else if(eno.isSelected()){
            exisitingaccount  ="NO";
        }
        
      String span = pan.getText();
      String saadhar = aadhar.getText();
      
      try{
            Conn c = new Conn();
              String query = " insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"' ,'"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
              c.s.executeUpdate(query);
              
              // SignupThree object
              setVisible(false);
              new SignupThree(formno).setVisible(true);
      }
      catch (Exception e){
          System.out.println(e);
      }
    }
      
    
    
    
    public static void main(String []args){
        
        new SignupTwo("");
        
    }
}
