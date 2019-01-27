/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahku;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author ASUS
 */
public class RumahKu extends Canvas {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int z = 0; z <= 680; z++) {

            //warna background asal 
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, 800, 600);
            //warna garisnya dan fillnya
            g.setColor(Color.yellow);
            //bikin garis mataharinya
            g.drawLine(100 + z, 67, 240 + z, 67);
            g.drawLine(170 + z, 5, 170 + z, 140);
            g.drawLine(120 + z, 10, 220 + z, 130);
            g.drawLine(220 + z, 10, 120 + z, 130);

            //bikin matahari
            g.fillArc(120 + z, 20, 100, 100, 360, 360);

            //awan
            g.setColor(new Color(0, 144, 255));
            g.fillOval(280 - z + 200, 20, 100, 80);
            g.fillOval(350 - z + 200, 10, 100, 100);
            g.fillOval(425 - z + 200, 20, 100, 80);

            //awan2
            g.setColor(new Color(0, 144, 255));
            g.fillOval(80 - z + 200, 20, 100, 80);
            g.fillOval(50 - z + 200, 10, 100, 100);
            g.fillOval(25 - z + 200, 20, 100, 80);

            //mengganti warna background awal setelah selesai
            if (z == 680) {
                //warna background
                g.setColor(new Color(8, 4, 88));
                g.fillRect(0, 0, 800, 600);

                g.setColor(Color.CYAN);//pengaturan warna objek
                g.setFont(new Font("Comic San MS", Font.BOLD, 15));//pengaturan font
                g.drawString("Fajar Ega Firmansyah", 50, 250);//menampilkan teks 

                g.setColor(Color.CYAN);//pengaturan warna objek
                g.setFont(new Font("Comic San MS", Font.BOLD, 15));//pengaturan font
                g.drawString("SISTEM INFORMASI", 80, 270);//Menampilkan teks

                g.setColor(Color.CYAN); // Koordinat Bintang
                int[] x = {115, 190, 220, 255, 325, 270, 295, 220, 152, 169};
                int[] y = {90, 70, 15, 70, 90, 125, 200, 160, 200, 125};

                g.fillPolygon(x, y, 10);
                g.drawPolygon(x, y, 10);

            }

            //RUMAH
            //atap rumah
            int x[] = {600, 700, 500};
            int y[] = {300, 400, 400};
            g.setColor(Color.ORANGE);
            g.fillPolygon(x, y, 3);

            //tembok rumah
            int a[] = {500, 700, 700, 500};
            int b[] = {400, 400, 500, 500};
            g.setColor(new Color(44, 195, 115));
            g.fillPolygon(a, b, 4);

            //pintu rumah
            int c[] = {570, 630, 630, 570};
            int d[] = {420, 420, 500, 500};
            g.setColor(new Color(234, 147, 53));
            g.fillPolygon(c, d, 4);

            //jendela rumah
            int e[] = {645, 688, 688, 645};
            int f[] = {420, 420, 465, 465};
            g.setColor(Color.WHITE);
            g.fillPolygon(e, f, 4);

            //gagang pintu
            g.setColor(new Color(246, 227, 45));
            g.fillRect(575, 450, 10, 20);
            g.setColor(new Color(234, 147, 53));
            g.fillOval(575, 451, 9, 9);
            g.setColor(new Color(65, 64, 63));
            g.fillOval(577, 462, 5, 5);

            //bikin garis jendela rumah
            g.setColor(Color.black);
            g.drawLine(645, 442, 688, 442);
            g.drawLine(666, 420, 666, 465);
            g.drawLine(645, 420, 645, 465);
            g.drawLine(688, 420, 688, 465);
            g.drawLine(645, 420, 688, 420);
            g.drawLine(645, 465, 688, 465);
            //lantai rumah
            g.setColor(new Color(163, 165, 149));
            g.fillRect(0, 500, 800, 100);

            //jalan rumah
            g.setColor(Color.lightGray);
            g.fillRect(40, 524, 100, 20);
            g.fillRect(200, 524, 100, 20);
            g.fillRect(360, 524, 100, 20);
            g.fillRect(520, 524, 100, 20);
            g.fillRect(680, 524, 100, 20);

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.out.println("Error!");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("RumahKu");
        RumahKu Rumah = new RumahKu();
        f.add(Rumah);
        f.setSize(800, 600);
        f.setVisible(true);
    }
}
