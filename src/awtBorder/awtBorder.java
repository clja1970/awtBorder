package awtBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// Declaraci�n de la clase AwtBorder que hereda de la Clase Frame
public class awtBorder extends Frame implements WindowListener, ActionListener
{
private static final long serialVersionUID = 1L;
Button btnBotonN = new Button("Norte");
Button btnBotonS = new Button("Sur");
Button btnBotonE = new Button("Este");
 Button btnBotonO = new Button("Oeste");
 Button btnBotonC = new Button("Centro");
// Constructor de la clase con el mismo nombre que ella
public awtBorder()
{
// Establecer la distribuci�n del Frame
 setLayout (new BorderLayout());
// Establecer el t�tulo de la aplicaci�n
setTitle ("BorderLayout");
// A�adir los botones antes creados en posici�n indicada
add( "North", btnBotonN);
add( "South", btnBotonS);
add( "East", btnBotonE);
add( "West", btnBotonO);
add( "Center", btnBotonC);
addWindowListener(this);
// Establecer el tama�o del Frame
setSize(200,200);
// Centra la ventana en la pantalla
setLocationRelativeTo(null);

// Mostrar el Frame en pantalla
setVisible(true);
 }
// Fin del Constructor
public static void main(String[] args)
{
new awtBorder();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.exit(0);
}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
}