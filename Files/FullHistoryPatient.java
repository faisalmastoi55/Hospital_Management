import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
class FullHistoryPatient
{
	JFrame win;
	JTable table;
	ImageIcon icon, imgBack2, image;
	JLabel lblImageBack2, lblImage;
	DefaultTableModel model;
	DefaultTableCellRenderer center;
	JScrollPane pane;

	FullHistoryPatient()
	{
		win = new JFrame("Table");
		//win.setLayout(new FlowLayout());
		win.setLayout(null);

		win.getContentPane().setBackground(Color.GRAY);

		icon = new ImageIcon("E:\\Hospital\\HospitalLogo.png");
		win.setIconImage(icon.getImage());

		//image = new ImageIcon("E:\\Hospital\\History1.jpg");
		//lblImage = new JLabel(image);
		//lblImage.setBounds(0,0,730,500);

		imgBack2 = new ImageIcon("E:\\Hospital\\BackLogo1.png");
		lblImageBack2 = new JLabel(imgBack2);
		lblImageBack2.setBounds(20,10,30,26);

		String row[][] = { };

		String columns[] = { "Symptom's", "Diagnosis", "Medicines", "Type Ward", "Patient ID", "Name", "Contant No", "Age", "Gender", "Blood", "Address", "Any Major Disease", "Patient ID"};

		model = new DefaultTableModel(row,columns);

		table = new JTable(model)
		{
			public boolean isCellEditable(int data, int head)
			{
				return false;
			}
		};

		center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment(JLabel.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(center);
	
		pane = new JScrollPane(table);
		pane.setBounds(10,60,700,360);
		table.getTableHeader().setFont(new Font("Agency FB",Font.BOLD,18));
		table.setRowHeight(30);
		win.add(pane);

		win.add(lblImageBack2);
//		win.add(lblImage);

		win.setSize(730,500);
		win.setLocation(280,100);
		win.setUndecorated(true);
		//win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		lblImageBack2.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent ae)
				{
					win.setVisible(false);
				}
			});
	}

		public static void main(String arg[])
		{
			new FullHistoryPatient();
		}
	
}
