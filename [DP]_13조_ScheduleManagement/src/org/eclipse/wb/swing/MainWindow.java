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
import ScheduleManagement.DBHandler;
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
import java.awt.SystemColor;

import javax.swing.JList;
import javax.print.DocFlavor.STRING;
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
import java.util.ArrayList;

import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

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
	private JTable table_8;
	private JTextField textField_20;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTable table_9;
	private JTable table_10;
	private BarChart3DDemo3 ScoreBoard1;
	protected String[] MainWindow;
	protected String[] args;
	private JTable table_11;
	private JTable table_12;
	private JTable table_13;
	private JTable table_14;
	private JTextField textField_24;
	private JTable table_15;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private DBHandler d_Handle;
	private JTextField textField_29;
	private JTextField textField_30;
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
		d_Handle=new DBHandler();
		initialize();


	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
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
				if(id!=""&&pw!="")
				{
					try {
						app.StudentLogin(id, pw);
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
					cards.show(frmScheduleManagementSystem.getContentPane(),"StudentMenu");
				}
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
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(14, 299, 438, 175);
		MonthlyPanel.add(scrollPane_9);
		table_12 = new JTable();
		scrollPane_9.setViewportView(table_12);
		table_12.setModel(new DefaultTableModel(
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
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Check", "To do"
			}
		));
		
		JLabel lblMonthlyDidList = new JLabel("Monthly Did List");
		lblMonthlyDidList.setBounds(160, 261, 144, 18);
		lblMonthlyDidList.setFont(new Font("DX?슦?벑?깮B", Font.PLAIN, 20));
		lblMonthlyDidList.setBackground(new Color(176, 224, 230));
		MonthlyPanel.add(lblMonthlyDidList);
		
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
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
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
		String MajorName="";
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == comboBox)
				{
					String str = (String)comboBox.getSelectedItem();
					
				}
			}
		});
		comboBox.setBounds(109, 182, 225, 36);
		StudentRegisterPanel.add(comboBox);				
		ArrayList<ArrayList<String>> temp=new ArrayList<ArrayList<String>>();
		try {
			temp=d_Handle.getAllSchools();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if(temp.size()!=0)
		{
			for(int i=0;i<temp.size();i++)
			{
				comboBox.addItem(temp.get(i).get(2));
				break;
			}
		}
		
	
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
		ArrayList<ArrayList<String>> maj=new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> s=new ArrayList<ArrayList<String>>();
		ArrayList<String> input=new ArrayList<String>();
		String schoolName=comboBox.getSelectedItem().toString();
		String schoolID="";
		input.add("");
		input.add(schoolName);
		input.add("");
		try {
			s=d_Handle.searchSchool(input);
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		schoolID=s.get(0).get(1);
		input.set(1, schoolID);
		try {
			maj=d_Handle.searchMajor(input);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if(maj.size()!=0)
		{
			for(int i=0;i<temp.size();i++)
			{
				//comboBox_1.addItem(maj.get(i).get(0));
			}
		}

		
		JButton btnNewButton_4 = new JButton("Next Step!");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String id=textField_2.getText();
				String nickname=textField_3.getText();
				String pw=textField_4.getText();
				String schoolName="ffff";
				String Major="C.E";
				try {
					app.StudentRegister(0, id, pw, schoolName, Major, nickname);
					app.StudentLogin(id, pw);
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
		final String schId=textField_6.getText();
		JButton btnNewButton_8 = new JButton("Next Step!");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String id=textField_6.getText();
				String pw=textField_7.getText();
				String SchoolName=textField_9.getText();
				try {
					app.SchoolRegister(0, id, pw, SchoolName);
					boolean log=app.SchoolLogin(id, pw);
					if(log)
					{
						cards.show(frmScheduleManagementSystem.getContentPane(), "AddDepartment");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		
		JLabel lblList = new JLabel("Registered Class List");
		scrollPane.setColumnHeaderView(lblList);
		
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
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_8.setBounds(14, 280, 454, 16);
		TotalTimeTablePanel.add(table_8);
		
		JLabel lblNewLabel_20 = new JLabel("학교 이름");
		lblNewLabel_20.setBounds(13, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("수업 시간");
		lblNewLabel_21.setBounds(80, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("강의명");
		lblNewLabel_22.setBounds(156, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("교수명");
		lblNewLabel_23.setBounds(218, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("수업교실");
		lblNewLabel_24.setBounds(274, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Credits");
		lblNewLabel_25.setBounds(345, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Type");
		lblNewLabel_26.setBounds(406, 250, 62, 18);
		TotalTimeTablePanel.add(lblNewLabel_26);
		
		JButton btnComplete_1 = new JButton("Add");
		btnComplete_1.setBounds(363, 308, 105, 27);
		btnComplete_1.setForeground(new Color(0, 0, 128));
		btnComplete_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		TotalTimeTablePanel.add(btnComplete_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(14, 40, 105, 24);
		TotalTimeTablePanel.add(comboBox_4);
		comboBox_4.addItem("학교명");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(132, 40, 105, 24);
		TotalTimeTablePanel.add(comboBox_5);
		comboBox_5.addItem("전공");
		comboBox_5.addItem("컴퓨터공학과");
		comboBox_5.addItem("전자공학과");
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(250, 40, 105, 24);
		TotalTimeTablePanel.add(comboBox_6);
		comboBox_6.addItem("강의명");
		comboBox_6.addItem("인간의 가치 탐색");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(363, 40, 105, 24);
		TotalTimeTablePanel.add(comboBox_7);
		comboBox_7.addItem("교수명");
		comboBox_7.addItem("이승형");
		
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
		Student stu=new Student();
		User cur=new User();
		//cur=app.getUser();
		//Student stu1=(Student)cur;
		//table_4.setValueAt(stu1.getId(), 0, 0);
		//table_4.setValueAt(stu1.getNickName(), 1, 0);
		//table_4.setValueAt(stu1.getSchool(), 2, 0);
		//table_4.setValueAt(stu1.getMajor(),3, 0);
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
				cards.show(frmScheduleManagementSystem.getContentPane(), "DailyPanel");
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
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(22, 269, 446, 107);
		StudentTimeTablePanel.add(scrollPane_2);
		
		table_6 = new JTable();
		scrollPane_2_1.setViewportView(table_6);
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"School", "Major", "Name", "Professor", "Time", "Room", "Credits"
			}
		));
		
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
		scrollPane_1.setBounds(33, 81, 406, 100);
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
		lblNewLabel_5.setBounds(33, 191, 62, 18);
		lblNewLabel_5.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		DailyPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To Do List");
		lblNewLabel_6.setBounds(33, 37, 140, 18);
		lblNewLabel_6.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 22));
		DailyPanel.add(lblNewLabel_6);

		JButton btnNewButton_15 = new JButton("Add To Do List");
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int check=Integer.parseInt(textField_29.getText());
				String name=textField_30.getText();
				app.registerSchedule(app.getUser().getId(), "ffff", app.getmonth()+1, app.getWeek(), app.getDate(), -1, 0, 4, false, false);
				for(int i=0;i<10;i++)
				{
					if(table.getValueAt(i, 0)==null)
					{
						table.setValueAt(check, i, 0);
						table.setValueAt(name, i, 1);
						break;
					}
				}
				
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
		btnNewButton_16.setBounds(314, 190, 125, 27);
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
		scrollPane_4.setBounds(33, 219, 406, 291);
		DailyPanel.add(scrollPane_4);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, "AM 00:00 ~ 00:15 ", null, null},
					{null, "00:15 ~ 00:30", null, null},
					{null, "00:30 ~ 00:45", null, null},
					{null, "00:45 ~ 01:00", null, null},
					{null, "01:00 ~ 01:15", null, null},
					{null, "01:15 ~ 01:30", null, null},
					{null, "01:30 ~ 01:45", null, null},
					{null, "01:45 ~ 02:00", null, null},
					{null, "02:00 ~ 02:15", null, null},
					{null, "02:15 ~ 02:30", null, null},
					{null, "02:30 ~ 02:45", null, null},
					{null, "02:45 ~ 03:00", null, null},
					{null, "03:00 ~ 03:15", null, null},
					{null, "03:15 ~ 03:30", null, null},
					{null, "03:30 ~ 03:45", null, null},
					{null, "03:45 ~ 04:00", null, null},
					{null, "04:00 ~ 04:15", null, null},
					{null, "04:15 ~ 04:30", null, null},
					{null, "04:30 ~ 04:45", null, null},
					{null, "04:45 ~ 05:00", null, null},
					{null, "05:00 ~ 05:15", null, null},
					{null, "05:15 ~ 05:30", null, null},
					{null, "05:30 ~ 05:45", null, null},
					{null, "05:45 ~ 06:00", null, null},
					{null, "06:00 ~ 06:15", null, null},
					{null, "06:15 ~ 06:30", null, null},
					{null, "06:30 ~ 06:45", null, null},
					{null, "06:45 ~ 07:00", null, null},
					{null, "07:00 ~ 07:15", null, null},
					{null, "07:15 ~ 07:30", null, null},
					{null, "07:30 ~ 07:45", null, null},
					{null, "07:45 ~ 08:00", null, null},
					{null, "08:00 ~ 08:15", null, null},
					{null, "08:15 ~ 08:30", null, null},
					{null, "08:30 ~ 08:45", null, null},
					{null, "08:45 ~ 09:00", null, null},
					{null, "09:00 ~ 09:15", null, null},
					{null, "09:15 ~ 09:30", null, null},
					{null, "09:30 ~ 09:45", null, null},
					{null, "09:45 ~ 10:00", null, null},
					{null, "10:00 ~ 10:15", null, null},
					{null, "10:15 ~ 10:30", null, null},
					{null, "10:30 ~ 10:45", null, null},
					{null, "10:45 ~ 11:00", null, null},
					{null, "11:00 ~ 11:15", null, null},
					{null, "11:15 ~ 11:30", null, null},
					{null, "11:30 ~ 11:45", null, null},
					{null, "11:45 ~ 12:00", null, null},
					{null, "PM 12:00 ~ 12:15", null, null},
					{null, "12:15 ~ 12:30", null, null},
					{null, "12:30 ~ 12:45", null, null},
					{null, "12:45 ~ 01:00", null, null},
					{null, "01:00 ~ 01:15", null, null},
					{null, "01:15 ~ 01:30", null, null},
					{null, "01:30 ~ 01:45", null, null},
					{null, "01:45 ~ 02:00", null, null},
					{null, "02:00 ~ 02:15", null, null},
					{null, "02:15 ~ 02:30", null, null},
					{null, "02:30 ~ 02:45", null, null},
					{null, "02:45 ~ 03:00", null, null},
					{null, "03:00 ~ 03:15", null, null},
					{null, "03:15 ~ 03:30", null, null},
					{null, "03:30 ~ 03:45", null, null},
					{null, "03:45 ~ 04:00", null, null},
					{null, "04:00 ~ 04:15", null, null},
					{null, "04:15 ~ 04:30", null, null},
					{null, "04:30 ~ 04:45", null, null},
					{null, "04:45 ~ 05:00", null, null},
					{null, "05:00 ~ 05:15", null, null},
					{null, "05:15 ~ 05:30", null, null},
					{null, "05:30 ~ 05:45", null, null},
					{null, "05:45 ~ 06:00", null, null},
					{null, "06:00 ~ 06:15", null, null},
					{null, "06:15 ~ 06:30", null, null},
					{null, "06:30 ~ 06:45", null, null},
					{null, "06:45 ~ 07:00", null, null},
					{null, "07:00 ~ 07:15", null, null},
					{null, "07:15 ~ 07:30", null, null},
					{null, "07:30 ~ 07:45", null, null},
					{null, "07:45 ~ 08:00", null, null},
					{null, "08:00 ~ 08:15", null, null},
					{null, "08:15 ~ 08:30", null, null},
					{null, "08:30 ~ 08:45", null, null},
					{null, "08:45 ~ 09:00", null, null},
					{null, "09:00 ~ 09:15", null, null},
					{null, "09:15 ~ 09:30", null, null},
					{null, "09:30 ~ 09:45", null, null},
					{null, "09:45 ~ 10:00", null, null},
					{null, "10:00 ~ 10:15", null, null},
					{null, "10:15 ~ 10:30", null, null},
					{null, "10:30 ~ 10:45", null, null},
					{null, "10:45 ~ 11:00", null, null},
					{null, "11:00 ~ 11:15", null, null},
					{null, "11:15 ~ 11:30", null, null},
					{null, "11:30 ~ 11:45", null, null},
					{null, "11:45 ~ 12:00", null, null},
				},
				new String[] {
					"\uC911\uC694\uB3C4", "\uC608\uC815 \uC2DC\uAC04", "\uACFC\uC81Cor\uC2DC\uD5D8", "Check"
				}
			));
			scrollPane_4.setViewportView(table_1);
		textField_14.setText(Integer.toString(app.getmonth()+1));
		textField_13.setText(Integer.toString(app.getWeek()));
		String date="";
		switch(app.getDate())
		{
		case 0:
			{
				date="일";
			break;
			}
		case 1:
		{
			date="월";
		break;
		}
		case 2:
		{
			date="화";
		break;
		}
		case 3:
		{
			date="수";
		break;
		}
		case 4:
		{
			date="목";
		break;
		}
		case 5:
		{
			date="금";
		break;
		}
		case 6:{
			date="토";
		break;
		}
		}
		textField_12.setText(date);
		Daily_Schedule day=new Daily_Schedule();
		day=app.getToday();
		ToDoList_ItemType todo=new ToDoList_ItemType();
		Schedule_ItemType sche=new Schedule_ItemType();
		if(day.Get_TodoList()[0].Get_ColoringCheck()!=0)
		{
		for(int i=0;i<10;i++)
		{
			todo=day.Get_TodoList()[i];
			table.setValueAt(todo.Get_ColoringCheck(), i, 0);
			table.setValueAt(todo.Get_Name(), i, 1);
		}
		}
		if(day.Get_TimecontentList()[0].Get_TimeLine()!=9999)
		{
		for(int i=0;i<day.Get_TimecontentList().length;i++)
		{
			sche=day.Get_TimecontentList()[i];
			table_1.setValueAt(sche.Get_TimeLine(), i, 0);
			table_1.setValueAt(sche.Get_Exam(), i, 2);
			table_1.setValueAt(sche.Get_Checking(), i, 3);
		}
		}
		JButton btnNewButton_32 = new JButton("Check");
		btnNewButton_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int ch=Integer.parseInt(textField_29.getText());
				String name=textField_30.getText();
				for(int i=0;i<10;i++)
				{
					if(table.getValueAt(i, 1)==name)
					{
						table.setValueAt(ch,i, 0);
						break;
					}
				}
				app.sortSchedule(app.getmonth(), app.getWeek(), app.getDate(), name);
			}
		});
		btnNewButton_32.setForeground(new Color(47, 79, 79));
		btnNewButton_32.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_32.setBounds(195, 33, 105, 27);
		DailyPanel.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Check");
		btnNewButton_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_33.setForeground(new Color(47, 79, 79));
		btnNewButton_33.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_33.setBounds(195, 190, 105, 27);
		DailyPanel.add(btnNewButton_33);
		
		textField_29 = new JTextField();
		textField_29.setBounds(33, 60, 116, 21);
		DailyPanel.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(155, 60, 116, 21);
		DailyPanel.add(textField_30);
		textField_30.setColumns(10);
		
		JPanel ScoreBoardPanel = new JPanel();
		ScoreBoardPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(ScoreBoardPanel, "ScoreBoardPanel");
ScoreBoardPanel.setLayout(null);
		
		JButton btnNewButton_12_1 = new JButton("Today's Checking Number");
		btnNewButton_12_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ScoreBoard1.main(args);
			}
		});
		btnNewButton_12_1.setBounds(128, 216, 219, 27);
		btnNewButton_12_1.setForeground(new Color(0, 0, 128));
		btnNewButton_12_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnNewButton_12_1);
		
		JButton btnNewButton_37 = new JButton("Today's Final Point");
		btnNewButton_37.setBounds(128, 129, 219, 27);
		btnNewButton_37.setForeground(new Color(0, 0, 128));
		btnNewButton_37.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("Today's Getting Goal");
		btnNewButton_38.setBounds(128, 294, 219, 27);
		btnNewButton_38.setForeground(new Color(0, 0, 128));
		btnNewButton_38.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Today's Getting Bucket List");
		btnNewButton_39.setBounds(128, 367, 219, 27);
		btnNewButton_39.setForeground(new Color(0, 0, 128));
		btnNewButton_39.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnNewButton_39);
		
		JLabel lblScoreboardFeedback = new JLabel("ScoreBoard & Feedback");
		lblScoreboardFeedback.setFont(new Font("굴림", Font.BOLD, 23));
		lblScoreboardFeedback.setBounds(108, 78, 307, 18);
		ScoreBoardPanel.add(lblScoreboardFeedback);
		
		JButton btnGoBack_2 = new JButton("Go Back");
		btnGoBack_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentMenu");
			}
		});
		btnGoBack_2.setBounds(363, 23, 105, 27);
		btnGoBack_2.setForeground(new Color(0, 0, 128));
		btnGoBack_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnGoBack_2);
		
		JLabel lblNewLabel_31 = new JLabel("Today's Getting Goal");
		lblNewLabel_31.setBounds(14, 269, 185, 18);
		lblNewLabel_31.setForeground(new Color(0, 0, 128));
		lblNewLabel_31.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Today's Getting Bucket List");
		lblNewLabel_32.setBounds(249, 269, 219, 18);
		lblNewLabel_32.setForeground(new Color(0, 0, 128));
		lblNewLabel_32.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(lblNewLabel_32);
		
		JLabel lblFinalPoint = new JLabel("Final Point here");
		lblFinalPoint.setFont(new Font("굴림", Font.BOLD, 18));
		lblFinalPoint.setBounds(14, 197, 185, 18);
		ScoreBoardPanel.add(lblFinalPoint);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(14, 316, 185, 80);
		ScoreBoardPanel.add(scrollPane_10);
		
		table_13 = new JTable();
		scrollPane_10.setViewportView(table_13);
		table_13.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
			},
			new String[] {
				"Complete Goal"
			}
		));
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(249, 316, 197, 80);
		ScoreBoardPanel.add(scrollPane_11);
		
		table_14 = new JTable();
		scrollPane_11.setViewportView(table_14);
		table_14.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
			},
			new String[] {
				"Complete BucketList"
			}
		));
		
		JLabel lblNewLabel_34 = new JLabel("Today's Feedback");
		lblNewLabel_34.setBounds(14, 420, 141, 18);
		lblNewLabel_34.setForeground(new Color(0, 0, 128));
		lblNewLabel_34.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(lblNewLabel_34);
		
		textField_24 = new JTextField();
		textField_24.setBounds(14, 448, 375, 52);
		ScoreBoardPanel.add(textField_24);
		textField_24.setColumns(10);
		
		JButton btnNewButton_37_1 = new JButton("Add");
		btnNewButton_37_1.setBounds(405, 473, 63, 27);
		btnNewButton_37_1.setForeground(new Color(0, 0, 128));
		btnNewButton_37_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		ScoreBoardPanel.add(btnNewButton_37_1);
		
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
				boolean login=false;
				String id=textField_10.getText();
				String pw=textField_11.getText();
				try {
					login=app.SchoolLogin(id, pw);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(login)
				{
					cards.show(frmScheduleManagementSystem.getContentPane(), "TotalTimeTablePanel");
				}
				else
				{
					
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
		
		JLabel lblAddDepartment = new JLabel("Add Department");
		lblAddDepartment.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 26));
		lblAddDepartment.setBounds(148, 15, 187, 18);
		AddDepartment.add(lblAddDepartment);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "TotalTimeTablePanel");
			}
		});
		btnComplete.setBackground(new Color(224, 255, 255));
		btnComplete.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnComplete.setForeground(new Color(0, 0, 128));
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComplete.setBounds(363, 76, 105, 27);
		AddDepartment.add(btnComplete);
		JButton btnNewButton_36 = new JButton("Go Back");
		btnNewButton_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolRegisterPanel");
			}
		});
		btnNewButton_36.setBackground(new Color(224, 255, 255));
		btnNewButton_36.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_36.setForeground(new Color(0, 0, 128));
		btnNewButton_36.setBounds(363, 22, 105, 27);
		AddDepartment.add(btnNewButton_36);
		
		textField_23 = new JTextField();
		textField_23.setBounds(121, 375, 224, 27);
		AddDepartment.add(textField_23);
		textField_23.setColumns(10);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(49, 128, 368, 158);
		AddDepartment.add(scrollPane_5);
		
		JList list = new JList();
		scrollPane_5.setViewportView(list);
		table_9 = new JTable();
		scrollPane_5.setViewportView(table_9);
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Registered Department List"
			}
		));
		
		JLabel lblNewLabel_27 = new JLabel("Current Department");
		lblNewLabel_27.setBounds(127, 85, 218, 18);
		lblNewLabel_27.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 26));
		AddDepartment.add(lblNewLabel_27);
		
		JButton btnNewButton_10_1 = new JButton("Add");
		btnNewButton_10_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String dep=textField_23.getText();
			ArrayList<ArrayList<String>> depp=new ArrayList<ArrayList<String>>();
			ArrayList<String> input=new ArrayList<String>();

			try {
				depp=d_Handle.getAllMajor();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int num=depp.size();
			input.add(Integer.toString(num));
			input.add(app.getUser().getId());
			input.add(dep);
			try {
				d_Handle.insertRowToMajor(input);
				for(int i=0;i<table_9.getRowCount();i++)
				{
					if(table_9.getValueAt(i, 0)==null)
						{
						table_9.setValueAt(dep, i, 0);
						break;
						}
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_10_1.setBounds(176, 414, 105, 27);
		btnNewButton_10_1.setBackground(new Color(224, 255, 255));
		btnNewButton_10_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_10_1.setForeground(new Color(0, 0, 128));
		AddDepartment.add(btnNewButton_10_1);
		
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
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(37, 218, 410, 199);
		WeeklyPanel.add(scrollPane_7);
		
		table_11 = new JTable();
		scrollPane_7.setViewportView(table_11);
		table_11.setModel(new DefaultTableModel(
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
				{null, null},
			},
			new String[] {
				"Checking", "To do"
			}
		));
		
		JLabel lblNewLabel_29 = new JLabel("Weekly Did List");
		lblNewLabel_29.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_29.setBounds(160, 188, 221, 18);
		WeeklyPanel.add(lblNewLabel_29);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(37, 108, 410, 49);
		WeeklyPanel.add(scrollPane_8);
		
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
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(47, 137, 373, 130);
		AddToDoList.add(scrollPane_6);
		
		table_10 = new JTable();
		scrollPane_6.setViewportView(table_10);
		table_10.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Registered To do list"
			}
		));
		
		JLabel lblNewLabel_28 = new JLabel("Current List");
		lblNewLabel_28.setBounds(158, 86, 208, 31);
		lblNewLabel_28.setFont(new Font("Dialog", Font.PLAIN, 23));
		AddToDoList.add(lblNewLabel_28);
		
		JButton btnNewButton_11_1 = new JButton("Add");
		btnNewButton_11_1.setBounds(179, 437, 105, 27);
		btnNewButton_11_1.setBackground(new Color(224, 255, 255));
		btnNewButton_11_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_11_1.setForeground(new Color(0, 0, 128));
		AddToDoList.add(btnNewButton_11_1);
		
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
		String time=textField_22.getText();
		int itime=-1;
		if(time=="")
		{
			itime=-1;
		}
		else
		{
			time="-1";
			itime=Integer.parseInt(time);
		}
		app.registerSchedule(stu.getId(), name, app.getmonth(), app.getWeek(), app.getDate(), itime, type, 4,exam,assign);
		JPanel SchoolMenu = new JPanel();
		SchoolMenu.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(SchoolMenu, "SchoolMenu");
		SchoolMenu.setLayout(null);
		
		JLabel lblNewLabel_35 = new JLabel("School Menu");
		lblNewLabel_35.setBounds(170, 108, 142, 18);
		lblNewLabel_35.setFont(new Font("Dialog", Font.PLAIN, 20));
		SchoolMenu.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Student List");
		lblNewLabel_36.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_36.setBounds(181, 171, 111, 18);
		SchoolMenu.add(lblNewLabel_36);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(44, 206, 383, 130);
		SchoolMenu.add(scrollPane_12);
		
		table_15 = new JTable();
		scrollPane_12.setViewportView(table_15);
		table_15.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uC804\uACF5", "\uD559\uBC88", "\uC774\uB984"
			}
		));
		
		JButton btnNewButton_38_1 = new JButton("Logout");
		btnNewButton_38_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "MainPanel");
			}
		});
		btnNewButton_38_1.setBounds(363, 12, 105, 27);
		btnNewButton_38_1.setBackground(new Color(224, 255, 255));
		btnNewButton_38_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_38_1.setForeground(new Color(0, 0, 128));
		SchoolMenu.add(btnNewButton_38_1);
		
		JButton btnNewButton_39_1 = new JButton("Update");
		btnNewButton_39_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "StudentLoginPanel");
			}
		});
		btnNewButton_39_1.setBounds(363, 51, 105, 27);
		btnNewButton_39_1.setBackground(new Color(224, 255, 255));
		btnNewButton_39_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_39_1.setForeground(new Color(0, 0, 128));
		SchoolMenu.add(btnNewButton_39_1);
		
		JPanel SchoolUpdate = new JPanel();
		SchoolUpdate.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(SchoolUpdate, "SchoolUpdate");
		SchoolUpdate.setLayout(null);
		
		JLabel label_8_1 = new JLabel("ID:");
		label_8_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_8_1.setBounds(36, 185, 57, 15);
		SchoolUpdate.add(label_8_1);
		
		JLabel label_9_1 = new JLabel("PassWord:");
		label_9_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_9_1.setBounds(16, 221, 77, 15);
		SchoolUpdate.add(label_9_1);
		
		JLabel label_10 = new JLabel("PW Check:");
		label_10.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_10.setBounds(26, 253, 77, 19);
		SchoolUpdate.add(label_10);
		
		JLabel label_11 = new JLabel("Name:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_11.setBounds(36, 287, 57, 15);
		SchoolUpdate.add(label_11);
		
		JLabel label_12 = new JLabel("Departments:");
		label_12.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		label_12.setBounds(14, 317, 89, 19);
		SchoolUpdate.add(label_12);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(108, 179, 141, 23);
		SchoolUpdate.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(108, 215, 251, 23);
		SchoolUpdate.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(108, 249, 251, 23);
		SchoolUpdate.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(108, 282, 251, 21);
		SchoolUpdate.add(textField_28);
		
		JButton btnAddDepartments = new JButton("Add Departments");
		btnAddDepartments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "AddDepartment");
			}
		});
		btnAddDepartments.setForeground(new Color(47, 79, 79));
		btnAddDepartments.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnAddDepartments.setBounds(108, 313, 209, 23);
		SchoolUpdate.add(btnAddDepartments);
		
		JButton button_3 = new JButton("Check");
		button_3.setForeground(new Color(47, 79, 79));
		button_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(261, 179, 97, 23);
		SchoolUpdate.add(button_3);
		
		JButton button_4 = new JButton("Next Step!");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "TotalTimeTablePanel");
			}
		});
		button_4.setForeground(new Color(47, 79, 79));
		button_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		button_4.setBounds(371, 180, 97, 93);
		SchoolUpdate.add(button_4);
		
		JLabel label_13 = new JLabel("학교 회원 정보 수정");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_13.setBounds(135, 121, 178, 28);
		SchoolUpdate.add(label_13);
		
		JButton button_5 = new JButton("Go Back");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "SchoolMenu");
			}
		});
		button_5.setForeground(new Color(47, 79, 79));
		button_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		button_5.setBounds(371, 12, 97, 23);
		SchoolUpdate.add(button_5);
		
		
		
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
