/**
 * <h2>java FramPlay class in swing package</h2>
 * @author Navid Farhadi
 * @since 1396/9/10
 * @see cods.Chek_charat0, cods.Frist_Char
 * @version 1
 */

package swing;

import cods.Chek_charat0;
import cods.Frist_Char;
import cods.ReminderBeep;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
//import cods.test;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.Timer;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.jar.JarEntry;
import java.util.Timer;

public class Frameplay{
    int time2;
    public JFrame frameplay = null;
    public JLabel name_lbl = null;
    public JLabel start_char=null;
    private JLabel str=null;       //===> "حرف اول کلمات"
    private JLabel lbl_time=null;
    public JLabel lbl_timer=null;
    private JLabel lbl_score=null;
    private JLabel lbl_JavaScore=null;
    private JLabel lbl_result=null;
    public String result;
    InputStream test;
    //**********player panl ******************//
    public JLabel game_lblname=null;
    public JTextField game_txtname=null;
    private JLabel game_lblfamily=null;
    public JTextField game_txtfamily=null;
    private  JLabel game_lblanimal=null;
    public JTextField game_txtanimal=null;
    private JLabel game_lblfood=null;
    public JTextField game_txtfood=null;
    private JLabel game_lblcolor=null;
    public JTextField game_txtcolor=null;
    private JLabel game_lblcar=null;
    public JTextField game_txtcar=null;
    private JLabel game_lblcountry=null;
    public JTextField game_txtcountry=null;
    private JLabel game_lblcity=null;
    public JTextField game_txtcity=null;
    private JLabel game_lblobject=null;
    public JTextField game_txtobject=null;
    private JLabel game_lblfruit=null;
    public  JTextField game_txtfruit=null;
    private JPanel panel=null;//===> player panel
//******************java panle ***************//

    private JLabel lbl_computerPlayer=null;
    private JLabel java_lblname=null;
    public JTextField java_txtname=null;
    private JLabel java_lblfamily=null;
    protected JTextField java_txtfamily=null;
    private  JLabel java_lblanimal=null;
    private JTextField java_txtanimal=null;
    private JLabel java_lblfood=null;
    private JTextField java_txtfood=null;
    private JLabel java_lblcolor=null;
    private JTextField java_txtcolor=null;
    private JLabel java_lblcar=null;
    private JTextField java_txtcar=null;
    private JLabel java_lblcountry=null;
    private JTextField java_txtcountry=null;
    private JLabel java_lblcity=null;
    private JTextField java_txtcity=null;
    private JLabel java_lblobject=null;
    private JTextField java_txtobject=null;
    private JLabel java_lblfruit=null;
    private  JTextField java_txtfruit=null;
    private JPanel panel3=null;//===> java player panel

    //****************btn panl *****************//
    private JButton end=null;
    private JPanel panl2=null;//===> buttons panel
    private JButton clear_all=null;
    private JButton restart=null;
    private JButton back=null;
    private JButton exit=null;



    AudioStream BGM1;//======> for backgrond music
    AudioStream BGM;//=======> for alarm music
    AudioStream victory_lose_equally;


    Timer timer_new=new Timer();


    //*************************************************************************************//
    public void setLbl_time(String time,boolean language)
    {
        lbl_time=new JLabel("زمان بازی :"+time+"\t ثانیه");
        if (language==false)lbl_time.setText("your time is : "+time+"  \ts");
        lbl_time.setFont(new Font("Areya", Font.BOLD, 22));
        lbl_time.setForeground(Color.white);
        lbl_time.setBounds(10, 20, 250, 30);
        lbl_time.setVisible(true);
        frameplay.add(lbl_time);
    }





    //----------------------------------------lbl Timer and cheng backgrond color---------------------------------


