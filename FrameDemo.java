/*
Frame

事件监听机制的特点：
1.事件源：就是awt包/swing包中的那些图形界面组件
2.事件：每一个事件源都有自己特有的对应事件和共性事件
3.监听器：将可以触发某一个事件的动作(不止一个动作)都已经封装在监听器中
（以上三者，在JAVA中都已经定义好了，直接获取其对象来用就可以了）
我们要做的，就是对产生的动作进行处理
4.事件处理：程序员自己定义对事件的处理方式

*/
import java.awt.*;
import java.awt.event.*;
class  FrameDemo
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("my awt");//创建窗体对象
		f.setSize(500,400);//窗体横、纵坐标
		f.setLocation(300,400);//窗体显示的位置
		f.setLayout(new FlowLayout());//流式布局
		Button b = new Button("I'm a button");//创建一个按钮
		f.add(b);//将按钮添加到窗体中
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("关闭");
				System.exit(0);
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("打开");
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("active");
			}
		});
	
		f.setVisible(true);//让窗体显示

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