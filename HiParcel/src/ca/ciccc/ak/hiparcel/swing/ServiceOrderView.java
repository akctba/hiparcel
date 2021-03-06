package ca.ciccc.ak.hiparcel.swing;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ca.ciccc.ak.hiparcel.adb.UsersDB;
import ca.ciccc.ak.hiparcel.model.User;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class ServiceOrderView {

	private JFrame frmSenderNew;
	private JFormattedDateTextField textField;
	JComboBox<User> cmbRecipients;
	JLabel lblSender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServiceOrderView window = new ServiceOrderView();
					window.frmSenderNew.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServiceOrderView() {
		initialize();
		loadData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSenderNew = new JFrame();
		frmSenderNew.setTitle("Sender - new ServiceOrder");
		frmSenderNew.setBounds(100, 100, 800, 500);
		frmSenderNew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSenderNew.getContentPane().setLayout(null);

		//panel to basic information about service order
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Service Order info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(19, 30, 282, 100);
		frmSenderNew.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblSo = new JLabel("S.O. #: ");
		panel.add(lblSo);

		JLabel soNumber = new JLabel("###");
		panel.add(soNumber);

		JLabel lblRegisterDate = new JLabel("Register date:");
		panel.add(lblRegisterDate);

		JLabel registerDate = new JLabel("__/__/__");
		panel.add(registerDate);

		JLabel lblRecipient = new JLabel("Recipient: ");
		panel.add(lblRecipient);

		cmbRecipients = new JComboBox();
		panel.add(cmbRecipients);

		JLabel lblDateToPick = new JLabel("Date to pick up: ");
		panel.add(lblDateToPick);

		textField = new JFormattedDateTextField();
		textField.setValue(new Date());
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Sender", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(362, 30, 418, 49);
		frmSenderNew.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		lblSender = new JLabel("______");
		lblSender.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panel_1.add(lblSender);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Items to deliver", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(19, 142, 761, 243);
		frmSenderNew.getContentPane().add(panel_2);

		JList itemList = new JList();
		// panel_2.add(itemList);

		JScrollPane scrollPane = new JScrollPane(itemList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		// scrollPane.setViewportView(itemList);
		// itemList.setLayoutOrientation(JList.VERTICAL);

		panel_2.add(scrollPane);
		
		JButton btnAddItem = new JButton("Add Item");
		panel_2.add(btnAddItem);
		
		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.setEnabled(false);
		panel_2.add(btnRemoveItem);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(19, 397, 761, 49);
		frmSenderNew.getContentPane().add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblCourierLbl = new JLabel("Courier: ");
		panel_3.add(lblCourierLbl);

		JLabel lblCourier = new JLabel("_______");
		panel_3.add(lblCourier);

		JLabel lblFinishedIn = new JLabel("   |   Finished: ");
		panel_3.add(lblFinishedIn);

		JLabel lblDtfinished = new JLabel("___/___/____");
		panel_3.add(lblDtfinished);

		JLabel lblSituationLBL = new JLabel("   |   Situation: ");
		panel_3.add(lblSituationLBL);

		JLabel lblSituation = new JLabel("________");
		panel_3.add(lblSituation);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(362, 91, 418, 39);
		frmSenderNew.getContentPane().add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton btnNewSo = new JButton("New SO");
		panel_4.add(btnNewSo);

		JButton btnSave = new JButton("Save");
		panel_4.add(btnSave);

	}

	/**
	 * Load data from database
	 */
	private void loadData() {
		UsersDB usersDB = new UsersDB();
		List<User> allCurrentUsers = usersDB.listAll();

		// Current user
		Random random = new Random(); // Mock code
		User current = usersDB.selectById(random.nextInt(10));
		lblSender.setText(current.toString());

		// current user cannot send to yourself
		allCurrentUsers.remove(current);

		// recipients
		if (cmbRecipients != null) {
			// clean combobox items
			cmbRecipients.removeAllItems();
			// Add all current users
			allCurrentUsers.forEach(user -> cmbRecipients.addItem(user));

		}


	}

}