    public void setLbl_timer(int time,boolean language) {

        lbl_timer = new JLabel();
        TimerTask lblTimer = new TimerTask() {
            int ti = time + 1;

            @Override
            public void run() {
                if (ti > 1) {
                    ti--;
                    lbl_timer.setText(ti + "");
                } else {
                    lbl_timer.setText("!! وقت تمومه !!");

                    if (language == false) lbl_timer.setText("!! time's  up !!");
                }


                if (ti > 10) {
                    frameplay.getContentPane().setBackground(Color.BLACK);
                }

                if (ti < 10) {
                    frameplay.getContentPane().setBackground(Color.RED);
                }

            }

        };
        TimerTask visibleFframe = new TimerTask() {
            @Override
            public void run() {
                Frameplay fp=new Frameplay();
                FinishFrame finishFrame = new FinishFrame();
                finishFrame.creat_view(game_txtname.getText(), game_txtfamily.getText(), game_txtanimal.getText(), game_txtfood.getText(), game_txtcolor.getText(), game_txtcar.getText(), game_txtcountry.getText(), game_txtcity.getText(), game_txtfruit.getText(), game_txtobject.getText());

                finishFrame.get_data_from_db(start_char.getText());

                java_txtname.setText(finishFrame.NameAnswer);
                java_txtfamily.setText(finishFrame.FamilyAnswer);
                java_txtanimal.setText(finishFrame.AnimalAnswer);
                java_txtfood.setText(finishFrame.FoodAnswer);
                java_txtcolor.setText(finishFrame.ColorAnswer);
                java_txtcar.setText(finishFrame.CarAnswer);
                java_txtcountry.setText(finishFrame.CountryAnswer);
                java_txtcity.setText(finishFrame.CityAnswer);
                java_txtfruit.setText(finishFrame.FruitAnswer);
                java_txtobject.setText(finishFrame.ObjectAnswer);

                Chek_charat0 chek_charat0 = new Chek_charat0();
                chek_charat0.chekchar(finishFrame.name_field.getText(), finishFrame.family_field.getText(), finishFrame.animal_field.getText(), finishFrame.food_field.getText(), finishFrame.color_field.getText(), finishFrame.car_field.getText(), finishFrame.country_field.getText(), finishFrame.city_field.getText(), finishFrame.fruit_field.getText(), finishFrame.object_field.getText(), start_char.getText(), finishFrame.name_field2.getText(), finishFrame.family_field2.getText(), finishFrame.animal_field2.getText(), finishFrame.food_field2.getText(), finishFrame.color_field2.getText(), finishFrame.car_field2.getText(), finishFrame.country_field2.getText(), finishFrame.city_field2.getText(), finishFrame.fruit_field2.getText(), finishFrame.object_field2.getText());

                end.setVisible(false);//=======> VISIABLE FALSE BTN AND SET TEXT LBL_RESULT AFTER FINISH TIME
                restart.setVisible(false);
                clear_all.setVisible(false);
                lbl_result.setText(fp.set_result(chek_charat0.javaScore, chek_charat0.score));

                VivtoryMusic(chek_charat0.javaScore, chek_charat0.score);//====>efect for victory_lose_equally
                AudioPlayer.player.start(victory_lose_equally);
//---------------------------------------------------

                lbl_score.setText("sum of your score is :" + chek_charat0.score);
                lbl_JavaScore.setText("sum of javas score is :"+chek_charat0.javaScore);




            }
        };
        //--------------------------

        timer_new.scheduleAtFixedRate(lblTimer, 0, 1000);//===> timer for lbl timer ******************
        timer_new.schedule(visibleFframe, time * 1000);//===> timer for visiable finish frame *********************
        //-------------------------------
        lbl_timer.setBounds(10, 70, 300, 40);
        lbl_timer.setVisible(true);
        lbl_timer.setFont(new Font("Areya", Font.BOLD, 36));
        lbl_timer.setForeground(Color.white);
        frameplay.add(lbl_timer);
    }


    //==============================================backgrond music==========================================
    public  void music(int level_time)
    {
        AudioPlayer MGP=AudioPlayer.player;
        AudioData MD;

        ContinuousAudioDataStream loop=null;

        try
        {
            InputStream test=new FileInputStream("D:\\ccc.WAV");//====>backgrond music
            BGM1=new AudioStream(test);
            AudioPlayer.player.start(BGM1);

            TimerTask Stopmusic1=new TimerTask() {
                public void run() {
                    AudioPlayer.player.stop(BGM1);

                }
            };
            TimerTask tScreenOof =new TimerTask() {
                @Override
                public void run() {
                    game_txtname.setEditable(false);
                    game_txtfamily.setEditable(false);
                    game_txtanimal.setEditable(false);
                    game_txtfood.setEditable(false);
                    game_txtcolor.setEditable(false);
                    game_txtcar.setEditable(false);
                    game_txtcountry.setEditable(false);
                    game_txtcity.setEditable(false);
                    game_txtfruit.setEditable(false);
                    game_txtobject.setEditable(false);


                    java_txtname.setEditable(false);
                    java_txtfamily.setEditable(false);
                    java_txtanimal.setEditable(false);
                    java_txtfood.setEditable(false);
                    java_txtcolor.setEditable(false);
                    java_txtcar.setEditable(false);
                    java_txtcountry.setEditable(false);
                    java_txtcity.setEditable(false);
                    java_txtfruit.setEditable(false);
                    java_txtobject.setEditable(false);

                }
            };



            timer_new.schedule(Stopmusic1, (level_time-10) * 1000);
            timer_new.schedule(tScreenOof,level_time*1000);

        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException error)
        {
            System.out.println(error.toString());
        }
        //AudioPlayer MGP=new AudioPlayer();
        MGP.start(loop);

    }


//================================================ alarm voise ==========================================

