import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Design extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

        public void paint(Graphics g) {
            Graphics2D g1 = (Graphics2D) g;
            //  корпус + фонари + основание
            g1.setColor(Color.BLACK);
            g1.fill(new RoundRectangle2D.Double(148, 84, 120, 318, 20, 20));
            g1.fillRoundRect(183,408,51,63,20,20);
            g1.setColor(Color.RED);
            g1.fill(new Ellipse2D.Double(172,110,75,75));
            g1.setColor(Color.YELLOW);
            g1.fill(new Ellipse2D.Double(172,207,75,75));
            g1.setColor(Color.GREEN);
            g1.fill(new Ellipse2D.Double(172,306,75,75));
            //верхняя дуга
            GeneralPath arcHi =new GeneralPath (GeneralPath.WIND_NON_ZERO, 0);
            g1.setColor(Color.WHITE);
            arcHi.moveTo(165, 138);
            arcHi.quadTo(167, 99, 208, 94);
            arcHi.quadTo(252,97,254,138);
            arcHi.quadTo(243,112,224,107);
            arcHi.quadTo(207,101,194,107);
            arcHi.quadTo(176,112,165,138);
            arcHi.closePath();
            g1.fill(arcHi);
            g1.draw(arcHi);
            // средняя дуга
            GeneralPath arcMid =new GeneralPath (GeneralPath.WIND_NON_ZERO, 0);
            g1.setColor(Color.WHITE);
            arcMid.moveTo(165, 235);
            arcMid.quadTo(167, 196, 208, 191);
            arcMid.quadTo(252,194,254,235);
            arcMid.quadTo(243,209,224,204);
            arcMid.quadTo(207,198,194,204);
            arcMid.quadTo(176,209,165,235);
            arcMid.closePath();
            g1.fill(arcMid);
            g1.draw(arcMid);
            // нижняя дуга
            GeneralPath arcLow =new GeneralPath (GeneralPath.WIND_NON_ZERO, 0);
            g1.setColor(Color.WHITE);
            arcLow.moveTo(165, 334);
            arcLow.quadTo(167, 295, 208, 290);
            arcLow.quadTo(252,293,254,334);
            arcLow.quadTo(243,308,224,303);
            arcLow.quadTo(207,297,194,303);
            arcLow.quadTo(176,308,165,334);
            arcLow.closePath();
            g1.fill(arcLow);
            g1.draw(arcLow);
            //  лев верхн козырёк
            GeneralPath trLhHi = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trLhHi.moveTo(80, 118);
            trLhHi.quadTo(78, 110, 90, 110);//угол
            trLhHi.lineTo(130, 110);//гориз
            trLhHi.quadTo(140, 110, 140, 115);// угол
            trLhHi.lineTo(140, 165);//вертик
            trLhHi.quadTo(140, 177, 130, 172);// угол
            trLhHi.closePath();
            g1.setColor(Color.BLACK);
            g1.fill(trLhHi);
            g1.draw(trLhHi);
            //  лев средн козырёк
            GeneralPath trLhMid = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trLhMid.moveTo(80, 214);
            trLhMid.quadTo(78, 206, 90, 206);//угол
            trLhMid.lineTo(130, 206);//гориз
            trLhMid.quadTo(140, 206, 140, 211);// угол
            trLhMid.lineTo(140, 261);//вертик
            trLhMid.quadTo(140, 273, 130, 268);// угол
            trLhMid.closePath();
            g1.fill(trLhMid);
            g1.draw(trLhMid);
            //  лев ниж козырёк
            GeneralPath trLhLow = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trLhLow.moveTo(80, 312);
            trLhLow.quadTo(78, 304, 90, 304);//угол
            trLhLow.lineTo(130, 304);//гориз
            trLhLow.quadTo(140, 304, 140, 309);// угол
            trLhLow.lineTo(140, 359);//вертик
            trLhLow.quadTo(140, 371, 130, 366);// угол
            trLhLow.closePath();
            g1.fill(trLhLow);
            g1.draw(trLhLow);
            //  прав верхн козырёк
            GeneralPath trRhHi = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trRhHi.moveTo(335, 118);
            trRhHi.quadTo(339, 110, 325, 110);//угол
            trRhHi.lineTo(285, 110);//гориз
            trRhHi.quadTo(275, 110, 275, 115);// угол
            trRhHi.lineTo(275, 165);//вертик
            trRhHi.quadTo(275,177 , 285, 172);// угол
            trRhHi.closePath();
            g1.fill(trRhHi);
            g1.draw(trRhHi);
            //  прав средн козырёк
            GeneralPath trRhMid = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trRhMid.moveTo(335, 214);
            trRhMid.quadTo(339, 206, 325, 206);//угол
            trRhMid.lineTo(285, 206);//гориз
            trRhMid.quadTo(275, 206, 275, 211);// угол
            trRhMid.lineTo(275, 261);//вертик
            trRhMid.quadTo(275,273 , 285, 268);// угол
            trRhMid.closePath();
            g1.fill(trRhMid);
            g1.draw(trRhMid);
            //  прав нижн козырёк
            GeneralPath trRhLow = new GeneralPath(GeneralPath.WIND_NON_ZERO, 0);
            trRhLow.moveTo(335, 312);
            trRhLow.quadTo(339, 304, 325, 304);//угол
            trRhLow.lineTo(285, 304);//гориз
            trRhLow.quadTo(275, 304, 275, 309);// угол
            trRhLow.lineTo(275, 359);//вертик
            trRhLow.quadTo(275,371 , 285, 366);// угол
            trRhLow.closePath();
            g1.fill(trRhLow);
            g1.draw(trRhLow);
            //шапка
            GeneralPath cap=new GeneralPath(GeneralPath.WIND_NON_ZERO,0);
            cap.moveTo(169,78);
            cap.quadTo(165,75,169,70);
            cap.quadTo(210,45,247,70);
            cap.quadTo(251,75,247,78);
            cap.closePath();
            g1.fill(cap);
            g1.draw(cap);
            }
}










