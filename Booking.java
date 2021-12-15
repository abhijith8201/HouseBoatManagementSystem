package javaproject;







import java.awt.BorderLayout;
import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;







import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.TextField;
import java.awt.Label;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JMonthChooser;





public class Booking extends JFrame {





private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private final ButtonGroup buttonGroup = new ButtonGroup();





/**
* Launch the application.
*/
public static void main(String[] args) {
String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
String username = "postgres";
String password = "abhijith";



try {
Connection connection = DriverManager.getConnection(jdbcURL, username, password);



System.out.print("Connected");
}
catch(SQLException e) {
System.out.println("Error in connection");
e.printStackTrace();
}
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Booking frame = new Booking();
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
public Booking() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 905, 759);
contentPane = new JPanel();
contentPane.setBackground(new Color(250, 240, 230));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);



JLabel lblNewLabel = new JLabel("New Booking");
lblNewLabel.setBounds(143, 10, 450, 73);
lblNewLabel.setForeground(Color.RED);
lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 27));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
contentPane.add(lblNewLabel);



JLabel lblNewLabel_1 = new JLabel("Duration");
lblNewLabel_1.setBackground(new Color(240, 240, 240));
lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
lblNewLabel_1.setBounds(36, 129, 120, 37);
contentPane.add(lblNewLabel_1);



JLabel lblNewLabel_2 = new JLabel("Date");
lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 18));
lblNewLabel_2.setBackground(new Color(250, 235, 215));
lblNewLabel_2.setBounds(36, 206, 120, 37);
contentPane.add(lblNewLabel_2);





JLabel lblNewLabel_3 = new JLabel("Passenger Details");
lblNewLabel_3.setBackground(new Color(240, 240, 240));
lblNewLabel_3.setForeground(Color.DARK_GRAY);
lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
lblNewLabel_3.setBounds(41, 492, 218, 30);
contentPane.add(lblNewLabel_3);



JLabel lblNewLabel_6 = new JLabel("Adult (18 & above)");
lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 18));
lblNewLabel_6.setBounds(51, 532, 177, 30);
contentPane.add(lblNewLabel_6);



textField = new JTextField();
textField.setBounds(238, 531, 88, 31);
contentPane.add(textField);
textField.setColumns(10);



JLabel lblNewLabel_7 = new JLabel("Children (<18)");
lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 18));
lblNewLabel_7.setBounds(412, 534, 143, 26);
contentPane.add(lblNewLabel_7);



textField_1 = new JTextField();
textField_1.setBounds(562, 531, 101, 29);
contentPane.add(textField_1);
textField_1.setColumns(10);



JPanel panel = new JPanel();
panel.setBackground(SystemColor.controlHighlight);
panel.setBounds(184, 129, 356, 37);
contentPane.add(panel);



JRadioButton rdbtnNewRadioButton = new JRadioButton("3 hr ");
rdbtnNewRadioButton.setBackground(Color.WHITE);
buttonGroup.add(rdbtnNewRadioButton);
panel.add(rdbtnNewRadioButton);
rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));



JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("6 hr ");
rdbtnNewRadioButton_1.setBackground(Color.WHITE);
buttonGroup.add(rdbtnNewRadioButton_1);
rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
panel.add(rdbtnNewRadioButton_1);



JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Half day");
rdbtnNewRadioButton_2.setBackground(Color.WHITE);
buttonGroup.add(rdbtnNewRadioButton_2);
rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
panel.add(rdbtnNewRadioButton_2);



JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Full day ");
rdbtnNewRadioButton_3.setBackground(Color.WHITE);
buttonGroup.add(rdbtnNewRadioButton_3);
rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
panel.add(rdbtnNewRadioButton_3);



JLabel lblNewLabel_4 = new JLabel("");
panel.add(lblNewLabel_4);
lblNewLabel_4.setBackground(new Color(230, 230, 250));
lblNewLabel_4.setForeground(new Color(255, 228, 181));



JButton btnNewButton = new JButton("Make Payment");
btnNewButton.setBackground(Color.PINK);
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
btnNewButton.setForeground(Color.BLACK);
btnNewButton.setBounds(326, 625, 193, 36);
contentPane.add(btnNewButton);



JMenuBar menuBar = new JMenuBar();
menuBar.setBounds(32, 79, 101, 22);
contentPane.add(menuBar);



JMenu mnNewMenu = new JMenu("Model");
mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 19));
menuBar.add(mnNewMenu);



