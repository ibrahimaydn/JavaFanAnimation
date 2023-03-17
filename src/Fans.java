
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fans  extends JPanel
{
    private int kanat1 =0 ;
    private int kanat2 = 90;
    private int kanat3 = 180;
    private int kanat4 = 270;

    public Fans()
    {
        Runnable donen  = new fanDöndür();

        Thread thread1 = new Thread(donen);
        thread1.start();
    }


    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new Fans());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    @Override
    protected void paintComponent(Graphics g)
    {


        super.paintComponent(g);

        g.drawOval(10, 10, 140, 140);
        g.fillArc(16, 16, 130, 130, kanat1, 30);
        g.fillArc(16, 16, 130, 130, kanat2, 30);
        g.fillArc(16, 16, 130, 130, kanat3, 30);
        g.fillArc(16, 16, 130, 130, kanat4, 30);


        g.drawOval(10, 150, 140, 140);
        g.fillArc(16, 154, 130, 130, kanat1, 30);
        g.fillArc(16, 154, 130, 130, kanat2, 30);
        g.fillArc(16, 154, 130, 130, kanat3, 30);
        g.fillArc(16, 154, 130, 130, kanat4, 30);

        g.drawOval(200, 10, 140, 140);
        g.fillArc(208, 16, 130, 130, kanat1, 30);
        g.fillArc(208, 16, 130, 130, kanat2, 30);
        g.fillArc(208, 16, 130, 130, kanat3, 30);
        g.fillArc(208, 16, 130, 130, kanat4, 30);

        g.drawOval(200, 150, 140, 140);
        g.fillArc(208, 154, 130, 130, kanat1, 30);
        g.fillArc(208, 154, 130, 130, kanat2, 30);
        g.fillArc(208, 154, 130, 130, kanat3, 30);
        g.fillArc(208, 154, 130, 130, kanat4, 30);


    }

    class fanDöndür implements Runnable
    {
        @Override
        public void run()
        {
            try
            {
                while(true)
                {
                    kanat1 = (kanat1 - 2) % 360;
                    kanat2 = (kanat2 - 2) % 360;
                    kanat3 = (kanat3 - 2) % 360;
                    kanat4 = (kanat4 - 2) % 360;

                    System.out.println(kanat1 + " " + kanat2 + " " + kanat3 + " " + kanat4);

                    repaint();

                    Thread.sleep(10);
                }
            }

            catch(InterruptedException ex)
            {  }    }
    }
}

