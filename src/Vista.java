import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Vista extends JPanel {
   private Image imagen;
   private static final int TAMANO_PEQUENO = 20;

   public Vista(Image imagen) {
      this.imagen = imagen;
   }
      
      protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          try {
              Image imagen = ImageIO.read(new File("C:\\Users\\golden\\Pictures\\descarga.png"));
              g.drawImage(imagen, 0, 0, this);

         
              int ancho = getWidth();
              int alto = getHeight();
              int cantidad = Math.min(200, ancho * alto / TAMANO_PEQUENO);
              for (int i = 0; i < cantidad; i++) {
                  int x = (int)(Math.random() * ancho);
                  int y = (int)(Math.random() * alto);
                  g.drawImage(imagen, x, y, TAMANO_PEQUENO, TAMANO_PEQUENO, this);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
   }
  