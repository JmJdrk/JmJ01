//This is the International version wich changes the language of the words contained from Spanish to English, 

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.*;
import javax.imageio.*;
public class EventosIII {

	public static void main(String[] args) {
		FrameWork myFramework = new FrameWork();
		myFramework.setVisible(true);
		myFramework.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class MarcoConBotones1 extends JFrame{
	public FrameWork() {
		setTitle("Titulo De Ventana");
		setBounds(700,300,500,300);
		setUndecorated(true);

		Laminated milamina = new Laminated();
		add(milamina);
	}
}

class Laminated extends JPanel{
	
	//Agregar objeto fuente
	JButton Botons1 = new JButton("Calculadora");
	JButton Botons2 = new JButton("General Gmail");
	JButton Botons3 = new JButton("Alexia");
	JButton Botons4 = new JButton("Correo Personal");
	JButton Botons5 = new JButton("Html");
	JButton Botons6 = new JButton("Cancelar Apagado");
	
	
	//creo el contructor para ese boton
	public Laminated() {

		this.setBackground(Color.gray);
		
		add(Botons1);
		add(Botons2);
		add(Botons3);
		add(Botons4);
		add(Botons5);
		add(Botons6);
		
		id Boton1 = new id(1);
		id Boton2 = new id(2);
		id Boton3 = new id(3);
		id Boton4 = new id(4);
		id Boton5 = new id(5);
		id Boton6  = new id(6);


		
		//Alhacer click.. addActionListener
		Botons1.addActionListener(Boton1);//tis para referenciar la propia lamina
		Botons2.addActionListener(Boton2);
		Botons3.addActionListener(Boton3);
		Botons4.addActionListener(Boton4);//tis para referenciar la propia lamina
		Botons5.addActionListener(Boton5);
		Botons6.addActionListener(Boton6);

		//el error dara si no implementamos una interfaz asi que por eso implementamos ActionListener
		
	}
	private class id implements ActionListener{
		
		private int id;
		
		public id(int c) {
			id = c;
			
		}
		

		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Aqui va lo que se ejecute en el oyente
			//setBackground(ColorDeFondo);
			System.out.println(id);
			switch(id) {
			
			// apagar pc
			case 1:
				System.out.println("APAGAR");
				try {
					JOptionPane.showMessageDialog(null,"Su ordenador se apagará!");
					String [] cmd = {"shutdown","-s","-t", "5"}; //Comando de apagado en windows
					Runtime.getRuntime().exec(cmd);
		
				} catch (IOException ioe) {
					System.out.println (ioe);
					JOptionPane.showMessageDialog(null,"Fatal Error!");
				}
			break;
			//abrir cuenta de correo del liceo
			case 2:
				 try {
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","Start firefox https://mail.google.com/mail/u/0/#inbox"});
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","Start firefox https://drive.google.com/drive/my-drive"});
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				break;
			//abrir alexia
			case 3:
				 try {
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","Start chrome https://liceolapaz.alexiaclassroom.com/login/index.php"});
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				 break;
			//abrir drive personal
			case 4:
				 try {
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox"});
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				 break;
			//abrir web de aprendizaje html
			case 5:
				try {
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","Start chrome https://www.w3schools.com/html/html_intro.asp"});
					Runtime.getRuntime().exec(new String[]{"cmd", "/c","Start chrome https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default"});
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				break;
			//cancelar apagado
			case 6:
				try {
					String [] cmd = {"shutdown","-a"}; //Comando de apagado en windows
					Runtime.getRuntime().exec(cmd);
				} catch (IOException ioe) {
					System.out.println (ioe);
				}
				break;
			
			}
			//Da error por lo que...
			
		}




		
	}
}

	