JMenuItem mntmNewMenuItem = new JMenuItem("house boat");
mntmNewMenuItem.setFont(new Font("Tahoma", Font.BOLD, 12));
mnNewMenu.add(mntmNewMenuItem);



JMenuItem mntmNewMenuItem_1 = new JMenuItem("Speed boat");
mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.BOLD, 12));
mnNewMenu.add(mntmNewMenuItem_1);



JMenuItem mntmNewMenuItem_2 = new JMenuItem("Shikkara");
mntmNewMenuItem_2.setFont(new Font("Tahoma", Font.BOLD, 12));
mnNewMenu.add(mntmNewMenuItem_2);



JMenuItem mntmNewMenuItem_3 = new JMenuItem("premium house boat");
mntmNewMenuItem_3.setFont(new Font("Tahoma", Font.BOLD, 12));
mnNewMenu.add(mntmNewMenuItem_3);



JMenuItem mntmNewMenuItem_4 = new JMenuItem("Deluxe House boat");
mntmNewMenuItem_4.setFont(new Font("Tahoma", Font.BOLD, 12));
mnNewMenu.add(mntmNewMenuItem_4);
JMenuBar menuBar_1 = new JMenuBar();
menuBar_1.setBounds(36, 278, 101, 22);
contentPane.add(menuBar_1);
JMenu mnNewMenu_1 = new JMenu("Food Menu");
mnNewMenu_1.setFont(new Font("Verdana", Font.BOLD, 15));
menuBar_1.add(mnNewMenu_1);
JMenuItem mntmNewMenuItem_5 = new JMenuItem("Veg.");
mntmNewMenuItem_5.setFont(new Font("Tahoma", Font.BOLD, 13));
mnNewMenu_1.add(mntmNewMenuItem_5);
JMenuItem mntmNewMenuItem_6 = new JMenuItem("Non Veg.");
mntmNewMenuItem_6.setFont(new Font("Tahoma", Font.BOLD, 13));
mnNewMenu_1.add(mntmNewMenuItem_6);
JMenuItem mntmNewMenuItem_7 = new JMenuItem("Both ");
mntmNewMenuItem_7.setFont(new Font("Tahoma", Font.BOLD, 13));
mnNewMenu_1.add(mntmNewMenuItem_7);
JPanel panel_2_1 = new JPanel();
panel_2_1.setBackground(Color.WHITE);
panel_2_1.setBounds(35, 445, 193, 37);
contentPane.add(panel_2_1);
JRadioButton rdbtnAc = new JRadioButton("AC ");
buttonGroup.add(rdbtnAc);
rdbtnAc.setFont(new Font("Tahoma", Font.BOLD, 15));
rdbtnAc.setBackground(Color.WHITE);
panel_2_1.add(rdbtnAc);
JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("NON AC ");
buttonGroup.add(rdbtnNewRadioButton_1_1_1);
rdbtnNewRadioButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
rdbtnNewRadioButton_1_1_1.setBackground(Color.WHITE);
panel_2_1.add(rdbtnNewRadioButton_1_1_1);
JLabel lblNewLabel_4_1_1 = new JLabel("");
lblNewLabel_4_1_1.setForeground(new Color(255, 228, 181));
lblNewLabel_4_1_1.setBackground(new Color(230, 230, 250));
panel_2_1.add(lblNewLabel_4_1_1);
JPanel panel_1 = new JPanel();
panel_1.setBounds(36, 360, 533, 41);
contentPane.add(panel_1);
JCheckBox chckbxNewCheckBox = new JCheckBox("Beverages ");
chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
panel_1.add(chckbxNewCheckBox);
JCheckBox chckbxNewCheckBox_1 = new JCheckBox("DJ Party ");
chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));
panel_1.add(chckbxNewCheckBox_1);
JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Fishing ");
chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 18));
panel_1.add(chckbxNewCheckBox_2);
JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Game Night");
chckbxNewCheckBox_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
panel_1.add(chckbxNewCheckBox_2_1);
JLabel lblNewLabel_5 = new JLabel("Entertainments");
lblNewLabel_5.setForeground(new Color(0, 0, 0));
lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
lblNewLabel_5.setBounds(36, 320, 168, 30);
contentPane.add(lblNewLabel_5);
JDateChooser dateChooser = new JDateChooser();
dateChooser.setBounds(184, 207, 73, 19);
contentPane.add(dateChooser);
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