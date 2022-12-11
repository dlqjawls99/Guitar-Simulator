package guitar_9;

import javax.swing.JFrame;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		add(new MainPanel()); 
		setSize(1280, 720); //프레임 크기 1280x720
		setTitle("GuitarSimulator"); //타이틀 명 GuitarSimulator
		setLocationRelativeTo(null); // 모니터 정중앙에 창 출력
		setResizable(false); // false일시 화면크기 변경 x;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); //프레임이 보이도록
		setLayout(null);//프레임의 배치관리자-null
	}
}