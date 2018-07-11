package cods;

import swing.FinishFrame;
import swing.Frameplay;
import swing.Name_family;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ReminderBeep {
    Toolkit toolkit;
    public Timer timer;

    public ReminderBeep(int seconds) {
        toolkit = toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),seconds*1000);
    }
    class RemindTask extends TimerTask
    {

        @Override
        public void run() {
            Frameplay fp=new Frameplay();
            Chek_charat0 c=new Chek_charat0();
            System.out.println("Time's up!");
            toolkit.beep();



            //JOptionPane.showMessageDialog(fp.frameplay,"Time's up !!!");
            //!!!!!!!!!!!!!!emtiaz!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
            //!!!!!!!!!!!!!!takmil shavad !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
            Frameplay frameplay=new Frameplay();


           // System.exit(0);
        }
    }

    public static void main(String[] args) {
        Name_family name_family=new Name_family();
        System.out.println("about to scheduled task.");
        new ReminderBeep(name_family.inetgameover());
        System.out.println("task scheduled");
    }
}
