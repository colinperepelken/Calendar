package bernard.colin.calendar;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayEditor extends JFrame {
	private static final int FRAME_WIDTH = 420;
	private static final int FRAME_HEIGHT = 560;
	
	private static final int OPEN_HOUR = 9;
	private static final int CLOSE_HOUR = 23;
	
	private static Container pane;
	private static JPanel panel;
	
	private static JButton addEvent;
	private static JButton removeEvent;
	private static JLabel lblAdd, lblRemove, lblEmployee1, lblEmployee2, lblStart, lblEnd;
	private static JComboBox<String> cmbAdd, cmbRemove;
	private static JComboBox<Integer> startHour, endHour;
	private static JComboBox<Double> startDouble, endDouble;
	
	public DayEditor(int month, int day, int year) {
		super(month + "/" + day + "/" + year);
		String title = month + "/" + day + "/" + year;
		
		// frame settings
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
		
		// pane settings
		pane = getContentPane();
		pane.setLayout(null);
		
		// panel settings
		panel = new JPanel(null);
		panel.setBorder(BorderFactory.createTitledBorder("Editing: " + title));
		panel.setBounds(0, 0, FRAME_WIDTH - 20, FRAME_HEIGHT - 45);
		
		// button settings
		addEvent = new JButton("Add Shift");
		addEvent.setBounds(50, 200, 100, 25);
		removeEvent = new JButton("Remove Shift");
		removeEvent.setBounds(50, 400, 100, 25);
		
		// action listeners
		addEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		removeEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		// label settings
		lblAdd = new JLabel("Schedule an Employee");
		lblAdd.setBounds(50, 25, 130, 25);
		lblRemove = new JLabel("Remove an Employee");
		lblRemove.setBounds(50, 250, 130, 25);
		lblEmployee1 = new JLabel("Employee:");
		lblEmployee1.setBounds(50, 100, 130, 25);
		lblEmployee2 = new JLabel("Employee:");
		lblEmployee2.setBounds(50, 300, 130, 25);
		lblStart = new JLabel("Start:");
		lblStart.setBounds(50, 130, 50, 25);
		lblEnd = new JLabel("End:");
		lblEnd.setBounds(50, 160, 50, 25);
		
		// combo box settings
		cmbAdd = new JComboBox<String>();
		cmbRemove = new JComboBox<String>();
		for(Employee e : EmployeeManager.employees) {
			cmbAdd.addItem(e.getFirstName() + " " + e.getLastName());
			cmbRemove.addItem(e.getFirstName() + " " + e.getLastName());
		}
		cmbAdd.setBounds(120, 100, 130, 25);
		cmbRemove.setBounds(120, 300, 130, 25);
		startHour = new JComboBox<Integer>();
		endHour = new JComboBox<Integer>();
		for(int i = OPEN_HOUR; i <= CLOSE_HOUR; i++) {
			startHour.addItem(i);
			endHour.addItem(i);
		}
		startHour.setBounds(120, 130, 50, 25);
		endHour.setBounds(120, 160, 50, 25);
		startDouble = new JComboBox<Double>();
		startDouble.addItem(0.0);
		startDouble.addItem(0.25);
		startDouble.addItem(0.5);
		startDouble.addItem(0.75);
		endDouble = new JComboBox<Double>();
		endDouble.addItem(0.0);
		endDouble.addItem(0.25);
		endDouble.addItem(0.5);
		endDouble.addItem(0.75);
		startDouble.setBounds(180, 130, 50, 25);
		endDouble.setBounds(180, 160, 50, 25);
		
		
		// add controls
		pane.add(panel);
		panel.add(addEvent);
		panel.add(removeEvent);
		panel.add(lblAdd);
		panel.add(lblRemove);
		panel.add(cmbAdd);
		panel.add(cmbRemove);
		panel.add(startHour);
		panel.add(endHour);
		panel.add(startDouble);
		panel.add(endDouble);
		panel.add(lblEmployee1);
		panel.add(lblEmployee2);
		panel.add(lblStart);
		panel.add(lblEnd);
		
		
	}
}
