package guitar_9;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OnePunchPanel extends JPanel implements ActionListener{
	
	BufferedImage img = null;
	BufferedImage Backimg = null;
	BufferedImage OneTabs1 = null;
	BufferedImage OneTabs2 = null;
	BufferedImage OneTabs3 = null;
	BufferedImage OneTabs4 = null;
	BufferedImage OneTabs5 = null;
	BufferedImage OneTabs6 = null;
	BufferedImage OneTabs7 = null;
	BufferedImage OneTabs8 = null;

	int img_x = 60, img_y = 315;
	private int i = 1;
	public OnePunchPanel(){
		this.setFocusable(true);
		requestFocus();
		this.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(500, 580, 640, 60);
		JLabel label=  new JLabel("ESC키: 종료");
		Font font = new Font("Aharoni 굵게", Font.BOLD, 40);
		label.setFont(font);
		panel1.add(label);
		add(panel1);
		
		try {
			Backimg = ImageIO.read(new File("One.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			img = ImageIO.read(new File("green.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs1 = ImageIO.read(new File("OneTabs1.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs2 = ImageIO.read(new File("OneTabs2.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs3 = ImageIO.read(new File("OneTabs3.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs4 = ImageIO.read(new File("OneTabs4.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs5 = ImageIO.read(new File("OneTabs5.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs6 = ImageIO.read(new File("OneTabs6.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
	
		try {
			OneTabs7 = ImageIO.read(new File("OneTabs7.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		try {
			OneTabs8 = ImageIO.read(new File("OneTabs8.png"));
		} catch (IOException e) {
			System.out.println("no image");
		}
		
		
	addKeyListener(new KeyListener() {
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_ESCAPE:
			img_x = 60;
			img_y = 315;
			i = 1;
			setVisible(false);
			break;
		case KeyEvent.VK_Z: //6번줄
			Music m1 = new Music("낮은미.mp3", false); m1.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_X: 
			Music m2 = new Music("낮은파.mp3", false); m2.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_C: 
			Music m3 = new Music("낮은파#.mp3", false); m3.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_V: 
			Music m4 = new Music("낮은솔.mp3", false); m4.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_B: 
			Music m5 = new Music("낮은솔#.mp3", false); m5.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		
		case KeyEvent.VK_N: //5번줄
			Music m6 = new Music("낮은라.mp3", false); m6.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_M: 
			Music m7 = new Music("낮은라#.mp3", false); m7.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_COMMA: 
			Music m8 = new Music("낮은시.mp3", false); m8.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_PERIOD: 
			Music m9 = new Music("도.mp3", false); m9.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_SLASH: 
			Music m10 = new Music("도#.mp3", false); m10.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		
		case KeyEvent.VK_A://4번줄 
			Music m11 = new Music("레.mp3", false); m11.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_S: 
			Music m12 = new Music("레#.mp3", false); m12.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_D: 
			Music m13 = new Music("미.mp3", false); m13.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F: 
			Music m14 = new Music("파.mp3", false); m14.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_G: 
			Music m15 = new Music("파#.mp3", false); m15.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		
		case KeyEvent.VK_Q: //3번줄
			Music m16 = new Music("솔.mp3", false); m16.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_W: 
			Music m17 = new Music("솔#.mp3", false); m17.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_E: 
			Music m18 = new Music("라.mp3", false); m18.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_R: 
			Music m19 = new Music("라#.mp3", false); m19.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		
		case KeyEvent.VK_1: //2번줄
			Music m20 = new Music("시.mp3", false); m20.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_2: 
			Music m21 = new Music("높은도.mp3", false); m21.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_3: 
			Music m22 = new Music("높은도#.mp3", false); m22.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_4: 
			Music m23 = new Music("높은레.mp3", false); m23.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_5: 
			Music m24 = new Music("높은레#.mp3", false); m24.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		
		case KeyEvent.VK_F1: //1번줄
			Music m25 = new Music("높은미.mp3", false); m25.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F2: 
			Music m26 = new Music("높은파.mp3", false); m26.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F3: 
			Music m27 = new Music("높은파#.mp3", false); m27.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F4: 
			Music m28 = new Music("높은솔.mp3", false); m28.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F5: 
			Music m29 = new Music("높은솔#.mp3", false); m29.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F6: 
			Music m30 = new Music("높은라.mp3", false); m30.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F7: 
			Music m31 = new Music("높은라#.mp3", false); m31.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;;
			}
			break;
		case KeyEvent.VK_F8: 
			Music m32 = new Music("높은시.mp3", false); m32.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F9: 
			Music m33 = new Music("높높도.mp3", false); m33.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F10: 
			Music m34 = new Music("높높도#.mp3", false); m34.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F11: 
			Music m35 = new Music("높높레.mp3", false); m35.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		case KeyEvent.VK_F12: 
			Music m36 = new Music("높높레#.mp3", false); m36.start();
			img_x =img_x + 60;
			if(img_x> 959) {
				i = i + 1;
				repaint();
				img_x = 60;
			}
			break;
		}
		repaint();
	}
	


	public void keyTyped(KeyEvent e) {}
	
	public void keyReleased(KeyEvent e) {}
	});
	
}//생성자
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Backimg, 0, 0, null);
		if(i == 1) {
		g.drawImage(OneTabs1, 0, 280, null);
		}
		if(i == 2) {
		g.drawImage(OneTabs2, 0, 280, null);
		}
		if(i == 3) {
		g.drawImage(OneTabs3, 0, 280, null);
		}
		if(i == 4) {
	    g.drawImage(OneTabs4, 0, 280, null);
		}
		if(i == 5) {
			g.drawImage(OneTabs5, 0, 280, null);
			}
		if(i == 6) {
			g.drawImage(OneTabs6, 0, 280, null);
			}
		if(i == 7) {
			g.drawImage(OneTabs7, 0, 280, null);
			}
		if(i == 8) {
			g.drawImage(OneTabs8, 0, 280, null);
			}
		if(i == 9) {
			int img_x = 60, img_y = 315;
			this.setVisible(false);
			i = 1;
		}

		g.drawImage(img, img_x, img_y, null);
	}



@Override
public void actionPerformed(ActionEvent e) {
	
	}
}