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



public class SimulationPanel extends JPanel implements KeyListener{ //클래스
	
	JPanel panelB1_00 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_01 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar도.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_02 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar레.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_03 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar미.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_04 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar파.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_05 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar솔.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_06 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar라.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_07 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar시.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_08 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_A코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_09 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_C코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_10 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_D코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_11 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_E코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB1_12 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../guitar/guitar_G코드.png")).getImage();
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
	
	JPanel panelB3_00 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_기본.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_01 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_도.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_02 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_레.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_03 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_미.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_04 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_파.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_05 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_솔.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_06 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_라.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_07 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_시.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};

	JPanel panelB3_08 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_A코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_09 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_C코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_10 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_D코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	JPanel panelB3_11 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_E코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	JPanel panelB3_12 = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../sheet/악보_G코드.png")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};	
	
	public SimulationPanel() {//생성자
		this.addKeyListener(this);
		requestFocus();
		setFocusable(true);
		setLayout(new BorderLayout());
		JPanel panelA = new JPanel(); //GUITAR SIMULATOR 레이블
		panelA.setBackground(new Color(250, 235, 215, 255));
		JLabel label1=  new JLabel("GUITAR SIMULATOR");
		Font font = new Font("Aharoni 굵게", Font.BOLD, 40);
		label1.setFont(font);
		panelA.add(label1);
		
		JPanel panelB = new JPanel(); //기타, 코드, 악보 표시 패널
		panelB.setBackground(new Color(250, 235, 215, 255));
		panelB.setLayout(null);	
		
		//기타 부분 panelB1_00~panelB1_12
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
		
		
		//손 부분 panelB2_00 ~ panelB2_5
		panelB2_00.setBounds(80, 300, 330, 250);
		panelB2_01.setBounds(80, 300, 330, 250);panelB2_01.setVisible(false);
		panelB2_02.setBounds(80, 300, 330, 250);panelB2_02.setVisible(false);
		panelB2_03.setBounds(80, 300, 330, 250);panelB2_03.setVisible(false);
		panelB2_04.setBounds(80, 300, 330, 250);panelB2_04.setVisible(false);
		panelB2_05.setBounds(80, 300, 330, 250);panelB2_05.setVisible(false);
		
		//악보 부분 panelB3_00 ~ panelB3_12
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
		
		//버튼부분
		JPanel panelC = new JPanel();//(Single, Chord 레이블), 각 음들의 버튼
		panelC.setLayout(new GridLayout(2, 1));
		JPanel panelC1 = new JPanel();//도레미파솔라시도 버튼
		JPanel panelC2 = new JPanel();//코드 버튼
			
		JButton button1 = new JButton("도 (1)"); 
		JButton button2 = new JButton("레 (2)"); 
		JButton button3 = new JButton("미 (3)");
		JButton button4 = new JButton("파 (4)"); 
		JButton button5 = new JButton("솔 (5)"); 
		JButton button6 = new JButton("라 (6)");
		JButton button7 = new JButton("시 (7)");
		JButton button8 = new JButton("A코드(A)"); 
		JButton button9 = new JButton("C코드(S)"); 
		JButton button10 = new JButton("D코드(D)"); 
		JButton button11 = new JButton("E코드(F)"); 
		JButton button12 = new JButton("G코드(G)");
		
		JLabel label2 = new JLabel("Single sound"); JLabel label3 = new JLabel("Chord sound");
		panelC1.add(label2); panelC1.add(button1); panelC1.add(button2); panelC1.add(button3); panelC1.add(button4); panelC1.add(button5); panelC1.add(button6);panelC1.add(button7);
		panelC2.add(label3); panelC2.add(button8); panelC2.add(button9); panelC2.add(button10); panelC2.add(button11); panelC2.add(button12);
		panelC.add(panelC1); panelC.add(panelC2);
		
		this.add(panelA, BorderLayout.NORTH); this.add(panelB, BorderLayout.CENTER); this.add(panelC, BorderLayout.SOUTH);
				
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button1) {
					Music m1 = new Music("도.mp3", false);
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
					Music m2 = new Music("레.mp3", false);
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
					Music m3 = new Music("미.mp3", false);
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
					Music m4 = new Music("파.mp3", false);
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
					Music m5 = new Music("솔.mp3", false);
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
					Music m6 = new Music("라.mp3", false);
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
					Music m7 = new Music("시.mp3", false);
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

		button8.addActionListener(new ActionListener() {//A코드
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
					Music m1 = new Music("낮은라.mp3", false);
					Music m2 = new Music("미.mp3", false);
					Music m3 = new Music("라.mp3", false);
					Music m4 = new Music("높은도#.mp3", false);
					Music m5 = new Music("높은미.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});

		button9.addActionListener(new ActionListener() {//C코드
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
					Music m1 = new Music("도.mp3", false);
					Music m2 = new Music("미.mp3", false);
					Music m3 = new Music("솔.mp3", false);
					Music m4 = new Music("높은도.mp3", false);
					Music m5 = new Music("높은미.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});
		
		button10.addActionListener(new ActionListener() {//D코드
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
					Music m1 = new Music("레.mp3", false);
					Music m2 = new Music("라.mp3", false);
					Music m3 = new Music("높은레.mp3", false);
					Music m4 = new Music("높은파#.mp3", false);
					m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
					requestFocus();

				}
			}
		});

		button11.addActionListener(new ActionListener() {//E코드
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
					Music m1 = new Music("낮은미.mp3", false);
					Music m2 = new Music("낮은시.mp3", false);
					Music m3 = new Music("미.mp3", false);
					Music m4 = new Music("솔#.mp3", false);
					Music m5 = new Music("시.mp3", false);
					Music m6 = new Music("높은미.mp3", false);
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

		button12.addActionListener(new ActionListener() { //G코드
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
					Music m1 = new Music("낮은솔.mp3", false);
					Music m2 = new Music("낮은시.mp3", false);
					Music m3 = new Music("레.mp3", false);
					Music m4 = new Music("솔.mp3", false);
					Music m5 = new Music("시.mp3", false);
					Music m6 = new Music("높은솔.mp3", false);
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
		
		}//생성자
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_1: 
			Music mA = new Music("도.mp3", true); mA.start(); 
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
			Music mB = new Music("레.mp3", true); mB.start(); 
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
			Music mC = new Music("미.mp3", true); mC.start();
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
			Music mD = new Music("파.mp3", true); mD.start();
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
			Music mE = new Music("솔.mp3", true); mE.start(); 
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
			Music mF = new Music("라.mp3", true); mF.start(); 
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
			Music mG = new Music("시.mp3", true); mG.start();
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
			
		case KeyEvent.VK_A: //A코드
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
			
			Music m1 = new Music("낮은라.mp3", false);
			Music m2 = new Music("미.mp3", false);
			Music m3 = new Music("라.mp3", false);
			Music m4 = new Music("높은도#.mp3", false);
			Music m5 = new Music("높은미.mp3", false);
			
			m1.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m2.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m3.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m4.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m5.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			break;
		
		case KeyEvent.VK_S: //c코드
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
			
			Music m6 = new Music("도.mp3", false);
			Music m7 = new Music("미.mp3", false);
			Music m8 = new Music("솔.mp3", false);
			Music m9 = new Music("높은도.mp3", false);
			Music m10 = new Music("높은미.mp3", false);

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
			
			Music m11 = new Music("레.mp3", false);
			Music m12 = new Music("라.mp3", false);
			Music m13 = new Music("높은레.mp3", false);
			Music m14 = new Music("높은파#.mp3", false);
	
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
			
			Music m15 = new Music("낮은미.mp3", false);
			Music m16 = new Music("낮은시.mp3", false);
			Music m17 = new Music("미.mp3", false);
			Music m18 = new Music("솔#.mp3", false);
			Music m19 = new Music("시.mp3", false);
			Music m20 = new Music("높은미.mp3", false);
			
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
			
			Music m21 = new Music("낮은솔.mp3", false);
			Music m22 = new Music("낮은시.mp3", false);
			Music m23 = new Music("레.mp3", false);
			Music m24 = new Music("솔.mp3", false);
			Music m25 = new Music("시.mp3", false);
			Music m26 = new Music("높은솔.mp3", false);
			
			m21.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m22.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m23.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m24.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();} 
			m25.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			m26.start(); try {Thread.sleep(120);} catch (InterruptedException e1) {e1.printStackTrace();}
			break;
		
		
		}	
	}//생성자
		public void keyTyped(KeyEvent e) {}
		
		public void keyReleased(KeyEvent e) {}
		
}//MainPanel 클래스