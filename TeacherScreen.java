import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Button;

public class TeacherScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherScreen frame = new TeacherScreen();
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
	public TeacherScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Join Meet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(76, 532, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Decrease");
		btnNewButton_1.setBounds(507, 489, 78, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Increase");
		btnNewButton_2.setBounds(419, 489, 78, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Set");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(467, 460, 62, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Schedule");
		lblNewLabel.setBounds(86, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name - Time");
		lblNewLabel_1.setBounds(76, 73, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Requests");
		lblNewLabel_2.setBounds(435, 73, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		Label label = new Label("Set Availability");
		label.setBounds(424, 253, 78, 22);
		contentPane.add(label);
		
		TextArea textArea = new TextArea();
		textArea.setText("Name - Time");
		textArea.setBounds(10, 107, 242, 405);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(380, 315, 78, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(487, 315, 78, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("From:");
		lblNewLabel_3.setBounds(380, 295, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		Label label_1 = new Label("To:");
		label_1.setBounds(487, 295, 56, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_4 = new JLabel("Student - Time");
		lblNewLabel_4.setBounds(364, 119, 78, 23);
		contentPane.add(lblNewLabel_4);
		
		Button button = new Button("Set ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(435, 341, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Accept");
		button_1.setBounds(448, 119, 56, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Deny");
		button_2.setBounds(510, 119, 56, 22);
		contentPane.add(button_2);
		
		Label label_2 = new Label("9:00");
		label_2.setBounds(357, 489, 56, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Time:");
		label_3.setBounds(351, 461, 62, 22);
		contentPane.add(label_3);
	}
}
