package HunLian;


import java.awt.Button;
import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.View;


public class VIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIP V1=new VIP();
	}
	
	public VIP() {
		int i;
		JFrame jf1=new JFrame();
		JPanel jp1=new JPanel();
		ImageIcon image,image2,image3,image4,image5,image11,image12,image13,image14,image15,image16,image17,image18;
		 image = new ImageIcon("images/image1.jpg");
		 image2 = new ImageIcon("images/image2.jpg");
		 image3 = new ImageIcon("images/image3.jpg");
		 image4 = new ImageIcon("images/image4.jpg");
		 image11 = new ImageIcon("images/image11.jpg");
		 image12 = new ImageIcon("images/image12.jpg");
		 image13 = new ImageIcon("images/image13.jpg");
		 image14 = new ImageIcon("images/image14.jpg");
		 image15 = new ImageIcon("images/image15.jpg");
		 image16 = new ImageIcon("images/image16.jpg");
		 image17 = new ImageIcon("images/image17.jpg");
		 image18 = new ImageIcon("images/image18.jpg");
		JButton jb1=new JButton(image11);
		JButton jb2=new JButton(image12);
		JButton jb3=new JButton(image17);
		JButton jb4=new JButton(image18);
		JButton jb5=new JButton(image13);
		JButton jb6=new JButton(image14);
		JButton jb7=new JButton(image15);
		JButton jb8=new JButton(image16);
		jb1.setBounds(0, 0, 170, 300);
		jb2.setBounds(190, 0, 170, 300);
		jb3.setBounds(0, 300, 170, 300);
		jb4.setBounds(190,300, 170, 300);
		jb5.setBounds(380, 0, 170, 300);
		jb6.setBounds(560, 0, 170, 300);
		jb7.setBounds(380, 300, 170, 300);
		jb8.setBounds(560,300, 170, 300);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jb5);
		jp1.add(jb6);
		jp1.add(jb7);
		jp1.add(jb8);	
		jp1.setLayout(null);
		jf1.add(jp1);
		jf1.setBounds(320, 150, 760, 620);

		jf1.setVisible(true);
	    jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jb1.addActionListener(new VIPListener());
	    jb2.addActionListener(new VIPListener());
	    jb3.addActionListener(new VIPListener());
	    jb4.addActionListener(new VIPListener());
	    jb5.addActionListener(new VIPListener());
	    jb6.addActionListener(new VIPListener());
	    jb7.addActionListener(new VIPListener());
	    jb8.addActionListener(new VIPListener());
	 
	}
	class VIPListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
				g2 jinru=new g2();
			
		}
		
	}

}
