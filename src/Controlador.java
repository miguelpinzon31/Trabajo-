import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Controlador {
   private JFrame ventana;
   private Modelo modelo;
   private Vista vista;

   public Controlador() {
      modelo = new Modelo(getImagen());
      vista = new Vista(modelo.getImagen());
      ventana = new JFrame("Dibujando Imagen");
      ventana.add(vista);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setSize(300, 300);
      ventana.setVisible(true);
   }

   private Image getImagen() {
      //Cargamos la imagen a dibujar
	   ImageIcon icono = new ImageIcon("C:\\Users\\golden\\Pictures\\descarga.png");
      return icono.getImage();
   }

   public static void main(String[] args) {
      new Controlador();
   }
}
