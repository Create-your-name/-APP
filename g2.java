package HunLian;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import HunLian.dengru2.ActionListener2;

public class g2 extends JFrame {
	//Out out = new Out();
	public static void main(String[] args) {
		new g2();
		
	}
	public  g2() {
		JFrame frame=new JFrame();
		JPanel jp=new JPanel();
		JTextArea jta2=new JTextArea(28,60);
		JTabbedPane jtb=new JTabbedPane(JTabbedPane.BOTTOM);//用于将两个不同的文本框放在一个相同的区域
		JLabel jlb=new JLabel();//设置编辑区域
		JTextField jtf=new JTextField();
		JButton jbt1=new JButton();
		JButton jbt2=new JButton();
		jbt1.setText("发送");
		frame.setBounds(0,0, 680, 750);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(new FlowLayout());
		jta2.setFont(new Font("楷体",Font.BOLD,16));
		jta2.setLineWrap(true);
		jta2.setEditable(false);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		jtb.setBounds(40, 100, 600, 500);//文本集合
		
		jtb.add("私人", jta2);
		jtf.setPreferredSize(new Dimension(440,40));//文本文件
		jtf.setBounds(80,600,440,40);
		jbt1.setBounds(540, 600, 80, 40);
		
		BufferedImage image1 = null;
		try {
			image1 = ImageIO.read(new File("images/king.jpg"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JLabel jlb1=new JLabel(new ImageIcon(image1));
		frame.getContentPane().add(jlb1);
		jlb1.setBounds(0, 0, image1.getWidth(), image1.getHeight());
		
		BufferedImage image2 = null;
		try {
			image2 = ImageIO.read(new File("images/5.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JLabel jlb2=new JLabel(new ImageIcon(image2));
		frame.getContentPane().add(jlb2);
		jlb2.setBounds(100, 0, image2.getWidth(), image2.getHeight());
		
		BufferedImage image3 = null;
		try {
			image3 = ImageIO.read(new File("images/6.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JLabel jlb3=new JLabel(new ImageIcon(image3));
		frame.getContentPane().add(jlb3);
		jlb3.setBounds(0, 650, image3.getWidth(), image3.getHeight());
		
		frame.add(jp);
		frame.add(jtb);
		frame.add(jlb);
		frame.add(jtf);
		frame.add(jbt1);
		
		frame.setVisible(true);
		
		CListener listener=new CListener(jtf,jtb);
		
		jbt1.addActionListener(listener);
		
		
	}

	public class CListener implements ActionListener{

		JTextField jtf;
		JTabbedPane jtp;

		//构造函数传参
		public CListener(JTextField jtf , JTabbedPane jtp){
			this.jtf = jtf;
			this.jtp = jtp;
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals("发送")) {
				JTextArea area = (JTextArea)jtp.getSelectedComponent();
				area.append(jtf.getText() + System.getProperty("line.separator"));
				jtf.setText("");
			}
			}
		}
	class gListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			invest invest1=new invest();
		}
	}
		
		
	
}
