package FrameBasic1;
//フレームの基本的な設定（プロパティ）/フレームの位置・タイトルの設定・アイコンの設定

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

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
				frame.setSize(512, 480);
				//×ボタンを押した時の動作（ー＞他のオプションも調べてみよう）
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				//画面上のフレームの位置の設定
				//void java.awt.Window.setLocation(int x,int y)
				//（ー＞画面内の座標系はどうなっているだろうか？）
				frame.setLocation(50, 50);

				//setTitle
				//void java.awt.Frame.setTitle(String)
				frame.setTitle("This is Title.");
				
				//アイコンの設定
				//
				Toolkit tk = Toolkit.getDefaultToolkit();
				Image img = tk.getImage("icon.png");
				frame.setIconImage(img);

				//フレームはデフォルト（最初）では見えないようになっている。（なんのためや）
				frame.setVisible(true);


			}
		});
		//ここまで
	}

}
