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
				System.out.println("关闭");
				System.exit(0);
			}
		});
		//给这个窗体添加退出程序的按钮
		/*
		按钮：是事件源
		选择监听器：
		
		
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("按钮关的");
				System.exit(0);
			}
		});*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("按钮关的");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		new FrameDemo2();
	}
}
