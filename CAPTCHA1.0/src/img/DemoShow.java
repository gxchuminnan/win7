package img;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DemoShow extends JFrame{

	JFrame frame;
	JLabel subject;
	JLabel name;
	JTextField text;
	JLabel imglabel;
	JButton change;
	JButton submit;
	JButton cancel;

	public DemoShow(){
		frame = new JFrame("������֤��Demo");
		subject = new JLabel("������֤��ʾ��");
		name = new JLabel("��֤�룺 ");
		text = new JTextField(5);
		//����ͼƬ
		ImageIcon img = new ImageIcon("image/createImg.jpg");
		imglabel = new JLabel(img);
		
		change = new JButton("��һ��");
		submit = new JButton("�ύ");
		cancel = new JButton("ȡ��");
		
		frame.add(subject);
		frame.add(name);
		frame.add(text);
		imglabel.setIcon(img);
		frame.add(imglabel);
		frame.add(change);
		frame.add(submit);
		frame.add(cancel);
		
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		
		change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("change");
				BuildImg bi = new BuildImg();
				System.out.println("run!");
				bi.createImage();
				ImageIcon img = new ImageIcon("image/createImg.jpg");
				imglabel = new JLabel(img);
				imglabel.setIcon(img);
			}
		});
		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BuildImg bi = new BuildImg();
				if(bi.getCheckCode().equals(text.getText())){
					System.out.println(text.getText() + "=yes");
				}else{
					System.out.println("captcha: " + bi.getCheckCode());
					System.out.println(bi.getCheckCode() + "==" + text.getText() + "no");}
			}
		});
	}


	public static void main(String[] args) {
		System.out.println("run");
		new DemoShow();
	}
}
