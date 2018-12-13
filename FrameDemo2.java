/*

*/
import java.awt.*;
import java.awt.event.*;

class  FrameDemo2
{
	private Frame fr;
	private Button but;

	FrameDemo2()
	{
		init();
	}

	public void init()
	{
		fr= new Frame("my frame");

		fr.setBounds(300,100,600,500);
		fr.setLayout(new FlowLayout());

		but = new Button("my button");

		fr.add(but);
		myEvents();
		fr.setVisible(true);
	}	
	public void myEvents()
	{
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ر�");
				System.exit(0);
			}
		});
		//�������������˳�����İ�ť
		/*
		��ť�����¼�Դ
		ѡ���������
		
		
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("��ť�ص�");
				System.exit(0);
			}
		});*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("��ť�ص�");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		new FrameDemo2();
	}
}
