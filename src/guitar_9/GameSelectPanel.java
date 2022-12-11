package guitar_9;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;



public class GameSelectPanel extends JPanel{
	private ImageIcon FreePlay = new ImageIcon(Main.class.getResource("../playlist/FreePlay.png"));
	private ImageIcon usoButtonImage = new ImageIcon(Main.class.getResource("../playlist/uso.jpg"));
	private ImageIcon OneButtonImage = new ImageIcon(Main.class.getResource("../playlist/Punch.png"));
	private ImageIcon SkyrimButtonImage = new ImageIcon(Main.class.getResource("../playlist/Skyrim.png"));
	private JButton FreePlayButton = new JButton(FreePlay);
	private JButton usoButton = new JButton(usoButtonImage);
	private JButton OneButton = new JButton(OneButtonImage);
	private JButton SkyrimButton = new JButton(SkyrimButtonImage);
	
	public GameSelectPanel(){
		setVisible(true);
		setLayout(null);
		setBackground(new Color(230, 230, 250, 255));
		
		FreePlayPanel FPP = new FreePlayPanel();
		add(FPP);
		FPP.setBounds(0, 0, 960, 680);
		FPP.setVisible(false);
		
		UsoPlayPanel UPP = new UsoPlayPanel();
		add(UPP);
		UPP.setBounds(0, 0, 960, 680);
		UPP.setVisible(false);
		
		OnePunchPanel OPP = new OnePunchPanel();
		add(OPP);
		OPP.setBounds(0, 0, 960, 680);
		OPP.setVisible(false);
		
		SkyrimPlayPanel SPP = new SkyrimPlayPanel();
		add(SPP);
		SPP.setBounds(0, 0, 960, 680);
		SPP.setVisible(false);
		
		
		FreePlayButton.setBounds(20, 20, 300, 200); 
		FreePlayButton.setVisible(true);
		FreePlayButton.setBorderPainted(false);
		FreePlayButton.setContentAreaFilled(false);
		FreePlayButton.setFocusPainted(false);
		FreePlayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				FreePlayButton.setIcon(FreePlay); 
				FreePlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				FreePlayButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				FPP.setVisible(true);
				FPP.setFocusable(true);
				FPP.requestFocus();
			}
		});
		
		
		usoButton.setBounds(330, 20, 300, 200); 
		usoButton.setVisible(true);
		usoButton.setBorderPainted(false);
		usoButton.setContentAreaFilled(false);
		usoButton.setFocusPainted(false);
		usoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				usoButton.setIcon(usoButtonImage); 
				usoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				usoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				UPP.setVisible(true);
				UPP.setFocusable(true);
				UPP.requestFocus();
			}
		});
		
		OneButton.setBounds(640, 20, 300, 200); 
		OneButton.setVisible(true);
		OneButton.setBorderPainted(false);
		OneButton.setContentAreaFilled(false);
		OneButton.setFocusPainted(false);
		OneButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				OneButton.setIcon(OneButtonImage); 
				OneButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				OneButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				OPP.setVisible(true);
				OPP.setFocusable(true);
				OPP.requestFocus();
			}
		});
		
		SkyrimButton.setBounds(330, 240, 300, 200); 
		SkyrimButton.setVisible(true);
		SkyrimButton.setBorderPainted(false);
		SkyrimButton.setContentAreaFilled(false);
		SkyrimButton.setFocusPainted(false);
		SkyrimButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 start버튼에 있을때 그림변경
				SkyrimButton.setIcon(SkyrimButtonImage); 
				SkyrimButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//커서가 손가락모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 start버튼에서 빠져나갔을때 그림변경
				SkyrimButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));//커서를 원래모양으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				SPP.setVisible(true);
				SPP.setFocusable(true);
				SPP.requestFocus();
			}
		});
		
		add(FreePlayButton);
		add(usoButton);
		add(OneButton);
		add(SkyrimButton);
		
	}//생성자
}//클래스
