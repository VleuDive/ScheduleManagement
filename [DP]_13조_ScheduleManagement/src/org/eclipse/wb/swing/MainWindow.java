package org.eclipse.wb.swing;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.UIManager;

import ScheduleManagement.App;
import ScheduleManagement.Daily_Schedule;
import ScheduleManagement.Schedule_ItemType;
import ScheduleManagement.Student;
import ScheduleManagement.ToDoList_ItemType;
import ScheduleManagement.User;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Panel;
import javax.swing.JToggleButton;
import java.awt.List;
import java.awt.Scrollbar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JTree;
import javax.swing.Popup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;

import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;

public class MainWindow {

	
	private JFrame frmScheduleManagementSystem;
	private CardLayout cards=new CardLayout(0,0);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private App app;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table_2;
	private JTable table_3;
	private JTextField txtProfile;
	private JTable table_4;
	private JTable table;
	private JTable table_6;
	private JTable table_5;
	//private school_list school_list;
	private JTable table_7;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_20;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_21;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmScheduleManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		app=new App();
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScheduleManagementSystem = new JFrame();
		frmScheduleManagementSystem.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.setTitle("Schedule Management System");
		frmScheduleManagementSystem.getContentPane().setLayout(cards);
		frmScheduleManagementSystem.setSize(500,559);
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(MainPanel, "MainPanel");
		MainPanel.setLayout(null);
		
		JLabel lblScheduleManager = new JLabel("\uD559\uC0DD \uC77C\uC815 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		lblScheduleManager.setFont(new Font("DX紐⑤뜕怨좊뵓B", Font.PLAIN, 20));
		lblScheduleManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblScheduleManager.setBounds(121, 26, 239, 27);
		MainPanel.add(lblScheduleManager);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(34, 76, 187, 162);
		MainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("\uD559\uC0DD\uD68C\uC6D0");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("DX?슦?벑?깮B", Font.PLAIN, 16));
		label.setBounds(65, 10, 73, 23);
		panel_1.add(label);
		
