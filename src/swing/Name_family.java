/**
 * <h1>java NameFamily class in swing package </h1>
 * @author Navid Farhadi
 * @since 1396/9/2
 * @see swing.Frameplay
 * @version 1
 */
package swing;

import cods.Chek_charat0;
import cods.Frist_Char;
import cods.ReminderBeep;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.*;
import java.util.Timer;

public class Name_family {
    private  Frameplay fn = null;
    protected JFrame framemain = null;
   // private JPanel panel1 = null;
    private JLabel lblwelcoming = null;
    public  JTextField whats_yourname = null;
    private JLabel your_name = null;
    private JLabel your_name2=null;
    private JLabel lbllevel = null;
    private JRadioButton easybutton = null;
    private JRadioButton middlebutton = null;
    private JRadioButton hardbutton = null;
    public JRadioButton persion_language=null;
    public JRadioButton englisg_language=null;
    public JButton play_button = null;



//***********************************************************************//

    /**
     * <p>invoke this method to build a fram for start play and setting </p>
     * @since 1396/9/10
     * @author Navid Farhadi
     */
        protected void initmaneframe() {
            //Dimension dimen=Toolkit.getDefaultToolkit().getScreenSize();
            framemain = new JFrame("*** بازی اسم فامیل ***");
            framemain.setBounds(500, 100, 300, 400);
            framemain.getContentPane().setBackground(Color.cyan);
            framemain.setVisible(true);
            framemain.setLayout(null);
            framemain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            framemain.setResizable(false);
            ShapesJpanel s=new ShapesJpanel();
            framemain.add(s);
        }

    /**<p>invoke this method for set logo play lable</p>
     * @author Navid Frahadi
     * @since 1396/9/10
     */
    protected void setLblwelcoming() {
        lblwelcoming = new JLabel("*** اسم فامیل ***");
        lblwelcoming.setFont(new Font("B Shadi", Font.BOLD, 30));
        lblwelcoming.setBounds(20, 10, 400, 40);
        lblwelcoming.setVisible(true);
        framemain.add(lblwelcoming);

    }

    public void setWhats_yourname() {
        whats_yourname = new JTextField();
        whats_yourname.setName("whats_yourname");
        whats_yourname.setFont(new Font("Areya", Font.BOLD, 18));
        whats_yourname.setBounds(30, 80, 100, 30);
        whats_yourname.setHorizontalAlignment(SwingConstants.RIGHT);
        whats_yourname.setVisible(true);
        framemain.add(whats_yourname);
    }


    protected void setYour_name() {
        your_name = new JLabel("نام خود را وارد کنید :");
        your_name.setFont(new Font("B Yekan", Font.PLAIN, 16));
        your_name.setBounds(140, 70, 200, 30);
        your_name.setVisible(true);
        framemain.add(your_name);
    }
    protected void setYourn_name2()
    {
        your_name2 = new JLabel("what's your name");
        your_name2.setFont(new Font("Areya", Font.PLAIN, 16));
        your_name2.setBounds(150, 90, 200, 30);
        your_name2.setVisible(true);
        framemain.add(your_name2);
    }

    protected void setLbllevel() {
        lbllevel = new JLabel("level    سطح بازی");
        lbllevel.setFont(new Font("Areya", Font.BOLD, 16));
        lbllevel.setBounds(100, 125, 200, 40);
        lbllevel.setVisible(true);
        framemain.add(lbllevel);
    }
    //***************** TIME UP METOD*************************************//

    /**
     * <p>invoke this method for chose a lavel time after select a radioButton</p>
     * @author Navid Frahadi
     * @since 1396/9/10
     * @return int time for lable timer
     */
    public int inetgameover()
    {
        if (easybutton.isSelected())
        {int timer=60;
            return timer;
        }
        else if(middlebutton.isSelected())
        {
            int timer=40;
            return timer;
        }
        else
        {
            int timer=20;
            return timer;
        }

    }

    //***************************jradiobuttons****************************\\

    /**
     * <p>invoke this method for build a easy radio button for level setting</p>
     * @author Navid Farhadi
     * @since 1396/9/10
     */
    protected void setEasybutton ()
    {
        easybutton = new JRadioButton("آسان      easy");
        easybutton.setFont(new Font("Areya",Font.PLAIN,14));
        easybutton.setBackground(Color.cyan);
        easybutton.setBounds(100, 160, 200, 40);
        easybutton.setVisible(true);
        easybutton.setSelected(true);
        framemain.add(easybutton);
    }
    /**
     * <p>invoke this method for build a middle radio button for level setting</p>
     * @author Navid Farhadi
     * @since 1396/9/10
     */
    protected void setMiddlebutton() {
        middlebutton = new JRadioButton("متوسط   middle");
        middlebutton.setFont(new Font("Areya", Font.PLAIN, 14));
        middlebutton.setBackground(Color.cyan);
        middlebutton.setBounds(100, 190, 200, 40);
        middlebutton.setVisible(true);
        framemain.add(middlebutton);
    }
    /**
     * <p>invoke this method for build a hard radio button for level setting</p>
     * @author Navid Farhadi
     * @since 1396/9/10
     */
    protected void setHardbutton() {
        hardbutton = new JRadioButton("سخت      hard");
        hardbutton.setFont(new Font("Areya",Font.PLAIN,14));
        hardbutton.setBackground(Color.cyan);
        hardbutton.setBounds(100, 220, 200, 40);
        hardbutton.setVisible(true);
        framemain.add(hardbutton);
        ButtonGroup bg = new ButtonGroup();
        bg.add(easybutton);
        bg.add(middlebutton);
        bg.add(hardbutton);
    }