    /**
     * <p>invoke this method for start and stop alarm music</p>
     * @param time_end type is int , time for end play and give of inetgameover method
     * @author Nvaid Farhadi
     * @see Timer,TimerTask
     * @see AudioPlayer,AudioStream
     * @since 1396/9/15
     *
     */
    public  void music2(int time_end)
    {
        AudioPlayer MGP=AudioPlayer.player;
        //AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop=null;

        try
        {
            InputStream test=new FileInputStream("D:\\AAA.WAV");//===>alarm music
            BGM=new AudioStream(test);

            TimerTask task_alarm=new TimerTask() {
                @Override
                public void run()
                {
                   AudioPlayer.player.start(BGM);
                }
            };

            timer_new.schedule(task_alarm,(time_end-10)*1000);//==> when alarm is started

            TimerTask task_end_alarm=new TimerTask() {
                @Override
                public void run() {

                    AudioPlayer.player.stop(BGM);
                }
            };
            timer_new.schedule(task_end_alarm,time_end);//===>when alarm is stoped


        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException error)
        {
            System.out.println(error.toString());
        }
        MGP.start(loop);
    }

//==================================================victory music========================================
public  void VivtoryMusic(int JScore,int Score)
{
    AudioPlayer MGP=AudioPlayer.player;
    AudioData MD;

    ContinuousAudioDataStream loop=null;
    if (Score>JScore)
    {try {
        test=new FileInputStream("D:\\tashvigh.WAV");
    }catch (Exception E){
        System.err.println();
    }
    }else if (JScore>Score)
    {
        try {
            test=new FileInputStream("D:\\lose(1).WAV");
        }catch (Exception E){
            System.err.println();
        }
    }
    else {

        try {
            test=new FileInputStream("D:\\equally(1).WAV");//====> draw
        }catch (Exception E){
            System.err.println();
        }
    }
        try
        {
          //InputStream test=new FileInputStream("D:\\Tashvigh.WAV");
            victory_lose_equally=new AudioStream(test);

        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException error)
        {
            System.out.println(error.toString());
        }
        MGP.start(loop);
    }






    //================================================================================================

    public void setLbl_totalscore()
    {
        Chek_charat0 chek_charat0=new Chek_charat0();
        lbl_score=new JLabel("sum of your score is :");
        lbl_score.setBounds(10, 630, 300, 30);
        lbl_score.setFont(new Font("Areya",Font.BOLD,18));
        lbl_score.setForeground(Color.white);
        lbl_score.setVisible(true);
        lbl_score.setLayout(null);
        lbl_score.setBackground(Color.cyan);
        frameplay.add(lbl_score);
    }

    public void setLbl_total_JavaScore()
    {
        Chek_charat0 chek_charat0=new Chek_charat0();
        lbl_JavaScore=new JLabel("sum of java score is :");
        lbl_JavaScore.setBounds(10, 660, 300, 30);
        lbl_JavaScore.setFont(new Font("Areya",Font.BOLD,18));
        lbl_JavaScore.setForeground(Color.white);
        lbl_JavaScore.setVisible(true);
        lbl_JavaScore.setLayout(null);
        lbl_JavaScore.setBackground(Color.cyan);
        frameplay.add(lbl_JavaScore);
    }


