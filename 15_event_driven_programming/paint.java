import java.awt.*;
import java.awt.event.*;

public class paint extends Frame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    Label l1 = new Label("Color");
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("White", cg, false);
    Checkbox c2 = new Checkbox("Black", cg, false);
    Checkbox c3 = new Checkbox("Red", cg, false);
    Checkbox c4 = new Checkbox("Green", cg, false);
    Checkbox c5 = new Checkbox("Blue", cg, false);

    paint(String s) {
        super(s);
        setSize(500, 500);
        setVisible(true);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);

        setLayout(flow);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

    }

    public void itemStateChanged(ItemEvent ie) {
        Graphics g = getGraphics();
        String s = (String) ie.getItem();
        if (s.equals("White")) {
            g.setColor(Color.white);
        }
        if (s.equals("Black")) {
            g.setColor(Color.black);
        }
        if (s.equals("Red")) {
            g.setColor(Color.red);
        }
        if (s.equals("Blue")) {
            g.setColor(Color.blue);
        }
        if (s.equals("Green")) {
            g.setColor(Color.green);
        }
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent me) {
                g.fillOval(me.getX(), me.getY(), 10, 10);

            }
        });
    }

    public static void main(String[] args) {
        new paint("Paint Brush");
    }
}