/**
 * <h5>java CheckCharat0 in cods packeg is for check player frist char white Random Char and show result in message dailog </h5>
 * @author Navid Farhadi
 * @since 1396/9/17
 * @see swing.Frameplay, cods.Frist_Char
 * @version 1
 */


package cods;

import jdk.nashorn.internal.ir.annotations.Ignore;
import swing.Frameplay;
//import swing.ResultFrame;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.util.ArrayList;

public class Chek_charat0 {
    public int score;
    public int javaScore;
    public String fristchar;
    public String emtiaz;
    public String string_chek1;
    public String string_chek2;
    public String string_chek3;
    public String string_chek4;
    public String string_chek5;
    public String string_chek6;
    public String string_chek7;
    public String string_chek8;
    public String string_chek9;
    public String string_chek10;

    public void chekchar(String name, String family,String animal,String food,String color,String car,String country,String city,String fruit,String object,String strFristChar,String jname,String jfamily,String janimal,String jfood,String jcolor,String jcar,String jcountry,String jcity,String jfruit,String jobject)
    {
        javaScore=0;
         score = 0;
        //=========================================================================================
        {
            if (name.isEmpty()){string_chek1="name text is empty ==> score = 0";
            if (!jname.isEmpty()){javaScore+=20;}
            else if (jname.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!name.isEmpty())
            {
                if (name.toLowerCase().startsWith(strFristChar) ) {

                     if (jname.isEmpty())
                    {
                        string_chek1 = name + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                     else if (!jname.isEmpty())
                     {
                         if (name.equals(jname))
                     {string_chek1="!!your word is equal by opponents word!!==> score: "+5;
                         score+=5;
                         javaScore+=5;
                     }
                     else if (!name.equals(jname)){
                         string_chek1 = name + "   \tis : true   " + "\t  score==>\t  " + 10;
                         score += 10;
                         javaScore+=10;
                         System.out.println(string_chek1);}
                     }

                    //..................
                } else if (name.charAt(0) != strFristChar.charAt(0)) {
                    string_chek1 = name + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jname.isEmpty())javaScore+=0;
                    else if (!jname.isEmpty())javaScore+=20;
                    System.out.println(string_chek1);
                }
            }}
 //==========================================================================================================
        {
            if (family.isEmpty()){string_chek2="family text is empty ==> score = 0";
                if (!jfamily.isEmpty()){javaScore+=20;}
                else if (jfamily.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!family.isEmpty())
            {
                if (family.toLowerCase().startsWith(strFristChar) ) {

                    if (jfamily.isEmpty())
                    {
                        string_chek2 = family + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jfamily.isEmpty())
                    {
                        if (family.equals(jfamily))
                        {string_chek2="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!family.equals(jfamily)){
                            string_chek2 = family + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek2);}
                    }

                    //..................
                } else if (family.charAt(0) != strFristChar.charAt(0)) {
                    string_chek2 = family + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jfamily.isEmpty())javaScore+=0;
                    else if (!jfamily.isEmpty())javaScore+=20;
                    System.out.println(string_chek2);
                }
            }}

//===========================================================================================================

        {
            if (animal.isEmpty()){string_chek3="animal text is empty ==> score = 0";
                if (!janimal.isEmpty()){javaScore+=20;}
                else if (janimal.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!animal.isEmpty())
            {
                if (animal.toLowerCase().startsWith(strFristChar) ) {

                    if (janimal.isEmpty())
                    {
                        string_chek3 = animal + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!janimal.isEmpty())
                    {
                        if (animal.equals(janimal))
                        {string_chek3="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!animal.equals(janimal)){
                            string_chek3 = animal + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek3);}
                    }

                    //..................
                } else if (animal.charAt(0) != strFristChar.charAt(0)) {
                    string_chek3 = animal + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (janimal.isEmpty())javaScore+=0;
                    else if (!janimal.isEmpty())javaScore+=20;
                    System.out.println(string_chek3);
                }
            }}

 //=======================================================================================================

        {
            if (food.isEmpty()){string_chek4="food text is empty ==> score = 0";
                if (!jfood.isEmpty()){javaScore+=20;}
                else if (jfood.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!food.isEmpty())
            {
                if (food.toLowerCase().startsWith(strFristChar) ) {

                    if (jfood.isEmpty())
                    {
                        string_chek4 = food + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jfood.isEmpty())
                    {
                        if (food.equals(jfood))
                        {string_chek4="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!food.equals(jfood)){
                            string_chek4 = food + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek4);}
                    }

                    //..................
                } else if (food.charAt(0) != strFristChar.charAt(0)) {
                    string_chek4 = food + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jfood.isEmpty())javaScore+=0;
                    else if (!jfood.isEmpty())javaScore+=20;
                    System.out.println(string_chek4);
                }
            }}

//======================================================================================================
        {
            if (color.isEmpty()){string_chek5="color text is empty ==> score = 0";
                if (!jcolor.isEmpty()){javaScore+=20;}
                else if (jcolor.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!color.isEmpty())
            {
                if (color.toLowerCase().startsWith(strFristChar) ) {

                    if (jcolor.isEmpty())
                    {
                        string_chek5 = color + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jcolor.isEmpty())
                    {
                        if (color.equals(jcolor))
                        {string_chek5="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!color.equals(jcolor)){
                            string_chek5 = color + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek5);}
                    }

                    //..................
                } else if (color.charAt(0) != strFristChar.charAt(0)) {
                    string_chek5 = color + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jcolor.isEmpty())javaScore+=0;
                    else if (!jcolor.isEmpty())javaScore+=20;
                    System.out.println(string_chek5);
                }
            }}