    public void setPanel()//==================>player panel
    {
        panel=new JPanel();
        panel.setBounds(250, 50, 400, 550);
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.cyan);
        frameplay.add(panel);
    }
    public void setFrameplay()
    {
        frameplay = new JFrame("name and family game");
        Dimension dmn = Toolkit.getDefaultToolkit().getScreenSize();
        frameplay.setBounds(0, 0, dmn.width, dmn.height);
        frameplay.setLayout(null);
        frameplay.setVisible(true);
        frameplay.getContentPane().setBackground(Color.black);
        frameplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frameplay.setResizable(false);
    }



    public  void setName_lbl(String str,boolean language) {
        name_lbl = new JLabel("بازیکن 1 : "+"   "+str);
        if (language==false)name_lbl.setText("palyer 1 : "+"   "+str);
        name_lbl.setFont(new Font("Areya",Font.BOLD,18));
        name_lbl.setForeground(Color.WHITE);
        name_lbl.setBounds(250, 20, 300, 30);
        name_lbl.setVisible(true);
        name_lbl.setLayout(null);
        frameplay.add(name_lbl);
    }

    public  void setGame_lblname(boolean language)
    {
        game_lblname=new JLabel("اسم");
        if (language==false)game_lblname.setText("name");
        game_lblname.setFont(new Font("Areya", Font.BOLD, 18));
        game_lblname.setBounds(50, 30, 100, 30);
        game_lblname.setVisible(true);
        panel.add(game_lblname);
    }

    protected void setGame_txtname()
    {
        game_txtname=new JTextField();
        game_txtname.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtname.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtname.setBounds(150, 30, 200, 30);
        game_txtname.setVisible(true);
        panel.add(game_txtname);

    }


    protected void setGame_lblfamily(boolean language)
    {
        game_lblfamily=new JLabel("فامیل");
        if (language==false)game_lblfamily.setText("family");
        game_lblfamily.setFont(new Font("Areya",Font.BOLD,18));
        game_lblfamily.setBounds(50,80,100,30);
        game_lblfamily.setVisible(true);
        panel.add(game_lblfamily);
    }
    public void  setGame_txtfamily()
    {
        game_txtfamily=new JTextField();
        game_txtfamily.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtfamily.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtfamily.setBounds(150,80,200,30);
        game_txtfamily.setVisible(true);
        panel.add(game_txtfamily);

    }
    protected void setGame_lblanimal(boolean language)
    {
        game_lblanimal=new JLabel("حیوان");
        if (language==false)game_lblanimal.setText("animal");
        game_lblanimal.setFont(new Font("Areya",Font.BOLD,18));
        game_lblanimal.setBounds(50,130,100,30);
        game_lblanimal.setVisible(true);
        panel.add(game_lblanimal);
    }
    protected void setGame_txtanimal()
    {
        game_txtanimal=new JTextField();
        game_txtanimal.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtanimal.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtanimal.setBounds(150,130,200,30);
        game_txtanimal.setVisible(true);
        panel.add(game_txtanimal);
    }

    protected void setGame_lblfood(boolean language)
    {
        game_lblfood=new JLabel("غذا");
        if (language==false)game_lblfood.setText("food");
        game_lblfood.setFont(new Font("Areya",Font.BOLD,18));
        game_lblfood.setBounds(50,180,100,30);
        game_lblfood.setVisible(true);
        panel.add(game_lblfood);
    }
    protected void setGame_txtfood()
    {
        game_txtfood=new JTextField();
        game_txtfood.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtfood.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtfood.setBounds(150, 180, 200, 30);
        game_txtfood.setVisible(true);
        panel.add(game_txtfood);
    }
    protected void setGame_lblcolor(boolean language)
    {
        game_lblcolor=new JLabel("رنگ");
        if (language==false)game_lblcolor.setText("color");
        game_lblcolor.setFont(new Font("Areya",Font.BOLD,18));
        game_lblcolor.setBounds(50,230,100,30);
        game_lblcolor.setVisible(true);
        panel.add(game_lblcolor);
    }
    protected void setGame_txtcolor()
    {
        game_txtcolor=new JTextField();
        game_txtcolor.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtcolor.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtcolor.setBounds(150,230,200,30);
        game_txtcolor.setVisible(true);
        panel.add(game_txtcolor);
    }
    protected void setGame_lblcar(boolean language)
    {
        game_lblcar=new JLabel("ماشین");
        if (language==false)game_lblcar.setText("car");
        game_lblcar.setFont(new Font("Areya",Font.BOLD,18));
        game_lblcar.setBounds(50,280,100,30);
        game_lblcar.setVisible(true);
        panel.add(game_lblcar);
    }
    protected void setGame_txtcar()
    {
        game_txtcar=new JTextField();
        game_txtcar.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtcar.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtcar.setBounds(150,280,200,30);
        game_txtcar.setVisible(true);
        panel.add(game_txtcar);
    }
    protected void setGame_lblcountry(boolean language)
    {
        game_lblcountry=new JLabel("کشور");
        if (language==false)game_lblcountry.setText("country");
        game_lblcountry.setFont(new Font("Areya",Font.BOLD,18));
        game_lblcountry.setBounds(50,330,100,30);
        game_lblcountry.setVisible(true);
        panel.add(game_lblcountry);
    }

    protected void setGame_txtcountry()
    {
        game_txtcountry=new JTextField();
        game_txtcountry.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtcountry.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtcountry.setBounds(150,330,200,30);
        game_txtcountry.setVisible(true);
        panel.add(game_txtcountry);
    }
    protected void setGame_lblcity(boolean language)
    {
        game_lblcity=new JLabel("شهر");
        if (language==false)game_lblcity.setText("city");
        game_lblcity.setFont(new Font("Areya",Font.BOLD,18));
        game_lblcity.setBounds(50,380,100,30);
        game_lblcity.setVisible(true);
        panel.add(game_lblcity);
    }

    protected void setGame_txtcity()
    {
        game_txtcity=new JTextField();
        game_txtcity.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtcity.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtcity.setBounds(150,380,200,30);
        game_txtcity.setVisible(true);
        panel.add(game_txtcity);
    }


    protected void setGame_lblfruit(boolean language)
    {
        game_lblfruit=new JLabel("میوه");
        if (language==false)game_lblfruit.setText("fruit");
        game_lblfruit.setFont(new Font("Areya",Font.BOLD,18));
        game_lblfruit.setBounds(50, 430, 100, 30);
        game_lblfruit.setVisible(true);
        panel.add(game_lblfruit);
    }

    protected void setGame_txtfruit()
    {
        game_txtfruit=new JTextField();
        game_txtfruit.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtfruit.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtfruit.setBounds(150,430,200,30);
        game_txtfruit.setVisible(true);
        panel.add(game_txtfruit);
    }

    protected void setGame_lblobject(boolean language)
    {
        game_lblobject=new JLabel("اشیاء");
        if (language==false)game_lblobject.setText("object");
        game_lblobject.setFont(new Font("Areya", Font.BOLD, 18));
        game_lblobject.setBounds(50,480,100,30);
        game_lblobject.setVisible(true);
        panel.add(game_lblobject);
    }

    protected void setGame_txtobject()
    {
        game_txtobject=new JTextField();
        game_txtobject.setHorizontalAlignment(SwingConstants.RIGHT);
        game_txtobject.setFont(new Font("Areya", Font.BOLD, 18));
        game_txtobject.setBounds(150, 480, 200, 30);
        game_txtobject.setVisible(true);
        panel.add(game_txtobject);
    }




    public void setStart_char(String ssss)
    {
        start_char=new JLabel(ssss);
        start_char.setFont(new Font("Areya", Font.BOLD, 50));
        start_char.setForeground(Color.white);
        start_char.setBounds(1200, 150, 300, 100);
        start_char.setVisible(true);
        frameplay.add(start_char);
    }

    public void setStr(boolean language)
    {
         str=new JLabel("حرف اول کلمات :");
        if (language==false)str.setText("frist char is :");
        str.setFont(new Font("Areya", Font.BOLD, 18));
        str.setForeground(Color.white);
        str.setBounds(1150, 100, 300, 30);
        str.setVisible(true);
        frameplay.add(str);

    }

    public void setPanl2()
    {
        panl2=new JPanel();
        panl2.setBounds(1100, 300, 200, 300);
        panl2.setBackground(Color.cyan);
        panl2.setLayout(null);
        panl2.setVisible(true);
        frameplay.add(panl2);
    }


    public String set_result(int JScore,int Score)
    {
        if (JScore<Score)
        {
            result="Victory";
        }
        else if(JScore>Score)
        {
            result="Lose";
        }
        else
        {
            result="Draw";
        }
        return result;
    }


    public void setLbl_result() {

        lbl_result = new JLabel();
        lbl_result.setBounds(50, 20, 100, 50);
        lbl_result.setFont(new Font("Areya",Font.BOLD,28));
        lbl_result.setForeground(Color.red);
        lbl_result.setVisible(true);
        panl2.add(lbl_result);
    }



    public void setClearall(boolean language)
    {
        clear_all=new JButton("پاک کردن همه");
        if (language==false)clear_all.setText("Clear all");
        clear_all.setName("Clear all");
        clear_all.setBounds(25, 100, 150, 30);
        clear_all.setVisible(true);
        panl2.add(clear_all);
        clear_all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game_txtname.setText("");
                game_txtfamily.setText("");
                game_txtanimal.setText("");
                game_txtfood.setText("");
                game_txtcolor.setText("");
                game_txtcar.setText("");
                game_txtcountry.setText("");
                game_txtcity.setText("");
                game_txtfruit.setText("");
                game_txtobject.setText("");
            }
        });

    }




    protected void setRestart(boolean language)
    {
        restart=new JButton("حرف جدید");
        if (language==false)restart.setText("new char");
        restart.setName("Restart");
        restart.setBounds(25,140, 150, 30);
        restart.setVisible(true);
        panl2.add(restart);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frist_Char fch = new Frist_Char();
                Name_family name_family=new Name_family();
                start_char.setText(fch.ch(language) + "");

                game_txtname.setText("");
                game_txtfamily.setText("");
                game_txtanimal.setText("");
                game_txtfood.setText("");
                game_txtcolor.setText("");
                game_txtcar.setText("");
                game_txtcountry.setText("");
                game_txtcity.setText("");
                game_txtfruit.setText("");
                game_txtobject.setText("");

            }
        });

    }
    protected void setBack(boolean language)
    {
        back=new JButton("بازی دوباره");
        if (language==false)back.setText("play again");
        back.setName("GO to Menu");
        back.setBounds(25, 180, 150, 30);
        back.setVisible(true);
        panl2.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer_new.cancel();//========> STOP TIMER AND MUSIC FOR START AGAIN
                AudioPlayer.player.stop(BGM1);
                AudioPlayer.player.stop(BGM);

                frameplay.setVisible(false);
                Name_family name_family=new Name_family();
                name_family.initmaneframe();
                name_family.setLblwelcoming();
                name_family.setLbllevel();
                name_family.setEasybutton();
                name_family.setYour_name();
                name_family.setMiddlebutton();
                name_family.setHardbutton();
                name_family.setPlay_button();
                name_family.setWhats_yourname();
                name_family.setPersion_language();
                name_family.setEnglisg_language();
            }
        });
    }

    protected void setExit(boolean language)
    {
        exit=new JButton("خروج");
        if (language==false)exit.setText("Exit");
        exit.setName("Exit");
        exit.setBounds(25, 220, 150, 30);
        exit.setVisible(true);
        panl2.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (language==false)JOptionPane.showMessageDialog(frameplay,"* are you sure to get out ? *");
                else {JOptionPane.showMessageDialog(frameplay,"میخوای بری !!!؟؟" );
                }
                System.exit(0);
            }
        });

    }
    //******************************************** metod end active check *****************************//
    public void intend(boolean language)
    { end=new JButton("تمام");
        if (language==false)end.setText("stop");
        end.setName("Stop");
        end.setBounds(25, 20, 150, 30);
        end.setBackground(Color.PINK);
        end.setVisible(true);
        end.setLayout(null);
        panl2.add(end);
        end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frameplay fp=new Frameplay();
                timer_new.cancel();
                end.setVisible(false);
                restart.setVisible(false);
                clear_all.setVisible(false);

                AudioPlayer.player.stop(BGM1);
                AudioPlayer.player.stop(BGM);

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              /* BtnPanel btnPanel=new BtnPanel();
               btnPanel.set_btn();
                frameplay.add(btnPanel.panel_btn);

                btnPanel.get_data_from_db(start_char.getText());
                java_txtname.setText(btnPanel.NAnswer);
                java_txtfamily.setText(btnPanel.FAnswer);
                java_txtanimal.setText(btnPanel.AAnswer);
                java_txtfood.setText(btnPanel.FoodAnswer);
                java_txtcolor.setText(btnPanel.ColorAnswer);
                java_txtcar.setText(btnPanel.CarAnswer);
                java_txtcountry.setText(btnPanel.CountryAnswer);
                java_txtcity.setText(btnPanel.CityAnswer);
                java_txtfruit.setText(btnPanel.FruitAnswer);
                java_txtobject.setText(btnPanel.ObjectAnswer);*/


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                FinishFrame finishFrame=new FinishFrame();
                finishFrame.creat_view(game_txtname.getText(), game_txtfamily.getText(), game_txtanimal.getText(), game_txtfood.getText(), game_txtcolor.getText(), game_txtcar.getText(), game_txtcountry.getText(), game_txtcity.getText(), game_txtfruit.getText(), game_txtobject.getText());

                finishFrame.get_data_from_db(start_char.getText());
                java_txtname.setText(finishFrame.NameAnswer);
                java_txtfamily.setText(finishFrame.FamilyAnswer);
                java_txtanimal.setText(finishFrame.AnimalAnswer);
                java_txtfood.setText(finishFrame.FoodAnswer);
                java_txtcolor.setText(finishFrame.ColorAnswer);
                java_txtcar.setText(finishFrame.CarAnswer);
                java_txtcountry.setText(finishFrame.CountryAnswer);
                java_txtcity.setText(finishFrame.CityAnswer);
                java_txtfruit.setText(finishFrame.FruitAnswer);
                java_txtobject.setText(finishFrame.ObjectAnswer);


                Chek_charat0 chek_charat0 = new Chek_charat0();
                chek_charat0.chekchar(finishFrame.name_field.getText(), finishFrame.family_field.getText(), finishFrame.animal_field.getText(), finishFrame.food_field.getText(), finishFrame.color_field.getText(), finishFrame.car_field.getText(), finishFrame.country_field.getText(), finishFrame.city_field.getText(), finishFrame.fruit_field.getText(), finishFrame.object_field.getText(), start_char.getText(), finishFrame.name_field2.getText(), finishFrame.family_field2.getText(), finishFrame.animal_field2.getText(), finishFrame.food_field2.getText(), finishFrame.color_field2.getText(), finishFrame.car_field2.getText(), finishFrame.country_field2.getText(), finishFrame.city_field2.getText(), finishFrame.fruit_field2.getText(), finishFrame.object_field2.getText());

                Name_family n=new Name_family();
                lbl_result.setText(fp.set_result(chek_charat0.javaScore, chek_charat0.score));

                VivtoryMusic(chek_charat0.javaScore, chek_charat0.score);
                AudioPlayer.player.start(victory_lose_equally);


                Frist_Char fch = new Frist_Char();
                start_char.setText(fch.ch(language) + "");

                game_txtname.setEditable(false);
                game_txtfamily.setEditable(false);
                game_txtanimal.setEditable(false);
                game_txtfood.setEditable(false);
                game_txtcolor.setEditable(false);
                game_txtcar.setEditable(false);
                game_txtcountry.setEditable(false);
                game_txtcity.setEditable(false);
                game_txtfruit.setEditable(false);
                game_txtobject.setEditable(false);

                java_txtname.setEditable(false);
                java_txtfamily.setEditable(false);
                java_txtanimal.setEditable(false);
                java_txtfood.setEditable(false);
                java_txtcolor.setEditable(false);
                java_txtcar.setEditable(false);
                java_txtcountry.setEditable(false);
                java_txtcity.setEditable(false);
                java_txtfruit.setEditable(false);
                java_txtobject.setEditable(false);
                
                
                

                /*game_txtname.setText("");
                game_txtfamily.setText("");
                game_txtanimal.setText("");
                game_txtfood.setText("");
                game_txtcolor.setText("");
                game_txtcar.setText("");
                game_txtcountry.setText("");
                game_txtcity.setText("");
                game_txtfruit.setText("");
                game_txtobject.setText("");*/

                lbl_score.setText("sum of your score is :" + chek_charat0.score);
                lbl_JavaScore.setText("sum of java score is :" + chek_charat0.javaScore);




            }
        });
    }

