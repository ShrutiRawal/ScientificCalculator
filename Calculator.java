import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame {
	private Controls control = new Controls();
	private BorderLayout bl = new BorderLayout();
	private BorderLayout bl2 = new BorderLayout();
	public static JTextField screen = new JTextField("0.0",50);
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	private JPanel panel7 = new JPanel();
	private Font inputFont = new Font("Courier",Font.BOLD,20);
	private JButton clrbtn = new JButton("CLEAR");
	
	Calculator(){
		
		this.setSize(500,400);
		this.setVisible(true);
		this.setLocation(new Point(600,300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(bl);
		this.setTitle("Calculator");
		
		Dimension dim = screen.getSize();
		
		panel1.setLayout(bl2);
		
		screen.setPreferredSize(new Dimension(dim.width,50));
		screen.setFont(inputFont);
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		clrbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("");
				Controls.answer = "";
			}
		});
		
		panel1.add(screen,BorderLayout.CENTER);
		panel1.add(panel4,BorderLayout.LINE_START);
		panel1.add(panel5,BorderLayout.LINE_END);
		panel1.add(panel6,BorderLayout.NORTH);
		panel1.add(panel7,BorderLayout.SOUTH);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.LINE_START);
		this.add(control,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.LINE_END);
		this.add(clrbtn,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