//========================================================================================================

        {
            if (car.isEmpty()){string_chek6="car text is empty ==> score = 0";
                if (!jcar.isEmpty()){javaScore+=20;}
                else if (jcar.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!car.isEmpty())
            {
                if (car.toLowerCase().startsWith(strFristChar) ) {

                    if (jcar.isEmpty())
                    {
                        string_chek6 = car + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jcar.isEmpty())
                    {
                        if (car.equals(jcar))
                        {string_chek6="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!car.equals(jcar)){
                            string_chek6 = car + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek6);}
                    }

                    //..................
                } else if (car.charAt(0) != strFristChar.charAt(0)) {
                    string_chek6 = car + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jcar.isEmpty())javaScore+=0;
                    else if (!jcar.isEmpty())javaScore+=20;
                    System.out.println(string_chek6);
                }
            }}
//========================================================================================================

        {
            if (country.isEmpty()){string_chek7="country text is empty ==> score = 0";
                if (!jcountry.isEmpty()){javaScore+=20;}
                else if (jcountry.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!country.isEmpty())
            {
                if (country.toLowerCase().startsWith(strFristChar) ) {

                    if (jcountry.isEmpty())
                    {
                        string_chek7 = country + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jcountry.isEmpty())
                    {
                        if (country.equals(jcountry))
                        {string_chek7="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!country.equals(jcountry)){
                            string_chek7 = country + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek7);}
                    }

                    //..................
                } else if (country.charAt(0) != strFristChar.charAt(0)) {
                    string_chek7 = country + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jcountry.isEmpty())javaScore+=0;
                    else if (!jcountry.isEmpty())javaScore+=20;
                    System.out.println(string_chek7);
                }
            }}
//========================================================================================================

        {
            if (city.isEmpty()){string_chek8="city text is empty ==> score = 0";
                if (!jcity.isEmpty()){javaScore+=20;}
                else if (jcity.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!city.isEmpty())
            {
                if (city.toLowerCase().startsWith(strFristChar) ) {

                    if (jcity.isEmpty())
                    {
                        string_chek8 = city + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jcity.isEmpty())
                    {
                        if (city.equals(jcity))
                        {string_chek8="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!city.equals(jcity)){
                            string_chek8 = city + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek8);}
                    }

                    //..................
                } else if (city.charAt(0) != strFristChar.charAt(0)) {
                    string_chek8 = city + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jcity.isEmpty())javaScore+=0;
                    else if (!jcity.isEmpty())javaScore+=20;
                    System.out.println(string_chek8);
                }
            }}
//========================================================================================================
        {
            if (fruit.isEmpty()){string_chek9="fruit text is empty ==> score = 0";
                if (!jfruit.isEmpty()){javaScore+=20;}
                else if (jfruit.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!fruit.isEmpty())
            {
                if (fruit.toLowerCase().startsWith(strFristChar) ) {

                    if (jfruit.isEmpty())
                    {
                        string_chek9 = fruit + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jfruit.isEmpty())
                    {
                        if (fruit.equals(jfruit))
                        {string_chek9="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!fruit.equals(jfruit)){
                            string_chek9 = fruit + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek9);}
                    }

                    //..................
                } else if (fruit.charAt(0) != strFristChar.charAt(0)) {
                    string_chek9 = fruit + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jfruit.isEmpty())javaScore+=0;
                    else if (!jfruit.isEmpty())javaScore+=20;
                    System.out.println(string_chek9);
                }
            }}

