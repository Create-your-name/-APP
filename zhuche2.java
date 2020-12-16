package HunLian;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class zhuche2 extends JFrame implements ActionListener{

         JPanel p1,p2,p3,p4,p5,p6,p7,p8;

         JLabel l1,l2,l3,l4,l5,l6,l7,l8;

         JTextField j1,j4,j5,j6,j7;

         JPasswordField j2,j3;

         JRadioButton r1,r2;

         JCheckBox ck1,ck2,ck3,ck4;

         JTextArea adddr;

         JComboBox degree;

         JButton bu1,bu2;

//         Connection conn;

 //   Statement stam;   

         public zhuche2() {
                 super("用户注册");
                 this.setLayout(new GridLayout(8,1));
                 p1 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l1 =new JLabel("用户名：");
                 j1=new JTextField(18);
                 p1.add(l1);
                 p1.add(j1);
                 this.add(p1); 

                 p2 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l2 =new JLabel("密码：");
                 j2=new JPasswordField(19);
                 p2.add(l2);
                 p2.add(j2);
                 this.add(p2);  

                 p3 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l3 =new JLabel("确认密码：");
                 j3=new JPasswordField(16);
                 p3.add(l3);
                 p3.add(j3);
                 this.add(p3);

                 p4 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l4 =new JLabel("确性别：");
                 r1=new JRadioButton("男");
                 r2=new JRadioButton("女");
                 this.r1.setSelected(true);

                 p4.add(l4);
                 p4.add(r1);
                 p4.add(r2);
                 this.add(p4);

                 p5 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l5 =new JLabel("爱好：");
                 ck1=new JCheckBox("阅读");
                 ck2=new JCheckBox("上网");
                 ck3=new JCheckBox("游泳");
                 ck4=new JCheckBox("旅游");

                 p5.add(l5);
                 p5.add(ck1);
                 p5.add(ck2);
                 p5.add(ck3);
                 p5.add(ck4);
                 this.add(p5);

                 p6 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l6 =new JLabel("地址：");
                 adddr =new JTextArea(2,19);
                 p6.add(l6);
                 p6.add(adddr);
                 this.add(p6);

                 p7 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l7 =new JLabel("学历：");
                 String str[]= {"小学","初中","高中","大学"};
                 degree=new JComboBox(str);
                 p7.add(l7);
                 p7.add(degree);
                 this.add(p7);   

                 p8 =new JPanel(new FlowLayout(FlowLayout.CENTER));
                 bu1=new JButton("注册");
                 bu2=new JButton("取消");  

                 p8.add(bu1);
                 p8.add(bu2);
                 this.add(p8);

                 //创建监听
                 awtEvent();
         }

         public static void main(String[] args) {
        	 zhuche2 r=new zhuche2();
                 r.setVisible(true);
                 r.setSize(300, 400);
                 r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
         //监听
    private void awtEvent() {
            //单选框互斥
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
        
        //注册按钮监听
        bu1.addActionListener(this);
        
        //取消按钮监听代码
        bu2.addActionListener(new ActionListener() {                  

                          @Override
                          public void actionPerformed(ActionEvent e) {
                                   dispose();
                          }
                 });
         }
    
         @Override
         public void actionPerformed(ActionEvent e) {
                 //获取选取的性别
                  String s1=null;
                  if(r1.isSelected()) {
                           s1="男";
                  }else {
                           s1="女";
                  }
                  //获取复选框中的值
                 String info ="";
        //通过面板属性名获取到该面板上的所有组件
        for(Component c:p5.getComponents()){
        //通过 instanceof方法筛选复选框组件
            if(c instanceof JCheckBox){
                //判断复选框组件是否被选中
                if(((JCheckBox) c).isSelected()){
                    //获取该复选框组件信息
                 info += ((JCheckBox)c).getText();
                    }
                }
            }
                  //下拉列表框中的值
                  String x = degree.getSelectedItem().toString();
                  //判断用户名和密码是否为空
                  judge();
                  //判断用户名是否重复
                  userName();
                  //两次密码是否一致
                  pwdName();
                  if(e.getSource()==bu1) {
                                   try {           
                                            //加载数据库驱动
//                                            conn=JdbcRe.getConnection();
                                            //创建执行sql语句的对象
//                                           stam=conn.createStatement();
                                            //编写sql语句
                                            String sql="insert into user values('"+j1.getText()+"','"+j2.getText()+"','"+j3.getText()+"','"+s1+"','"+info+"','"+adddr.getText()+"','"+x+"')";
                                            //执行sql语句
//                                            stam.execute(sql);
                                            //提示框
                                            JOptionPane.showMessageDialog(null, "注册成功!!!!!");
                                            //关闭注册界面窗体
                                            this.dispose(); 
                                            //打开登录窗体
                                            User user=new User();
                                            user.setVisible(true);
                                            user.setSize(600,500);
                                            user.setLocation(600,200);
                                   }catch (Exception e1) {
                                            e1.printStackTrace();
                                   }finally {
                                            JdbcRe.result(conn, stam);
                                   }
                          }
         }
         //判断用户名密码是否为空
         private void judge() {
                 if (j1.getText().isEmpty()) {// 判断用户名是否为空
                          this.dispose();
                          JOptionPane.showMessageDialog(this, "用户名不能为空！", "警告信息", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }
                          if (new String(j2.getText()).isEmpty()) {// 判断密码是否为空
                                   this.dispose();
                          JOptionPane.showMessageDialog(this, "密码不能为空！", "警告信息", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }
                          if (new String(j3.getText()).isEmpty()) {// 判断确认密码是否为空
                                   this.dispose();
                          JOptionPane.showMessageDialog(this, "确认密码不能为空！", "警告信息", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }               
         }
         
         
         //判断新的用户是否和原用户名有重复
         private void userName() {
                 try {
//                          conn=JdbcRe.getConnection();
//                         stam=(Statement)conn.createStatement();
                 //编写SQL语句
//                String sql="select id num from User where id='"+j1.getText()+"'";
//                ResultSet rs=stam.executeQuery(sql);
                 int num=0;
             if(rs!=null&&rs.next()) {
//                     num=rs.getInt("num");
                     System.out.println(num);
             }
                 //判断用户名是否有相同
                 if (num>0) {
                          JOptionPane.showMessageDialog(this, "用户名已使用，请重新选取","警告消息",JOptionPane.WARNING_MESSAGE);
                          this.dispose();
                          zhuche2 r=new zhuche2();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                 }
                 } catch (Exception e) {
                          e.printStackTrace();
                 }
         }
         
         
         //判断相关用户的密码和确认密码相同
         private void pwdName() {
                 if (j2.equals(j3)) {
                          JOptionPane.showMessageDialog(this, "两次密码不相同","警告消息",JOptionPane.WARNING_MESSAGE);
                          zhuche2 r=new zhuche2();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                 }
         }
}