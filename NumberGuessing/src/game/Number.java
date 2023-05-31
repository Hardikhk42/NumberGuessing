package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
class Code{
	 Scanner sc = new Scanner(System.in);
     int myNumber = (int)(Math.random()*100);
     int userNumber = 0;
     {

     do {
         System.out.println("Guess my number(1-100) : ");
         userNumber = sc.nextInt();

         if(userNumber == myNumber) {
             System.out.println("WOOHOO .. CORRECT NUMBER!!!");
             break;
         }
         else if(userNumber > myNumber) {
             System.out.println("your number is too large");
         }
         else {
             System.out.println("your number is too small");
         }
     } while(userNumber >= 0);

     System.out.print("My number was : ");
     System.out.println(myNumber);


}}



public class Number extends JFrame {
	
	private JPanel contentPane;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Number frame = new Number();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Number() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 574, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Number Below");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(160, 88, 188, 26);
		panel.add(lblNewLabel_1);
		
		num = new JTextField();
		num.setBounds(170, 126, 147, 26);
		panel.add(num);
		num.setColumns(10);
		int myNumber = (int)(Math.random()*100);
		JButton subButton = new JButton("Submit");
		subButton.setBackground(Color.GREEN);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(num.getText().toString())==myNumber) {
					Final f = new Final();
					f.setVisible(true);
				}
				else if(Integer.parseInt(num.getText().toString())>myNumber) {
					JOptionPane.showMessageDialog(subButton, "too large");
				}
				else if(Integer.parseInt(num.getText().toString())<myNumber) {
					JOptionPane.showMessageDialog(subButton, "too small");
				}
			}
		});
		subButton.setBounds(191, 162, 103, 26);
		panel.add(subButton);
		
		JLabel lblNewLabel = new JLabel("Guessing The Number");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel.setBounds(97, 19, 318, 35);
		panel.add(lblNewLabel);
		
		JButton surrButton = new JButton("Surrender");
		surrButton.setBackground(Color.RED);
		surrButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		surrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(surrButton, "Number was "+myNumber);
				System.exit(myNumber);
			}
		});
		surrButton.setBounds(191, 196, 103, 26);
		panel.add(surrButton);
	}
}
