package PROJECT;
import java.awt.BorderLayout; 
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
	public abstract class fram1 implements ActionListener {
	public static void main(String[] args) {
	     	JTextField t1,t2;
	        JFrame f=new JFrame("book store");
	        JLabel l1;
	        l1=new JLabel("*****ONLINE BOOK STORE*****");  
	        l1.setBounds(450,100, 250,80);  
	         f.add(l1);
	            JLabel c=new JLabel("USERNAME:"); 
	            t1=new JTextField(" ");
			    t1.setBounds(500,340,150,30);  
			    f.add(t1);
			    JLabel b1=new JLabel("PASSWORD:"); 
			    t2=new JTextField(" ");
			    t2.setBounds(500,250,150,30);
			    f.add(t2);
	            c.setBounds(410,245,200,50);
			    f.add(c);                   
			    b1.setBounds(410,330,200,50);
			    f.add(b1);
			    JButton r12=new JButton(new ImageIcon("C:\\Users\\sri\\Downloads\\login1.png"));    
			    r12.setBounds(390,400,250, 80);    
			    f.add(r12);
			    JButton b11=new JButton(new ImageIcon("C:\\Users\\sri\\Downloads\\createaccount.jpg"));    
			    b11.setBounds(350,510,340, 40);    
			    f.add(b11);
			    f.setSize(400,400);  
			    f.setLayout(null);  
			    f.setVisible(true);   
			    f.add(r12);
			    f.add(b11);
			    JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\cub.gif"));
			    f.add(background);
			    background.setBounds(200,180,100,100);
			    background.setSize(705,460);
			
	}
	}
	
	
	
	

	
	
	