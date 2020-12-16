package HunLian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
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

public class chonzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 chonzhi xiexie=new chonzhi();
		 xiexie.go();
	}
	void go(){
		JFrame jf1=new JFrame();
		JPanel jp1=new JPanel();
		ImageIcon image;
	    image = new ImageIcon("images/二维码.jpg");
		JButton button3=new JButton(image);
		jp1.setLayout(new BorderLayout());  
	    jp1.add(button3,BorderLayout.CENTER);
	    jf1.setBounds(360, 0, image.getIconWidth()+20, image.getIconHeight()+150);
	    jp1.setBounds(600, 200, image.getIconWidth()+20,image.getIconHeight()+25);   //把标签设置为和图片等高等宽
        JButton jb1=new JButton("确定");
        jb1.setBounds(0,850, 800, 50);
        jf1.add(jb1);
        jf1.add(jp1);
        jf1.add(button3);
        button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "恭喜你，充值成功！！");
				VIP V1=new VIP();
				
			}

		
			
			});
	    jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