//***************************************************************************************************//


    public void setPanel3()
    {
        panel3=new JPanel();
        panel3.setBounds(650,50,400,550);
        panel3.setVisible(true);
        panel3.setLayout(null);
        panel3.setBackground(Color.yellow);
        frameplay.add(panel3);
    }

    public void setLbl_computerPlayer(boolean language)
    {
        lbl_computerPlayer=new JLabel("بازیکن 2 :"+"   "+"جاوا");
        if (language==false)lbl_computerPlayer.setText("player 2 : JAVA");
        lbl_computerPlayer.setFont(new Font("Areya", Font.BOLD, 18));
        lbl_computerPlayer.setForeground(Color.white);
        lbl_computerPlayer.setBounds(650, 20, 200, 30);
        lbl_computerPlayer.setVisible(true);
        frameplay.add(lbl_computerPlayer);
    }



    protected  void setjava_lblname(boolean language)
    {
        java_lblname=new JLabel("اسم");
        if (language==false)java_lblname.setText("name");
        java_lblname.setFont(new Font("Areya", Font.BOLD, 18));
        java_lblname.setBounds(50, 30, 100, 30);
        java_lblname.setVisible(true);
        panel3.add(java_lblname);
    }
    protected void setjava_txtname()
    {
        java_txtname=new JTextField();
        java_txtname.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtname.setBounds(150, 30, 200, 30);
        java_txtname.setVisible(true);
        java_txtname.setEditable(false);
        panel3.add(java_txtname);

    }
    protected void setjava_lblfamily(boolean language)
    {
        java_lblfamily=new JLabel("فامیل");
        if (language==false)java_lblfamily.setText("family");
        java_lblfamily.setFont(new Font("Areya", Font.BOLD, 18));
        java_lblfamily.setBounds(50,80,100,30);
        java_lblfamily.setVisible(true);
        panel3.add(java_lblfamily);
    }
    public void  setjava_txtfamily()
    {
        java_txtfamily=new JTextField();
        java_txtfamily.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtfamily.setBounds(150,80,200,30);
        java_txtfamily.setVisible(true);
        java_txtfamily.setEditable(false);
        panel3.add(java_txtfamily);

    }
    protected void setjava_lblanimal(boolean language)
    {
        java_lblanimal=new JLabel("حیوان");
        if (language==false)java_lblanimal.setText("animal");
        java_lblanimal.setFont(new Font("Areya", Font.BOLD, 18));
        java_lblanimal.setBounds(50,130,100,30);
        java_lblanimal.setVisible(true);
        panel3.add(java_lblanimal);
    }
    protected void setjava_txtanimal()
    {
        java_txtanimal=new JTextField();
        java_txtanimal.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtanimal.setBounds(150,130,200,30);
        java_txtanimal.setVisible(true);
        java_txtanimal.setEditable(false);
        panel3.add(java_txtanimal);
    }

    protected void setjava_lblfood(boolean language)
    {
        java_lblfood=new JLabel("غذا");
        if (language==false)java_lblfood.setText("food");
        java_lblfood.setFont(new Font("Areya", Font.BOLD, 18));
        java_lblfood.setBounds(50,180,100,30);
        java_lblfood.setVisible(true);
        panel3.add(java_lblfood);
    }
    protected void setjava_txtfood()
    {
        java_txtfood=new JTextField();
        java_txtfood.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtfood.setBounds(150, 180, 200, 30);
        java_txtfood.setVisible(true);
        java_txtfood.setEditable(false);
        panel3.add(java_txtfood);
    }
    protected void setjava_lblcolor(boolean language)
    {
        java_lblcolor=new JLabel("رنگ");
        if (language==false)java_lblcolor.setText("color");
        java_lblcolor.setFont(new Font("Areya",Font.BOLD,18));
        java_lblcolor.setBounds(50,230,100,30);
        java_lblcolor.setVisible(true);
        panel3.add(java_lblcolor);
    }
    protected void setjava_txtcolor()
    {
        java_txtcolor=new JTextField();
        java_txtcolor.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtcolor.setBounds(150,230,200,30);
        java_txtcolor.setVisible(true);
        java_txtcolor.setEditable(false);
        panel3.add(java_txtcolor);
    }
    protected void setjava_lblcar(boolean language)
    {
        java_lblcar=new JLabel("ماشین");
        if (language==false)java_lblcar.setText("car");
        java_lblcar.setFont(new Font("Areya",Font.BOLD,18));
        java_lblcar.setBounds(50,280,100,30);
        java_lblcar.setVisible(true);
        panel3.add(java_lblcar);
    }
    protected void setjava_txtcar()
    {
        java_txtcar=new JTextField();
        java_txtcar.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtcar.setBounds(150,280,200,30);
        java_txtcar.setVisible(true);
        java_txtcar.setEditable(false);
        panel3.add(java_txtcar);
    }
    protected void setjava_lblcountry(boolean language)
    {
        java_lblcountry=new JLabel("کشور");
        if (language==false)java_lblcountry.setText("car");
        java_lblcountry.setFont(new Font("Areya",Font.BOLD,18));
        java_lblcountry.setBounds(50,330,100,30);
        java_lblcountry.setVisible(true);
        panel3.add(java_lblcountry);
    }

    protected void setjava_txtcountry()
    {
        java_txtcountry=new JTextField();
        java_txtcountry.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtcountry.setBounds(150,330,200,30);
        java_txtcountry.setVisible(true);
        java_txtcountry.setEditable(false);
        panel3.add(java_txtcountry);
    }
    protected void setjava_lblcity(boolean language)
    {
        java_lblcity=new JLabel("شهر");
        if (language==false)java_lblcity.setText("city");
        java_lblcity.setFont(new Font("Areya",Font.BOLD,18));
        java_lblcity.setBounds(50,380,100,30);
        java_lblcity.setVisible(true);
        panel3.add(java_lblcity);
    }

    protected void setjava_txtcity()
    {
        java_txtcity=new JTextField();
        java_txtcity.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtcity.setBounds(150,380,200,30);
        java_txtcity.setVisible(true);
        java_txtcity.setEditable(false);
        panel3.add(java_txtcity);
    }


    protected void setjava_lblfruit(boolean language)
    {
        java_lblfruit=new JLabel("میوه");
        if (language==false)java_lblfruit.setText("fruit");
        java_lblfruit.setFont(new Font("Areya",Font.BOLD,18));
        java_lblfruit.setBounds(50,430,100,30);
        java_lblfruit.setVisible(true);
        panel3.add(java_lblfruit);
    }

    protected void setjava_txtfruit()
    {
        java_txtfruit=new JTextField();
        java_txtfruit.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtfruit.setBounds(150,430,200,30);
        java_txtfruit.setVisible(true);
        java_txtfruit.setEditable(false);
        panel3.add(java_txtfruit);
    }
    protected void setjava_lblobject(boolean language)
    {
        java_lblobject=new JLabel("اشیاء");
        if (language==false)java_lblobject.setText("object");
        java_lblobject.setFont(new Font("Areya",Font.BOLD,18));
        java_lblobject.setBounds(50,480,100,30);
        java_lblobject.setVisible(true);
        panel3.add(java_lblobject);
    }

    protected void setjava_txtobject()
    {
        java_txtobject=new JTextField();
        java_txtobject.setHorizontalAlignment(SwingConstants.RIGHT);
        java_txtobject.setBounds(150, 480, 200, 30);
        java_txtobject.setVisible(true);
        java_txtobject.setEditable(false);
        panel3.add(java_txtobject);
    }
//#############################################################################################

 /*  public static void main(String[] args)
   {
       Frameplay fp=new Frameplay();
       ShapesJpanel shapesJpanel=new ShapesJpanel();
       fp.frameplay.add(shapesJpanel);
   }
       /* Frameplay fp = new Frameplay();
        fp.LanLbl2();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frist_Char frist_char=new Frist_Char();
                Name_family name_family=new Name_family();

                fp.setFrameplay();
                fp.setLbl_totalscore(toString());

                frist_char.setRnm();
                fp.setStart_char(toString());
                //  fp.setStr(toString());\\EZAFI

               // fp.setName_lbl(toString());


                //fp.setLbl_time(toString());//EZAFI

                fp.setPanel();// ===>  player panl
                fp.setPanl2();// ===> buttons panl
                fp.setPanel3();//===>    java panl
//**********************************  buttons  **********************
                //fp.intend();
                //fp.setClearall();
               // fp.setRestart();
               // fp.setBack();
               // fp.setExit();




            }
        });

    }*/
//###############################################################################################

}







