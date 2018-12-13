import java.awt.*;
import java.awt.event.*;
class MenuDemo 
{
	private Frame f;//窗口
	private MenuBar mb;//菜单栏
	private Menu m,subMenu;//菜单名
	private MenuItem closeItem,subItem;//菜单条目

	MenuDemo(){
		init();
	}
	public void init(){
		f = new Frame("my window");
		f.setBounds(300,100,500,600);
		f.setLayout(new FlowLayout());

		mb = new MenuBar();

		m = new Menu("文件");
		subMenu = new Menu("子菜单");

		closeItem = new MenuItem("退出");
		subItem = new MenuItem("子条目");

		m.add(subMenu);
		m.add(closeItem);
		subMenu.add(subItem);

		mb.add(m);

		f.setMenuBar(mb);
		myEvents();
		f.setVisible(true);
	}
	private void myEvents(){
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("close");
				System.exit(0);
			}
		});
		closeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("菜单退出");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args){
		new MenuDemo();
	}
}