package swing ;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class ShapesJpanel extends JPanel
{
    public void paintComponent( Graphics g )                       //line 10
    {
        // call superclass's paintComponent
        super.paintComponent( g );                                  //line 13
        //random number generator
        Random random = new Random();                               //line 15

        int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 }; //line  17
        int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };  //line  18

        Graphics2D g2d = ( Graphics2D ) g;                          // line  20
        // create GeneralPath object
        GeneralPath star = new GeneralPath();                       // line 22

        // set the initial coordinate of the General Path
        star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );                  // line 25

        // create the star--this does not draw the star
        for ( int count = 1 ; count < xPoints.length; count++ )     // line 28
            star.lineTo( xPoints[ count ], yPoints[ count ] );       // line 29

        star.closePath(); // close the shape                        // line 31
        // translate the origin to (200, 200)
        g2d.translate( 200, 300 );                                  //line  33

        // rotate around origin and draw stars in random colors
        for ( int count = 1 ; count <= 20; count++ )                //line 36
        {
            g2d.rotate( Math.PI / 10.0 ); // rotate coordinate system //line 38

            // set random drawing color
            g2d.setColor( new Color( random.nextInt( 256 ),
                    random.nextInt( 256 ), random.nextInt( 256 ) ) );      //line 41

            g2d.fill( star ); // draw filled star                     //line 43
        } // end for                                                 //line 44
    } // end method paintComponent                                  //line 45
}

