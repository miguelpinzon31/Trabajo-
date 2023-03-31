import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Vista extends JPanel {
   private Image imagen;

   public Vista(Image imagen) {
      this.imagen = imagen;
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(imagen, 0, 0, this);
   }
}
