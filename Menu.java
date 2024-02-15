import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{

	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem menuItem, menuItem1, menuItem2;
	private JButton cerrar;
	
	public Menu(){
		setLayout(null);

		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu = new JMenu("Opciones");
		menubar.add(menu);

		menuItem = new JMenuItem("Rojo");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menuItem1 = new JMenuItem("Verde");
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		menuItem2 = new JMenuItem("Azul");
		menuItem2.addActionListener(this);
		menu.add(menuItem2);
		
		cerrar = new JButton("Cerrar");
		cerrar.setBounds(280,200,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		Container fondo = this.getContentPane();
		
		if(e.getSource() == menuItem){
			fondo.setBackground(new Color(255,0,0));
		}

		if(e.getSource() == menuItem1){
			fondo.setBackground(new Color(0,255,0));
		}

		if(e.getSource() == menuItem2){
			fondo.setBackground(new Color(0,0,255));
		}

		if(e.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		Menu interfaz = new Menu();
		interfaz.setBounds(0,0,400,300);
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
	}
}