package guitar_9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondEduPanel extends JPanel{
	JLabel TitleLabel = new JLabel("코드표(C코드)");
	JPanel ImagePanel = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../edu/edu2.png")).getImage();
	
	
	public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	SecondEduPanel(){
		setLayout(null);
		
		Font font = new Font("SanSerif", Font.BOLD, 30);
		TitleLabel.setFont(font);
		TitleLabel.setBounds(400, 0,  960, 100);
		ImagePanel.setBounds(0, 100, 960, 378);
		
		add(ImagePanel); add(TitleLabel);
		
	}
	
	

}
