package HunLian;


import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.*;
public class dengru2 extends JFrame implements ActionListener
{
	static int i = 0;
	private Container container=null;
	private JButton  jbn1=new JButton("��һ��");
	private JLabel jlabel=null;
	static String path ="images/image2.jpg";	
	String path3 ="images/image10.jpg";
	JComboBox comBox;
    public static void main(String[] agrs)
    {
    	dengru2  rukou =new dengru2();
    }
    public dengru2() {
    	JLabel label=new JLabel();
    	JFrame frame=new JFrame("���������");    //����Frame����
    	frame.setLayout(new BorderLayout());    //ΪFrame�������ò���ΪBorderLayout
		//frame.setBounds(500,500, 700, 650);
    	//	container = this.getContentPane();
    //	container.setLayout(new BorderLayout());
	//	container.add(jbn1,BorderLayout.EAST);
		jbn1.setActionCommand("��һ��");
		//frame.setBounds(400, 200, 200, 800);
		//frame.setBounds(700, 700, 150, 25);
		jbn1.addActionListener(this);
		JButton button1=new JButton ("�����ʶ������");
	//	JButton button2=new JButton ("");
	//	JButton button4=new JButton("");
		JButton button5=new JButton("��");
        frame.add(button1,BorderLayout.NORTH);
       // frame.add(button2,BorderLayout.WEST);
       // frame.add(button4,BorderLayout.EAST);
        frame.add(button5,BorderLayout.SOUTH);
        
        //����CENTER�ı���
        ImageIcon image;
        image = new ImageIcon("images/10.jpg");
        JButton button3=new JButton(image);
        frame.add(button3,BorderLayout.CENTER);
        button1.addActionListener(new ActionListener2());
        button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				repaint(); 
				
				System.out.print(i);
				String path2 = null;
				if(i==0) {
						repaint();
						 path2 ="images/7.jpg";
					}else if(i==1) {
						repaint();
					 path2 ="images/8.jpg";
					}else if(i==2){
						path2 ="images/9.jpg";
					}
			ImageIcon icon =new ImageIcon(path2);
			Image temp1= icon.getImage().getScaledInstance(button3.getWidth(),
				button3.getHeight(), icon.getImage().SCALE_DEFAULT);
			icon =new ImageIcon(temp1);
			button3.setIcon(icon);
			i++;
			}
        	
        });
        //�����б�
        if(path=="images/image2.jpg") {
        comBox = new JComboBox();//�����б�
		comBox.addItem( "���� 		 18 \n"
				+		 "���� 		 ����		");
		//comBox.addItem("���� 		����	");
		//comBox.addItem("���		180cm");
		frame.add(comBox,BorderLayout.SOUTH);
        }
        //�����·�������
        button5.addActionListener(new ActionListener1());
        //�ѱ���ͼƬ��ӵ���ǩ��
        frame.setBounds(400, 0, image.getIconWidth(), image.getIconHeight()-300);   //�ѱ�ǩ����Ϊ��ͼƬ�ȸߵȿ�
        frame.add(button3);
        //�����Ҳ��ֵı���
    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
    	@Override
    	public void actionPerformed(ActionEvent e) {
	
    	}
    	class ActionListener1 implements ActionListener {

    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    				dengru2 dr = new dengru2 (); 
    			
    			
    			}
    		
    		
    	}
    	class ActionListener2 implements ActionListener {

    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    				
						g jinru=new g();
					
    			
    			}
    		
    		
    	}

}

