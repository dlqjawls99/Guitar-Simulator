package guitar_9;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class MainPanel extends JPanel{
	
	ImageIcon RightButtonBasicImage = new ImageIcon(Main.class.getResource("../image/RightButton1.png"));
	ImageIcon RightButtonEnteredImage = new ImageIcon(Main.class.getResource("../image/RightButton2.png"));
	ImageIcon LeftButtonBasicImage = new ImageIcon(Main.class.getResource("../image/LeftButton1.png"));
	ImageIcon LeftButtonEnteredImage = new ImageIcon(Main.class.getResource("../image/LeftButton2.png"));
	ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../image/start1.png"));
	ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../image/start2.png"));
	ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../image/quit1.png"));
	ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../image/quit2.png"));
	ImageIcon tutorialButtonBasicImage = new ImageIcon(Main.class.getResource("../image/tutorial1.png"));
	ImageIcon tutorialButtonEnteredImage = new ImageIcon(Main.class.getResource("../image/tutorial2.png"));
	JButton RightButton = new JButton(RightButtonBasicImage);
	JButton LeftButton = new JButton(LeftButtonBasicImage);
	JButton startButton = new JButton(startButtonBasicImage);
	JButton quitButton = new JButton(quitButtonBasicImage);
	JButton nextButton = new JButton(RightButtonBasicImage);
	JButton previousButton = new JButton(LeftButtonBasicImage);
	JButton tutorialButton = new JButton(tutorialButtonBasicImage);
	
	JProgressBar progress = new JProgressBar(0, 100);
	
	
	SimulationPanel SP = new SimulationPanel();
	FirstEduPanel EP1 = new FirstEduPanel();
	SecondEduPanel EP2 = new SecondEduPanel();
	ThirdEduPanel EP3 = new ThirdEduPanel();
	FirstQuestionPanel QP1 = new FirstQuestionPanel();
	SecondQuestionPanel QP2 = new SecondQuestionPanel();
	ThirdQuestionPanel QP3 = new ThirdQuestionPanel();
	GameSelectPanel GSP = new GameSelectPanel();
	
	JPanel IntroImage = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../image/introBackground.jpg")).getImage();
		public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
		
	public MainPanel(){//생성자
		setLayout(null); //배치관리자 Null
		setVisible(true); //패널이 보이도록
		setBackground(new Color(255, 250, 210, 255)); //패널배경
		setSize(1280, 720); //패널 크기
		add(EP1); EP1.setBounds(160, 0, 960, 680); EP1.setVisible(false);
		add(EP2); EP2.setBounds(160, 0, 960, 680); EP2.setVisible(false);
		add(EP3); EP3.setBounds(160, 0, 960, 680); EP3.setVisible(false);
		add(QP1); QP1.setBounds(160, 0, 960, 680); QP1.setVisible(false);
		add(QP2); QP2.setBounds(160, 0, 960, 680); QP2.setVisible(false);
		add(QP3); QP3.setBounds(160, 0, 960, 680); QP3.setVisible(false);
		add(GSP); GSP.setBounds(160, 0, 960, 680); GSP.setVisible(false);
		add(SP); SP.setBounds(160, 0, 960, 680); SP.setVisible(false);
		
		
		
		RightButton.setVisible(false);
		RightButton.setBorderPainted(false);
		RightButton.setContentAreaFilled(false);
		RightButton.setFocusPainted(false);
		RightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				RightButton.setIcon(RightButtonEnteredImage); 
				RightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				RightButton.setIcon(RightButtonBasicImage);
				RightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				LeftButton.setVisible(true);
				RightButton.setVisible(false);
				SP.setVisible(false);
				GSP.setVisible(true);
			}
		});
		
		LeftButton.setVisible(false);
		LeftButton.setBorderPainted(false);
		LeftButton.setContentAreaFilled(false);
		LeftButton.setFocusPainted(false);
		LeftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				LeftButton.setIcon(LeftButtonEnteredImage); 
				LeftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				LeftButton.setIcon(LeftButtonBasicImage);
				LeftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				LeftButton.setVisible(false);
				RightButton.setVisible(true);
				GSP.setVisible(false);
				tutorialButton.setVisible(false);
				SP.setVisible(true);
			}
		});
		
		nextButton.setVisible(false);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				nextButton.setIcon(RightButtonEnteredImage); 
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				nextButton.setIcon(RightButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		
		previousButton.setVisible(false);
		previousButton.setBorderPainted(false);
		previousButton.setContentAreaFilled(false);
		previousButton.setFocusPainted(false);
		previousButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				previousButton.setIcon(LeftButtonEnteredImage); 
				previousButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				previousButton.setIcon(LeftButtonBasicImage);
				previousButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		
		tutorialButton.setBounds(100, 165, 262, 101);
		tutorialButton.setVisible(true);
		tutorialButton.setBorderPainted(false);
		tutorialButton.setContentAreaFilled(false);
		tutorialButton.setFocusPainted(false);
		tutorialButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				tutorialButton.setIcon(tutorialButtonEnteredImage); 
				tutorialButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				tutorialButton.setIcon(tutorialButtonBasicImage);
				tutorialButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				nextButton.setVisible(true);
				previousButton.setVisible(true);
				EP1.setVisible(true);
				
				tutorialButton.setVisible(false);
				startButton.setVisible(false);
				quitButton.setVisible(false);
				IntroImage.setVisible(false);
				
				progress.setValue(0);
				progress.setString(0 + "%");
				previousButton.setEnabled(true);
				count++;
				
			}
		});
		
		
		startButton.setBounds(100, 295, 262, 101); //시작하기버튼 
		startButton.setVisible(true);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				startButton.setIcon(startButtonEnteredImage); 
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);//스타트 버튼 입력시 스타트 버튼이 안보이게함
				quitButton.setVisible(false);//스타트 버튼 입력시 종료 버튼이 안보이게
				SP.setFocusable(true);
				SP.setVisible(true);
				SP.requestFocus();
				IntroImage.setVisible(false);
				RightButton.setVisible(true);
				tutorialButton.setVisible(false);
			}
		});
		
		quitButton.setBounds(100, 425, 262, 101); //끝내기 버튼
		quitButton.setVisible(true);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 끝내기 버튼에 있을때 그림변경
				quitButton.setIcon(quitButtonEnteredImage); 
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 끝내기 버튼에서 빠져나갔을때 그림변경
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {//클릭시 프로그램 종료
				System.exit(0);
			}
		});
		progress.setStringPainted(true);// true로 설정하면 현재 진행상황을 %로 표시함.
		progress.setString("0%");
		startButton.setEnabled(false);
		
		RightButton.setBounds(1140, 300, 100, 100); //오른쪽
		LeftButton.setBounds(30, 300, 100, 100); //왼쪽
		nextButton.setBounds(1140, 300, 100, 100); //오른쪽
		previousButton.setBounds(30, 300, 100, 100); //왼쪽

		progress.setBounds(5, 615, 150, 60);
		IntroImage.setBounds(0, 0, 1280, 720);
		
		add(tutorialButton);
		add(progress); 
		add(previousButton); 
		add(nextButton);
		add(RightButton);
		add(LeftButton);
		add(startButton);
		add(quitButton);
		add(IntroImage);//나중에 생성할수록 패널들의 뒤쪽에 생성
		
		previousButton.addActionListener(new MyListener()); previousButton.setVisible(false);
		nextButton.addActionListener(new MyListener()); nextButton.setVisible(false);

		
	}//생성자
	int count = 0;
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch(count) {
				
			case 1://EP1
				if(e.getSource()==previousButton) {
					EP1.setVisible(false);
					previousButton.setVisible(false);
					nextButton.setVisible(false);
					startButton.setVisible(true);
					quitButton.setVisible(true);
					tutorialButton.setVisible(true);
					IntroImage.setVisible(true);
					progress.setValue(0);
					progress.setString(0 + "%");
					count--;
				}
				else if(e.getSource()==nextButton) {
					EP1.setVisible(false);
					QP1.setVisible(true);
					//nextButton.setEnabled(false);
					count++;
				}
				break;
				
			case 2://QP1
				if(e.getSource()==previousButton) {
					QP1.setVisible(false);
					EP1.setVisible(true);
					count--;
				}
				else if(e.getSource()==nextButton) {
					QP1.setVisible(false);
					EP2.setVisible(true);
					progress.setValue(33);
					progress.setString(33 + "%");
					count++;
				}
				break;
				
			case 3://EP2
				if(e.getSource()==previousButton) {
					EP2.setVisible(false);
					QP1.setVisible(true);
					progress.setValue(0);
					progress.setString(0 + "%");
					count--;
				}
				else if(e.getSource()==nextButton) {
					EP2.setVisible(false);
					QP2.setVisible(true);
					count++;
				}
				break;
				
			case 4://QP2
				if(e.getSource()==previousButton) {
					QP2.setVisible(false);
					EP2.setVisible(true);
					count--;
				}
				else if(e.getSource()==nextButton) {
					QP2.setVisible(false);
					EP3.setVisible(true);
					progress.setValue(66);
					progress.setString(66 + "%");
					count++;
				}
				break;
				
				
			case 5://EP3
				if(e.getSource()==previousButton) {
					EP3.setVisible(false);
					QP2.setVisible(true);
					progress.setValue(33);
					progress.setString(33 + "%");
					count--;
					nextButton.setEnabled(true);
				}
				else if(e.getSource()==nextButton) {
					EP3.setVisible(false);
					QP3.setVisible(true);
					count++;
				}
				
				break;
				
			case 6://QP3
				if(e.getSource()==previousButton) {
					QP3.setVisible(false);
					EP3.setVisible(true);
					count--;
				}
				else if(e.getSource()==nextButton) {
					QP3.setVisible(false);
					nextButton.setVisible(false);
					previousButton.setVisible(false);
					progress.setValue(100);
					progress.setString(100 + "%");
					startButton.setVisible(true);
					startButton.setEnabled(true);
					quitButton.setVisible(true);
					tutorialButton.setVisible(true);
					IntroImage.setVisible(true);
					count = 0;
				}
				break;
			}	
		}
	}
}//클래스