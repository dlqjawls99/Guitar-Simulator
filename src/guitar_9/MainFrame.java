package guitar_9;

import javax.swing.JFrame;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		add(new MainPanel()); 
		setSize(1280, 720); //������ ũ�� 1280x720
		setTitle("GuitarSimulator"); //Ÿ��Ʋ �� GuitarSimulator
		setLocationRelativeTo(null); // ����� ���߾ӿ� â ���
		setResizable(false); // false�Ͻ� ȭ��ũ�� ���� x;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); //�������� ���̵���
		setLayout(null);//�������� ��ġ������-null
	}
}