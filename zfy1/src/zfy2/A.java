package zfy2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class A extends JFrame{
	public void createFrame(String title) {
		JFrame j = new JFrame(title);
		Container container = j.getContentPane();
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10, 10, 100, 21);
		bl.setHorizontalAlignment(SwingConstants.SOUTH_EAST);
		bl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog(A.this).setVisible(true);
				
			}
			
		});
//		JLabel jl = new JLabel("这是一个JFrame窗体");
//		jl.setHorizontalAlignment(SwingConstants.CENTER);
//		container.add(jl);
		container.add(bl);
		container.setBackground(Color.WHITE);
		j.setVisible(true);
		j.setSize(300, 150);
		j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new A().createFrame("创建一个JFrame窗体");
	}
}
class MyDialog extends JDialog{
	public MyDialog(A frame) {
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();
		container.setBackground(Color.black);
		container.add(new JLabel("这是一个对话框"));
		setBounds(120,120,100,100);
	}
}