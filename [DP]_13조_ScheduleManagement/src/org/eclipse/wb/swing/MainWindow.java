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

public class MainWindow {


	private JFrame frmScheduleManagementSystem;
	private CardLayout cards=new CardLayout(0,0);
	private JTextField textField;
	private JTextField textField_1;
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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScheduleManagementSystem = new JFrame();
		frmScheduleManagementSystem.setTitle("Schedule Management System");
		frmScheduleManagementSystem.getContentPane().setLayout(cards);
		frmScheduleManagementSystem.setSize(500,300);
		JPanel MainPanel = new JPanel();
		frmScheduleManagementSystem.getContentPane().add(MainPanel, "MainPanel");
		MainPanel.setLayout(null);
		
		JLabel lblScheduleManager = new JLabel("학생 일정 관리 프로그램");
		lblScheduleManager.setFont(new Font("DX모던고딕B", Font.PLAIN, 20));
		lblScheduleManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblScheduleManager.setBounds(143, 23, 209, 27);
		MainPanel.add(lblScheduleManager);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(34, 76, 187, 162);
		MainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("학생 회원");
		label.setBounds(70, 10, 57, 15);
		panel_1.add(label);
		
		JButton btnNewButton = new JButton("Login!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "LoginPanel");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(48, 49, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register!");
		btnNewButton_1.setBounds(48, 102, 97, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(267, 76, 190, 162);
		MainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("학교 회원");
		label_1.setBounds(73, 10, 57, 15);
		panel_2.add(label_1);
		
		JButton btnLogin = new JButton("Login!");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(), "LoginPanel");
			}
		});
		btnLogin.setBounds(51, 50, 97, 23);
		panel_2.add(btnLogin);
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.setBounds(51, 102, 97, 23);
		panel_2.add(btnRegister);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 15));
		lblWelcome.setBounds(218, 51, 57, 15);
		MainPanel.add(lblWelcome);
		
		JPanel LoginPanel = new JPanel();
		frmScheduleManagementSystem.getContentPane().add(LoginPanel, "LoginPanel");
		LoginPanel.setLayout(null);
		
		JLabel lblLogin = new JLabel("회원 로그인");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(182, 21, 114, 28);
		LoginPanel.add(lblLogin);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(frmScheduleManagementSystem.getContentPane(),"MainPanel");
			}
		});
		btnGoBack.setBounds(40, 24, 97, 23);
		LoginPanel.add(btnGoBack);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(129, 98, 24, 15);
		LoginPanel.add(lblId);
		
		JLabel lblPw = new JLabel("PW:");
		lblPw.setBounds(129, 145, 24, 15);
		LoginPanel.add(lblPw);
		
		textField = new JTextField();
		textField.setBounds(165, 96, 164, 18);
		LoginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 142, 164, 23);
		LoginPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin_1 = new JButton("Login!");
		btnLogin_1.setBounds(283, 198, 97, 23);
		LoginPanel.add(btnLogin_1);
	}
}
