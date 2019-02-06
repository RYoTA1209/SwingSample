package simpleframepackage;
//まずはシンプルにフレームを表示するだけのプログラム。なにもしない。
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ここから
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//frameインスタンス（オブジェクト）の作成
				JFrame frame = new JFrame();
				//フレームのサイズを整数で指定（幅、高さ）
				frame.setSize(300,400);
				//×ボタンを押した時の動作（ー＞他のオプションも調べてみよう）
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//フレームはデフォルト（最初）では見えないようになっている。（なんのためや）
				frame.setVisible(true);
			}
		});
		//ここまで
	}

}
