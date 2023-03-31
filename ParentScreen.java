/**
 * This is the interface used by parents. It is a Boundary class. In terms of the MVC pattern, it is also a View and a Controller.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ParentScreen extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField ChildNameTxtField;
	private static ArrayList<String> parent = new ArrayList<String>();
	private static ArrayList<String> teacher = new ArrayList<String>();
	private static ArrayList<String> subject = new ArrayList<String>();
	private static ArrayList<String> Teacher1Time = new ArrayList<String>();
	private static ArrayList<String> Teacher2Time = new ArrayList<String>();
	private static ArrayList<String> Teacher3Time = new ArrayList<String>();
	
	private static String[] header1 = new String[2];
	private static String[] header2 = new String[2];
	private static String[][] school = new String[3][3];
	private DefaultTableModel model = new DefaultTableModel(3, 2); // table model for jenga table
	private DefaultTableModel model2 = new DefaultTableModel(3, 2); // table model for jenga table
	private int step=1;
	
	private JButton btnEnterName;
	private JButton btnAutomatic;
	private JButton btnManual;
	private JButton btnDone;
	private JButton btnConfirm;
	private JButton btnDeny;
	private JButton btnJoin1;
	private JButton btnJoin2;
	private JButton btnJoin3;
	
	private JTable teacherBkTable;
	private JLabel lblTeacher_1;
	private JLabel lblTeacher_2;
	private JLabel lblTeacher_3;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JTable BookingConfTable;
	
	
//////////////////////////////////////////////////////////////////////////
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		init();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParentScreen frame = new ParentScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void init() {
		// TODO Auto-generated method stub
		parent.add("Fuad");
		parent.add("Shantanu");
		parent.add("Neil");
		parent.add("Uzair");
		parent.add("Ram");
		parent.add("Joe");
		
		teacher.add("Shahid");
		teacher.add("Azim");
		teacher.add("Chetna");
		
		subject.add("Math");
		subject.add("Science");
		subject.add("Social");
		
		header1[0]="Teacher";
		header1[1]="Subject";
		
		header2[0]="Teacher";
		header2[1]="Timing";
		
		Teacher1Time.add("9:00-10:00");
		Teacher1Time.add("10:00-11:00");
		Teacher1Time.add("11:00-12:00");
		Teacher1Time.add("13:00-14:00");
		Teacher1Time.add("14:00-15:00");
		Teacher1Time.add("15:00-16:00");
		
		Teacher2Time.add("9:00-10:00");
		Teacher2Time.add("10:00-11:00");
		Teacher2Time.add("11:00-12:00");
		Teacher2Time.add("13:00-14:00");
		Teacher2Time.add("14:00-15:00");
		Teacher2Time.add("15:00-16:00");
		
		Teacher3Time.add("9:00-10:00");
		Teacher3Time.add("10:00-11:00");
		Teacher3Time.add("11:00-12:00");
		Teacher3Time.add("13:00-14:00");
		Teacher3Time.add("14:00-15:00");
		Teacher3Time.add("15:00-16:00");
	}
///////////////////////////////////////
	/**
	 * Create the frame.
	 */
	public ParentScreen() {
		
		setTitle("Parent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEnterChildName = new JLabel("Enter Child Name:");
		lblEnterChildName.setForeground(Color.BLACK);
		lblEnterChildName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterChildName.setBackground(Color.GRAY);
		lblEnterChildName.setBounds(49, 49, 141, 20);
		contentPane.add(lblEnterChildName);
		
		ChildNameTxtField = new JTextField();
		ChildNameTxtField.setToolTipText("Enter minimum budget");
		ChildNameTxtField.setFont(new Font("Tahoma", Font.BOLD, 13));
		ChildNameTxtField.setColumns(10);
		ChildNameTxtField.setBounds(10, 80, 227, 20);
		contentPane.add(ChildNameTxtField);
		
		btnEnterName = new JButton("Enter");
		btnEnterName.setToolTipText("Search Budget");
		btnEnterName.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEnterName.setBackground(new Color(135, 206, 250));
		btnEnterName.setBounds(79, 112, 78, 23);
		btnEnterName.addActionListener(this);
		contentPane.add(btnEnterName);
		
		JScrollPane scrollPaneTchrBok = new JScrollPane();
		scrollPaneTchrBok.setBounds(13, 210, 227, 126);
		contentPane.add(scrollPaneTchrBok);
		
		model.setColumnIdentifiers(header1);
		teacherBkTable = new JTable();
		teacherBkTable.setModel(model);
		teacherBkTable.setRowHeight(35);
		scrollPaneTchrBok.setViewportView(teacherBkTable);
		
		JScrollPane scrollPaneBokConf = new JScrollPane();
		scrollPaneBokConf.setBounds(300, 210, 227, 126);
		contentPane.add(scrollPaneBokConf);
		
		model2.setColumnIdentifiers(header2);
		BookingConfTable = new JTable();
		BookingConfTable.setRowHeight(35);
		BookingConfTable.setModel(model2);
		scrollPaneBokConf.setViewportView(BookingConfTable);
		
		btnAutomatic = new JButton("Automatic");
		btnAutomatic.setBounds(13, 347, 112, 23);
		btnAutomatic.addActionListener(this);
		contentPane.add(btnAutomatic);
		
		btnManual = new JButton("Manual");
		btnManual.setBounds(135, 347, 105, 23);
		btnManual.addActionListener(this);
		contentPane.add(btnManual);
		
		lblTeacher_1 = new JLabel("");
		lblTeacher_1.setForeground(Color.BLACK);
		lblTeacher_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher_1.setBackground(Color.GRAY);
		lblTeacher_1.setBounds(297, 49, 92, 20);
		contentPane.add(lblTeacher_1);
		
		lblTeacher_2 = new JLabel("");
		lblTeacher_2.setForeground(Color.BLACK);
		lblTeacher_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher_2.setBackground(Color.GRAY);
		lblTeacher_2.setBounds(297, 80, 92, 20);
		contentPane.add(lblTeacher_2);
		
		lblTeacher_3 = new JLabel("");
		lblTeacher_3.setForeground(Color.BLACK);
		lblTeacher_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher_3.setBackground(Color.GRAY);
		lblTeacher_3.setBounds(297, 111, 92, 20);
		contentPane.add(lblTeacher_3);
		
		comboBox1 = new JComboBox<String>();
		comboBox1.setSelectedIndex(-1);
		comboBox1.setForeground(Color.WHITE);
		comboBox1.setFont(new Font("Dubai", Font.BOLD, 14));
		comboBox1.setBackground(new Color(51, 51, 51));
		comboBox1.setBounds(399, 50, 128, 20);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox<String>();
		comboBox2.setSelectedIndex(-1);
		comboBox2.setForeground(Color.WHITE);
		comboBox2.setFont(new Font("Dubai", Font.BOLD, 14));
		comboBox2.setBackground(new Color(51, 51, 51));
		comboBox2.setBounds(399, 81, 128, 20);
		contentPane.add(comboBox2);
		
		comboBox3 = new JComboBox<String>();
		comboBox3.setSelectedIndex(-1);
		comboBox3.setForeground(Color.WHITE);
		comboBox3.setFont(new Font("Dubai", Font.BOLD, 14));
		comboBox3.setBackground(new Color(51, 51, 51));
		comboBox3.setBounds(399, 112, 128, 20);
		contentPane.add(comboBox3);
		
		btnDone = new JButton("Done");
		btnDone.setBounds(368, 142, 89, 23);
		btnDone.addActionListener(this);
		contentPane.add(btnDone);
		

		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(300, 347, 89, 23);
		btnConfirm.addActionListener(this);
		contentPane.add(btnConfirm);
		
		btnDeny = new JButton("Deny");
		btnDeny.setBounds(438, 347, 89, 23);
		btnDeny.addActionListener(this);
		contentPane.add(btnDeny);
		
		JLabel lblTeacher1 = new JLabel("Teacher Name:");
		lblTeacher1.setForeground(Color.BLACK);
		lblTeacher1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher1.setBackground(Color.GRAY);
		lblTeacher1.setBounds(128, 428, 112, 20);
		contentPane.add(lblTeacher1);
		
		JLabel lblTeacher2 = new JLabel("Teacher Name:");
		lblTeacher2.setForeground(Color.BLACK);
		lblTeacher2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher2.setBackground(Color.GRAY);
		lblTeacher2.setBounds(128, 459, 112, 20);
		contentPane.add(lblTeacher2);
		
		JLabel lblTeacher3 = new JLabel("Teacher Name:");
		lblTeacher3.setForeground(Color.BLACK);
		lblTeacher3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacher3.setBackground(Color.GRAY);
		lblTeacher3.setBounds(128, 490, 112, 20);
		contentPane.add(lblTeacher3);
		
		btnJoin1 = new JButton("Join");
		btnJoin1.setBounds(250, 428, 89, 23);
		btnJoin1.addActionListener(this);
		contentPane.add(btnJoin1);
		
		btnJoin2 = new JButton("Join");
		btnJoin2.addActionListener(this);
		btnJoin2.setBounds(250, 459, 89, 23);
		contentPane.add(btnJoin2);
		
		btnJoin3 = new JButton("Join");
		btnJoin3.setBounds(250, 490, 89, 23);
		btnJoin3.addActionListener(this);
		contentPane.add(btnJoin3);
		
		JLabel lblTime1 = new JLabel("Time");
		lblTime1.setForeground(Color.BLACK);
		lblTime1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime1.setBackground(Color.GRAY);
		lblTime1.setBounds(349, 428, 46, 20);
		contentPane.add(lblTime1);
		
		JLabel lblTime2 = new JLabel("Time");
		lblTime2.setForeground(Color.BLACK);
		lblTime2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime2.setBackground(Color.GRAY);
		lblTime2.setBounds(349, 459, 46, 20);
		contentPane.add(lblTime2);
		
		JLabel lblTime3 = new JLabel("Time");
		lblTime3.setForeground(Color.BLACK);
		lblTime3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime3.setBackground(Color.GRAY);
		lblTime3.setBounds(349, 490, 46, 20);
		contentPane.add(lblTime3);
		
		JLabel lblTeacherBooking = new JLabel("Teacher Booking:");
		lblTeacherBooking.setForeground(Color.BLACK);
		lblTeacherBooking.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacherBooking.setBackground(Color.GRAY);
		lblTeacherBooking.setBounds(60, 189, 130, 20);
		contentPane.add(lblTeacherBooking);
		
		JLabel lblBookConf = new JLabel("Booking Conformation:");
		lblBookConf.setForeground(Color.BLACK);
		lblBookConf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookConf.setBackground(Color.GRAY);
		lblBookConf.setBounds(326, 189, 176, 20);
		contentPane.add(lblBookConf);
		
		JLabel lblManualBooking = new JLabel("Manual Booking:");
		lblManualBooking.setForeground(Color.BLACK);
		lblManualBooking.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblManualBooking.setBackground(Color.GRAY);
		lblManualBooking.setBounds(345, 22, 130, 20);
		contentPane.add(lblManualBooking);
		
		JLabel lblBookingLink = new JLabel("Booking Links:");
		lblBookingLink.setForeground(Color.BLACK);
		lblBookingLink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBookingLink.setBackground(Color.GRAY);
		lblBookingLink.setBounds(213, 403, 112, 20);
		contentPane.add(lblBookingLink);
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if(e.getSource()==btnEnterName) {
		verifyChild();
		}
	
	if(e.getSource()==btnAutomatic) {
		automaticBooking();
		comboBox1.removeAllItems();
		comboBox2.removeAllItems();
		comboBox3.removeAllItems();
	}
	if(e.getSource()==btnManual) {
		manualBooking();

	}
	if(e.getSource()==btnDone) {
		confirmBooking();
		comboBox1.removeAllItems();
		comboBox2.removeAllItems();
		comboBox3.removeAllItems();
	}
	if(e.getSource()==btnConfirm) {}
	if(e.getSource()==btnDeny) {
		manualBooking();
		resetTable(BookingConfTable);
	}
	if(e.getSource()==btnJoin1) {}
	if(e.getSource()==btnJoin2) {}
	if(e.getSource()==btnJoin3) {}

	
}

private void resetTable(JTable table){
	for(int i =0;i<table.getRowCount() ; i++) {
			for(int j =0;j<table.getColumnCount() ; j++) {
				table.setValueAt(null, i, j);
				table.setValueAt(null, i, j);
			}
		
	}
}
private void automaticBooking() {
	// TODO Auto-generated method stub
	ArrayList<String> randomTime = new ArrayList<String>();
	randomTime.add(Teacher1Time.get((int)(Math.random() * Teacher1Time.size())));
	randomTime.add(Teacher1Time.get((int)(Math.random() * Teacher1Time.size())));
	randomTime.add(Teacher1Time.get((int)(Math.random() * Teacher1Time.size())));
	for(int i =0;i<teacher.size() ; i++) {
		BookingConfTable.setValueAt(teacher.get(i), i, 0);
		BookingConfTable.setValueAt(randomTime.get(i), i, 1);
	}
}
private void confirmBooking() {
	// TODO Auto-generated method stub
	ArrayList<String> combobox = new ArrayList<String>();
	combobox.add((String) comboBox1.getSelectedItem());
	combobox.add((String) comboBox2.getSelectedItem());
	combobox.add((String) comboBox3.getSelectedItem());
	for(int i =0;i<teacher.size() ; i++) {
		BookingConfTable.setValueAt(teacher.get(i), i, 0);
		BookingConfTable.setValueAt(combobox.get(i), i, 1);
	}
	
}
private void manualBooking() {
	// TODO Auto-generated method stub
	lblTeacher_1.setText(teacher.get(0)+":");
	lblTeacher_2.setText(teacher.get(1)+":");
	lblTeacher_3.setText(teacher.get(2)+":");
	comboBox1.setModel(new DefaultComboBoxModel<String>(Teacher1Time.toArray(new String[0])));
	comboBox2.setModel(new DefaultComboBoxModel<String>(Teacher2Time.toArray(new String[0])));
	comboBox3.setModel(new DefaultComboBoxModel<String>(Teacher3Time.toArray(new String[0])));
}

private void verifyChild() {
	// TODO Auto-generated method stub
	String s = ChildNameTxtField.getText();
		for(String p: parent) {
			if(s.equals(p)) {
				for(int i =0;i<teacher.size() ; i++) {
				teacherBkTable.setValueAt(teacher.get(i), i, 0);
				teacherBkTable.setValueAt(subject.get(i), i, 1);
				}				
			}
		}
}
}
