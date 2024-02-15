import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Radio extends JFrame implements ChangeListener, ActionListener{

	private JRadioButton radio, radio1, radio2;
	private ButtonGroup bg;
	private JButton cerrar;

	public Radio(){
		setLayout(null);
		
		bg = new ButtonGroup();
		
		radio = new JRadioButton("640*480");
		radio.setBounds(10,20,100,30);
		radio.addChangeListener(this);
		add(radio);
		bg.add(radio);

		radio1 = new JRadioButton("800*600");
		radio1.setBounds(10,70,100,30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);

		radio2 = new JRadioButton("1024*768");
		radio2.setBounds(10,120,100,30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(150,130,100,30);
		add(cerrar);
		cerrar.addActionListener(this);

	}

	public void stateChanged(ChangeEvent c){
		if(radio.isSelected()){
			setSize(640,480);
			cerrar.setBounds(440,380,100,30);
		}

		if(radio1.isSelected()){
			setSize(800,600);
			cerrar.setBounds(600,500,100,30);
		}

		if(radio2.isSelected()){
			setSize(1024,768);
			cerrar.setBounds(824,668,100,30);
		}
	}

	public void actionPerformed(ActionEvent a){
		if(a.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		Radio formulario = new Radio();
		formulario.setBounds(0,0,350,230);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}