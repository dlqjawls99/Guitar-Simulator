package guitar_9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SecondQuestionPanel extends JPanel implements ActionListener{
	JPanel TitlePanel = new JPanel();
	JLabel TitleLabel = new JLabel("Q2. C코드의 줄로 알맞은 것을 고르시오");
	
	JPanel SelectPanel = new JPanel();
	JRadioButton radio1 = new JRadioButton("2번 4번 5번");
	JRadioButton radio2 = new JRadioButton("1번 2번 3번");
	ButtonGroup group = new ButtonGroup();
	

	
	SecondQuestionPanel(){
		setLayout(new BorderLayout());
		
		Font font_select = new Font("SanSerif", Font.BOLD, 15);
		radio1.setFont(font_select);
		radio2.setFont(font_select);
		
		Font font = new Font("SanSerif", Font.BOLD, 30);
		TitleLabel.setFont(font);
		TitlePanel.add(TitleLabel);
		add(TitlePanel, BorderLayout.NORTH);
		
		group.add(radio1);
		group.add(radio2);
		radio1.addActionListener(this);
		radio2.addActionListener(this);
		SelectPanel.add(radio1);
		SelectPanel.add(radio2);
		add(SelectPanel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		
		if (s.equals(radio1.getText())) {
			JOptionPane.showMessageDialog(null,"정답입니다");
			//nextButton.setEnabled(true);
		}
		if (s.equals(radio2.getText())) {
			JOptionPane.showMessageDialog(null,"오답입니다");
		}
		
		
		}
	

}
