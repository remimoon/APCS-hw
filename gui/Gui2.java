import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

    private JButton b1,b2;
    private Container pane;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;

    public void actionPerformed(ActionEvent e){
	if(e.getSource() == b1){
	    System.out.println("you clicked click me");
	    System.out.println("And the text area has: " + text.getText());
	} else if (e.getSource() == label) {
	    label.setText(text.getText());
	    text.setText("");
	} else if (e.getSource() == b2){
	    System.out.println("shutting down");
	    System.exit(0);
	}
    }
		
    public Gui2(){
				
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
				//pane.setLayout(new GridLayout(3,3);
	pane.setLayout(new FlowLayout());
	b1 = new JButton("Click me");
	pane.add(b1);
	b1.addActionListener(this);
	b2 = new JButton("exit");
	pane.add(b2);

	label = new JLabel("The Label:");
	pane.add(label);

	text =new JTextArea();
	text.setColumns(40);
	text.setRows(5);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2)); 	
	pane.add(canvas);

    }
    public static void main(String[] args) {
	Gui2 f = new Gui2();
	f.setVisible(true);
    }
}
