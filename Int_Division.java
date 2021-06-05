package javaapplication1;

import java.awt.*;
import java.awt.event.*;
public class Int_Division extends Frame implements ActionListener
{
Label L1,L2,L3;
TextField T1,T2,T3;
Button B1;
Int_Division()
{
setLayout(new FlowLayout(FlowLayout.LEFT));
L1=new Label("Enter the First Number: ");
add(L1);
T1=new TextField(10);
add(T1);
L2=new Label("Enter the Second Number: ");
add(L2);
T2=new TextField(10);
add(T2);
L3=new Label("Division of 2 Numbers: ");
add(L3);
T3=new TextField(30);
add(T3);
B1=new Button("Compute");
add(B1);
B1.addActionListener(this);
addWindowListener (new WindowAdapter()
{
public void windowClosing (WindowEvent we)
{
System.exit (0);
}
});
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B1)
{
try
{
int val1=Integer.parseInt(T1.getText());
int val2=Integer.parseInt(T2.getText());
double div=(double)val1/val2;
T3.setText(String.valueOf(div));
}
catch(ArithmeticException ae)
{
T3.setText("ArithmeticException");
}
catch(NumberFormatException ne)
{
T3.setText("NumberFormatException");
}
catch(Exception ea)
{
T3.setText(String.valueOf(ea));
}
}
}
public static void main(String args[])
{
Int_Division ob = new Int_Division();
ob.setTitle ("Int_Division_Frame");
ob.setSize (600,200);
ob.setVisible (true);

ob.setLocationRelativeTo(null);
}
}