package projectdb;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Calculator_Prg implements ActionListener
{
	JFrame frm;
	JLabel l1;
	JTextArea ta;
	JButton one,two,three,four,five,six,seven,eight,nine,zero,dot,ac,plus,sub,mul,div,exit,del,sqrt,percentage,equal;
	Font fon1,fon2;
	double first,second,result;
	String operation,answer;
	
	public void setObj() {
		 
		  fon1=new Font("Bookman Old Style", Font.BOLD, 20);
		  fon2=new Font("Calibri",Font.TYPE1_FONT,20);
		  
		  l1=new  JLabel("Calculator");
		  l1.setFont(fon1);
		  ta=new JTextArea();
		  ta.setFont(fon2);
		  one=new JButton("1");
		  two=new JButton("2");
		  three=new JButton("3");
		  four=new JButton("4");
		  five=new JButton("5");
		  six=new JButton("6");
		  seven=new JButton("7");
		  eight=new JButton("8");
		  nine=new JButton("9");
		  zero=new JButton("0");
		  dot=new JButton(".");
		  ac=new JButton("ac");
		  plus=new JButton("+");
		  sub=new JButton("-");
		  mul=new JButton("*");
		  div=new JButton("/");
		  exit=new JButton("Exit");
		  del=new JButton("D");
		  equal=new JButton("=");
		  percentage=new JButton("%");
		  sqrt=new JButton("x²");
		  
		  JFrame.isDefaultLookAndFeelDecorated();
		  frm=new JFrame("calculator"); 
		  frm.setSize(500, 500);
		  frm.setLocationRelativeTo(null);
		  frm.setResizable(false);
		  frm.setLayout(null);
		  frm.setDefaultCloseOperation(3);
		  frm.setVisible(true);
		  
		  l1.setBounds(210,10, 150, 20);
		  ta.setBounds(0, 50, 500, 100);
		  
		  percentage.setBounds(140, 180, 50, 30);
		  sqrt.setBounds(200, 180, 50, 30);
		  del.setBounds(260, 180, 50, 30);
		  plus.setBounds(320, 180, 50, 30);
		  
		  seven.setBounds(140, 230, 50, 30);
		  eight.setBounds(200, 230, 50, 30);
		  nine.setBounds(260, 230, 50, 30);
		  sub.setBounds(320, 230, 50, 30);
		  
		  four.setBounds(140, 280, 50, 30);
		  five.setBounds(200, 280, 50, 30);
		  six.setBounds(260, 280, 50, 30);
		  mul.setBounds(320, 280, 50, 30);
		  
		  one.setBounds(140, 330, 50, 30);
		  two.setBounds(200, 330, 50, 30);
		  three.setBounds(260, 330, 50, 30);
		  div.setBounds(320, 330, 50, 30);
		  
		  zero.setBounds(140, 380, 50, 30);
		  dot.setBounds(200, 380, 50, 30);
		  ac.setBounds(260, 380, 50, 30);
		  equal.setBounds(320, 380, 50, 30);
		  exit.setBounds(380, 380, 60, 30);
		  
		  frm.add(l1);
		  frm.add(ta);
		  frm.add(one);
		  frm.add(two);
		  frm.add(three);
		  frm.add(four);
		  frm.add(five);
		  frm.add(six);
		  frm.add(seven);
		  frm.add(eight);
		  frm.add(nine);
		  frm.add(zero);
		  frm.add(dot);
		  frm.add(ac);
		  frm.add(plus);
		  frm.add(sub);
		  frm.add(mul);
		  frm.add(div);
		  frm.add(exit);
		  frm.add(del);
		  frm.add(equal);
		  frm.add(percentage);
		  frm.add(sqrt);
		  
		  seven.addActionListener(this);
		  eight.addActionListener(this);
		  nine.addActionListener(this);
		  four.addActionListener(this);
		  five.addActionListener(this);
		  six.addActionListener(this);
		  one.addActionListener(this);
		  two.addActionListener(this);
		  three.addActionListener(this);
		  zero.addActionListener(this);
		  dot.addActionListener(this);
		  ac.addActionListener(this);
		  plus.addActionListener(this);
		  sub.addActionListener(this);
		  mul.addActionListener(this);
		  div.addActionListener(this);
		  exit.addActionListener(this);
		  del.addActionListener(this);
		  sqrt.addActionListener(this);
		  percentage.addActionListener(this);
		  equal.addActionListener(this);  
	      return;
	}
	

	public static void main(String[] args) {
		Calculator_Prg cp=new Calculator_Prg();
		cp.setObj();
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==seven) 
		{
			    String a =ta.getText()+seven.getText();
				ta.setText(a);	
		}
		if(e.getSource()==eight) 
		{
		   String a=ta.getText()+eight.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==nine) 
		{
		   String a=ta.getText()+nine.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==four) 
		{
		   String a=ta.getText()+four.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==five) 
		{
		   String a=ta.getText()+five.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==six) 
		{
		   String a=ta.getText()+six.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==one) 
		{
		   String a=ta.getText()+one.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==two) 
		{
		   String a=ta.getText()+two.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==three) 
		{
		   String a=ta.getText()+three.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==zero) 
		{
		   String a=ta.getText()+zero.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==dot) 
		{
		   String a=ta.getText()+dot.getText();
		   ta.setText(a);  
	    }
		if(e.getSource()==del) 
		{
		   String a=null;
		   if(ta.getText().length()>0) {
			   StringBuilder str=new StringBuilder(ta.getText());
			   str.deleteCharAt(ta.getText().length()-1);
			   a=str.toString();
			   ta.setText(a);
		   }
	    }
		
		if(e.getSource()==equal) 
		{   
			String answer;
			second=Double.parseDouble(ta.getText());
		   if(operation=="+") 
		   {
			   result=first+second;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   else if(operation=="-") 
		   {
			   result=first-second;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   else if(operation=="*") 
		   {
			   result=first*second;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   else if(operation=="/") 
		   {
			   result=first/second;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   else if(operation=="%") 
		   {
			   result=first%second;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   else if(operation=="x²") 
		   {
			   result=first*first;
			   answer=String.format("%.2f", result);
			   ta.setText(answer);   
		   }
		   
	    }
		if(e.getSource()==plus) {
			
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="+";
		}
		if(e.getSource()==sub) {
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="-";
		}
		if(e.getSource()==mul) {
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="*";
		}
		if(e.getSource()==div) {
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="/";
		}
		if(e.getSource()==percentage) {
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="%";
		}
		if(e.getSource()==sqrt) {
			first=Double.parseDouble(ta.getText());
			ta.setText("");
			operation="x²";
		}
		if(e.getSource()==ac)
		{
			clrtxt();
			JOptionPane.showMessageDialog(null, "Enter new Values");
			
		}
		if(e.getSource()==exit) {
			frm.dispose();
			JOptionPane.showMessageDialog(null, "Thank You");
		}
		
			
}
		
	

	public void clrtxt() {
		ta.setText(" ");
	
	}


	
	
}
