package guitar_9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FirstQuestionPanel extends JPanel implements ActionListener{
	JPanel TitlePanel = new JPanel();
	JLabel TitleLabel = new JLabel("Q1. 순서대로 기타 줄의 음 이름을 고르시오");
	
	JPanel SelectPanel = new JPanel();
	JRadioButton radio1 = new JRadioButton("미라레솔시미");
	JRadioButton radio2 = new JRadioButton("도레미파솔라");
	ButtonGroup group = new ButtonGroup();
	
	
	
	FirstQuestionPanel(){
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
