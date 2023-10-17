import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class UpdatePatient
{
	JFrame win;
	ImageIcon icon, image, imgBack;
	JLabel lblImage, lblImageBack, lbl, lblId, lblName, lblContact, lblAge, lblGender, lblNationality, lblNominateNo, lblBlood, lblAddress, lblMajorDisease;
	JTextField txtSearch, txtId, txtName, txtContact, txtNominateNo, txtAge, txtBlood, txtAddress, txtMajorDisease;
	JRadioButton rbMale, rbFemale;
	ButtonGroup buttonGroup;
	JComboBox cbNationality;
	JButton btnSearch, btnSave, btnClose;

	UpdatePatient()
	{
		win = new JFrame("Add Patient");
		win.setLayout(null);

		icon = new ImageIcon("E:\\Hospital\\HospitalLogo.png");
		win.setIconImage(icon.getImage());

		image = new ImageIcon("E:\\Hospital\\Patient.jpg");
		lblImage = new JLabel(image);
		lblImage.setBounds(0,0,730,500);

		imgBack = new ImageIcon("E:\\Hospital\\BackLogo1.png");
		lblImageBack = new JLabel(imgBack);
		lblImageBack.setBounds(20,10,30,26);

		lbl = new JLabel("Update Patient");
		lbl.setBounds(230,10,500,60);
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Serif",Font.BOLD,35));

		lblId = new JLabel("ID");
		lblId.setBounds(60,100,150,60);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Serif",Font.BOLD,20));

		lblName = new JLabel("Patient Name");
		lblName.setBounds(370,100,150,60);
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Serif",Font.BOLD,20));

		lblContact = new JLabel("Contact No");
		lblContact.setBounds(60,140,150,60);
		lblContact.setForeground(Color.BLACK);
		lblContact.setFont(new Font("Serif",Font.BOLD,20));

		lblAge = new JLabel("Age");
		lblAge.setBounds(370,140,150,60);
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Serif",Font.BOLD,20));

		lblGender = new JLabel("Gender");
		lblGender.setBounds(60,185,150,60);
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Serif",Font.BOLD,20));

		lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(370,185,150,60);
		lblNationality.setForeground(Color.BLACK);
		lblNationality.setFont(new Font("Serif",Font.BOLD,20));

		lblNominateNo = new JLabel("Nominate No");
		lblNominateNo.setBounds(60,230,150,60);
		lblNominateNo.setForeground(Color.BLACK);
		lblNominateNo.setFont(new Font("Serif",Font.BOLD,20));

		lblBlood = new JLabel("Blood Group");
		lblBlood.setBounds(370,230,150,60);
		lblBlood.setForeground(Color.BLACK);
		lblBlood.setFont(new Font("Serif",Font.BOLD,20));

		lblAddress = new JLabel("Address");
		lblAddress.setBounds(60,270,150,60);
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Serif",Font.BOLD,20));

		lblMajorDisease = new JLabel("Any Major Disease Suffered Earlier");
		lblMajorDisease.setBounds(60,320,400,30);
		lblMajorDisease.setForeground(Color.BLACK);
		lblMajorDisease.setFont(new Font("Serif",Font.BOLD,20));

		txtSearch = new JTextField();
		txtSearch.setBounds(510,50,80,30);
		txtSearch.setBackground(new Color(202,236,244));
		txtSearch.setForeground(Color.BLACK);
		txtSearch.setHorizontalAlignment(JTextField.CENTER);
		txtSearch.setFont(new Font("Serif",Font.BOLD,18));

		txtId = new JTextField();
		txtId.setBounds(180,115,150,30);
		txtId.setBackground(new Color(202,236,244));
		txtId.setForeground(Color.BLACK);
		txtId.setHorizontalAlignment(JTextField.CENTER);
		txtId.setFont(new Font("Serif",Font.BOLD,18));

		txtName = new JTextField();
		txtName.setBounds(510,115,150,30);
		txtName.setBackground(new Color(202,236,244));
		txtName.setForeground(Color.BLACK);
		txtName.setHorizontalAlignment(JTextField.CENTER);
		txtName.setFont(new Font("Serif",Font.BOLD,18));

		txtContact = new JTextField();
		txtContact.setBounds(180,155,150,30);
		txtContact.setBackground(new Color(202,236,244));
		txtContact.setForeground(Color.BLACK);
		txtContact.setHorizontalAlignment(JTextField.CENTER);
		txtContact.setFont(new Font("Serif",Font.BOLD,18));

		txtNominateNo = new JTextField();
		txtNominateNo.setBounds(180,245,150,30);
		txtNominateNo.setBackground(new Color(202,236,244));
		txtNominateNo.setForeground(Color.BLACK);
		txtNominateNo.setHorizontalAlignment(JTextField.CENTER);
		txtNominateNo.setFont(new Font("Serif",Font.BOLD,18));

		txtAge = new JTextField();
		txtAge.setBounds(510,155,150,30);
		txtAge.setBackground(new Color(202,236,244));
		txtAge.setForeground(Color.BLACK);
		txtAge.setHorizontalAlignment(JTextField.CENTER);
		txtAge.setFont(new Font("Serif",Font.BOLD,18));
		
		txtBlood = new JTextField();
		txtBlood.setBounds(510,245,150,30);
		txtBlood.setBackground(new Color(202,236,244));
		txtBlood.setForeground(Color.BLACK);
		txtBlood.setHorizontalAlignment(JTextField.CENTER);
		txtBlood.setFont(new Font("Serif",Font.BOLD,18));
		
		txtAddress = new JTextField();
		txtAddress.setBounds(180,285,480,30);
		txtAddress.setBackground(new Color(202,236,244));
		txtAddress.setForeground(Color.BLACK);
		txtAddress.setHorizontalAlignment(JTextField.CENTER);
		txtAddress.setFont(new Font("Serif",Font.BOLD,18));

		txtMajorDisease = new JTextField();
		txtMajorDisease.setBounds(180,350,480,30);
		txtMajorDisease.setBackground(new Color(202,236,244));
		txtMajorDisease.setForeground(Color.BLACK);
		txtMajorDisease.setHorizontalAlignment(JTextField.CENTER);
		txtMajorDisease.setFont(new Font("Serif",Font.BOLD,18));

		rbMale = new JRadioButton("Male");
		rbMale.setBounds(170,200,70,30);
		rbMale.setForeground(Color.BLACK);
		rbMale.setFocusable(false);
		rbMale.setFont(new Font("Serif",Font.BOLD,17));

		rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(245,200,90,30);
		rbFemale.setForeground(Color.BLACK);
		//rbFemale.setBackground(new Color(0,0,0,50));
		rbFemale.setFocusable(false);
		rbFemale.setFont(new Font("Serif",Font.BOLD,17));

		buttonGroup = new ButtonGroup();

		String comboBox[] = {"Nationality","Pakistan","India","Bangladesh","Afghanistan","Iran","Iraq","America","Chania"};
		cbNationality = new JComboBox(comboBox);
		cbNationality.setBackground(new Color(202,236,244));
		JScrollPane pane = new JScrollPane(cbNationality);
		pane.setBounds(510,200,150,30);

		btnSearch = new JButton("Search");
		btnSearch.setBounds(600,50,100,30);
		btnSearch.setBackground(Color.BLUE);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFocusable(false);
		btnSearch.setFont(new Font("Serif",Font.BOLD,16));

		btnSave = new JButton("Save");
		btnSave.setBounds(210,400,180,30);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFocusable(false);
		btnSave.setFont(new Font("Serif",Font.BOLD,16));

		btnClose = new JButton("Close");
		btnClose.setBounds(450,400,180,30);
		btnClose.setBackground(Color.BLUE);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFocusable(false);
		btnClose.setFont(new Font("Serif",Font.BOLD,16));

		win.add(lbl);
		win.add(lblId);
		win.add(lblName);
		win.add(lblContact);
		win.add(lblAge);
		win.add(lblGender);
		win.add(lblNationality);
		win.add(lblNominateNo);
		win.add(lblBlood);
		win.add(lblAddress);
		win.add(lblMajorDisease);

		win.add(txtId);
		win.add(txtName);
		win.add(txtContact);
		win.add(txtAge);
		win.add(txtNominateNo);
		win.add(txtBlood);
		win.add(txtAddress);
		win.add(txtMajorDisease);
		win.add(txtSearch);

		buttonGroup.add(rbMale);
		buttonGroup.add(rbFemale);

		win.add(rbMale);
		win.add(rbFemale);

		win.add(pane);

		win.add(btnSave);
		win.add(btnClose);
		win.add(btnSearch);

		win.add(lblImageBack);
		win.add(lblImage);

		win.setSize(730,500);
		win.setLocation(280,100);
		win.setUndecorated(true);
		win.setResizable(false);
		//win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		lblImageBack.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent ae)
				{
					win.setVisible(false);
				}
			});

	}

	public static void main(String arg[])
	{
		new UpdatePatient();
	}
	
}