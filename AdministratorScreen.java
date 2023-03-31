/**
 * This is the interface used by the PEO system administrator.
 * It is a Boundary class.
 * In terms of the MVC pattern, it is also a View and a Controller.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class AdministratorScreen extends JFrame {

	private JPanel contentPane;
	private JTextField studentNameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorScreen frame = new AdministratorScreen();
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
	public AdministratorScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		TextArea ResultTextArea = new TextArea();
		ResultTextArea.setForeground(Color.WHITE);
		ResultTextArea.setFont(new Font("Dialog", Font.BOLD, 15));
		ResultTextArea.setBackground(Color.DARK_GRAY);
		ResultTextArea.setBounds(67, 238, 664, 174);
		contentPane.add(ResultTextArea);
		
		studentNameText = new JTextField();
		studentNameText.setToolTipText("Enter minimum budget");
		studentNameText.setFont(new Font("Tahoma", Font.BOLD, 13));
		studentNameText.setColumns(10);
		studentNameText.setBounds(187, 197, 134, 20);
		contentPane.add(studentNameText);
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setBackground(Color.GRAY);
		lblEnterName.setForeground(Color.BLACK);
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterName.setBounds(67, 196, 110, 20);
		contentPane.add(lblEnterName);
		
		JButton btnDisplayLog = new JButton("Display Log");
		btnDisplayLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDisplayLog.setToolTipText("Search Budget");
		btnDisplayLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDisplayLog.setBackground(new Color(135, 206, 250));
		btnDisplayLog.setBounds(621, 198, 110, 23);
		contentPane.add(btnDisplayLog);
		
		JComboBox<Object> selectTypeCombo = new JComboBox<Object>(new Object[]{});
		selectTypeCombo.setSelectedIndex(-1);
		selectTypeCombo.setForeground(Color.WHITE);
		selectTypeCombo.setFont(new Font("Dubai", Font.BOLD, 14));
		selectTypeCombo.setBackground(new Color(51, 51, 51));
		selectTypeCombo.setBounds(469, 199, 128, 20);
		contentPane.add(selectTypeCombo);
		
		JLabel lblSelectType = new JLabel("Select Type :");
		lblSelectType.setForeground(Color.BLACK);
		lblSelectType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectType.setBackground(Color.GRAY);
		lblSelectType.setBounds(349, 197, 110, 20);
		contentPane.add(lblSelectType);
		
		JLabel lblBookingsOpen = new JLabel("Bookings Open:");
		lblBookingsOpen.setForeground(Color.BLACK);
		lblBookingsOpen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookingsOpen.setBackground(Color.GRAY);
		lblBookingsOpen.setBounds(38, 27, 116, 20);
		contentPane.add(lblBookingsOpen);
		
		JLabel lblEveningStart = new JLabel("Evening Start:");
		lblEveningStart.setForeground(Color.BLACK);
		lblEveningStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEveningStart.setBackground(Color.GRAY);
		lblEveningStart.setBounds(426, 27, 110, 20);
		contentPane.add(lblEveningStart);
		
		JLabel lblBookingsClose = new JLabel("Bookings Close:");
		lblBookingsClose.setForeground(Color.BLACK);
		lblBookingsClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookingsClose.setBackground(Color.GRAY);
		lblBookingsClose.setBounds(38, 73, 126, 20);
		contentPane.add(lblBookingsClose);
		
		JLabel lblEveningEnd = new JLabel("Evening End:");
		lblEveningEnd.setForeground(Color.BLACK);
		lblEveningEnd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEveningEnd.setBackground(Color.GRAY);
		lblEveningEnd.setBounds(426, 73, 110, 20);
		contentPane.add(lblEveningEnd);
		
		JComboBox<Object> bookOpenComboHr = new JComboBox<Object>(new Object[]{});
		bookOpenComboHr.setSelectedIndex(-1);
		bookOpenComboHr.setForeground(Color.WHITE);
		bookOpenComboHr.setFont(new Font("Dubai", Font.BOLD, 14));
		bookOpenComboHr.setBackground(new Color(51, 51, 51));
		bookOpenComboHr.setBounds(165, 29, 67, 20);
		contentPane.add(bookOpenComboHr);
		
		JComboBox<Object> bookOpenComboMins = new JComboBox<Object>(new Object[]{});
		bookOpenComboMins.setSelectedIndex(-1);
		bookOpenComboMins.setForeground(Color.WHITE);
		bookOpenComboMins.setFont(new Font("Dubai", Font.BOLD, 14));
		bookOpenComboMins.setBackground(new Color(51, 51, 51));
		bookOpenComboMins.setBounds(254, 29, 67, 20);
		contentPane.add(bookOpenComboMins);
		
		JComboBox<Object> bookCloseComboHr = new JComboBox<Object>(new Object[]{});
		bookCloseComboHr.setSelectedIndex(-1);
		bookCloseComboHr.setForeground(Color.WHITE);
		bookCloseComboHr.setFont(new Font("Dubai", Font.BOLD, 14));
		bookCloseComboHr.setBackground(new Color(51, 51, 51));
		bookCloseComboHr.setBounds(165, 75, 67, 20);
		contentPane.add(bookCloseComboHr);
		
		JComboBox<Object> bookCloseComboMins = new JComboBox<Object>(new Object[]{});
		bookCloseComboMins.setSelectedIndex(-1);
		bookCloseComboMins.setForeground(Color.WHITE);
		bookCloseComboMins.setFont(new Font("Dubai", Font.BOLD, 14));
		bookCloseComboMins.setBackground(new Color(51, 51, 51));
		bookCloseComboMins.setBounds(254, 75, 67, 20);
		contentPane.add(bookCloseComboMins);
		
		JComboBox<Object> eveningStartComboHr = new JComboBox<Object>(new Object[]{});
		eveningStartComboHr.setSelectedIndex(-1);
		eveningStartComboHr.setForeground(Color.WHITE);
		eveningStartComboHr.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningStartComboHr.setBackground(new Color(51, 51, 51));
		eveningStartComboHr.setBounds(546, 29, 67, 20);
		contentPane.add(eveningStartComboHr);
		
		JComboBox<Object> eveningStartComboMins = new JComboBox<Object>(new Object[]{});
		eveningStartComboMins.setSelectedIndex(-1);
		eveningStartComboMins.setForeground(Color.WHITE);
		eveningStartComboMins.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningStartComboMins.setBackground(new Color(51, 51, 51));
		eveningStartComboMins.setBounds(634, 29, 67, 20);
		contentPane.add(eveningStartComboMins);
		
		JComboBox<Object> eveningEndComboHr = new JComboBox<Object>(new Object[]{});
		eveningEndComboHr.setSelectedIndex(-1);
		eveningEndComboHr.setForeground(Color.WHITE);
		eveningEndComboHr.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningEndComboHr.setBackground(new Color(51, 51, 51));
		eveningEndComboHr.setBounds(546, 75, 67, 20);
		contentPane.add(eveningEndComboHr);
		
		JComboBox<Object> eveningEndComboMins = new JComboBox<Object>(new Object[]{});
		eveningEndComboMins.setSelectedIndex(-1);
		eveningEndComboMins.setForeground(Color.WHITE);
		eveningEndComboMins.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningEndComboMins.setBackground(new Color(51, 51, 51));
		eveningEndComboMins.setBounds(634, 75, 67, 20);
		contentPane.add(eveningEndComboMins);
		
		JCheckBox verifyCheckBox = new JCheckBox("Agree to Terms and condition");
		verifyCheckBox.setForeground(Color.WHITE);
		verifyCheckBox.setFont(new Font("Dubai", Font.ITALIC, 11));
		verifyCheckBox.setBackground(new Color(51, 51, 51));
		verifyCheckBox.setBounds(67, 437, 176, 24);
		contentPane.add(verifyCheckBox);
		
		JButton btnClearLog = new JButton("Clear Log");
		btnClearLog.setToolTipText("Search Budget");
		btnClearLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnClearLog.setBackground(new Color(135, 206, 250));
		btnClearLog.setBounds(67, 479, 110, 23);
		contentPane.add(btnClearLog);
		
		JSlider meetDurationSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 70);
		meetDurationSlider.setInverted(true);
		meetDurationSlider.setBounds(228, 132, 385, 20);
		contentPane.add(meetDurationSlider);
		
		JLabel lblMeetingDuration = new JLabel("Meeting Duration:");
		lblMeetingDuration.setForeground(Color.BLACK);
		lblMeetingDuration.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMeetingDuration.setBackground(Color.GRAY);
		lblMeetingDuration.setBounds(79, 132, 139, 20);
		contentPane.add(lblMeetingDuration);
		
		JLabel meetDurationTime = new JLabel("-min(s)");
		meetDurationTime.setForeground(Color.BLACK);
		meetDurationTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		meetDurationTime.setBackground(Color.GRAY);
		meetDurationTime.setBounds(374, 154, 57, 20);
		contentPane.add(meetDurationTime);
	}
}
