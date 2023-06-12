
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class FilialMenu implements ActionListener {
	
	private int filialsQtd ;
	private double filialValue;
	private List<JLabel> labels;
	private List<JButton> buttons;
	private List<JPanel> panels;
	private JFrame jf;
	private JPanel panel;


	public FilialMenu(int filialsQtd){
		super();
		JFrame jf = new JFrame();
		jf.setSize(1500,1500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(new Color(100,150,255));
		
		//To put in full Screen when we run the application 
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		panels = new ArrayList<JPanel>();
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();

		
		panels.add( new JPanel());
		panels.get(0).setLayout(null);
		panels.get(0).setBackground(new Color(100, 150, 255));
		
		this.filialsQtd = filialsQtd;
		
		int x = jf.getWidth()/2;
		
		//the name of the filial JLabel
		labels.add(new JLabel("Loja da Havan"));
		labels.get(0).setBounds(x - (labels.get(0).getText().length()*4), 23,labels.get(0).getText().length()*20,30);
		labels.get(0).setFont(new Font("Times New Roman", Font.BOLD, 20));
		panels.get(0).add(labels.get(0));
		
		//the JLabel 'Filial' 
		labels.add(new JLabel("Filial :"));
		labels.get(1).setBounds(x - (labels.get(0).getText().length()*4) - 150, 20, 150, 30);
		labels.get(1).setFont(new Font("Times New Roman", Font.BOLD, 30));
		panels.get(0).add(labels.get(1));
	
		int paneSize = 0;
		
		if(labels.get(0).getText().length() <= 5)
		{
			paneSize = labels.get(0).getText().length()*12 - 3;
		}
		else if (labels.get(0).getText().length() <= 10)
		{
			paneSize = labels.get(0).getText().length()*11;
		}
		else if (labels.get(0).getText().length() <= 15)
		{
			paneSize = labels.get(0).getText().length()*11 - 5;
		}
		else
		{
			paneSize = labels.get(0).getText().length()*11 - 10;
		}
		
		
		//The JPanel that has the name of the Filial
		panels.add(new JPanel());
		panels.get(1).setBounds(x - (labels.get(0).getText().length()*4), 23, paneSize, 30);
		panels.get(1).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(1));
		
		buttons.add( new JButton("Editar"));
		buttons.get(0).setBounds(1200, 23, 150, 30);
		panels.get(0).add(buttons.get(0));
		
		buttons.get(0).addActionListener(this);
		
		//the JLabel of 'Endereço'
		labels.add(new JLabel("Estados Unidos, texas, caipira, rua marinho, 22"));
		labels.get(2).setBounds(x - (labels.get(2).getText().length()*4), 100,labels.get(2).getText().length() * 20,30);
		labels.get(2).setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		//the JLabel 'Endereço'
		labels.add(new JLabel("Endereço :"));
		labels.get(3).setBounds(x - (labels.get(2).getText().length()*4) - 190, 100, 200,30);
		labels.get(3).setFont(new Font("Times New Roman", Font.BOLD, 25));
		panels.get(0).add(labels.get(3));

		
		panels.get(0).add(labels.get(2));
		
		int paneSize2 = 0;
		
		if(labels.get(2).getText().length() <= 5 && labels.get(2).getText().length() > 1)
		{
			paneSize2 = labels.get(2).getText().length()*12 - 3;
		}
		else if (labels.get(2).getText().length() <= 10)
		{
			paneSize2 = labels.get(2).getText().length()*11;
		}
		else if (labels.get(2).getText().length() <= 15)
		{
			paneSize2 = labels.get(2).getText().length()*11 - 5;
		}
		else if (labels.get(2).getText().length() <= 30)
		{
			paneSize2 = labels.get(2).getText().length()*11 - 9;
		}
		else
		{
			paneSize2 = labels.get(2).getText().length()*10 - 25;
		}
		
		//The JPanel that has the endereço
		panels.add(new JPanel());
		panels.get(2).setBounds(x - (labels.get(2).getText().length()*4), 100, paneSize2, 30);
		panels.get(2).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(2));
		
		buttons.add( new JButton("Editar"));
		buttons.get(1).setBounds(1200, 100, 150, 30);
		panels.get(0).add(buttons.get(1));
		
		buttons.get(0).addActionListener(this);
		
		filialValue = 15000.500;
		//the JLabel of 'Patrimônio líquido'
		labels.add(new JLabel("R$ " + Double.toString(filialValue)));
		labels.get(4).setBounds(x - (labels.get(4).getText().length()*4), 170, labels.get(4).getText().length() * 20, 50);
		labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(4));
		
		//the JLabel 'Patrimônio líquido da Filial' 
		labels.add(new JLabel("Patrimônio líquido da Filial :"));
		labels.get(5).setBounds(x - (labels.get(4).getText().length()*4) - 400, 170, 350, 50);
		labels.get(5).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(5));
		
		
		
		int paneSize3 = 0;
		
		if(labels.get(4).getText().length() <= 5 && labels.get(4).getText().length() > 1)
		{
			paneSize3 = labels.get(4).getText().length()*12 - 3;
		}
		else if (labels.get(4).getText().length() <= 10)
		{
			paneSize3 = labels.get(4).getText().length()*11;
		}
		else if (labels.get(4).getText().length() <= 15)
		{
			paneSize3 = labels.get(4).getText().length()*11;
		}
		else if (labels.get(4).getText().length() <= 30)
		{
			paneSize3 = labels.get(4).getText().length()*12 - 10;
		}
		else
		{
			paneSize3 = labels.get(4).getText().length()*11 - 20;
		}
		
		//The JPanel that has the patrimono liquido
		panels.add(new JPanel());
		panels.get(3).setBounds(x - (labels.get(4).getText().length()*4), 180,paneSize3,30);
		panels.get(3).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(3));
				
		labels.add( new JLabel("<html><u>Patrimôios Cadastrtados :</u></html>"));
		labels.get(6).setBounds(640, 250, 350, 50);
		labels.get(6).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(6));
		
		int VerticalSize = 500;
		
		for (int i = 0; i < filialsQtd; i++) {
			JPanel quadrado = new JPanel();
			quadrado.setBounds(350 , 300 + (i * 100), 50, 50); // Define a posição e tamanho do quadrado manualmente
			quadrado.setBackground(new Color(10, 255, 100));
			panels.get(0).add(quadrado);
		}
		
		panels.add(new JPanel());
		panels.get(4).setPreferredSize(new Dimension(500, 300));
		panels.get(4).setBounds(400, 330, 700, 400);
		panels.get(4).setBackground(new Color(192, 192, 192));
		panels.get(0).add(panels.get(4));
		
		//JPanel p1 = new JPanel();
		//p1.setLayout(flo);
	
		
		JScrollPane scrollPane = new JScrollPane(panels.get(0));
		
		scrollPane.setBounds(500, 500, 5000, 5000);
		jf.setContentPane(scrollPane);
		//jf.setPreferredSize(new Dimension(2000, 2000));

		//scrollPane.add(panels.get(0));
		//scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//panels.get(0).add(scrollPane);
		//jf.add(panels.get(0));
		//scrollPane.setVisible(true);
		//jf.getContentPane().add(scrollPane);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

