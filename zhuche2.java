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
                 super("�û�ע��");
                 this.setLayout(new GridLayout(8,1));
                 p1 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l1 =new JLabel("�û�����");
                 j1=new JTextField(18);
                 p1.add(l1);
                 p1.add(j1);
                 this.add(p1); 

                 p2 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l2 =new JLabel("���룺");
                 j2=new JPasswordField(19);
                 p2.add(l2);
                 p2.add(j2);
                 this.add(p2);  

                 p3 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l3 =new JLabel("ȷ�����룺");
                 j3=new JPasswordField(16);
                 p3.add(l3);
                 p3.add(j3);
                 this.add(p3);

                 p4 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l4 =new JLabel("ȷ�Ա�");
                 r1=new JRadioButton("��");
                 r2=new JRadioButton("Ů");
                 this.r1.setSelected(true);

                 p4.add(l4);
                 p4.add(r1);
                 p4.add(r2);
                 this.add(p4);

                 p5 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l5 =new JLabel("���ã�");
                 ck1=new JCheckBox("�Ķ�");
                 ck2=new JCheckBox("����");
                 ck3=new JCheckBox("��Ӿ");
                 ck4=new JCheckBox("����");

                 p5.add(l5);
                 p5.add(ck1);
                 p5.add(ck2);
                 p5.add(ck3);
                 p5.add(ck4);
                 this.add(p5);

                 p6 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l6 =new JLabel("��ַ��");
                 adddr =new JTextArea(2,19);
                 p6.add(l6);
                 p6.add(adddr);
                 this.add(p6);

                 p7 =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 l7 =new JLabel("ѧ����");
                 String str[]= {"Сѧ","����","����","��ѧ"};
                 degree=new JComboBox(str);
                 p7.add(l7);
                 p7.add(degree);
                 this.add(p7);   

                 p8 =new JPanel(new FlowLayout(FlowLayout.CENTER));
                 bu1=new JButton("ע��");
                 bu2=new JButton("ȡ��");  

                 p8.add(bu1);
                 p8.add(bu2);
                 this.add(p8);

                 //��������
                 awtEvent();
         }

         public static void main(String[] args) {
        	 zhuche2 r=new zhuche2();
                 r.setVisible(true);
                 r.setSize(300, 400);
                 r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
         //����
    private void awtEvent() {
            //��ѡ�򻥳�
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
        
        //ע�ᰴť����
        bu1.addActionListener(this);
        
        //ȡ����ť��������
        bu2.addActionListener(new ActionListener() {                  

                          @Override
                          public void actionPerformed(ActionEvent e) {
                                   dispose();
                          }
                 });
         }
    
         @Override
         public void actionPerformed(ActionEvent e) {
                 //��ȡѡȡ���Ա�
                  String s1=null;
                  if(r1.isSelected()) {
                           s1="��";
                  }else {
                           s1="Ů";
                  }
                  //��ȡ��ѡ���е�ֵ
                 String info ="";
        //ͨ�������������ȡ��������ϵ��������
        for(Component c:p5.getComponents()){
        //ͨ�� instanceof����ɸѡ��ѡ�����
            if(c instanceof JCheckBox){
                //�жϸ�ѡ������Ƿ�ѡ��
                if(((JCheckBox) c).isSelected()){
                    //��ȡ�ø�ѡ�������Ϣ
                 info += ((JCheckBox)c).getText();
                    }
                }
            }
                  //�����б���е�ֵ
                  String x = degree.getSelectedItem().toString();
                  //�ж��û����������Ƿ�Ϊ��
                  judge();
                  //�ж��û����Ƿ��ظ�
                  userName();
                  //���������Ƿ�һ��
                  pwdName();
                  if(e.getSource()==bu1) {
                                   try {           
                                            //�������ݿ�����
//                                            conn=JdbcRe.getConnection();
                                            //����ִ��sql���Ķ���
//                                           stam=conn.createStatement();
                                            //��дsql���
                                            String sql="insert into user values('"+j1.getText()+"','"+j2.getText()+"','"+j3.getText()+"','"+s1+"','"+info+"','"+adddr.getText()+"','"+x+"')";
                                            //ִ��sql���
//                                            stam.execute(sql);
                                            //��ʾ��
                                            JOptionPane.showMessageDialog(null, "ע��ɹ�!!!!!");
                                            //�ر�ע����洰��
                                            this.dispose(); 
                                            //�򿪵�¼����
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
         //�ж��û��������Ƿ�Ϊ��
         private void judge() {
                 if (j1.getText().isEmpty()) {// �ж��û����Ƿ�Ϊ��
                          this.dispose();
                          JOptionPane.showMessageDialog(this, "�û�������Ϊ�գ�", "������Ϣ", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }
                          if (new String(j2.getText()).isEmpty()) {// �ж������Ƿ�Ϊ��
                                   this.dispose();
                          JOptionPane.showMessageDialog(this, "���벻��Ϊ�գ�", "������Ϣ", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }
                          if (new String(j3.getText()).isEmpty()) {// �ж�ȷ�������Ƿ�Ϊ��
                                   this.dispose();
                          JOptionPane.showMessageDialog(this, "ȷ�����벻��Ϊ�գ�", "������Ϣ", JOptionPane.WARNING_MESSAGE);
                          Register r=new Register();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                          }               
         }
         
         
         //�ж��µ��û��Ƿ��ԭ�û������ظ�
         private void userName() {
                 try {
//                          conn=JdbcRe.getConnection();
//                         stam=(Statement)conn.createStatement();
                 //��дSQL���
//                String sql="select id num from User where id='"+j1.getText()+"'";
//                ResultSet rs=stam.executeQuery(sql);
                 int num=0;
             if(rs!=null&&rs.next()) {
//                     num=rs.getInt("num");
                     System.out.println(num);
             }
                 //�ж��û����Ƿ�����ͬ
                 if (num>0) {
                          JOptionPane.showMessageDialog(this, "�û�����ʹ�ã�������ѡȡ","������Ϣ",JOptionPane.WARNING_MESSAGE);
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
         
         
         //�ж�����û��������ȷ��������ͬ
         private void pwdName() {
                 if (j2.equals(j3)) {
                          JOptionPane.showMessageDialog(this, "�������벻��ͬ","������Ϣ",JOptionPane.WARNING_MESSAGE);
                          zhuche2 r=new zhuche2();
                          r.setVisible(true);
                          r.setSize(300, 400);
                          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          return;
                 }
         }
}