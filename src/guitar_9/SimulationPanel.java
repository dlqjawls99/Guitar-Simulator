package guitar_9;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class SimulationPanel extends JPanel implements KeyListener{ //Ŭ����
	
	JPanel panelB1_00 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_01 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_02 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_03 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_04 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_05 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_06 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_07 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_08 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_A�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_09 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_C�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_10 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_D�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_11 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_E�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_12 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_G�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	//####################################################################################################################################
	JPanel panelB2_00 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_not.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB2_01 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_A.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB2_02 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_C.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB2_03 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_D.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB2_04 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_E.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB2_05 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../fingering/finger_G.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	//####################################################################################################################################
	
	JPanel panelB3_00 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_�⺻.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_01 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_02 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_03 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_04 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_05 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_06 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_07 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_��.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_08 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_A�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_09 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_C�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_10 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_D�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_11 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_E�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB3_12 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/�Ǻ�_G�ڵ�.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};	
	
	public SimulationPanel() {//������
		this.addKeyListener(this);
		requestFocus();
		setFocusable(true);
		setLayout(new BorderLayout());
		JPanel panelA = new JPanel(); //GUITAR SIMULATOR ���̺�
		panelA.setBackground(new Color(250, 235, 215, 255));
		JLabel label1=  new JLabel("GUITAR SIMULATOR");
		Font font = new Font("Aharoni ����", Font.BOLD, 40);
		label1.setFont(font);
		panelA.add(label1);
		
		JPanel panelB = new JPanel(); //��Ÿ, �ڵ�, �Ǻ� ǥ�� �г�
		panelB.setBackground(new Color(250, 235, 215, 255));
		panelB.setLayout(null);	
		
		//��Ÿ �κ� panelB1_00~panelB1_12
		panelB1_00.setBounds(0, 20, 960, 270);//panelB1_00.setLayout(null);
		panelB1_01.setBounds(0, 20, 960, 270);panelB1_01.setVisible(false);
		panelB1_02.setBounds(0, 20, 960, 270);panelB1_02.setVisible(false);
		panelB1_03.setBounds(0, 20, 960, 270);panelB1_03.setVisible(false);
		panelB1_04.setBounds(0, 20, 960, 270);panelB1_04.setVisible(false);
		panelB1_05.setBounds(0, 20, 960, 270);panelB1_05.setVisible(false);
		panelB1_06.setBounds(0, 20, 960, 270);panelB1_06.setVisible(false);
		panelB1_07.setBounds(0, 20, 960, 270);panelB1_07.setVisible(false);
		panelB1_08.setBounds(0, 20, 960, 270);panelB1_08.setVisible(false);
		panelB1_09.setBounds(0, 20, 960, 270);panelB1_09.setVisible(false);
		panelB1_10.setBounds(0, 20, 960, 270);panelB1_10.setVisible(false);
		panelB1_11.setBounds(0, 20, 960, 270);panelB1_11.setVisible(false);
		panelB1_12.setBounds(0, 20, 960, 270);panelB1_12.setVisible(false);
		
		
		//�� �κ� panelB2_00 ~ panelB2_5
		panelB2_00.setBounds(80, 300, 330, 250);
		panelB2_01.setBounds(80, 300, 330, 250);panelB2_01.setVisible(false);
		panelB2_02.setBounds(80, 300, 330, 250);panelB2_02.setVisible(false);
		panelB2_03.setBounds(80, 300, 330, 250);panelB2_03.setVisible(false);
		panelB2_04.setBounds(80, 300, 330, 250);panelB2_04.setVisible(false);
		panelB2_05.setBounds(80, 300, 330, 250);panelB2_05.setVisible(false);
		
		//�Ǻ� �κ� panelB3_00 ~ panelB3_12
		panelB3_00.setBounds(550, 300, 330, 250); 
		panelB3_01.setBounds(550, 300, 330, 250); panelB3_01.setVisible(false);
		panelB3_02.setBounds(550, 300, 330, 250); panelB3_02.setVisible(false);
		panelB3_03.setBounds(550, 300, 330, 250); panelB3_03.setVisible(false);
		panelB3_04.setBounds(550, 300, 330, 250); panelB3_04.setVisible(false);
		panelB3_05.setBounds(550, 300, 330, 250); panelB3_05.setVisible(false);
		panelB3_06.setBounds(550, 300, 330, 250); panelB3_06.setVisible(false);
		panelB3_07.setBounds(550, 300, 330, 250); panelB3_07.setVisible(false);
		panelB3_08.setBounds(550, 300, 330, 250); panelB3_08.setVisible(false);
		panelB3_09.setBounds(550, 300, 330, 250); panelB3_09.setVisible(false);
		panelB3_10.setBounds(550, 300, 330, 250); panelB3_10.setVisible(false);
		panelB3_11.setBounds(550, 300, 330, 250); panelB3_11.setVisible(false);
		panelB3_12.setBounds(550, 300, 330, 250); panelB3_12.setVisible(false);
		
		panelB.add(panelB1_00);panelB.add(panelB1_01); panelB.add(panelB1_02);panelB.add(panelB1_03);panelB.add(panelB1_04);panelB.add(panelB1_05);panelB.add(panelB1_06);panelB.add(panelB1_07); panelB.add(panelB1_08);panelB.add(panelB1_09);panelB.add(panelB1_10);panelB.add(panelB1_11);panelB.add(panelB1_12);
		panelB.add(panelB2_00); panelB.add(panelB2_01); panelB.add(panelB2_02); panelB.add(panelB2_03); panelB.add(panelB2_04); panelB.add(panelB2_05); 
		panelB.add(panelB3_00);panelB.add(panelB3_01);panelB.add(panelB3_02);panelB.add(panelB3_03);panelB.add(panelB3_04);panelB.add(panelB3_05); panelB.add(panelB3_06);panelB.add(panelB3_07);panelB.add(panelB3_08);panelB.add(panelB3_09);panelB.add(panelB3_10);panelB.add(panelB3_11);panelB.add(panelB3_12);
		
		//��ư�κ�
		JPanel panelC = new JPanel();//(Single, Chord ���̺�), �� ������ ��ư
		panelC.setLayout(new GridLayout(2, 1));
		JPanel panelC1 = new JPanel();//�������ļֶ�õ� ��ư
		JPanel panelC2 = new JPanel();//�ڵ� ��ư
			
		JButton button1 = new JButton("�� (1)"); 
		JButton button2 = new JButton("�� (2)"); 
		JButton button3 = new JButton("�� (3)");
		JButton button4 = new JButton("�� (4)"); 
		JButton button5 = new JButton("�� (5)"); 
		JButton button6 = new JButton("�� (6)");
		JButton button7 = new JButton("�� (7)");
		JButton button8 = new JButton("A�ڵ�(A)"); 
		JButton button9 = new JButton("C�ڵ�(S)"); 
		JButton button10 = new JButton("D�ڵ�(D)"); 
		JButton button11 = new JButton("E�ڵ�(F)"); 
		JButton button12 = new JButton("G�ڵ�(G)");
		
		JLabel label2 = new JLabel("Single sound"); JLabel label3 = new JLabel("Chord sound");
		panelC1.add(label2); panelC1.add(button1); panelC1.add(button2); panelC1.add(button3); panelC1.add(button4); panelC1.add(button5); panelC1.add(button6);panelC1.add(button7);
		panelC2.add(label3); panelC2.add(button8); panelC2.add(button9); panelC2.add(button10); panelC2.add(button11); panelC2.add(button12);
		panelC.add(panelC1); panelC.add(panelC2);
		
		this.add(panelA, BorderLayout.NORTH); this.add(panelB, BorderLayout.CENTER); this.add(panelC, BorderLayout.SOUTH);
				
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button1) {
					Music m1 = new Music("��.mp3", false);
					m1.start();
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(true);  panelB2_01.setVisible(false); panelB3_01.setVisible(true);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button2) {
					Music m2 = new Music("��.mp3", false);
					m2.start();	
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(true);  panelB2_02.setVisible(false); panelB3_02.setVisible(true); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button3) {
					Music m3 = new Music("��.mp3", false);
					m3.start();
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(true);  panelB2_03.setVisible(false); panelB3_03.setVisible(true); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);

				}
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button4) {
					Music m4 = new Music("��.mp3", false);
					m4.start();
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(true);  panelB2_04.setVisible(false); panelB3_04.setVisible(true); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
				}
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button5) {
					Music m5 = new Music("��.mp3", false);
					m5.start();	
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(true);  panelB2_05.setVisible(false); panelB3_05.setVisible(true);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);

				}
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button6) {
					Music m6 = new Music("��.mp3", false);
					m6.start();
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(true); 								panelB3_06.setVisible(true);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);

				}
			}
		});
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button7) {
					Music m7 = new Music("��.mp3", false);
					m7.start();
					requestFocus();
					panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(true); 								panelB3_07.setVisible(true);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
				}
			}
		});

		button8.addActionListener(new ActionListener() {//A�ڵ�
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button8) {
					panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(true);  panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(true); 								panelB3_08.setVisible(true);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
					Music m1 = new Music("������.mp3", false);
					Music m2 = new Music("��.mp3", false);
					Music m3 = new Music("��.mp3", false);
					Music m4 = new Music("������#.mp3", false);
					Music m5 = new Music("������.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});

		button9.addActionListener(new ActionListener() {//C�ڵ�
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button9) {
					panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(true);  panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(true); 								panelB3_09.setVisible(true);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
					Music m1 = new Music("��.mp3", false);
					Music m2 = new Music("��.mp3", false);
					Music m3 = new Music("��.mp3", false);
					Music m4 = new Music("������.mp3", false);
					Music m5 = new Music("������.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});
		
		button10.addActionListener(new ActionListener() {//D�ڵ�
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button10) {
					panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(true);  panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(true); 								panelB3_10.setVisible(true);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
					Music m1 = new Music("��.mp3", false);
					Music m2 = new Music("��.mp3", false);
					Music m3 = new Music("������.mp3", false);
					Music m4 = new Music("������#.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});

		button11.addActionListener(new ActionListener() {//E�ڵ�
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button11) {
					panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(true);  panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(true); 								panelB3_11.setVisible(true);
					panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
					Music m1 = new Music("������.mp3", false);
					Music m2 = new Music("������.mp3", false);
					Music m3 = new Music("��.mp3", false);
					Music m4 = new Music("��#.mp3", false);
					Music m5 = new Music("��.mp3", false);
					Music m6 = new Music("������.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
					m6.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
					requestFocus();
				}
			}
		});

		button12.addActionListener(new ActionListener() { //G�ڵ�
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button12) {
					panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
					panelB1_01.setVisible(false);  panelB2_01.setVisible(false);panelB3_01.setVisible(false);  
					panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
					panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
					panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
					panelB1_05.setVisible(false); panelB2_05.setVisible(true);  panelB3_05.setVisible(false);
					panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
					panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
					panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
					panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
					panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
					panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
					panelB1_12.setVisible(true); 								panelB3_12.setVisible(true);
					Music m1 = new Music("������.mp3", false);
					Music m2 = new Music("������.mp3", false);
					Music m3 = new Music("��.mp3", false);
					Music m4 = new Music("��.mp3", false);
					Music m5 = new Music("��.mp3", false);
					Music m6 = new Music("������.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
					m6.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
					requestFocus();

				}
			}
		});
		
		}//������
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_1: 
			Music mA = new Music("��.mp3", true); mA.start(); 
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(true);  panelB2_01.setVisible(false); panelB3_01.setVisible(true);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_2: 
			Music mB = new Music("��.mp3", true); mB.start(); 
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(true);  panelB2_02.setVisible(false); panelB3_02.setVisible(true); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_3: 
			Music mC = new Music("��.mp3", true); mC.start();
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(true);  panelB2_03.setVisible(false); panelB3_03.setVisible(true); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_4: 
			Music mD = new Music("��.mp3", true); mD.start();
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(true);  panelB2_04.setVisible(false); panelB3_04.setVisible(true); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_5: 
			Music mE = new Music("��.mp3", true); mE.start(); 
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(true);  panelB2_05.setVisible(false); panelB3_05.setVisible(true);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_6: 
			Music mF = new Music("��.mp3", true); mF.start(); 
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(true); 								panelB3_06.setVisible(true);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
		
		case KeyEvent.VK_7: 
			Music mG = new Music("��.mp3", true); mG.start();
			panelB1_00.setVisible(false); panelB2_00.setVisible(true);  panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(true); 								panelB3_07.setVisible(true);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			break;
			
		case KeyEvent.VK_A: //A�ڵ�
			panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(true);  panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(true); 								panelB3_08.setVisible(true);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			
			Music m1 = new Music("������.mp3", false);
			Music m2 = new Music("��.mp3", false);
			Music m3 = new Music("��.mp3", false);
			Music m4 = new Music("������#.mp3", false);
			Music m5 = new Music("������.mp3", false);
			
			m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			break;
		
		case KeyEvent.VK_S: //c�ڵ�
			panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(true);  panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(true); 								panelB3_09.setVisible(true);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			
			Music m6 = new Music("��.mp3", false);
			Music m7 = new Music("��.mp3", false);
			Music m8 = new Music("��.mp3", false);
			Music m9 = new Music("������.mp3", false);
			Music m10 = new Music("������.mp3", false);

			m6.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m7.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m8.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m9.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m10.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			break;
		
		case KeyEvent.VK_D: 
			panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(true);  panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(true); 								panelB3_10.setVisible(true);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			
			Music m11 = new Music("��.mp3", false);
			Music m12 = new Music("��.mp3", false);
			Music m13 = new Music("������.mp3", false);
			Music m14 = new Music("������#.mp3", false);
	
			m11.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m12.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m13.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m14.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			break;
		
		case KeyEvent.VK_F:
			panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false); panelB2_01.setVisible(false); panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(true);  panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(false); panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(true); 								panelB3_11.setVisible(true);
			panelB1_12.setVisible(false); 								panelB3_12.setVisible(false);
			
			Music m15 = new Music("������.mp3", false);
			Music m16 = new Music("������.mp3", false);
			Music m17 = new Music("��.mp3", false);
			Music m18 = new Music("��#.mp3", false);
			Music m19 = new Music("��.mp3", false);
			Music m20 = new Music("������.mp3", false);
			
			m15.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m16.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m17.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m18.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m19.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			m20.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			break;
		
		case KeyEvent.VK_G:
			panelB1_00.setVisible(false); panelB2_00.setVisible(false); panelB3_00.setVisible(false); 
			panelB1_01.setVisible(false);  panelB2_01.setVisible(false);panelB3_01.setVisible(false);  
			panelB1_02.setVisible(false); panelB2_02.setVisible(false); panelB3_02.setVisible(false); 
			panelB1_03.setVisible(false); panelB2_03.setVisible(false); panelB3_03.setVisible(false); 
			panelB1_04.setVisible(false); panelB2_04.setVisible(false); panelB3_04.setVisible(false); 
			panelB1_05.setVisible(false); panelB2_05.setVisible(true);  panelB3_05.setVisible(false);
			panelB1_06.setVisible(false); 								panelB3_06.setVisible(false);
			panelB1_07.setVisible(false); 								panelB3_07.setVisible(false);
			panelB1_08.setVisible(false); 								panelB3_08.setVisible(false);
			panelB1_09.setVisible(false); 								panelB3_09.setVisible(false);
			panelB1_10.setVisible(false); 								panelB3_10.setVisible(false);
			panelB1_11.setVisible(false); 								panelB3_11.setVisible(false);
			panelB1_12.setVisible(true); 								panelB3_12.setVisible(true);
			
			Music m21 = new Music("������.mp3", false);
			Music m22 = new Music("������.mp3", false);
			Music m23 = new Music("��.mp3", false);
			Music m24 = new Music("��.mp3", false);
			Music m25 = new Music("��.mp3", false);
			Music m26 = new Music("������.mp3", false);
			
			m21.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m22.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m23.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m24.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m25.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			m26.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			break;
		
		
		}	
	}//������
		public void keyTyped(KeyEvent e) {}
		
		public void keyReleased(KeyEvent e) {}
		
}//MainPanel Ŭ����