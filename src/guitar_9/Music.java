package guitar_9;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) { //����Music("���ϸ�", true(�������)or false)
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
// public int getTime() {//���� ������ ������ġ�� ��Ÿ�� 10�ʸ� 10000 ��ȯ
//	if(player == null)
//			return 0;
//	return player.getPosition();
//	}
//	public void close() { //���� �����Լ�
//		isLoop = false;
//		player.close();
//		this.interrupt();
//}
	
	@Override
	public void run() {
		try {
				player.play();
				player.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

 }
}


//do {
//	fis = new FileInputStream(file);
//	bis = new BufferedInputStream(fis);
//	player = new Player(bis);
//	player.play();
//}while(isLoop);