		JButton btnNewButton = new JButton("Login!");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentLoginPanel");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(48, 49, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register!");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentRegisterPanel");
			}
		});
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(48, 102, 97, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(267, 76, 190, 162);
		MainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("\uD559\uAD50\uD68C\uC6D0");
		label_1.setForeground(new Color(0, 100, 0));
		label_1.setFont(new Font("DX?슦?벑?깮B", Font.PLAIN, 16));
		label_1.setBounds(69, 10, 79, 30);
		panel_2.add(label_1);
		
		JButton btnLogin = new JButton("Login!");
		btnLogin.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnLogin.setForeground(new Color(47, 79, 79));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolLoginPanel");
			}
		});
		btnLogin.setBounds(51, 50, 97, 23);
		panel_2.add(btnLogin);
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolRegisterPanel");
			}
		});
		btnRegister.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnRegister.setForeground(new Color(47, 79, 79));
		btnRegister.setBounds(51, 102, 97, 23);
		panel_2.add(btnRegister);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("1?썕?븯??怨좎뼇?씠 R", Font.PLAIN, 15));
		lblWelcome.setBounds(203, 51, 78, 15);
		MainPanel.add(lblWelcome);
		
		JPanel StudentLoginPanel = new JPanel();
		StudentLoginPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentLoginPanel, "StudentLoginPanel");
		StudentLoginPanel.setLayout(null);
		//test
		JLabel lblLogin = new JLabel("\uD68C\uC6D0 \uB85C\uADF8\uC778");
		lblLogin.setFont(new Font("DX紐⑤뜕怨좊뵓B", Font.PLAIN, 20));
		lblLogin.setForeground(new Color(0, 0, 0));
		lblLogin.setBackground(new Color(248, 248, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(172, 30, 167, 28);
		StudentLoginPanel.add(lblLogin);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnGoBack.setForeground(new Color(25, 25, 112));
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(),"MainPanel");
			}
		});
		btnGoBack.setBounds(36, 34, 97, 23);
		StudentLoginPanel.add(btnGoBack);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblId.setBounds(115, 98, 24, 15);
		StudentLoginPanel.add(lblId);
		
		JLabel lblPw = new JLabel("PW:");
		lblPw.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblPw.setBounds(113, 146, 36, 15);
		StudentLoginPanel.add(lblPw);
		
		textField = new JTextField();
		textField.setBounds(151, 96, 192, 23);
		StudentLoginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 142, 192, 23);
		StudentLoginPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin_1 = new JButton("Login!");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=textField.getText();
				String pw=textField_1.getText();
				try {
					app.StudentLogin(id, pw);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cards.show(frmScheduleManagementSystem.getContentPane(),"StudentMenu");
			}
		});
		btnLogin_1.setForeground(new Color(25, 25, 112));
		btnLogin_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnLogin_1.setBounds(355, 98, 83, 67);
		StudentLoginPanel.add(btnLogin_1);
		
		JPanel MonthlyPanel = new JPanel();
		MonthlyPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(MonthlyPanel, "MonthlyPanel");
		MonthlyPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monthly Schedule");
		lblNewLabel.setBounds(160, 11, 154, 29);
		lblNewLabel.setFont(new Font("DX?슦?벑?깮B", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(176, 224, 230));
		MonthlyPanel.add(lblNewLabel);
		
		table_2 = new JTable();
		table_2.setBounds(14, 80, 438, 96);
		
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		MonthlyPanel.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(164, 52, 150, 16);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"2017", "12"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		MonthlyPanel.add(table_3);
		
		JButton btnNewButton_9 = new JButton("Go Back");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentMenu");
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_9.setForeground(new Color(25, 25, 112));
		btnNewButton_9.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_9.setBounds(373, 14, 95, 27);
		MonthlyPanel.add(btnNewButton_9);
		
		JPanel StudentRegisterPanel = new JPanel();
		StudentRegisterPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentRegisterPanel, "StudentRegisterPanel");
		StudentRegisterPanel.setLayout(null);
		
		JLabel label_2 = new JLabel("\uD559\uC0DD \uD68C\uC6D0 \uAC00\uC785");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("DX紐⑤뜕怨좊뵓B", Font.PLAIN, 20));
		label_2.setBounds(171, 10, 140, 31);
		StudentRegisterPanel.add(label_2);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(),"MainPanel");
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_2.setBounds(39, 15, 97, 23);
		StudentRegisterPanel.add(btnNewButton_2);
		
		JLabel lblId_1 = new JLabel("ID:");
		lblId_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblId_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId_1.setBounds(39, 55, 57, 15);
		StudentRegisterPanel.add(lblId_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 51, 140, 23);
		textField_2.setColumns(10);
		StudentRegisterPanel.add(textField_2);
		
		JLabel lblPassword = new JLabel("PassWord:");
		lblPassword.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(12, 116, 84, 15);
		StudentRegisterPanel.add(lblPassword);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 116, 225, 23);
		StudentRegisterPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Check");
		btnNewButton_3.setForeground(new Color(0, 0, 128));
		btnNewButton_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_3.setBounds(262, 51, 72, 24);
		StudentRegisterPanel.add(btnNewButton_3);
		
		JLabel lblPasswordCheck = new JLabel("PW Check:");
		lblPasswordCheck.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblPasswordCheck.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPasswordCheck.setBounds(12, 149, 84, 23);
		StudentRegisterPanel.add(lblPasswordCheck);
		
		textField_4 = new JTextField();
		textField_4.setBounds(109, 149, 225, 23);
		StudentRegisterPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSchool = new JLabel("School:");
		lblSchool.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblSchool.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchool.setBounds(39, 182, 57, 15);
		StudentRegisterPanel.add(lblSchool);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(109, 182, 225, 36);
		StudentRegisterPanel.add(comboBox);				
		comboBox.addItem("경희대학교");
	
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setBounds(12, 228, 84, 15);
		StudentRegisterPanel.add(lblDepartment);
		
		JFrame frm = new JFrame();

		JLabel label_combo = new JLabel();
		JTextField textField_combo = new JTextField();

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == comboBox_1)
				{
					String str = (String)comboBox_1.getSelectedItem();
					
				}
			}
		});
		comboBox_1.setBounds(109, 228, 225, 23);
		StudentRegisterPanel.add(comboBox_1);
		
		
		comboBox_1.addItem("컴퓨터공학과");
		comboBox_1.addItem("전자공학과");
		
		
		
		
		JButton btnNewButton_4 = new JButton("Next Step!");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String id=textField_2.getText();
				String nickname=textField_3.getText();
				String pw=textField_4.getText();
				String schoolName=comboBox.getSelectedItem().toString();
				String Major=comboBox_1.getSelectedItem().toString();
				try {
					app.StudentRegister(0, id, pw, schoolName, Major, nickname);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cards.show(frmScheduleManagementSystem.getContentPane(),"StudentTimeTablePanel");
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 128));
		btnNewButton_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_4.setBounds(362, 52, 97, 97);
		StudentRegisterPanel.add(btnNewButton_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(109, 84, 225, 21);
		StudentRegisterPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NickName:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 91, 72, 15);
		StudentRegisterPanel.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Skip Next");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String id=textField_2.getText();
				String nickname=textField_3.getText();
				String pw=textField_4.getText();
				String schoolName=comboBox.getSelectedItem().toString();
				String Major=comboBox_1.getSelectedItem().toString();
				try {
					app.StudentRegister(0, id, pw, schoolName, Major, nickname);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cards.show(frmScheduleManagementSystem.getContentPane(),"StudentLoginPanel");
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 128));
		btnNewButton_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_5.setBounds(362, 159, 97, 92);
		StudentRegisterPanel.add(btnNewButton_5);
		
		JPanel SchoolRegisterPanel = new JPanel();
		SchoolRegisterPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(SchoolRegisterPanel, "SchoolRegisterPanel");
		SchoolRegisterPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uD559\uAD50 \uD68C\uC6D0 \uAC00\uC785");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("DX紐⑤뜕怨좊뵓B", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(170, 9, 160, 28);
		SchoolRegisterPanel.add(lblNewLabel_2);
		
		JButton btnGoBack_1 = new JButton("Go Back");
		btnGoBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGoBack_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "MainPanel");
			}
		});
		btnGoBack_1.addMouseMotionListener(new MouseMotionAdapter() {
		
		});
		btnGoBack_1.setForeground(new Color(47, 79, 79));
		btnGoBack_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnGoBack_1.setBounds(45, 14, 97, 23);
		SchoolRegisterPanel.add(btnGoBack_1);
		
		JLabel lblId_2 = new JLabel("ID:");
		lblId_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblId_2.setBounds(32, 59, 57, 15);
		SchoolRegisterPanel.add(lblId_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 55, 141, 23);
		SchoolRegisterPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(101, 91, 251, 23);
		SchoolRegisterPanel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(101, 125, 251, 23);
		SchoolRegisterPanel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(101, 158, 251, 21);
		SchoolRegisterPanel.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Regitser Departments");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "AddDepartment");
			}
		});
		
		
		btnNewButton_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_6.setForeground(new Color(47, 79, 79));
		btnNewButton_6.setBounds(101, 189, 209, 23);
		SchoolRegisterPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Check");
		btnNewButton_7.setForeground(new Color(47, 79, 79));
		btnNewButton_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_7.setBounds(254, 55, 97, 23);
		SchoolRegisterPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Next Step!");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "TotalTimeTablePanel");
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_8.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8.setForeground(new Color(47, 79, 79));
		btnNewButton_8.setBounds(364, 56, 97, 93);
		SchoolRegisterPanel.add(btnNewButton_8);
		
		JLabel lblPassword_1 = new JLabel("PassWord:");
		lblPassword_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword_1.setBounds(12, 95, 77, 15);
		SchoolRegisterPanel.add(lblPassword_1);
		
		JLabel lblPwCheck = new JLabel("PW Check:");
		lblPwCheck.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblPwCheck.setBounds(22, 127, 77, 19);
		SchoolRegisterPanel.add(lblPwCheck);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(32, 161, 57, 15);
		SchoolRegisterPanel.add(lblName);
		
		JLabel lblDepartments = new JLabel("Departments:");
		lblDepartments.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblDepartments.setBounds(10, 191, 89, 19);
		SchoolRegisterPanel.add(lblDepartments);
		
		JPanel TotalTimeTablePanel = new JPanel();
		TotalTimeTablePanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(TotalTimeTablePanel, "TotalTimeTablePanel");
		TotalTimeTablePanel.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("School");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setForeground(new Color(0, 0, 128));
		btnNewButton_10.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_10.setBounds(14, 39, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_10);
		
		
		
		JButton btnNewButton_11 = new JButton("Major");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setForeground(new Color(0, 0, 128));
		btnNewButton_11.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_11.setBounds(132, 39, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Year");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setForeground(new Color(0, 0, 128));
		btnNewButton_12.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_12.setBounds(250, 39, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Semester");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13.setForeground(new Color(0, 0, 128));
		btnNewButton_13.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_13.setBounds(363, 39, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_13);
		
		Border border = BorderFactory.createTitledBorder("선택사항");
		
		JScrollPane scroll = new JScrollPane();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 71, 454, 170);
		TotalTimeTablePanel.add(scrollPane);
		
		JList list_1 = new JList();
		scrollPane.setViewportView(list_1);
		
		JButton btnNewButton_14 = new JButton("Go Back");
		btnNewButton_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolRegisterPanel");
			}
		});
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_14.setForeground(new Color(0, 0, 128));
		btnNewButton_14.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_14.setBounds(250, 5, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_14);
		
		JLabel label_6 = new JLabel("학교 전체 시간표");
		label_6.setFont(new Font("굴림", Font.PLAIN, 18));
		
		label_6.setBounds(16, 2, 190, 34);
		TotalTimeTablePanel.add(label_6);
		
		JButton btnNewButton_26 = new JButton("Complete");
		btnNewButton_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolLoginPanel");
			}
		});
		btnNewButton_26.setForeground(new Color(0, 0, 128));
		btnNewButton_26.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_26.setBounds(363, 5, 105, 27);
		TotalTimeTablePanel.add(btnNewButton_26);
		
		JPanel StudentTimeTablePanel = new JPanel();
		StudentTimeTablePanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentTimeTablePanel, "StudentTimeTablePanel");
		StudentTimeTablePanel.setLayout(null);
		
		Panel panel_4 = new Panel();
		panel_4.setBounds(22, 42, 198, 72);
		StudentTimeTablePanel.add(panel_4);
		panel_4.setLayout(null);
		
		txtProfile = new JTextField();
		txtProfile.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		txtProfile.setBounds(5, 9, 57, 55);
		txtProfile.setBackground(Color.GRAY);
		txtProfile.setForeground(Color.WHITE);
		txtProfile.setText("Profile");
		panel_4.add(txtProfile);
		txtProfile.setColumns(10);
		
		table_4 = new JTable();
		table_4.setBackground(Color.WHITE);
		table_4.setBounds(71, 9, 127, 64);
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		panel_4.add(table_4);
		User cur=app.getUser();
		Student stu=(Student)cur;
		table_4.setValueAt(stu.getId(), 0, 0);
		table_4.setValueAt(stu.getNickName(), 1, 0);
		table_4.setValueAt(stu.getSchool(), 2, 0);
		table_4.setValueAt(stu.getMajor(),3, 0);
		JLabel label_7 = new JLabel("학생 정보");
		label_7.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		label_7.setBounds(22, 18, 62, 18);
		StudentTimeTablePanel.add(label_7);
		
		JLabel lblNewLabel_3 = new JLabel("과목 선택");
		lblNewLabel_3.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(22, 130, 62, 18);
		StudentTimeTablePanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("시간표 미리보기");
		lblNewLabel_4.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(273, 50, 112, 25);
		StudentTimeTablePanel.add(lblNewLabel_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(22, 164, 198, 77);
		StudentTimeTablePanel.add(scrollPane_2);
		
		table_6 = new JTable();
		scrollPane_2.setViewportView(table_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(273, 79, 195, 162);
		StudentTimeTablePanel.add(scrollPane_3);
		
		table_5 = new JTable();
		scrollPane_3.setViewportView(table_5);
		
		JButton btnNewButton_21 = new JButton("Go Back");
		btnNewButton_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentRegisterPanel");
			}
		});
		btnNewButton_21.setForeground(new Color(47, 79, 79));
		btnNewButton_21.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_21.setBounds(273, 15, 91, 27);
		StudentTimeTablePanel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("Complete");
		btnNewButton_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentLoginPanel");
			}
			
		});
		btnNewButton_22.setForeground(new Color(47, 79, 79));
		btnNewButton_22.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_22.setBounds(368, 15, 100, 27);
		StudentTimeTablePanel.add(btnNewButton_22);
		
		JPanel DailyPanel = new JPanel();
		DailyPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(DailyPanel, "DailyPanel");
		DailyPanel.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setBounds(155, 3, 47, 24);
		DailyPanel.add(textField_12);
		textField_12.setText("날짜");
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(94, 3, 47, 24);
		DailyPanel.add(textField_13);
		textField_13.setText("요일");
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(33, 3, 47, 24);
		DailyPanel.add(textField_14);
		textField_14.setText("월");
		textField_14.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 61, 406, 100);
		DailyPanel.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Check", "Content"
			}
		));
		table.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_5 = new JLabel("일정");
		lblNewLabel_5.setBounds(33, 173, 62, 18);
		lblNewLabel_5.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		DailyPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To Do List");
		lblNewLabel_6.setBounds(33, 37, 140, 18);
		lblNewLabel_6.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		DailyPanel.add(lblNewLabel_6);

		JButton btnNewButton_15 = new JButton("Add To Do List");
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "AddToDoList");
			}
		});
		btnNewButton_15.setBounds(314, 33, 125, 27);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_15.setBounds(314, 33, 125, 27);
		btnNewButton_15.setForeground(new Color(47, 79, 79));
		btnNewButton_15.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		DailyPanel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Add Schedule");
		btnNewButton_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "AddSchedule");
			}
		});
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_16.setBounds(314, 167, 125, 27);
		btnNewButton_16.setForeground(new Color(47, 79, 79));
		btnNewButton_16.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		DailyPanel.add(btnNewButton_16);
		
		JButton btnNewButton_23 = new JButton("Go Back");
		btnNewButton_23.setBounds(334, 2, 105, 27);
		btnNewButton_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentMenu");
			}
		});
		btnNewButton_23.setForeground(new Color(47, 79, 79));
		btnNewButton_23.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DailyPanel.add(btnNewButton_23);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(33, 203, 406, 291);
		DailyPanel.add(scrollPane_4);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\uC911\uC694\uB3C4", "\uC608\uC815 \uC2DC\uAC04", "\uACFC\uC81Cor\uC2DC\uD5D8", "Check"
			}
		));
		scrollPane_4.setViewportView(table_1);
		Daily_Schedule day=new Daily_Schedule();
		day=app.getToday();
		ToDoList_ItemType todo=new ToDoList_ItemType();
		Schedule_ItemType sche=new Schedule_ItemType();
		for(int i=0;i<10;i++)
		{
			todo=day.Get_TodoList()[i];
			table.setValueAt(todo.Get_ColoringCheck(), i, 0);
			table.setValueAt(todo.Get_Name(), i, 1);
		}
		for(int i=0;i<day.Get_TimecontentList().length;i++)
		{
			sche=day.Get_TimecontentList()[i];
			table_1.setValueAt(sche.Get_TimeLine(), i, 0);
			table_1.setValueAt(sche.Get_TimeLine(), i, 1);
			table_1.setValueAt(sche.Get_Exam(), i, 2);
			table_1.setValueAt(sche.Get_Checking(), i, 3);
		}
		JButton btnNewButton_32 = new JButton("Check");
		btnNewButton_32.setForeground(new Color(47, 79, 79));
		btnNewButton_32.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_32.setBounds(195, 33, 105, 27);
		DailyPanel.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Check");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_33.setForeground(new Color(47, 79, 79));
		btnNewButton_33.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_33.setBounds(195, 167, 105, 27);
		DailyPanel.add(btnNewButton_33);
		
		JPanel ScoreBoardPanel = new JPanel();
		ScoreBoardPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(ScoreBoardPanel, "ScoreBoardPanel");
		
		JPanel SchoolLoginPanel = new JPanel();
		SchoolLoginPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(SchoolLoginPanel, "SchoolLoginPanel");
		SchoolLoginPanel.setLayout(null);
		
		JLabel label_3 = new JLabel("\uD559\uAD50 \uB85C\uADF8\uC778");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("DX紐⑤뜕怨좊뵓B", Font.PLAIN, 20));
		label_3.setBackground(new Color(248, 248, 255));
		label_3.setBounds(178, 29, 145, 28);
		SchoolLoginPanel.add(label_3);
		
		JButton button = new JButton("Go Back");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "MainPanel");
			}
		});
		button.setForeground(new Color(25, 25, 112));
		button.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		button.setBounds(45, 33, 97, 23);
		SchoolLoginPanel.add(button);
		
		JLabel label_4 = new JLabel("ID:");
		label_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_4.setBounds(80, 100, 24, 15);
		SchoolLoginPanel.add(label_4);
		
		JLabel label_5 = new JLabel("PW:");
		label_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_5.setBounds(75, 142, 36, 15);
		SchoolLoginPanel.add(label_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(132, 93, 192, 23);
		SchoolLoginPanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(131, 146, 192, 23);
		SchoolLoginPanel.add(textField_11);
		
		JButton button_1 = new JButton("Login!");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=textField_10.getText();
				String pw=textField_11.getText();
				try {
					app.SchoolLogin(id, pw);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setForeground(new Color(25, 25, 112));
		button_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		button_1.setBounds(342, 96, 83, 67);
		SchoolLoginPanel.add(button_1);
		
		JPanel AddDepartment = new JPanel();
		AddDepartment.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(AddDepartment, "AddDepartment");
		AddDepartment.setLayout(null);
		
		JList list = new JList();
		list.setBounds(27, 45, 430, 196);
		AddDepartment.add(list);
		
		JLabel lblAddDepartment = new JLabel("Add Department");
		lblAddDepartment.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 26));
		lblAddDepartment.setBounds(148, 15, 187, 18);
		AddDepartment.add(lblAddDepartment);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolRegisterPanel");
			}
		});
		btnComplete.setBackground(new Color(224, 255, 255));
		btnComplete.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnComplete.setForeground(new Color(0, 0, 128));
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComplete.setBounds(363, 12, 105, 27);
		AddDepartment.add(btnComplete);
		
		JPanel StudentMenu = new JPanel();
		StudentMenu.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentMenu, "StudentMenu");
		StudentMenu.setLayout(null);
		
		JButton btnNewButton_17 = new JButton("Daily View");
		btnNewButton_17.setBackground(new Color(224, 255, 255));
		btnNewButton_17.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_17.setForeground(new Color(0, 0, 128));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
			}
		});
		btnNewButton_17.setBounds(68, 85, 132, 27);
		StudentMenu.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Weekly View");
		btnNewButton_18.setBackground(new Color(224, 255, 255));
		btnNewButton_18.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_18.setForeground(new Color(0, 0, 128));
		btnNewButton_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "WeeklyPanel");
			}
		});
		btnNewButton_18.setBounds(68, 126, 132, 27);
		StudentMenu.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("Monthly View");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_19.setBackground(new Color(224, 255, 255));
		btnNewButton_19.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_19.setForeground(new Color(0, 0, 128));
		btnNewButton_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "MonthlyPanel");
			}
		});
		btnNewButton_19.setBounds(68, 165, 132, 27);
		StudentMenu.add(btnNewButton_19);
		
		JLabel lblNewLabel_7 = new JLabel("Student Menu");
		lblNewLabel_7.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel_7.setBounds(169, 39, 183, 18);
		StudentMenu.add(lblNewLabel_7);
		
		JButton btnNewButton_24 = new JButton("Update");
		btnNewButton_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentUpdate");
			}
		});
		btnNewButton_24.setBackground(new Color(224, 255, 255));
		btnNewButton_24.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_24.setForeground(new Color(0, 0, 128));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_24.setBounds(271, 124, 91, 27);
		StudentMenu.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Logout");
		btnNewButton_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "MainPanel");
			}
		});
		btnNewButton_25.setBackground(new Color(224, 255, 255));
		btnNewButton_25.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_25.setForeground(new Color(0, 0, 128));
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_25.setBounds(271, 85, 91, 27);
		StudentMenu.add(btnNewButton_25);
		
		JPanel WeeklyPanel = new JPanel();
		WeeklyPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(WeeklyPanel, "WeeklyPanel");
		WeeklyPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 68, 410, 18);
		WeeklyPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(-6, -20, 422, 45);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		table_7 = new JTable();
		table_7.setBounds(6, 20, 410, 18);
		panel_3.add(table_7);
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		JLabel lblNewLabel_8 = new JLabel("Weekly Schedule");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(160, 25, 186, 18);
		WeeklyPanel.add(lblNewLabel_8);
		
		JButton btnNewButton_20 = new JButton("Go back");
		btnNewButton_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentMenu");
			}
		});
		btnNewButton_20.setBackground(new Color(224, 255, 255));
		btnNewButton_20.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_20.setForeground(new Color(0, 0, 128));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_20.setBounds(363, 23, 105, 27);
		WeeklyPanel.add(btnNewButton_20);
		
		JPanel StudentUpdate = new JPanel();
		StudentUpdate.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentUpdate, "StudentUpdate");
		StudentUpdate.setLayout(null);

		JButton btnNewButton_27 = new JButton("Go Back");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_27.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(),"StudentMenu");
			}
		});
		btnNewButton_27.setForeground(new Color(0, 0, 128));
		btnNewButton_27.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_27.setBounds(39, 15, 97, 23);
		StudentUpdate.add(btnNewButton_27);
		
		JLabel lblUpdate = new JLabel("Update Information");
		lblUpdate.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblUpdate.setBounds(171, 10, 208, 31);
		StudentUpdate.add(lblUpdate);
		
		JLabel lblNewLabel_9 = new JLabel("ID:");
		lblNewLabel_9.setBounds(39, 85, 62, 18);
		lblNewLabel_9.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(39, 55, 57, 15);
		StudentUpdate.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("NickName:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(24, 91, 72, 15);
		StudentUpdate.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("PassWord:");
		lblNewLabel_11.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(12, 116, 84, 15);
		StudentUpdate.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("PW Check:");
		lblNewLabel_12.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setBounds(12, 149, 84, 23);
		StudentUpdate.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("School:");
		lblNewLabel_13.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setBounds(39, 182, 57, 15);
		StudentUpdate.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Department:");
		lblNewLabel_14.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_14.setBounds(12, 228, 84, 15);
		StudentUpdate.add(lblNewLabel_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(109, 51, 140, 23);
		StudentUpdate.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(109, 84, 225, 21);
		StudentUpdate.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(109, 116, 225, 23);
		StudentUpdate.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(109, 149, 225, 23);
		StudentUpdate.add(textField_18);
		textField_18.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(109, 182, 225, 36);
		StudentUpdate.add(comboBox_2);
		
		comboBox_2.addItem("경희대학교");
		
		
		
		JButton btnNewButton_28 = new JButton("Check");
		btnNewButton_28.setForeground(new Color(0, 0, 128));
		btnNewButton_28.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_28.setBounds(262, 51, 72, 24);
		StudentUpdate.add(btnNewButton_28);
		

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == comboBox_3)
				{
					String str = (String)comboBox_3.getSelectedItem();
					
				}
			}
		});
		comboBox_3.setBounds(109, 228, 225, 23);
		StudentUpdate.add(comboBox_3);
		
		
		comboBox_3.addItem("컴퓨터공학과");
		comboBox_3.addItem("전자공학과");
		
		
		
		JButton btnNewButton_29 = new JButton("Complete");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String id=textField_15.getText();
				String nickname=textField_16.getText();
				String pw=textField_17.getText();
				String schoolName=comboBox_2.getSelectedItem().toString();
				String Major=comboBox_3.getSelectedItem().toString();
				try {
					app.StudentRegister(0, id, pw, schoolName, Major, nickname);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cards.show(frmScheduleManagementSystem.getContentPane(),"StudentMenu");
			}
		});
		btnNewButton_29.setForeground(new Color(0, 0, 128));
		btnNewButton_29.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_29.setBounds(362, 52, 97, 97);
		StudentUpdate.add(btnNewButton_29);
		
		JPanel AddToDoList = new JPanel();
		AddToDoList.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(AddToDoList, "AddToDoList");
		AddToDoList.setLayout(null);
		
		textField_20 = new JTextField();
		textField_20.setBounds(45, 109, 373, 330);
		AddToDoList.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Add To Do List");
		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(169, 54, 208, 31);
		AddToDoList.add(lblNewLabel_15);
		
		JButton btnNewButton_30 = new JButton("Complete");
		btnNewButton_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name=textField_20.getText();
				app.registerSchedule(stu.getId(), name, app.getmonth(), app.getWeek(), app.getDate(), -1, 1, 4, false, false);
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
			}
		});
		btnNewButton_30.setBounds(114, 462, 105, 27);
		btnNewButton_30.setBackground(new Color(224, 255, 255));
		btnNewButton_30.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_30.setForeground(new Color(0, 0, 128));
		AddToDoList.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("Go Back");
		btnNewButton_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
			}
		});
		btnNewButton_31.setBounds(272, 462, 105, 27);
		btnNewButton_31.setBackground(new Color(224, 255, 255));
		btnNewButton_31.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_31.setForeground(new Color(0, 0, 128));
		AddToDoList.add(btnNewButton_31);
		
		JPanel AddSchedule = new JPanel();
		AddSchedule.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(AddSchedule, "AddSchedule");
		AddSchedule.setLayout(null);
		
		textField_19 = new JTextField();
		textField_19.setBounds(166, 71, 116, 27);
		AddSchedule.add(textField_19);
		textField_19.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(166, 212, 116, 26);
		AddSchedule.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("중요도");
		lblNewLabel_16.setBounds(68, 73, 62, 18);
		lblNewLabel_16.setFont(new Font("굴림", Font.BOLD, 18));
		AddSchedule.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("예정 시간");
		lblNewLabel_17.setBounds(68, 212, 92, 18);
		lblNewLabel_17.setFont(new Font("굴림", Font.BOLD, 18));
		AddSchedule.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("시험,과제여부");
		lblNewLabel_18.setBounds(68, 261, 116, 18);
		lblNewLabel_18.setFont(new Font("굴림", Font.BOLD, 16));
		AddSchedule.add(lblNewLabel_18);
		
		JButton btnNewButton_34 = new JButton("Complete");
		btnNewButton_34.setBounds(166, 301, 105, 27);
		btnNewButton_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
			}
		});
		btnNewButton_34.setBackground(new Color(224, 255, 255));
		btnNewButton_34.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_34.setForeground(new Color(0, 0, 128));
		AddSchedule.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("Go Back");
		btnNewButton_35.setBounds(354, 34, 105, 27);
		btnNewButton_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
			}
		});
		btnNewButton_35.setBackground(new Color(224, 255, 255));
		btnNewButton_35.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_35.setForeground(new Color(0, 0, 128));
		AddSchedule.add(btnNewButton_35);
		
		JLabel lblNewLabel_19 = new JLabel("Add Schedule");
		lblNewLabel_19.setBounds(171, 30, 208, 31);
		lblNewLabel_19.setFont(new Font("Dialog", Font.PLAIN, 20));
		AddSchedule.add(lblNewLabel_19);
		
		JLabel label_8 = new JLabel("타입");
		label_8.setBounds(68, 121, 57, 15);
		label_8.setFont(new Font("굴림", Font.BOLD, 18));
		AddSchedule.add(label_8);
		
		JLabel label_9 = new JLabel("이름");
		label_9.setFont(new Font("굴림", Font.BOLD, 18));
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setBounds(68, 174, 57, 15);
		AddSchedule.add(label_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("시험");
		rdbtnNewRadioButton.setBackground(new Color(176, 224, 230));
		rdbtnNewRadioButton.setBounds(186, 260, 62, 23);
		AddSchedule.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("과제");
		rdbtnNewRadioButton_1.setBackground(new Color(176, 224, 230));
		rdbtnNewRadioButton_1.setBounds(252, 260, 62, 23);
		AddSchedule.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNothing = new JRadioButton("Nothing");
		rdbtnNothing.setBackground(new Color(176, 224, 230));
		rdbtnNothing.setBounds(320, 260, 121, 23);
		AddSchedule.add(rdbtnNothing);
		boolean exam=false;
		boolean assign=false;
		if(rdbtnNewRadioButton.isSelected())
		{
			exam=true;
		}
		else if(rdbtnNewRadioButton_1.isSelected())
		{
			assign=true;
		}
		else if(rdbtnNothing.isSelected())
		{
			exam=false;
			assign=false;
		}
		JRadioButton rdbtnSchool = new JRadioButton("School");

		rdbtnSchool.setBackground(new Color(176, 224, 230));
		rdbtnSchool.setBounds(165, 119, 72, 23);
		AddSchedule.add(rdbtnSchool);
		
		JRadioButton rdbtnPrivate = new JRadioButton("Private");
		rdbtnPrivate.setBackground(new Color(176, 224, 230));
		rdbtnPrivate.setBounds(274, 119, 79, 23);
		AddSchedule.add(rdbtnPrivate);
		int type=0;
		if(rdbtnSchool.isSelected())
		{
			type=0;
		}
		else if(rdbtnPrivate.isSelected())
		{
			type=1;
		}
		textField_21 = new JTextField();
		textField_21.setBounds(166, 164, 162, 27);
		AddSchedule.add(textField_21);
		textField_21.setColumns(10);
		String name=textField_21.getText();
		int time=Integer.parseInt(textField_22.getText());
		app.registerSchedule(stu.getId(), name, app.getmonth(), app.getWeek(), app.getDate(), time, type, 4,exam,assign);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