//===========================================================================================================
        {
            if (object.isEmpty()){string_chek10="object text is empty ==> score = 0";
                if (!jobject.isEmpty()){javaScore+=20;}
                else if (jobject.isEmpty()){javaScore+=0;}}
//---------------------------------
            else if (!object.isEmpty())
            {
                if (object.toLowerCase().startsWith(strFristChar) ) {

                    if (jobject.isEmpty())
                    {
                        string_chek10 = object + "   \tis : true   " + "\t  score==>\t  " + 20;
                        score+=20;
                    }
                    else if (!jobject.isEmpty())
                    {
                        if (object.equals(jobject))
                        {string_chek10="!!your word is equal by opponents word!!==> score: "+5;
                            score+=5;
                            javaScore+=5;
                        }
                        else if (!object.equals(jobject)){
                            string_chek10 = object + "   \tis : true   " + "\t  score==>\t  " + 10;
                            score += 10;
                            javaScore+=10;
                            System.out.println(string_chek10);}
                    }

                    //..................
                } else if (object.charAt(0) != strFristChar.charAt(0)) {
                    string_chek10 = object + "   \tis : false   " + "\t  score==>\t  " + 0;
                    if (jobject.isEmpty())javaScore+=0;
                    else if (!jobject.isEmpty())javaScore+=20;
                    System.out.println(string_chek10);
                }
            }}
        
        //==================================================================================================




        fristchar = "frist   char   is   " + strFristChar.charAt(0);
        String emtiaz = "sum of your score is :\t" + score;
        String javaEmtiaz = "sum of JavaScore is :\t" + javaScore;

        System.out.println(emtiaz);

        Frameplay fp = new Frameplay();
        JOptionPane.showMessageDialog(fp.frameplay, fristchar + "\r\n" + "\r\n" + string_chek1 + "\r\n" + string_chek2
                + "\r\n" + string_chek3 + "\r\n" + string_chek4 + "\r\n" + string_chek5 + "\r\n" + string_chek6
                + "\r\n" + string_chek7 + "\r\n" + string_chek8 + "\r\n" + string_chek9
                + "\r\n" + string_chek10 + "\r\n" + "\r\n" + emtiaz+"\r\n"+javaEmtiaz);


    }

    public int totalscore()
    {
        int TS=0;

             TS+=score;

        return TS ;
    }
    public int total_java_score()
    {
        int TSJ=0;

        TSJ+=javaScore;

        return TSJ;
    }

        //*********************************************************************************

      /* ArrayList list = new ArrayList();
        String sss;
        list.add(name.charAt(0));
        list.add(family.charAt(0));
        list.add(animal.charAt(0));
        list.add(food.charAt(0));
        list.add(car.charAt(0));
        list.add(country.charAt(0));
        list.add(city.charAt(0));
        list.add(fruit.charAt(0));
        list.add(object.charAt(0));
        for (int i = 0; i < 10; i++) {
            if (list.get(i) == strFristChar) {
                string_chek = "true";
                score = +10;
                //System.out.println(string_chek);
            } else {
                string_chek = "fals";
                // System.out.println(string_chek);
            }
            String emtiaz = "your score is :\t" + score;
            Frameplay fp = new Frameplay();
            JOptionPane.showMessageDialog(fp.frameplay, emtiaz + string_chek + string_chek1);*/

        //*********************************************************************************

   /* public void setFrame()
    {
        frame=new JFrame();
        frame.setBounds(200, 50, 300, 440);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public void setresult()
    {Frameplay fp=new Frameplay();
        String str="\r\n"+string_chek1+"\r\n"+string_chek2
                +"\r\n"+string_chek3+"\r\n"+string_chek3+"\r\n"+string_chek4+"\r\n"+string_chek5
                +"\r\n"+string_chek6+"\r\n"+string_chek7+"\r\n"+string_chek8+"\r\n"+string_chek9
                +"\r\n"+string_chek10;
       // String emtiaz = "your score is :\t" + score;
        result=new JOptionPane(str);
        result.setBounds(50, 10, 200, 300);
        result.setVisible(true);
        result.setBackground(Color.red);
        frame.add(result);
       // frame.add(lblresult);
    }*/

}

//****** neveshtan metod for pass dadan masseg ****//


