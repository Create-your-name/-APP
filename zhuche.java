package HunLian;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
//import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*hb
 * 管理员注册界面
 * 
 */
public class zhuche extends JFrame{
	zhuche () {
		init();
	}
	static String name;
	static String passwd;
	static String confrimpasswd;
	static String age;
	static String clas;
	static String home;
	static String hobby;
	void init() {
            JFrame frame = new JFrame("注册恩赐账号");
            frame.setLayout(null);
            
            JLabel nameStr = new JLabel("用户名:");
            nameStr.setBounds(250, 50, 100, 25);
            frame.add(nameStr);

            JLabel passwordStr = new JLabel("密码:");
            passwordStr.setBounds(250, 100, 100, 25);
            frame.add(passwordStr);  
               
            JLabel confrimStr = new JLabel("确认密码:");
            confrimStr.setBounds(250, 150, 100, 30);
            frame.add(confrimStr);
            
            JLabel ageStr = new JLabel("年龄:");
            ageStr.setBounds(250, 200, 100, 30);
            frame.add(ageStr);
            
            JLabel clasStr = new JLabel("专业:");
            clasStr.setBounds(250, 250, 100, 25);
            frame.add(clasStr);
            
            JLabel homeStr = new JLabel("家乡:");
            homeStr.setBounds(250, 300, 100, 25);
            frame.add(homeStr);
            
            JLabel hobbyStr = new JLabel("爱好:");
            hobbyStr.setBounds(250, 350, 100, 25);
            frame.add(hobbyStr);
            
            JTextField userName = new JTextField();
            userName.setBounds(320, 50, 150, 25);
            frame.add(userName);

            JPasswordField password = new JPasswordField();
            password.setBounds(320, 100, 150, 25);
            frame.add(password);

            JPasswordField confrimPassword = new JPasswordField();
            confrimPassword.setBounds(320, 150, 150, 25);
            frame.add(confrimPassword);
            
            JTextField userAge = new JTextField();
            userAge.setBounds(320, 200, 150, 25);
            frame.add(userAge);
            
            JTextField userClas = new JTextField();
            userClas.setBounds(320, 250, 150, 25);
            frame.add(userClas);
            
            JTextField userHome = new JTextField();
            userHome.setBounds(320, 300, 150, 25);
            frame.add(userHome);
            
            JTextField userHobby = new JTextField();
            userHobby.setBounds(320, 350, 150, 25);
            frame.add(userHobby);
                    
            
            JRadioButton r1,r2,c;
            r1=new JRadioButton("男");
    		r2=new JRadioButton("女");
    		r1.setSelected(true);
    		c=new JRadioButton("接受用户协议");
    		frame.add(r1);
    		frame.add(r2);
    		frame.add(c);
    		r1.setSelected(true);
    		r1.setForeground(Color.black);
    		r2.setForeground(Color.black);
    		c.setForeground(Color.black);
    		c.setSelected(true);
    		r1.setBounds(250, 400, 100, 50);
    		r2.setBounds(350, 400, 100, 50);
    		c.setBounds(250, 450, 100, 50);
    		
            
            JButton buttonregister = new JButton("注册");
            buttonregister.setBounds(350, 500, 70, 25);
            frame.add(buttonregister);

            frame.setBounds(380, 100, 700, 640);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
                   
            
            
            	r1.addActionListener(new ActionListener() {                
                @Override
                public void actionPerformed(ActionEvent e) {
                         // TODO Auto-generated method stub
                         if(r1.isSelected()){
                                  r2.setSelected(false); 
                         } 
                }
       });

            	r2.addActionListener(new ActionListener() {                  
                @Override
                public void actionPerformed(ActionEvent e) {
                         // TODO Auto-generated method stub
                         if(r2.isSelected()){
                                  r1.setSelected(false);
                         }
                }
       });
            	
            	c.addActionListener(new ActionListener() {                
                    @Override
                    public void actionPerformed(ActionEvent e) {
                             // TODO Auto-generated method stub
                             if(c.isSelected()==false){
                            	 JOptionPane.showMessageDialog(frame, "对不起，请您勾选上条约"); 
                             } 
                    }
           });
            
            
            buttonregister.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    name = userName.getText();
                    passwd = new String (password.getPassword());
                    confrimpasswd = new String (confrimPassword.getPassword());
                    age = userAge.getText();
                    clas = userClas.getText();
                    home = userHome.getText();
                    hobby = userHobby.getText();
                    judge(); 
				    
                }

				private void judge() {
					// TODO Auto-generated method stub
					if (userName.getText().isEmpty()) {// 判断用户名是否为空
						JOptionPane.showMessageDialog(frame, "对不起，您输入的用户名为空值");
                        return;
                        }
                        if (new String(password.getText()).isEmpty()) {// 判断密码是否为空
                        JOptionPane.showMessageDialog(frame, "对不起，您输入的密码为空值");
                        return;
                        }
                        if (new String(confrimPassword.getText()).isEmpty()) {// 判断确认密码是否为空
                        JOptionPane.showMessageDialog(frame, "对不起，您输入的确认密码为空值");
                        return;
                        }
                        if (passwd.equals(confrimpasswd)==false) {
    						JOptionPane.showMessageDialog(frame, "对不起，您输两次密码不相同");
                            return;
                   }
                        if (age.matches("\\d+")==false) {
    						JOptionPane.showMessageDialog(frame, "对不起，请你输入年龄为数字整数");
                            return;
                   }
                        frame.setVisible(false);
    				   // new Hunlian();
    				    FileWriter out;
    					try {
    						out = new FileWriter("D:/文本.txt");
    						out.write(name);
    						out.write(passwd);
    						out.write(confrimpasswd);
    						out.write(age);
    						out.write(clas);
    						out.write(home);
    						out.write(hobby);//将文本内容保存到文件中
    						out.close();
    						JOptionPane.showMessageDialog(frame, "注册成功，系统已将你的信息保存");
    					} catch (IOException e1) {
    						e1.printStackTrace();
    					}
    					userName.setText(userName.getText());
				}
            });
}
}