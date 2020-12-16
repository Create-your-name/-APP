package HunLian;
import HunLian.chonzhi;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import HunLian.g.gListener;

public class invest extends JFrame{
	
	public static void main(String[] args) {
		new invest();
	}
	
	public invest() {
		JFrame frame=new JFrame();
		JPanel jp=new JPanel();
		
		BufferedImage image1 = null;
		try {
			image1 = ImageIO.read(new File("images/2.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JButton jlb1=new JButton(new ImageIcon(image1));
		frame.getContentPane().add(jlb1);
		jlb1.setBounds(20, 20, image1.getWidth(), image1.getHeight());
		jlb1.addActionListener(new investListener1());
		
		BufferedImage image2 = null;
		try {
			image2 = ImageIO.read(new File("images/3.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JButton jlb2=new JButton(new ImageIcon(image2));
		frame.getContentPane().add(jlb2);
		jlb2.setBounds(340, 20, image2.getWidth(), image2.getHeight());
		jlb2.addActionListener(new investListener2());
		
		BufferedImage image3 = null;
		try {
			image3 = ImageIO.read(new File("images/4.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		JButton jlb3=new JButton(new ImageIcon(image3));
		frame.getContentPane().add(jlb3);
		jlb3.setBounds(660, 20, image3.getWidth(), image3.getHeight());
		jlb3.addActionListener(new investListener3());
		
		frame.setBounds(0,0, 990, 470);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		
		frame.setVisible(true);
	}
	class investListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			VIP V1=new VIP();
		}
	}
	class investListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			chonzhi go=new chonzhi();
			go.go();
		}
	}
	class investListener3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			chonzhi go=new chonzhi();
			go.go();
		}
	}

}
