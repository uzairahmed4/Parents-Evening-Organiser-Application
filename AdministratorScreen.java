package SE;

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
import java.awt.Label;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdministratorScreen extends JFrame {

	private JPanel contentPane;
	private JTextField studentNameText;
	private JTextField textField;
	private JTable pupilTable;
	private JTable teacherTable;

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
		setBounds(100, 100, 890, 879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		TextArea LogTextArea = new TextArea();
		LogTextArea.setForeground(Color.WHITE);
		LogTextArea.setFont(new Font("Dialog", Font.BOLD, 15));
		LogTextArea.setBackground(new Color(255, 255, 255));
		LogTextArea.setBounds(187, 538, 424, 265);
		contentPane.add(LogTextArea);
		
		studentNameText = new JTextField();
		studentNameText.setToolTipText("Enter minimum budget");
		studentNameText.setFont(new Font("Tahoma", Font.BOLD, 13));
		studentNameText.setColumns(10);
		studentNameText.setBounds(187, 242, 134, 20);
		contentPane.add(studentNameText);
		
		JLabel lblEnterName = new JLabel("Enter Pupil Name:");
		lblEnterName.setBackground(Color.GRAY);
		lblEnterName.setForeground(Color.BLACK);
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterName.setBounds(38, 241, 139, 20);
		contentPane.add(lblEnterName);
		
		JButton btnDisplayLog = new JButton("Display Log");
		btnDisplayLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDisplayLog.setToolTipText("Search Budget");
		btnDisplayLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDisplayLog.setBackground(new Color(135, 206, 250));
		btnDisplayLog.setBounds(67, 713, 110, 23);
		contentPane.add(btnDisplayLog);
		
		JLabel lblBookingsOpen = new JLabel("Bookings Open:");
		lblBookingsOpen.setForeground(Color.BLACK);
		lblBookingsOpen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookingsOpen.setBackground(Color.GRAY);
		lblBookingsOpen.setBounds(24, 42, 116, 20);
		contentPane.add(lblBookingsOpen);
		
		JLabel lblEveningStart = new JLabel("Evening Start:");
		lblEveningStart.setForeground(Color.BLACK);
		lblEveningStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEveningStart.setBackground(Color.GRAY);
		lblEveningStart.setBounds(24, 101, 110, 20);
		contentPane.add(lblEveningStart);
		
		JLabel lblBookingsClose = new JLabel("Bookings Close:");
		lblBookingsClose.setForeground(Color.BLACK);
		lblBookingsClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookingsClose.setBackground(Color.GRAY);
		lblBookingsClose.setBounds(298, 42, 126, 20);
		contentPane.add(lblBookingsClose);
		
		JLabel lblEveningEnd = new JLabel("Evening End:");
		lblEveningEnd.setForeground(Color.BLACK);
		lblEveningEnd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEveningEnd.setBackground(Color.GRAY);
		lblEveningEnd.setBounds(298, 101, 110, 20);
		contentPane.add(lblEveningEnd);
		
		JComboBox<Object> bookOpenTime = new JComboBox<Object>(new Object[]{});
		bookOpenTime.setSelectedIndex(-1);
		bookOpenTime.setForeground(Color.WHITE);
		bookOpenTime.setFont(new Font("Dubai", Font.BOLD, 14));
		bookOpenTime.setBackground(new Color(51, 51, 51));
		bookOpenTime.setBounds(158, 42, 110, 20);
		contentPane.add(bookOpenTime);
		
		JComboBox<Object> bookCloseTime = new JComboBox<Object>(new Object[]{});
		bookCloseTime.setSelectedIndex(-1);
		bookCloseTime.setForeground(Color.WHITE);
		bookCloseTime.setFont(new Font("Dubai", Font.BOLD, 14));
		bookCloseTime.setBackground(new Color(51, 51, 51));
		bookCloseTime.setBounds(434, 42, 110, 20);
		contentPane.add(bookCloseTime);
		
		JComboBox<Object> eveningStartTime = new JComboBox<Object>(new Object[]{});
		eveningStartTime.setSelectedIndex(-1);
		eveningStartTime.setForeground(Color.WHITE);
		eveningStartTime.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningStartTime.setBackground(new Color(51, 51, 51));
		eveningStartTime.setBounds(158, 101, 110, 20);
		contentPane.add(eveningStartTime);
		
		JComboBox<Object> eveningEndTime = new JComboBox<Object>(new Object[]{});
		eveningEndTime.setSelectedIndex(-1);
		eveningEndTime.setForeground(Color.WHITE);
		eveningEndTime.setFont(new Font("Dubai", Font.BOLD, 14));
		eveningEndTime.setBackground(new Color(51, 51, 51));
		eveningEndTime.setBounds(434, 101, 110, 20);
		contentPane.add(eveningEndTime);
		
		JButton btnClearLog = new JButton("Clear Log");
		btnClearLog.setToolTipText("Search Budget");
		btnClearLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnClearLog.setBackground(new Color(135, 206, 250));
		btnClearLog.setBounds(617, 713, 110, 23);
		contentPane.add(btnClearLog);
		
		JLabel lblMeetingDuration = new JLabel("Meeting Duration:");
		lblMeetingDuration.setForeground(Color.BLACK);
		lblMeetingDuration.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMeetingDuration.setBackground(Color.GRAY);
		lblMeetingDuration.setBounds(24, 164, 139, 20);
		contentPane.add(lblMeetingDuration);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(162, 165, 92, 22);
		contentPane.add(comboBox);
		
		JButton AddPupilBtn = new JButton("Add Pupil");
		AddPupilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AddPupilBtn.setBounds(187, 273, 104, 23);
		contentPane.add(AddPupilBtn);
		
		JButton EditPupilBtn = new JButton("Edit Pupil");
		EditPupilBtn.setBounds(187, 307, 104, 23);
		contentPane.add(EditPupilBtn);
		
		JButton RemovePupilBtn = new JButton("Remove pupil");
		RemovePupilBtn.setBounds(187, 341, 104, 23);
		contentPane.add(RemovePupilBtn);
		
		textField = new JTextField();
		textField.setBounds(546, 243, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Teacher Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(373, 244, 163, 14);
		contentPane.add(lblNewLabel);
		
		JButton AddTeacherBtn = new JButton("Add Teacher");
		AddTeacherBtn.setBounds(546, 273, 116, 23);
		contentPane.add(AddTeacherBtn);
		
		JButton EditTeacherBtn = new JButton("Edit Teacher");
		EditTeacherBtn.setBounds(546, 307, 116, 23);
		contentPane.add(EditTeacherBtn);
		
		JButton RemoveTeacherBtn = new JButton("Remove Teacher");
		RemoveTeacherBtn.setBounds(546, 341, 116, 23);
		contentPane.add(RemoveTeacherBtn);
		
		JButton BookingsSetBtn = new JButton("Booking Set");
		BookingsSetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BookingsSetBtn.setBounds(573, 43, 89, 23);
		contentPane.add(BookingsSetBtn);
		
		JButton EveningSetBtn = new JButton("Evening Set");
		EveningSetBtn.setBounds(573, 102, 89, 23);
		contentPane.add(EveningSetBtn);
		
		JButton SetDurationBtn = new JButton("Set Duration");
		SetDurationBtn.setBounds(287, 165, 110, 23);
		contentPane.add(SetDurationBtn);
		
		JScrollPane pupilScrollPane = new JScrollPane();
		pupilScrollPane.setBounds(187, 393, 110, 123);
		contentPane.add(pupilScrollPane);
		
		pupilTable = new JTable();
		pupilTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Pupil Name"
			}
		));
		pupilScrollPane.setViewportView(pupilTable);
		
		JScrollPane teacherScrollPane = new JScrollPane();
		teacherScrollPane.setBounds(546, 393, 126, 75);
		contentPane.add(teacherScrollPane);
		
		teacherTable = new JTable();
		teacherTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
			},
			new String[] {
				"Teacher Name"
			}
		));
		teacherScrollPane.setViewportView(teacherTable);
	}
}
