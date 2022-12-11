package guitar_9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstEduPanel extends JPanel{
	JLabel TitleLabel = new JLabel("줄 번호, 음 이름");
	JPanel ImagePanel = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../edu/edu1.jpg")).getImage();
	public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	
	FirstEduPanel(){
		setLayout(null);
		
		Font font = new Font("SanSerif", Font.BOLD, 30);
		TitleLabel.setFont(font);
		TitleLabel.setBounds(380, 0,  960, 100);
		ImagePanel.setBounds(270, 100, 403, 480);
		
		add(ImagePanel); add(TitleLabel);
		
	}
	
	

}
