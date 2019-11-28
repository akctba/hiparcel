package ca.ciccc.ak.hiparcel.swing;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ca.ciccc.ak.hiparcel.adb.UsersDB;
import ca.ciccc.ak.hiparcel.model.User;

public class Application {

	private JFrame frmSenderNew;
	private JFormattedDateTextField textField;
	JComboBox<User> cmbSender;
	JComboBox<User> cmbRecipients;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
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

		JPanel panel = new JPanel();
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
		panel_1.setBounds(362, 30, 418, 49);
		frmSenderNew.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JLabel lblSender = new JLabel("Sender: ");
		lblSender.setFont(new Font("Arial Hebrew", Font.PLAIN, 16));
		panel_1.add(lblSender);

		cmbSender = new JComboBox();
		panel_1.add(cmbSender);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(19, 160, 761, 225);
		frmSenderNew.getContentPane().add(panel_2);

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

	}

	/**
	 * Load data from database
	 */
	private void loadData() {
		UsersDB usersDB = new UsersDB();
		List<User> allCurrentUsers = usersDB.allCurrentUsers();

		// senders
		if (cmbSender != null) {
			//clean combobox items
			cmbSender.removeAllItems();
			//Add all current users
			allCurrentUsers.forEach(user -> cmbSender.addItem(user));
		}

		// recipients
		if (cmbRecipients != null) {
			//clean combobox items
			cmbRecipients.removeAllItems();
			//Add all current users
			allCurrentUsers.forEach(user -> cmbRecipients.addItem(user));
		}

	}
}
