import java.awt.*;
import java.awt.event.*;
class MenuDemo 
{
	private Frame f;//����
	private MenuBar mb;//�˵���
	private Menu m,subMenu;//�˵���
	private MenuItem closeItem,subItem;//�˵���Ŀ

	MenuDemo(){
		init();
	}
	public void init(){
		f = new Frame("my window");
		f.setBounds(300,100,500,600);
		f.setLayout(new FlowLayout());

		mb = new MenuBar();

		m = new Menu("�ļ�");
		subMenu = new Menu("�Ӳ˵�");

		closeItem = new MenuItem("�˳�");
		subItem = new MenuItem("����Ŀ");

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
				System.out.println("�˵��˳�");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args){
		new MenuDemo();
	}
}