    /**
     * <p>invoke this method for select a language for game</p>
     * @author NAVID farhadi
     */
    public void setPersion_language()
    {
        persion_language=new JRadioButton("persion");
        persion_language.setBackground(Color.cyan);
        persion_language.setBounds(70, 270, 80, 40);
        persion_language.setVisible(true);
        persion_language.setSelected(true);
        framemain.add(persion_language);


    }
    public void setEnglisg_language()
    {
        englisg_language=new JRadioButton("english");
        englisg_language.setBounds(160, 270, 80, 40);
        englisg_language.setBackground(Color.cyan);
        englisg_language.setVisible(true);
        framemain.add(englisg_language);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(persion_language);
        buttonGroup.add(englisg_language);
    }

    /**
     * <p>invoke this method for use other method that language be english or persian</p>
     * @return boolean false for englishLanguage and true for persian
     * @author Navid Farhadi
     */
   public boolean LanLbl()
    {
        boolean bool=false;
        if (englisg_language.isSelected())
        {
            return false;
        }
        else
        {
            return true;
        }
    }





    //**********************************jradiobuttons****************************//

    /**
     * <p>invoke this method for build start play button</p>
     * @see Frameplay
     * @author Navid Farhadi
     * @since 1396/9/11
     */
    public  void setPlay_button() {
        play_button = new JButton("شروع بازی");
        play_button.setFont(new Font("B Yekan",Font.PLAIN,18));
        play_button.setName("play_button");
        play_button.setBounds(75, 310,150, 40);
        play_button.setVisible(true);
        framemain.add(play_button);



        play_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn = new Frameplay();

                Frist_Char fch=new Frist_Char();
                //ReminderBeep reminderBeep=new ReminderBeep(inetgameover());
                framemain.setVisible(false);
                fn.setFrameplay();

                fn.setPanel();
                fn.setName_lbl(whats_yourname.getText(), LanLbl());



                fn.setGame_lblname(LanLbl());//*****************************
                fn.setGame_txtname();
                fn.setGame_lblfamily(LanLbl());
                fn.setGame_txtfamily();
                fn.setGame_lblanimal(LanLbl());
                fn.setGame_txtanimal();
                fn.setGame_lblfood(LanLbl());
                fn.setGame_txtfood();
                fn.setGame_lblcolor(LanLbl());
                fn.setGame_txtcolor();
                fn.setGame_lblcar(LanLbl());
                fn.setGame_txtcar();
                fn.setGame_lblcountry(LanLbl());
                fn.setGame_txtcountry();
                fn.setGame_lblcity(LanLbl());
                fn.setGame_txtcity();
                fn.setGame_lblfruit(LanLbl());
                fn.setGame_txtfruit();
                fn.setGame_lblobject(LanLbl());
                fn.setGame_txtobject();
                fn.setStart_char(fch.ch(LanLbl()) + "");
                fn.setStr(LanLbl());
                Chek_charat0 chek_charat0=new Chek_charat0();
                fn.setLbl_totalscore();
                fn.setLbl_total_JavaScore();
                //?????????????????????????????????????LBL_TIME?????????
                fn.setLbl_time(inetgameover() + "", LanLbl());


                fn.setPanel3();
                fn.setLbl_computerPlayer(LanLbl());
                fn.setjava_lblname(LanLbl());
                fn.setjava_txtname();
                fn.setjava_lblfamily(LanLbl());
                fn.setjava_txtfamily();
                fn.setjava_lblanimal(LanLbl());
                fn.setjava_txtanimal();
                fn.setjava_lblfood(LanLbl());
                fn.setjava_txtfood();
                fn.setjava_lblcolor(LanLbl());
                fn.setjava_txtcolor();
                fn.setjava_lblcar(LanLbl());
                fn.setjava_txtcar();
                fn.setjava_lblcountry(LanLbl());
                fn.setjava_txtcountry();
                fn.setjava_lblcity(LanLbl());
                fn.setjava_txtcity();
                fn.setjava_lblfruit(LanLbl());
                fn.setjava_txtfruit();
                fn.setjava_lblobject(LanLbl());
                fn.setjava_txtobject();


                fn.setPanl2();
                fn.setLbl_result();
                fn.intend(LanLbl());
                fn.setClearall(LanLbl());
                fn.setRestart(LanLbl());
                fn.setBack(LanLbl());
                fn.setExit(LanLbl());


                /*BtnPanel btnPanel=new BtnPanel();
                btnPanel.setPanel_btn();
               fn. frameplay.add(btnPanel.panel_btn);
                btnPanel.set_btn();*/


                fn.setLbl_timer(inetgameover(), LanLbl());
                fn.music(inetgameover());
                fn.music2(inetgameover());
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Name_family ui = new Name_family();

                ui.initmaneframe();
                ui.setLblwelcoming();
                ui.setLbllevel();
                ui.setEasybutton();
                ui.setYour_name();
                ui.setYourn_name2();
                ui.setMiddlebutton();
                ui.setHardbutton();
                ui.setWhats_yourname();
                ui.setPersion_language();
                ui.setEnglisg_language();
                ui.setPlay_button();
                ui.inetgameover();


            }
        });
    }
}
