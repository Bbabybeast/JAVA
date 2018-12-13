import java.awt.*;
import java.awt.event.*;
class MouseAndKeyEvent 
{
	private Frame fr;
	private Button but;

	MouseAndKeyEvent()
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
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("按钮摁了");
			}
		});
		//鼠标事件
		/*but.addMouseListener(new MouseAdapter()
		{
			private int count = 1;
			private int clickCount = 1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("鼠标进入到该组件"+count++);
			}
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				System.out.println("双击动作"+clickCount++);
			}
		});*/
		//键盘事件
		but.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
			}
		});
	}
	public static void main(String[] args) 
	{
		new MouseAndKeyEvent();
	}
}
