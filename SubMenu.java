import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubMenu extends JFrame implements ActionListener{

	private JMenuBar menubar;
	private JMenu menu, menu1, menu2;
	private JMenuItem menuItem, menuItem1, menuItem2, menuItem3;
	private JButton cerrar;

	public SubMenu(){
		setLayout(null);

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu = new JMenu("Opciones");
		menubar.add(menu);
		
		menu1 = new JMenu("Tamaño de la ventana");
		menu.add(menu1);

		menu2 = new JMenu("Color de fondo");
		menu.add(menu2);

		menuItem = new JMenuItem("300*200");
		menu1.add(menuItem);
		menuItem.addActionListener(this);

		menuItem1 = new JMenuItem("640*480");
		menu1.add(menuItem1);
		menuItem1.addActionListener(this);

		menuItem2 = new JMenuItem("Rojo");
		menu2.add(menuItem2);
		menuItem2.addActionListener(this);

		menuItem3 = new JMenuItem("Verde");
		menu2.add(menuItem3);
		menuItem3.addActionListener(this);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(150,100,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == menuItem){
			setSize(300,200);
			cerrar.setBounds(150,100,100,30);
		}

		if(e.getSource() == menuItem1){
			setSize(640,480);
			cerrar.setBounds(490,380,100,30);
		}

		if(e.getSource() == menuItem2){
			getContentPane().setBackground(new Color(255,0,0));
		}

		if(e.getSource() == menuItem3){
			getContentPane().setBackground(new Color(0,255,0));
		}

		if(e.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		SubMenu formulario = new SubMenu();
		formulario.setBounds(0,0,300,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}