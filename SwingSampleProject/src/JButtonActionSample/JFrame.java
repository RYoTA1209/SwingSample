package JButtonActionSample;

/**
 * 
 * 
 */

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;

public class JFrame extends javax.swing.JFrame {

	public JFrame() throws HeadlessException {
		// TODO 自動生成されたコンストラクター・スタブ
		//フレームの生成
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(512, 460);
		setTitle("This is title.");
		
		//ボタンの生成
		JButton btn1 = new JButton("Button1");
		btn1.addActionListener(new ClickAction());
		add(btn1);
		
		//これだけは忘れずに
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO 自動生成されたメソッド・スタブ
				JFrame frame = new JFrame();
			}

		});

	}

}
