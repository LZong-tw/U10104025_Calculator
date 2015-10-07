import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{

	public static void main(String[] args) {
		Main main1 = new Main();
		main1.setTitle("Calculator");
		main1.setSize(400, 400);
		main1.setLocationRelativeTo(null);
		main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main1.setVisible(true);
	}

    JTextField show = new JTextField(); // Show the expression by Textfield.
    char jbutton[]={'7','8','9','/','4','5','6','*','1','2','3','-','0','.','=','+'};
    JButton button[]=new JButton[16];
    
	public Main(){
		JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        
        for(int i=0;i<16;i++){
            button[i]=new JButton(""+jbutton[i]);
            p1.add(button[i]);
            button[i].addActionListener(this);
        }

		JPanel p2 = new JPanel(new BorderLayout()); // Merge the panels into
													// one.
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		show.setEditable(false); // Let the Text field can't be edited through
								 // keyboard.

		add(p2, BorderLayout.CENTER); // Put the merged panel onto the frame.
    }
    public void actionPerformed(ActionEvent event){   
    }
}
