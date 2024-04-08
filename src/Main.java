import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
           Design tl=new Design();
           JFrame start=new JFrame();
           start.add(tl);
           start.setBounds(450, 50, 420, 550);
           start.setBackground(new Color(200,200,200));
           start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           start.setVisible(true);

    }}
