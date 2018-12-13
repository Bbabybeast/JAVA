/*
Frame

�¼��������Ƶ��ص㣺
1.�¼�Դ������awt��/swing���е���Щͼ�ν������
2.�¼���ÿһ���¼�Դ�����Լ����еĶ�Ӧ�¼��͹����¼�
3.�������������Դ���ĳһ���¼��Ķ���(��ֹһ������)���Ѿ���װ�ڼ�������
���������ߣ���JAVA�ж��Ѿ�������ˣ�ֱ�ӻ�ȡ��������þͿ����ˣ�
����Ҫ���ģ����ǶԲ����Ķ������д���
4.�¼���������Ա�Լ�������¼��Ĵ���ʽ

*/
import java.awt.*;
import java.awt.event.*;
class  FrameDemo
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("my awt");//�����������
		f.setSize(500,400);//����ᡢ������
		f.setLocation(300,400);//������ʾ��λ��
		f.setLayout(new FlowLayout());//��ʽ����
		Button b = new Button("I'm a button");//����һ����ť
		f.add(b);//����ť��ӵ�������
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ر�");
				System.exit(0);
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("��");
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("active");
			}
		});
	
		f.setVisible(true);//�ô�����ʾ

		System.out.println("Hello World!");
	}
}

class MyWin extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		//System.out.println("window closing----"+e.toString());
	}
}