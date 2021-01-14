package busReservation;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputTicketDetails extends JFrame implements ActionListener
{
    JLabel name,sex,age,noseat,acornac;
    JButton submit,cancel,reset;
    JTextField namet,sext,aget,noseatt,acornoac;
    Container c;
	
	public InputTicketDetails()
    {
		super("Details Entry");
		InputDetails();
    }
    
    public void InputDetails()
    {
        c = getContentPane();
        setLayout(new GridLayout(7,2));
        
        name = new JLabel("Name");
        sex = new JLabel("Name");
        age = new JLabel("Name");
        noseat = new JLabel("Name");
        acornac = new JLabel("Name");
        
        namet = new JTextField(10);
        sext = new JTextField(10);
        aget = new JTextField(10);
        noseatt = new JTextField(10);
        acornoac = new JTextField(10);
        
        
    }

	public void actionPerformed(ActionEvent ae) 
	{
		
		
	}
}
