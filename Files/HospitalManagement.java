import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class HospitalManagement
{
	JFrame win;
	ImageIcon icon;
	ImageIcon image;
	JPanel panel;
	JLabel lblProjectName, lblImage,label;
	Image lblImage1,lblImage2;
	JButton btnAddPatient, btnDiagnosis, btnPatientHistory, btnUpdate, btnInformation, btnLogout;

	HospitalManagement()
	{
		win = new JFrame("Hospital Management System");
		win.setLayout(new BorderLayout());
		
		win.getContentPane().setBackground(new Color(0,88,176));

		icon = new ImageIcon("E:\\Hospital\\HospitalLogo.png");
		win.setIconImage(icon.getImage());

		image = new ImageIcon("E:\\Hospital\\Hospital2.png");
		lblImage = new JLabel(image);

		panel = new JPanel();
		panel.setBounds(72,15,1220,70);
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.WHITE);

		lblProjectName = new JLabel("Hospital Management System");
		//lblProjectName.setBounds(0,-60,600,30);
		lblProjectName.setForeground(Color.WHITE);
		lblProjectName.setFont(new Font("Serif",Font.BOLD,45));

		/*image = new ImageIcon("E:\\Hospital\\Hospital2.png");
		lblImage1 = image.getImage();
		lblImage2 = lblImage1.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
		image = new ImageIcon(lblImage2);
		lblImage = new JLabel(" ",image,JLabel.CENTER);
		lblImage.setBounds(0,0,1366,768);*/
		//Icon icon3 = new ImageIcon("E:\\Hospital\\AddPatientLogo1.png");
		btnAddPatient = new JButton("Add Patient");
		btnAddPatient.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAddPatient.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddPatient.setBounds(980,200,300,50);
		btnAddPatient.setBackground(Color.BLUE);
		btnAddPatient.setForeground(Color.WHITE);
		btnAddPatient.setFocusable(false);
		btnAddPatient.setFont(new Font("Serif",Font.BOLD,20));

		btnDiagnosis = new JButton("Diagnosis");
		btnDiagnosis.setBounds(980,260,300,50);
		btnDiagnosis.setBackground(Color.BLUE);
		btnDiagnosis.setForeground(Color.WHITE);
		btnDiagnosis.setFocusable(false);
		btnDiagnosis.setFont(new Font("Serif",Font.BOLD,20));

		btnPatientHistory = new JButton("Patient History");
		btnPatientHistory.setBounds(980,320,300,50);
		btnPatientHistory.setBackground(Color.BLUE);
		btnPatientHistory.setForeground(Color.WHITE);
		btnPatientHistory.setFocusable(false);
		btnPatientHistory.setFont(new Font("Serif",Font.BOLD,20));

		btnUpdate = new JButton("Update data");
		btnUpdate.setBounds(980,380,300,50);
		btnUpdate.setBackground(Color.BLUE);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFocusable(false);
		btnUpdate.setFont(new Font("Serif",Font.BOLD,20));

		btnInformation = new JButton("Hospital Information");
		btnInformation.setBounds(980,440,300,50);
		btnInformation.setBackground(Color.BLUE);
		btnInformation.setForeground(Color.WHITE);
		btnInformation.setFocusable(false);
		btnInformation.setFont(new Font("Serif",Font.BOLD,20));

		btnLogout = new JButton("Logout");
		btnLogout.setBounds(980,500,300,50);
		btnLogout.setBackground(Color.BLUE);
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFocusable(false);
		btnLogout.setFont(new Font("Serif",Font.BOLD,20));
		
		panel.add(lblProjectName);
		win.add(panel);

		win.add(btnAddPatient);
		win.add(btnDiagnosis);
		win.add(btnPatientHistory);
		win.add(btnUpdate);
		win.add(btnInformation);
		win.add(btnLogout);

		win.add(lblImage);
		
		win.setExtendedState(JFrame.MAXIMIZED_BOTH);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setResizable(false);
		win.setVisible(true);

		btnAddPatient.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new AddPatient();
				}
			});

		btnDiagnosis.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new AddDiagnosis();
				}
			});

		btnPatientHistory.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new FullHistoryPatient();
				}
			});

		btnUpdate.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new UpdatePatient();
				}
			});

		btnLogout.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new Login();
					win.setVisible(false);
				}
			});
	}


	public static void main(String arg[])
	{
		new HospitalManagement();
	}
	
}