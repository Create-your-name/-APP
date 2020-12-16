package HunLian;
import HunLian.dengru2;

import java.awt.Color;
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


public class Hunlian extends JFrame implements ActionListener {
	
	private JPanel jp=new JPanel();
	private JLabel[] jlArray={
			new JLabel("’À    ∫≈"),
			new JLabel("√‹    ¬Î"),
			new JLabel("")
	};
	
	private JTextField jtxtName =new JTextField();
	private JPasswordField jtxtPassword= new JPasswordField();
	public  Hunlian(){
		jp.setLayout(null);
		for(int i=0;i<2;i++){
			jlArray[i].setBounds(105, 155+i*50, 80, 26);
			jp.add(jlArray[i]);
		}
		JButton jb1 = new JButton("µ«¬º");
		JButton jb2 = new JButton("◊¢≤·");
		BufferedImage image = null;
		try {
			image=ImageIO.read(new File("images/x.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//getContentPane().setLayout(null);
		JLabel lable=new JLabel(new ImageIcon(image));
		getContentPane().add(lable);
		lable.setBounds(65, 30, image.getWidth(), image.getHeight());
		jp.add(jb1);
		jp.add(jb2);
		jb1.setBounds(125,265,80,26);
		jb2.setBounds(245,265,80,26);
		jtxtName.setBounds(155,155,180,30);
		jp.add(jtxtName);
		jtxtName.addActionListener(this);
		jtxtPassword.setBounds(155,205,180,30);
		jp.add(jtxtPassword);
		jtxtPassword.setEchoChar('*');
		jtxtPassword.addActionListener(this);
		jlArray[2].setBounds(85, 315, 300, 30);
		jp.add(jlArray[2]);
		this.add(jp);
		this.setTitle("µ«¬Ω");
		this.setResizable(false);
		this.setBounds(520, 240, 450, 400);
		this.setVisible(true);
		jb1.setActionCommand("µ«¬º");
		jb2.setActionCommand("◊¢≤·");
		jb1.addActionListener(new DengruListener());
		jb2.addActionListener(this);
		jp.setBackground(Color.green);
		//Admin admin = new Admin();
        //admin.setID(name);
        //admin.setPassword(passwd);
	}
	

	public static void main(String[] args) {
		new Hunlian();
	//	JOptionPane.showMessageDialog(temporaryLostComponent, "∂‘≤ª∆£¨ƒ˙ ‰»Îµƒ√‹¬ÎŒ™ø’÷µ");

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("◊¢≤·")) {
		//	jp.setVisible(false);
			zhuche zc = new zhuche(); 
		}else {
			jp.setVisible(true);
			if(jtxtName.getText().equals(zhuche.name)&&jtxtPassword.getText().equals(zhuche.passwd)) {
				dengru2 dr = new dengru2();
		}
	}
	}
	class DengruListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			  dengru2 dr = new dengru2(); 
			//  dr.go();
			 
			
			}
		
		
	}
}