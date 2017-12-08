package org.eclipse.wb.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class PopUp extends JDialog {

	private final JPanel SchoolList = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PopUp dialog = new PopUp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PopUp() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(SchoolList, "name_7135415796411");
		SchoolList.setLayout(null);
		{
			JButton btnSelect = new JButton("Select");
			btnSelect.setActionCommand("OK");
			btnSelect.setBounds(259, 214, 77, 27);
			SchoolList.add(btnSelect);
		}
		{
			JButton button = new JButton("Cancel");
			button.setActionCommand("Cancel");
			button.setBounds(341, 214, 77, 27);
			SchoolList.add(button);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(14, 12, 404, 189);
			SchoolList.add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel plus = new JPanel();
			plus.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(plus, "name_7135438819606");
		}
	}

}
