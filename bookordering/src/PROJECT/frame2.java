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
public abstract class frame2 implements ActionListener {
	static JTextField t1,t2,t3,t4,t5,t6,t7;
	public static void main(String[] args) {
		JTextField t1=null;
		JTextField t2=null;
		JTextField t3=null;
		JTextField t4=null;
		JTextField t5=null;
		JTextField t6=null;
		JTextField t7=null;
		JFrame f=new JFrame("Button Example");
		JLabel b=new JLabel("First Name:");
		t1=new JTextField(" ");
		t1.setBounds(350,100,150,30);
		f.add(t1);
		JLabel b1=new JLabel ("Last Name:");
		t2=new JTextField(" ");
		t2.setBounds(350,150,150,30);
		f.add(t2);
		b.setBounds(200,100,150,30);
		f.add(b);
		b1.setBounds(200,150,150,30);
		f.add(b1);
		JLabel b2=new JLabel("E-Mail:");
		t3=new JTextField(" ");
		t3.setBounds(350,200,150,30);
		f.add(t3);
		JLabel b3=new JLabel("password:");
		t4=new JTextField(" ");
		t4.setBounds(350,250,150,30);
		f.add(t4);
		JLabel b4=new JLabel("phone number:");
		t5=new JTextField(" ");
		t5.setBounds(350,300,150,30);
		f.add(t5);
		b2.setBounds(200,200,150,30);
		f.add(b2);
		b3.setBounds(200,250,150,30);
		f.add(b3);
		b4.setBounds(200,300,150,30);
		f.add(b4);
		JLabel z=new JLabel("village Name:");
		t1=new JTextField(" ");
		t1.setBounds(350,350,150,30);
		f.add(t1);
		JLabel z1=new JLabel ("street:");
		t2=new JTextField(" ");
		t2.setBounds(350,400,150,30);
		f.add(t2);
		z.setBounds(200,350,150,30);
		f.add(z);
		z1.setBounds(200,400,150,30);
		f.add(z1);
		JLabel z2=new JLabel("Door number:");
		t3=new JTextField(" ");
		t3.setBounds(350,450,150,30);
		f.add(t3);
		JLabel z3=new JLabel("Mandal:");
		t4=new JTextField(" ");
		t4.setBounds(350,500,150,30);
		f.add(t4);
		JLabel z4=new JLabel("district:");
		t5=new JTextField(" ");
		t5.setBounds(350,550,150,30);
		f.add(t5);
		JLabel b5=new JLabel("pin code");
		t6=new JTextField(" ");
		t6.setBounds(350,600,150,30);
		f.add(t6);
		JLabel b6=new JLabel("state");
		t7=new JTextField(" ");
		t7.setBounds(350,650,150,30);
		f.add(t7);
		z2.setBounds(200,450,150,30);
		f.add(z2);
		z3.setBounds(200,500,150,30);
		f.add(z3);
		z4.setBounds(200,550,150,30);
		f.add(z4);
		b5.setBounds(200,600,150,30);
		f.add(b5);
		b6.setBounds(200,650,150,30);
		f.add(b6);
		f.add(b4);
		Checkbox checkbox1 = new Checkbox("Male");  
		checkbox1.setBounds(550, 450,70,40);  
		Checkbox checkbox2 = new Checkbox("Female");  
		checkbox2.setBounds(670,450, 70,40);  
		f.add(checkbox1);  
		f.add(checkbox2);  
		JRadioButton r11=new JRadioButton(" ABOVE 18 YEARS"); 
		r11.setBounds(600,390,180,40);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r11);   
		f.add(r11);
		JLabel j1=new JLabel("DATE OF BIRTH:");
		j1.setBounds(600,20,120,180);
		f.add(j1);
		JLabel j13=new JLabel("DATE:");j13.setBounds(600,140,70,30);
		j13.setFont(new Font("Courier New",Font.ITALIC,20));
		String date1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		final JComboBox dm=new JComboBox(date1);
		dm.setBounds(700,140,70,30);
		dm.setFont(new Font("Courier New",Font.ITALIC,20));
		f.add(j13);
		f.add(dm);
		JLabel j14=new JLabel("MONTH:");j14.setBounds(600,200,90,30);
		j14.setFont(new Font("Courier New",Font.ITALIC,20));
		String num[]= {"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
		final JComboBox cm=new JComboBox(num);
		cm.setBounds(700,200,90,30);
		cm.setFont(new Font("Courier New",Font.ITALIC,20));	
		f.add(j14);
		f.add(cm);	
		JLabel j141=new JLabel("year:");j141.setBounds(600,270,90,30);
j141.setFont(new Font("Courier New",Font.ITALIC,20));
String num1[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
final JComboBox cm1=new JComboBox(num1);
cm1.setBounds(700,270,90,30);
cm1.setFont(new Font("Courier New",Font.ITALIC,20));	
f.add(j141);
f.add(cm1);

//JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\PLANE.jpg"));
  //  f.add(background);
    //background.setBounds(180,70,100,100);
    //background.setSize(705,460);
JButton r1=new JButton("create");
r1.setBounds(250,750,150,30);
f.add(r1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);	
		
				

	}
}
