import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.text.*;

public class PrintStil {
    private int gepindBedrag = 200;
    private String IBAN= "CASH 0890338";
    private PageFormat mPageFormat;
    public String[] message = {generateDate(),"Gepind:" + " \u20AC" + gepindBedrag, "Rekening: ",getRekeningNummer(), "Bedankt!"};
    static boolean voorbeeld = false;
    public void print() {
        PrintStil ps = new PrintStil();
        if (voorbeeld) {
            ps.preview();
        }
    }

    public String generateDate(){
       Calendar cur = new GregorianCalendar();
       SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       String minutes;
     /*  if (cur.get(Calendar.MINUTE) < 10) {
           minutes = "0" + cur.get(Calendar.MINUTE);
       }
       else{
           minutes = parseString(cur.get(Calendar.MINUTE));
       }*/
       String currentDate = timeFormat.format(cur.getTime())+"   "+dateFormat.format(cur.getTime());
       return currentDate;
    }

    public String getRekeningNummer(){
        char[] hiddenIBAN  = new char[12];
        for(int i=0; i<IBAN.length(); i++){
            if(i<8) {
                hiddenIBAN[i] = 'X';
            }
            else{
                hiddenIBAN[i] = IBAN.charAt(i);
            }
        }
        return new String(hiddenIBAN);
    }

    public void preview() {
        JFrame frame = new JFrame();
        frame.add(new OpScherm());
        frame.setTitle("Preview van label 99014");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public PrintStil() {
        if (!voorbeeld) {
            PrinterJob pj = PrinterJob.getPrinterJob();
            mPageFormat = new PageFormat();
            Paper paper = new Paper();
//mPageFormat.setOrientation(mPageFormat.LANDSCAPE);
            paper.setImageableArea(0, 0, 160, 290);
            paper.setSize(160, 290);
            mPageFormat.setPaper(paper);
            pj.setPrintable(new OutPrintable(), mPageFormat);
//if (pj.printDialog())
            {
                try {
                    pj.print();
                } catch (PrinterException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void makeGraphics(Graphics2D g3) {
        g3.setColor(Color.white);
        g3.fillRect(0, 0, 160, 280);
        Image img = new ImageIcon("textlogobw.png").getImage();
        g3.drawImage(img, 5, 15, 150, 36, null);
        g3.setColor(Color.black);
        g3.setFont(new Font("Helvetica", Font.BOLD, 12));
        g3.drawString(message[0], 15, 80);
        g3.drawString(message[1], 15, 110);
        g3.drawString(message[2], 15, 140);
        g3.drawString(message[3], 15, 155);
        g3.drawString(message[4], 15, 185);
        g3.drawLine(10, 280, 150, 280);
    }

    class OutPrintable implements Printable {
        public int print(Graphics g, PageFormat pf, int pageIndex) {
            if (pageIndex != 0) {
                return NO_SUCH_PAGE;
            }
            Graphics2D g2 = (Graphics2D) g;
            makeGraphics(g2);
            return PAGE_EXISTS;
        }
    }
    class OpScherm extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
               Graphics2D g2 = (Graphics2D) g;
            makeGraphics(g2);
        }
    }
}