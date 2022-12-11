package guitar_9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdEduPanel extends JPanel{
	JLabel TitleLabel = new JLabel("林过(漠赋家 府惦)");
	JPanel ImagePanel = new JPanel() {Image img = new ImageIcon(Main.class.getResource("../edu/edu3.jpg")).getImage();
	
	
	public void paint(Graphics g) {g.drawImage(img, 0, 0, null);}};
	ThirdEduPanel(){
		setLayout(null);
		
		Font font = new Font("SanSerif", Font.BOLD, 30);
		TitleLabel.setFont(font);
		TitleLabel.setBounds(370, 0,  960, 100);
		ImagePanel.setBounds(0, 100, 960, 320);
		
		add(ImagePanel); add(TitleLabel);
		
	}
	
	

}
