import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;

class AddDiagnosis
{
	JFrame win;
	ImageIcon icon, imgBack1, image;
	JLabel lblImage , lblImageBack1, lblPatientID, lblSymptoms, lblDiagnosis, lblMedicines, lblWardRequired, lblTypeWard;
	JTextField txtPatientID, txtSymptoms, txtDiagnosis, txtMedicines;
	JButton btnSearch, btnSave, btnClose;
	JTable table;
	JScrollPane pane;
	DefaultTableModel model;
	JCheckBox yes;
	JComboBox general;

	AddDiagnosis()
	{
		win = new JFrame("Diagnosis");
		win.setLayout(null);

		win.getContentPane().setBackground(Color.BLUE);

		icon = new ImageIcon("E:\\Hospital\\HospitalLogo.png");
		win.setIconImage(icon.getImage());

		image = new ImageIcon("E:\\Hospital\\Diagnosis.png");
		lblImage = new JLabel(image);
		lblImage.setBounds(0,0,730,500);

		imgBack1 = new ImageIcon("E:\\Hospital\\BackLogo1.png");
		lblImageBack1 = new JLabel(imgBack1);
		lblImageBack1.setBounds(20,10,30,26);

		lblPatientID = new JLabel("Patient ID");
		lblPatientID.setBounds(200,50,200,30);
		lblPatientID.setForeground(Color.BLACK);
		lblPatientID.setFont(new Font("Serif",Font.BOLD,20));

		lblSymptoms = new JLabel("Symptom's");
		lblSymptoms.setBounds(20,250,200,30);
		lblSymptoms.setForeground(Color.BLACK);
		lblSymptoms.setFont(new Font("Serif",Font.BOLD,20));

		lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setBounds(20,310,200,30);
		lblDiagnosis.setForeground(Color.BLACK);
		lblDiagnosis.setFont(new Font("Serif",Font.BOLD,20));

		lblMedicines = new JLabel("Medicines");
		lblMedicines.setBounds(20,370,200,30);
		lblMedicines.setForeground(Color.BLACK);
		lblMedicines.setFont(new Font("Serif",Font.BOLD,20));

		lblWardRequired = new JLabel("Ward Required?");
		lblWardRequired.setBounds(400,250,200,30);
		lblWardRequired.setForeground(Color.WHITE);
		lblWardRequired.setFont(new Font("Serif",Font.BOLD,16));

		lblTypeWard = new JLabel("Type Of Ward");
		lblTypeWard.setBounds(400,310,100,30);
		lblTypeWard.setForeground(Color.BLACK);
		lblTypeWard.setFont(new Font("Serif",Font.BOLD,16));
		lblTypeWard.setVisible(false);

		txtPatientID = new JTextField();
		txtPatientID.setBounds(310,50,100,30);
		txtPatientID.setBackground(new Color(185,185,185));
		txtPatientID.setForeground(Color.BLACK);
		txtPatientID.setHorizontalAlignment(JTextField.CENTER);
		txtPatientID.setFont(new Font("Serif",Font.BOLD,16));

		txtSymptoms = new JTextField();
		txtSymptoms.setBounds(150,250,150,30);
		txtSymptoms.setBackground(new Color(185,185,185));
		txtSymptoms.setForeground(Color.BLACK);
		txtSymptoms.setHorizontalAlignment(JTextField.CENTER);
		txtSymptoms.setFont(new Font("Serif",Font.BOLD,16));

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(150,310,150,30);
		txtDiagnosis.setBackground(new Color(185,185,185));
		txtDiagnosis.setForeground(Color.BLACK);
		txtDiagnosis.setHorizontalAlignment(JTextField.CENTER);
		txtDiagnosis.setFont(new Font("Serif",Font.BOLD,16));

		txtMedicines = new JTextField();
		txtMedicines.setBounds(150,370,150,30);
		txtMedicines.setBackground(new Color(185,185,185));
		txtMedicines.setForeground(Color.BLACK);
		txtMedicines.setHorizontalAlignment(JTextField.CENTER);
		txtMedicines.setFont(new Font("Serif",Font.BOLD,16));

		btnSearch = new JButton("Search");
		btnSearch.setBounds(440,50,100,30);
		btnSearch.setBackground(Color.BLUE);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFocusable(false);
		btnSearch.setFont(new Font("Serif",Font.BOLD,16));

		btnSave = new JButton("Save");
		btnSave.setBounds(400,380,100,30);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFocusable(false);
		btnSave.setFont(new Font("Serif",Font.BOLD,16));

		btnClose = new JButton("Close");
		btnClose.setBounds(545,380,130,30);
		btnClose.setBackground(Color.BLUE);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFocusable(false);
		btnClose.setFont(new Font("Serif",Font.BOLD,16));

		String row[][] = {};

		String columns[] = {"Patient ID", "Name", "Contant No", "Age", "Gender", "Nationality", "Nominate " , "Blood", "Address", "Any Major Disease"};

		model = new DefaultTableModel(row, columns);

		table = new JTable(model);

		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment(JLabel.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(center);

		pane = new JScrollPane(table);
		pane.setBounds(20,100,675,100);
		table.getTableHeader().setFont(new Font("Agency FB",Font.BOLD,18));
		table.setRowHeight(30);
		table.setForeground(Color.BLACK);

		yes = new JCheckBox("Yes");
		yes.setBounds(540,250,60,30);
		yes.setForeground(Color.BLACK);
		yes.setFocusable(false);
		yes.setFont(new Font("Serif",Font.BOLD,16));

		String comboBox[] = {"General", "Single", "Duo"}; 
		general = new JComboBox(comboBox);
		general.setBounds(545,310,130,30);
		general.setVisible(false);


		win.add(lblPatientID);
		win.add(lblSymptoms);
		win.add(lblDiagnosis);
		win.add(lblMedicines);
		win.add(lblWardRequired);
		win.add(lblTypeWard);

		win.add(txtPatientID);
		win.add(txtSymptoms);
		win.add(txtDiagnosis);
		win.add(txtMedicines);

		win.add(btnSearch);
		win.add(btnSave);
		win.add(btnClose);

		win.add(pane);

		win.add(yes);
		win.add(general);

		win.add(lblImageBack1);
		win.add(lblImage);

		win.setSize(730,500);
		win.setLocation(280,100);
		win.setUndecorated(true);
		win.setResizable(false);
		//win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		yes.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					if(yes.isSelected())
					{
						lblTypeWard.setVisible(true);
						general.setVisible(true);
					}
					else
					{
						lblTypeWard.setVisible(false);
						general.setVisible(false);
					}
				}
			});

		lblImageBack1.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent ae)
				{
					win.setVisible(false);
				}
			});

		btnSave.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					String symptom = txtSymptoms.getText().toString();
					String diagnosis = txtDiagnosis.getText().toString();
					String medicines = txtMedicines.getText().toString();
					String ward = (String)general.getSelectedItem();

					//int row = table.getSelectedRow();

					//model.setValueAt(symptom, row, 10);
					//new FullHistoryPatient();
					//model.setValueAt(diagnosis, row, 5);
					//model.setValueAt(medicines, row, 6);
					//model.setValueAt(ward, row, 7);

					Object[] newRow = {symptom,diagnosis,medicines,ward};
					new FullHistoryPatient().model.addRow(newRow);//model.setValueAt(newRow, row, 12);//model.addRow(newRow);
					win.setVisible(false);
					
				}
			});
	}

		public static void main(String arg[])
		{
			new AddDiagnosis();
		}
	
}