/*

*/
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyWindowDemo 
{
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	private Dialog d;
	private Label lab;
	private Button dBut;
	MyWindowDemo()
	{
		init();
	}
	public void init()
	{
		f = new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		tf = new TextField(60);
		but = new Button("转到");
		ta = new TextArea(25,70);

		d = new Dialog(f,"提示信息-self",true);
		d.setBounds(400,200,200,150);
		d.setLayout(new FlowLayout());

		lab = new Label();
		dBut = new Button("确定");

		d.add(lab);
		d.add(dBut);

		f.add(tf);
		f.add(but);
		f.add(ta);

		myEvent();
		f.setVisible(true);
	}

	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("close");
				System.exit(0);
			}
		});

		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				showDir();
			}
		});
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				d.setVisible(false);
			}
		
		});
		dBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d.setVisible(false);
			}
		});

		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					//System.out.println("fubaoren");
					showDir();
				}
			}
		});
	}
	private void showDir(){
		String dirPath = tf.getText();
		File dir = new File(dirPath);
		if(dir.exists() && dir.isDirectory()){
			ta.setText("");
			String[] names = dir.list();
			for(String name : names){
				ta.append(name+"\r\n");
			}
		}else{
			String info = "您输入的信息错误"+dirPath+"请重新输入";
			lab.setText(info);
			d.setVisible(true);
		}
		//String text = tf.getText();
		//ta.setText(text);
		tf.setText("");
		//System.out.println(text);
	}
	public static void main(String[] args) 
	{
		new MyWindowDemo();
	}
}
