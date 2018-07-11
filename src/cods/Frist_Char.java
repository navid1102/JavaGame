/**
 * <h4>java FristChar in cods packeg is for give a Random char for frist char play</h4>
 * @author Navid Farhadi
 * @since 1396/9/10
 * @see java.util.Random
 * @version 1
 */

package cods;

import swing.Name_family;

import java.util.ArrayList;
import java.util.Random;

public class Frist_Char {
    public char str1;
    public char ss;
    public ArrayList list = null;

    //************************************************//
    public char ch(boolean language){
        list = new ArrayList();

        if (language==true){
            list.add('ا');
            list.add('ب');
            list.add('پ');
            list.add('ت');
            list.add('د');
            list.add('س');
            list.add('ف');
            list.add('ک');
            list.add('م');
            list.add('ن');}
        else {
            list.add('a');
            list.add('b');
            list.add('d');
            list.add('f');
            list.add('k');
            list.add('m');
            list.add('n');
            list.add('p');
            list.add('s');
            list.add('t');
        }

        Frist_Char ff = new Frist_Char();
        ff.setRnm();
            char str1 = (char) list.get(setRnm());
             ss=str1;
        return ss;
        // System.out.println(list.get(setRnm()));

    }

    //***************************************************************
    public int setRnm() {
        int min = 0;
        int max =9;
        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        // System.out.println(this.i1);
        return i1;
    }

    //*****************************************************************
    public static void main(String[] args) {
        Name_family name_family=new Name_family();
        Frist_Char FF = new Frist_Char();
        //FF.ch();
        //System.out.println(FF.ch());
        // FF.setRnm();
        // System.out.println(FF.ar.get(0));

    }


}
