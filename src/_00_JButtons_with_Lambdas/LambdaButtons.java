package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e->{
			String snum1=JOptionPane.showInputDialog("What is one number?");
			String snum2=JOptionPane.showInputDialog("What is one number?");
			int num1=Integer.parseInt(snum1);
			int num2=Integer.parseInt(snum2);
			System.out.println(num1+num2);
		});
		randNumber.addActionListener(e->{
			Random rand=new Random();
			 System.out.println(rand.nextInt(1000000));
		});
		tellAJoke.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "Two hunters are out in the woods when one of them collapses. He doesn't seem to be breathing and his eyes are glazed. The other guy whips out his phone and calls the emergency services. \n He gasps, \"My friend is dead! What can I do?\" The operator says, \"Calm down. I can help. First, let's make sure he's dead.\" There is a silence; then a gun shot is heard. Back on the phone, the guy says, \"OK, now what?");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
