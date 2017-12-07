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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;

import ScheduleManagement.App;
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
		initialize();
		app=new App();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScheduleManagementSystem = new JFrame();
		frmScheduleManagementSystem.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.setTitle("Schedule Management System");
		frmScheduleManagementSystem.getContentPane().setLayout(cards);
		frmScheduleManagementSystem.setSize(500,300);
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
		label.setFont(new Font("DX�슦�벑�깮B", Font.PLAIN, 16));
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
		label_1.setFont(new Font("DX�슦�벑�깮B", Font.PLAIN, 16));
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
		lblWelcome.setFont(new Font("1�썕�븯��怨좎뼇�씠 R", Font.PLAIN, 15));
		lblWelcome.setBounds(203, 51, 78, 15);
		MainPanel.add(lblWelcome);
		
		JPanel StudentLoginPanel = new JPanel();
		StudentLoginPanel.setBackground(new Color(176, 224, 230));
		frmScheduleManagementSystem.getContentPane().add(StudentLoginPanel, "StudentLoginPanel");
		StudentLoginPanel.setLayout(null);
		
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		StudentLoginPanel.add(panel);
		
		JButton btnLogin_1 = new JButton("Login!");
		btnLogin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=textField.getText();
				String pw=textField_1.getText();
				try {
					boolean res=app.StudentLogin(id, pw);
					if(res)
					{
						cards.show(frmScheduleManagementSystem.getContentPane(),"MonthlyPanel");
					}
					else
					{
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
		lblNewLabel.setFont(new Font("DX�슦�벑�깮B", Font.PLAIN, 20));
		lblNewLabel.setBounds(179, 10, 139, 31);
		MonthlyPanel.add(lblNewLabel);
		
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
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
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
		StudentRegisterPanel.add(textField_2);
		textField_2.setColumns(10);
		
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
		//comboBox.addItem("a");
	
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setBounds(12, 228, 84, 15);
		StudentRegisterPanel.add(lblDepartment);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(109, 228, 225, 23);
		StudentRegisterPanel.add(comboBox_1);
		//comboBox_1.addItem("B");
		
		JButton btnNewButton_4 = new JButton("Next Step!");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String id=textField_2.getText();
				String nickname=textField_3.getText();
				String pw=textField_4.getText();
				String schoolName=comboBox.getSelectedItem().toString();
				String Major=comboBox_1.getSelectedItem().toString();
				app.StudentRegister(0, id, pw, schoolName, Major, nickname);
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
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String id=textField_2.getText();
				String nickname=textField_3.getText();
				String pw=textField_4.getText();
				String schoolName=comboBox.getSelectedItem().toString();
				String Major=comboBox_1.getSelectedItem().toString();
				app.StudentRegister(0, id, pw, schoolName, Major, nickname);
				cards.show(frmScheduleManagementSystem.getContentPane(),"MonthlyPanel");
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
		lblNewLabel_2.setBounds(179, 10, 131, 28);
		SchoolRegisterPanel.add(lblNewLabel_2);
		
		JButton btnGoBack_1 = new JButton("Go Back");
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
		frmScheduleManagementSystem.getContentPane().add(TotalTimeTablePanel, "TotalTimeTablePanel");
		
		JPanel StudentTimeTablePanel = new JPanel();
		frmScheduleManagementSystem.getContentPane().add(StudentTimeTablePanel, "StudentTimeTablePanel");
		
		JPanel DailyPanel = new JPanel();
		frmScheduleManagementSystem.getContentPane().add(DailyPanel, "DailyPanel");
		
		JPanel ScoreBoardPanel = new JPanel();
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 10, 10);
		SchoolLoginPanel.add(panel_3);
		
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
	}
}
